package inheritance001.section;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        //객체생성
       DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

       //CellPhone 클래스로부터 상속받은 필드
        System.out.println("모델: " + dmbCellPhone.model);
        System.out.println("색상: " + dmbCellPhone.color);

        //DmbCellPhone클래스의 필드
        System.out.println("채널: " + dmbCellPhone);

        //CellPhone 클래스로부터 상속받은 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동 입니다.");
        dmbCellPhone.sendVoice("아~ 예 반갑습니다");
        dmbCellPhone.hangup();

        //dmbCellPhone 클래스의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
   }
}
