package Pro.src;

public class Staticvariable1 {
		//class1
		   int rollno;	//integer variable  
		   String name;  
		   float fee;
		   //static String college ="SRM";		//static variable  
			//static void change
			//college="ITC";
		   //constructor  
		   Staticvariable1 (int rollno, String name, float fee){  
		  this.rollno = rollno;  
		   this.name = name;  
		  this.fee=fee;
		   }  
		   //method  
		   void display (){
			System.out.println(rollno+" "+name+" "+fee);
		  
		}  
		//Test class to show the values of objects 
		 
		public class Staticvariable{  		//class2
		 public static void main (String[] args){  
			//StaticVariable1.change();
			//objects
		    Staticvariable1 s1 = new Staticvariable1(111,"Arnab",5000);  
		    Staticvariable1 s2 = new Staticvariable1(555,"Virat",6000);   
		    s1.display();  
		    s2.display();  
		 }  
		} 
		}


