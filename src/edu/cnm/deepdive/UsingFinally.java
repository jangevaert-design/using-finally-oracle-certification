package edu.cnm.deepdive;

public class UsingFinally {

  public static void main(String[] args) {
      String[] array = new String[5];//all 5 elements have been initialized to null.

//      String element = firstToUppercase(array);// we will get a NullPointerException because we are
//    calling the method on a String with elements that have been initialized to null.
//    System.out.println("element = " + element);

    try {
      String element = firstToUppercase(array);
      System.out.println("element = " + element);
    } catch (NullPointerException npe) {
      System.out.println("Error message = " + npe.getMessage());
    } finally {
      System.out.println("finally block");// prints: Error message = null - finally block
    }

    array[0] = "John";
    try {
      String element = firstToUppercase(array);
      System.out.println();
      System.out.println("element = " + element);
    } catch (NullPointerException npe) {
      System.out.println("Error message = " + npe.getMessage());
    } finally {
      System.out.println("finally block");//prints: element = JOHN - finally block
    }

    //exam question:

    String str = "";

    try {
      str += "a";
    } catch(Exception e) {
      str += "b";
    } finally {
      str += "c";
    }
    str += "d";
    System.out.println();
    System.out.println(str);// will print acd as try block - then finally - then line 43.


  String st = "";

     try {
       int result = 10/0;
    st += "a";
  } catch(Exception ex) {
    st += "b";
  } finally {
    st += "c";
  }
  st += "d";
    System.out.println();
     System.out.println(st);// will print bcd as catch block - then finally - then line 43.
}

  public static String firstToUppercase(String[] array) {
    return array[0].toUpperCase();
  }

}
