package inheritance001.section;

public class DmbCellPhone extends Cellphone {
    //D폰이 상속받음 cellphone에게
    //필드
    int channel;

    //생성자
    DmbCellPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
        //부모클래스로부터 상속받은 필드
    }
    void turnOnDmb() {
        System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
    }
    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널" + channel + "번으로 바꿉니다");
    }
    void turnOffDmb() {
        System.out.println("DMB방송 수신을 멈춥니다.");
    }
}
