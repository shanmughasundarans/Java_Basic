package Method;

public class Overloading {


		class DisplayOverloading
		{
			 public  void display1(int a)
		    {
		    	 System.out.println( "rijin " +a);
		    }
		   public void display(char a, int num)  
		    {
		    	int c=10,  b=30;
		    	num=c+b;
		         System.out.println(a+" "+num);
		    }
		    public void display(String c)
		    {
		      System.out.println(c);
		    }
		    public void display(int v)
		    {
		    	
		         System.out.println(v);
		    }
		    public void display(char v)
		    {
		    	  System.out.println(v);
		    }
		      
		}
		     
		public class moverload {

			public void main(String[] args) {
				// TODO Auto-generated method stub
				 DisplayOverloading w = new DisplayOverloading();
				
				 w.display1(60);
			     w.display("rate");
			     w.display1(88);
			     w.display('r');
			    // Overloading.display('z',10);      
			}

		}


}
