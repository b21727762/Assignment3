import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public  class Salami implements ToppingDecorator {

    String nameOfSalami = "Salami";
    double costofSalami = 3;
    public Salami(){

    }
    public Salami(ToppingDecorator topping){
        costofSalami += topping.getCost();
        nameOfSalami += " "+topping.getTopping();
    }

    public void addTopping(ToppingDecorator object) {
        costofSalami += object.getCost();
        nameOfSalami +=" "+ object.getTopping();
    }

    public String getTopping(){
        return nameOfSalami;
    }

    public double getCost(){
        return  costofSalami;
    }
}
