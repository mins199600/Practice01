package NewJavaa.section001;

public class example {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        int sum ;
        sum = num1 + num2;

        //new를 통해 계산기 객체 생성 (계산기 사온거임)
        Calculator001 calculator001 = new Calculator001();
        System.out.println(calculator001.add(1,3));
        System.out.println(calculator001.subtract(5,3));
    }

}



