package Constructor;

public class Default_Constructor {
	
	//Let us see another example of default constructor  
	//which displays the default values  
	public class condefalult {
			int id=100;  
			String name="Gopi";
			condefalult(){
				System.out.println(id+" "+name);
			}
					
					//method to display the value of id and name  
			 void display(){
				System.out.println(id+" "+name);
				
				}  
		public void main(String args[]){  
			//creating objects  
				condefalult s1=new condefalult();  
				
				condefalult s2=new condefalult();  
			//displaying values of the object  
			s1.display();  
			s2.display();  
			}  

	}

}
