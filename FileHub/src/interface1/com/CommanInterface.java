package interface1.com;


import bean.com.DataOwnerBean;
import bean.com.RegisterBean;
import bean.com.RegisterBeanO;


public interface CommanInterface {

	public int register(RegisterBean refbean);
	
	public int registerO(RegisterBeanO refbeanO);
	
	public boolean login(RegisterBean loginref);
	
	public boolean loginO(RegisterBeanO loginref);

	public int encrypt11(DataOwnerBean up);
	
	
	
	}
	
	
	
	

