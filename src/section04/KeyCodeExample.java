package section04;

public class KeyCodeExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keycode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        while (true){
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
        }

    }
}
