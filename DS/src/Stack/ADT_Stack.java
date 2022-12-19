package Stack;

public interface ADT_Stack <T> {

    public boolean push (T newEntry); //새로운 요소 넣음

    public T pop (); //맨 위에 있는 요소 꺼내고 무엇인지 확인

    public T peek (); //맨 위에 있는 요소가 무엇인지 확인만

    public boolean isEmpty (); //비어있는지 확인

    public void clear(); // 안에있는 모든 요소 꺼냄

}
