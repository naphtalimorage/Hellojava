class Hello {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//        /**
//         * Variables
//         */
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
//

//    /**
//     * working with Methods
//     */
//    static void addTwoNumbers() {
//        int num1 = 20;
//        int num2 = 20;
//        int result = num1 + num2;
//        System.out.println(result);
//    }
//
//    public static void main(String[] args) {
//        addTwoNumbers();
//    }

//
//
//    /**
//     * working with class methods (public)
//     */
//
//    public void takeDetails(String fname, String lname , int age ) {
//        System.out.println("My Name is " + fname +" "+ lname + " and am " + age +" years old.");
//    }

    /**
     * working with constructors
     */

     String fname;
     String lname;
     int age;

     public Hello() {
          fname = "Naphtali";
          lname = "Morage";
          age = 20;
     }
}