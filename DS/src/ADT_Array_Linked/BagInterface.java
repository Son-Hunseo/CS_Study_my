package ADT_Array_Linked;

public interface BagInterface <T> {

    public int getCurrentSize (); //가방 안에 들어있는 품목의 개수

    public boolean isFull (); //가방이 가득 찼는지?

    public boolean isEmpty (); //가방이 비어있는지?

    public boolean add (T newEntry); //새로운 품목을 가방안에 넣음, 성공 여부 반환

    public T remove (); //특정되지 않은 항목을 제거하고, 제거에 성공하였을 경우 제거된 품목이 무엇인지 반환, 실패하였을 경우 null 반환

    public boolean remove (T anEntry); //특정 항목을 제거하고 성공 여부 반환

    public void clear (); //가방에 있는 모든 품목 제거

    public int getFrequencyOf (T anEntry); //특정 품목의 개수 반환

    public boolean contains (T anEntry); //특정 품목이 들어있는지의 여부 반환

    public T [] toArray (); //가방에 있는 모든 품목을 Array형태로 생성하여 반환

}
