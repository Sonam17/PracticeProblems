
public class MySingletonClass {

	private static MySingletonClass instance=null;

	//exists only to deafeat instantiation
	private MySingletonClass(){
	}
	
	
	public static MySingletonClass getInstance(){
		if(instance==null){
			instance  = new MySingletonClass();
		}
		return instance;
	}
	
}
