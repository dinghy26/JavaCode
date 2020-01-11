public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World \n Brake line");

        Test();
        math();
        loop();
        
    }

    public static void Test() {
        System.out.println("This is a new Method");
    }

    public static void math() {
        int x = 5;
        int w = 5;
        int t = x + w;
        t ++;

        System.out.println("");
    }

    public static void loop(){
        int p = 5;
        for (int i = 0; i <= 5; i++) {
            System.out.println(i + "=" + p++);
        }
    }

}