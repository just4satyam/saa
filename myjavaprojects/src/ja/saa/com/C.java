package ja.saa.com;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	An interface reference can point
		to any object of a class that implements this interface*/
		
	//case 1:	
		A a=new A();
		a.display();
		a.a_display(); // non interface method.
		
		//output  :  ====A display====
/* Exp: In the above code we defined referance variable "a" as A class type,
  		in order to call display() method which A class implemented.*/
		
	//case 2: Now if we want to use display method in B class we will do following code
		
		B b=new B();
		b.display();
		
		//output     : 		====B display====
/*   Exp: In the above code we defined referance variable "b" as B class type,
   		in order to call display() method which B class implemented. */
		
		Inn i=new A(); //new B() to access B class display()
		i.display();
		/*i.a_display(); this gives an error, since interface referance cannot
		point to non interface methods*/
		
		//output  :  ====A display====
		
/*		Exp: The above code states that object of "A" class was stored in "i" variable
			 which is of "Inn" interface type. Since A implements Inn, so Inn type varables
			 can call all methods in that Interface. 
			 
			 So display() which belongs to Inn and implemented by A class can be accesed 
			 by "i" varable. 
			 this results i.display() to give output "====A display====".
		in case2:
			 Now if I want to access display() in B implementation we simple need
			 TO CHANGE ONLY ONE LINE " ie OBJECT CREATION"
			 Inn i= new B();
				i.display();
		
		//output  :  ====B display====
			 */
   		
	/*Now we can state that "Inn" Interface reference "i" is going point any
	class object "A" or "B"	that implements "Inn"
		NOTE: AN INTERFANCE REFERENCE CANNOT POINT TO NON INTERFACE MENTHODS IN A CLASS 
		*/
	}
}

