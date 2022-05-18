
public class App {

	public App() 
	{
		System.out.println("in the constructor");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World from Geeta!!");

		App a = new App();
		
		Student st =  new Student();
		st.setsName("Geeta Kavitkar");
		st.setRollNumber(1);
		
		System.out.println(st);
	}

}
