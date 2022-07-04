public class Test {
    public static void main(String[]args) {
        Copycons c1 = new Copycons("Pritam",55.15);
        Copycons cloneofc1 = new Copycons(c1);
        c1.setName("pkkkkk");
        System.out.println("First student name is "+c1.getName());
        System.out.println("Clone student name is "+cloneofc1.getName());