package server.com;

import implementation.com.CommanImplementation;
import interface1.com.CommanInterface;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;
import javax.xml.ws.Response;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import bean.com.DataOwnerBean;

import com.oreilly.servlet.multipart.FilePart;
import com.oreilly.servlet.multipart.MultipartParser;
import com.oreilly.servlet.multipart.ParamPart;
import com.oreilly.servlet.multipart.Part;

/**
 * Servlet implementation class DataownerUpload
 */
@WebServlet("/DataownerUpload")
public class DataownerUpload extends HttpServlet {
	

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DataownerUpload() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
		
	

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {//method open
		// TODO Auto-generated method stub
		
		Random randomGenerator = new Random();
	    int randomInt = randomGenerator.nextInt(3);
	    System.out.println("randon generation key" + randomInt);
	    
		
		
		
		int hashcodevalue=0;
		
		String key12 = "";
		String ownername123="";
		ArrayList li=new ArrayList();
		System.out.println("key="+key12);

		Part part;

		FilePart filepart;

		ParamPart parampart;

		String filename = null;

		long filesize = 0;

		String filetype = null;

		String filepath = null;
		
		String filepath1 = null;
		String filepath2=null;

		File file = null;

		String encontent =null;
		
		String decontent=null;

		
		//set workspace for original file
		
		String workspacepath = request.getServletContext().getRealPath("");

		System.out.println("workspacepath =" + workspacepath);

		workspacepath = workspacepath.substring(0, workspacepath.indexOf("."));

		MultipartParser mpp = new MultipartParser(request, 999999999);
		
		System.out.println("workspacepath =" + workspacepath);

		while ((part = mpp.readNextPart()) != null) 
		{// while open
			
			System.out.println("part===="+part);
			
			if (part.isFile()) { // if open

				filepart = (FilePart) part;

				filename = filepart.getFileName();

				System.out.println("filename =" + filename);

				filetype = filepart.getContentType();

				System.out.println("filetype =" + filetype);

				filepath = workspacepath + "\\FileHub\\WebContent\\originalFile\\"
						+ filename;

				//D:\sai\FileHub\WebContent\originalFile
				
				System.out.println(filepath + "............................");
				
				file = new File(filepath);

				filesize = filepart.writeTo(file);

			} // if close

			
			
			else if(part.isParam()) {//else if open

				parampart = (ParamPart) part;

				li.add(parampart.getStringValue().toString());

				
			}// else if close
		}//while close
	
	
			// FileInputStrean get bytes from file

			String filecontent = "";

			if (filename.endsWith(".txt")) {// if open

	//file encrypted and store into filepath1
				
				FileInputStream fis = new FileInputStream(file);
				byte[] b = new byte[fis.available()];
				fis.read(b);
				String reading = new String(b);
				filecontent = filecontent + reading;
				
				hashcodevalue=filecontent.hashCode();
                System.out.println("filecontent=" + filecontent);
                
                try {//try1 open
                	
                	
                if(randomInt==0){
				encontent = AES.encrypt99(filecontent);
                }
                
                else if (randomInt==1) {
                	encontent=BlowfishTest.encrypt(filecontent);
					
				}
                else
                {
                	TribleDes td=new TribleDes();
                	encontent=td.encrypt(filecontent);
                }
                
				
				
				System.out.println("encontent===="+encontent);
                filepath1 = workspacepath + "\\FileHub\\WebContent\\Encrypt\\"+ filename;
                File file1 = new File(filepath1);
                file1.createNewFile();
                if (!file.exists()) {file.createNewFile();}// If file doesn't exists, then create it
                FileWriter fw = new FileWriter(file1.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
                bw.write(encontent);// Write in file
                bw.close();// Close connection
                System.out.println("fileeeeeeeeeeeeeeeee" + filepath1);
   
      //file decrypted and store into filepath2
               
                
               
				
                if(randomInt==0){
                	 decontent= AES.decrypt(encontent);
                    }
                    
                    else if (randomInt==1) {
                    	decontent=BlowfishTest.decrypt(encontent);
    					
    				}
                
                    else
                    {
                    	TribleDes td=new TribleDes();
                    	decontent=td.decrypt(filecontent);
                    }
                
                System.out.println("decontent===="+decontent);
                filepath2 = workspacepath + "\\FileHub\\WebContent\\Decrypt\\"+ filename;
                File file2 = new File(filepath2);
                file2.createNewFile();
                if (!file.exists()) {file.createNewFile();}// If file doesn't exists, then create it
                FileWriter fw1 = new FileWriter(file2.getAbsoluteFile());
				BufferedWriter bw1 = new BufferedWriter(fw1);
                bw1.write(decontent);// Write in file
                bw1.close();// Close connection
                System.out.println("fileeeeeeeeeeeeeeeee" + filepath2);
   
                
                }// try close
                
			
     
			catch (Exception e) {
				System.out.println(e);
			}
              
			}// if close
       
                
			
			if(li.get(0)!=null){
				key12=li.get(0).toString();
				ownername123=li.get(1).toString();
			}

			
			
			DataOwnerBean up = new DataOwnerBean();
			
			System.out.println("filename.........."+filepath1);

			System.out.println("filepath........."+filepath1);
			
			System.out.println("owner name............////////////////////...........///////"+ownername123);
			
			System.out.println("key valuesss are " + key12);
			
			
			String hashvalueget=Integer.toString(hashcodevalue);
			
			up.setKey(hashvalueget);
			up.setFilepath(filepath1);
			up.setFilename(filename);
            up.setOwner(ownername123);
			CommanInterface lo = new CommanImplementation();

			int q = lo.encrypt11(up);
			
			
			if (q == 1)
			{

				response.sendRedirect("DataOwnerUpload.jsp");
			}
			
			else {
				response.sendRedirect("error.jsp");
			}
	}
}
			
                
			



	             
			
             
