package ADT_Array_Linked;

public class ArrayBag <T> implements BagInterface <T> {

    private  T [] bag; //final이 들어가야하나 final로는 blank상태로 생성 할 수 없어서 final 을 제외하였다
    private static final int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    public ArrayBag () {
        this (DEFAULT_CAPACITY);
    } // default constructor

    public ArrayBag (int capacity) {
        numberOfEntries = 0;
        T [] tempBag = (T []) new Object [capacity];
        bag = tempBag;

    } // constructor with given initial capacity


    public boolean add(T newEntry) {
        boolean result = true;
        if (isFull()) {
            result = false;
        }
        else {
            bag[numberOfEntries] = newEntry;
            numberOfEntries++;
        }
        return result;
    }

    public boolean isFull() {
        return numberOfEntries == bag.length;
    }

    public T[] toArray() {
        T[] result = (T[])new Object[numberOfEntries];
        for (int index = 0; index < numberOfEntries; index++) {
            result[index] = bag[index];
        }
        return result;
    } //bag자체의 레퍼런스를 그대로 return 하면 다른사람이 주소에 직접 접근을 하는 문제가 생길 수 있다.
    //따라서 copy를 만들어 return 하는것이 좋다.

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public int getCurrentSize() {
        return numberOfEntries;
    }

    public int getFrequencyOf(T anEntry) {
        int counter = 0;

        for (int index = 0; index < numberOfEntries; index++) {
            if (anEntry.equals(bag[index])){
                counter++;
            }
        }
        return counter;
    }

    public boolean contains(T anEntry) {
        boolean found = false;

        for (int index = 0; !found && (index < numberOfEntries); index++) {
            if (anEntry.equals(bag[index])) {
                found = true;
            }
        }
        return found;
    }

    public void clear() {
        numberOfEntries = 0;
    } //numberOfEntires가 0이 되어도 array자체는 메모리에 남아있다. 하지만 나중에 GC가 collect하기 때문에 상관없음

    public T remove() {
        T result = null;
        if (numberOfEntries >0) {
            result = bag[numberOfEntries -1];
            bag[numberOfEntries -1] = null;
            numberOfEntries--; //특정 entry를 지우는 것이 아닌 마지막 index에 위치한 entry 삭제
        }
        return result;
    }

    public boolean remove(T anEntry) {
        boolean result = false;

        for (int index = 0; index<numberOfEntries; index++) {
            if (anEntry.equals(bag[index])) {
                bag[index] = null;
                result = true;
            }
        }
        return result;
    } //remove된 entry보다 뒤에 있는 entry 들을 한 칸씩 shift해주고 numberOfEntrie--하는 구현이 추가적으로 필요함
}
