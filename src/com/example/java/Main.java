package com.example.java;

public class Main {

    public static void main(String[] args) {

        /* This program was created to test a try with multiple catches that you can customize the message
        *  to give more intuitive information instead of letting the printStackTrace method display a message
        *  that might otherwise might not give enough description of problem.
        *  */

        String welcome = "Welcome!";
        char [] chars = welcome.toCharArray();

        //quick tip select the code you want to add a try and catch. Then go to title bar select "code -> surround with"

        try {
//            char lastChar = chars[chars.length];  // this line of code will invoke the first exception error
            char lastChar = chars[chars.length-1];  // this line of code will fix the first exception error
            System.out.println(lastChar);

            String sub = welcome.substring(10);

        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();                        //here you get the compiler's error message.
            System.out.println("Array index problem. ");  //Here you are customize the error message
        } catch (StringIndexOutOfBoundsException e){
//            e.printStackTrace();                        //here you get the compiler's error message.
            System.out.println("String index problem. "); //you should get this message since the array is size 8
        }


    }
}
