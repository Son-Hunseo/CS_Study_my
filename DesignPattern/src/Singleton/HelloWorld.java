package Singleton;

class Singleton {
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //멀티쓰레드 환경에서 두 개 이상의 쓰레드 인스턴스를 획득하기위해
    //getInstance() 메쏘드에 진입하여 경합하는 과정에서
    //두 개의 다른 인스턴스가 만들어지는 경우를 방지하기 위해서 synchronized 사용
    public static synchronized Singleton getInstance() {
        return singleInstanceHolder.INSTANCE;
    }


}

public class HelloWorld {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        if (a==b) {
            System.out.println(true);
        }

    }
}
