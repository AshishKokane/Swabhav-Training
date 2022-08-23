class Hello
{
 public static void main(String args[]) throws Exception {    
  Class c=Class.forName(args[0]);    
  System.out.println("Class Name: "+c.getName());    
 }    
}




