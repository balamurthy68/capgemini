package accessmodifiers;

public class student extends person{
	  private int graduationYear = 2018;
	  public static void main(String[] args) {
	    student myObj = new student();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
}
	  }
	  
