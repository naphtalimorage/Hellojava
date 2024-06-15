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

        /**
         * Primitive Datatypes
         */
        byte num1= 127;
        short num2 = 32668;
        int num3 = 2147483548;
        long num4 = 4000000000000l;
        boolean on = true;
        char grade = 'D';
        float points = 5.6f;

        /**
         * conversion
         */

        byte b= 12;
        int i= 256;
        i = b;  //converted byte to integer


        short s = 256;
        int t = 1200;
        t=s;  //converting short into integer
        /**
         * casting
         */

        short f= 24;
        int r=2400;
        r = (short) f;
        System.out.println(r);

    }
}