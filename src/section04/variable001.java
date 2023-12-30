package section04;


import java.util.Scanner;

public class variable001 {
    public static void main(String[] args) {
        /*이름: 이수민
        * 나이: 25
        * 전화: 010-8380-0311 */

        /*int name = "이수민";
        int age = 25;
        String tel1 = "010", tel2="8380", tel3="0311";

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("전화: " + tel1 + "-" + tel2 + "-" + tel3 );*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 수: ");
        String strNum1 = "19";

        System.out.print("두번째 수:");
        String strNum2 = "20";

        int num1 = Integer.valueOf(strNum1);
        int num2 = Integer.valueOf(strNum2);

        int result = num1 + num2;
        System.out.println("덧셈 결과:" + result);

        /*Scanner를 이용해서 이름, 주민번호 앞 6자리, 전화번호를 키보드에서 입력받고 출력하는 코드를 작성하세요*/
        String name5;
        String age6;
        int IdNum;
        int phoneNum;

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("이름을 입력하세요");
        name5 = scanner.next();
        System.out.println("나이를 입력하세요");
        age6 = scanner.next();
        System.out.println("주민번호 앞 6자리를 입력하세요");
        int idNum = scanner.nextInt();
        System.out.println("휴대폰 번호를 입력하세요");
        phoneNum = scanner.nextInt();

        System.out.println(name5);
        System.out.println(age6);
        System.out.println(idNum);
        System.out.println(phoneNum);





    }
}
