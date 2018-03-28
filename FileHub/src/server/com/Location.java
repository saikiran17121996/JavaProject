package server.com;
import java.util.Random;


public class Location {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		String Locationkey;
		String ran1[]={"tnagar","tambaram","parrys","tindivanam","Manali","Madhavaram","viyasa","mailai","nagaram","velacherry","guindy","pallavaram","manimangalam","mailam","pondy","kovai","nagai","thanjavor"};
	
		Locationkey=(ran1[new Random().nextInt(ran1.length)]);
		
		System.out.println("loatons are ..............."+Locationkey);
		
		
		String publickey;
		String ran[]={"1","2","3","4","5","6","7","8","9","0","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String r1=(ran[new Random().nextInt(ran.length)]);
		String r2=(ran[new Random().nextInt(ran.length)]);
		String r3=(ran[new Random().nextInt(ran.length)]);
		String r4=(ran[new Random().nextInt(ran.length)]);
		String r5=(ran[new Random().nextInt(ran.length)]);
		publickey=r1+r2+r3+r4+r5;
	
		
		
	}

}
