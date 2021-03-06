// This explaination shows Java operators and the working of Logical operators with examples
package Java;

public class Operators {                                       // For the program to run, ensure the class holds the same name as the file name
    public static void main(String[] args) {
        int total1 = 120 + 123;                             // The assignment operator (=) and addition (+) in Java
        int total2 = total1 + 459;                          // The assignment operator (=) and addition (+) in Java
        int total3 = total2 + total1;                       // The assignment operator (=) in Java
        int num1 = 33;                                      // The assignment operator (=) in Java
        num1 += 22;                                         // The addition assignment (+=) operator in Java
        int num2 = 21;
        int num3 =num2 * num2;                              // Product operator in Java
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        int number4 = 40;
        int number5 = 40;
        System.out.println("|=============================================|");
        System.out.println(number1 < number2 && number2 < number3);         // Will return True
        System.out.println(number1 < number3 && number3 > number4);         // Will return False
        System.out.println(number1 < 20 && number4 > 39);                   // Will return True
        System.out.println(number1 > 5 && number2 < 18);                    // Will return False
        System.out.println(number2 > 80 && number2 > 32);                   // Will return False        
        // The || logical operator is used in returning true when of of the cross-examined statements are true
        // The below example helps in explaining this concepts
        System.out.println(number1 > number5 || number2 < number4);             // Will return True, one of the conditions is True, i.e., number2 is less than number4
        System.out.println(number3 > 5 || number2 < 12);                        // Will return True since all statements are True
        System.out.println(number3 < 15 || number5 < 24);                       // Will return False, since all statements are False


        // In this last section, we demonstrate the Logical not (!) statement
        // The statement works by reversing obtained results from the operation
        // That is, if the attained result is True, the Logical not returns False
        // Below is an Example, based on some of the previous workings [above]

        System.out.println(!(number3 < 15 || number5 < 24));                    // Will return True, i.e., Reverses the Result
        System.out.println(!(number1 < 20 && number4 > 39));                    // Will return False, i.e. there is Reversing the Result, which is True

        System.out.println("|=============================================|");

        // Logical and && returns true when both items in the statement are deemed true
        
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println("The product of "+num2+" and "+num2+" is: "+num3);       // In this section, there is also depicting concatenation with +
        
    }
    
}


// -------------------OUTPUTS---------------------
/*

|=============================================|
true
false
true
false
false
true
true
false
true
false
|=============================================|
243
702
945
55
21

*/
