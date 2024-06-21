public class myDetails {
    public static void main(String[] args) {
        Hello myObj = new Hello();
        myObj.setName("Naphtali");
        System.out.println("My Name is: " + myObj.getName());
        myObj.setAge(25);
        System.out.println("I'm " + myObj.getAge() + " years old.");
        myObj.setContact("0716220216");
        System.out.println("My phone number is: " + myObj.getContact());
    }
}
