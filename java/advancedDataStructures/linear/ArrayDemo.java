import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayDemo{

    /*  
    ----------
    Array Demo
    ----------

    1) In java all arrays are dynamically allocated
    2) Arrays are sorted consecutively
    3) Since Arrays are objects we can find their lengths
    4) The size of an array must be specified by int or short value and not long.
    5) This storage of arrays helps us in randomly accessing the elements of an array 
    (different from queuing or stacking)
    6) The size of the array cannot be altered (once initialized).  However, an array 
    reference can be made to point to another array.
    7) The elements in the array allocated by new will automatically be initialized to
    zero (for numeric types), false (for boolean), or null (for reference types)
    
    */
    public static void main(String[] args) {
    
        int[] intArray;
        byte byteArray[];
        short shortsArray[];
        boolean booleanArray[];
        long longArray[];
        float floatArray[];
        double doubleArray[];
        char charArray[];
        
        // an array of references to objects of
        // the class MyClass (a class created by
        // user)
        // MyClass myClassArray[]; 

        // To use 'new' to allocate an array, you must specify the type and number of elements to allocate.
        intArray = new int[20];  // allocating memory to array
        // You can also decleare and allocate in the same line 
        // int[] intArray = new int[20]; // combining both statements in one

        //Array Literal
        int[] intArrayLiteralExample = new int[]{1,2,3,4,5,6}; 
        //The length of this array determines the length of the created array.        
        //There is no need to write the new int[] part in the latest versions of Java.

        //For each can be used to scan through an array
        for (int i : intArrayLiteralExample) {
            System.out.print(i);
        }
        System.out.println("");

        //Also you can clone arrays
        int[] cloneArray = intArrayLiteralExample.clone();
        //but it will not equal to the array before
        //you must check it with .equals()
        if(cloneArray == intArrayLiteralExample)
            System.out.println("1: true");
        else
            System.out.println("1: false");
        if(cloneArray.equals(intArrayLiteralExample))
            System.out.println("2: true");
        else
            System.out.println("2: false");
        for (int i : cloneArray) {
            System.out.println(i);
        }

        // but == can check equality for subarrays of the same array
    }
}