package Factory;

//Super Class인 Coffee
abstract class Coffee {
    public abstract int getPrice(); //추상 메쏘드

    @Override
    public String toString() {
        return "Hi this coffee is " + this.getPrice();
    }
}
// Factory Class
class CoffeeFactory {
    public static Coffee getCoffee(String type, int price) {
        if ("Latte".equalsIgnoreCase(type)) {
            return new Latte(price);
        } else if ("Americano".equalsIgnoreCase(type)) {
            return new Americano(price);
        } else {
            return new DefaultCoffee();
        }
    }
}

//Sub Class인 DefaultCoffee, Latte, Americano

class DefaultCoffee extends Coffee {
    private int price;

    public DefaultCoffee() {
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Latte extends Coffee {
    private int price;

    public Latte(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Americano extends Coffee {
    private int price;

    public Americano(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

public class HelloWorld {
    public static void main(String[] arg) {
        Coffee latte = CoffeeFactory.getCoffee("Latte", 4000);
        Coffee ame = CoffeeFactory.getCoffee("Americano", 3000);
        System.out.println("Factory latte ::" + latte);
        System.out.println("Factory latte ::" + ame);
    }

}
