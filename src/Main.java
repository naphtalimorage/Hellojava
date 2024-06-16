class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        /**
         * Variables
         */
//        int num1= 2;
//        int num2= 4;
//        int result= num1 + num2;
//        System.out.println(result);


//        /**
//         * Operators
//         */
//        int num1 = 25;
//        int num2=5;
//        int results1= num1 + num2; //addition operator
//        int results2= num1 - num2; // minus operator
//        int results3= num1 / num2; //division operator
//        int results4= num1 % num2; //modulus operator
//        int results5= num1++;    // post-increment operator
//        int results6= ++num1;    // pre-increment operator
//        System.out.println(results1);
//        System.out.println(results2);
//        System.out.println(results3);
//        System.out.println(results4);
//        System.out.println(results5);
//        System.out.println(results6);


//        /**
//         * relational operators
//         */
//
//        int num1= 12;
//        int num2=12;
//        boolean results1= num1 > num2;
//        boolean results2= num1 < num2;
//        boolean results3= num1 >= num2;
//        boolean results4= num1 <= num2;
//        boolean results5= num1 == num2;
//        boolean results6= num1 != num2;
//        System.out.println(results1);
//        System.out.println(results2);
//        System.out.println(results3);
//        System.out.println(results4);
//        System.out.println(results5);
//        System.out.println(results6);
//
//        /**
//         * logical operators
//         */
//        int num1= 12;
//        int num2=12;
//        boolean results1= num1 > num2 && num1 < num2; // LOGICAL AND operator
//        boolean results3= num1 >= num2 || num1 <= num2;  // LOGICAL OR operator
//        boolean results5= num1 == num2;
//        System.out.println(results1);
//        System.out.println(results3);
//        System.out.println(!results5); //NEGATION
        /**
         * if -else statements
         */
        int age = 18;
        if(age < 18) {
            System.out.println("Sorry! You are not qualified ");
        } else {
            System.out.println("Congratulation You qualify ");
        }

        /**
         * if - else-if
         */
        int number1 = 20;
        if(number1 < 10) {
            System.out.println("Number is less than 10");
        } else if(number1 < 20) {
            System.out.println("Number is less than 20");
        } else {
            System.out.println("Number is greater");
        }

        /**
         * for loop
         */
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /**
         * while loop
         */

        int count = 0;
        while(count < 10) {
            System.out.println(count);
            count++;
        }

        /**
         * do - while loop
         */
        int count = 0;
        do{
            System.out.println(count);
            count++;
        } while(count < 10);
    }
}