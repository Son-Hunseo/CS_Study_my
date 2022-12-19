package DI;

//DI를 적용하지 않는 이 예시의 경우의 문제점
//두 '클래스'가 강하게 결합되어있음
//객체들 간의 관계가 아니라 클래스 간의 관계가 맺어짐
public class Store {

    private Pencil pencil;

    public Store () {
        this.pencil = new Pencil();
    }

}

class Pencil {
    private int length;
}
