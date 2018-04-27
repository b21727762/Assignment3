import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Soudjouk implements ToppingDecorator {

    String nameOfSoudjouk = "Soudjouk";
    double costofSoudjouk = 3;
    public Soudjouk(){

    }
    public Soudjouk(ToppingDecorator topping){
        costofSoudjouk += topping.getCost();
        nameOfSoudjouk +=" "+ topping.getTopping();
    }

    public void addTopping(ToppingDecorator object) {
        costofSoudjouk += object.getCost();
        nameOfSoudjouk += " "+object.getTopping();
    }

    public String getTopping(){
        return nameOfSoudjouk;
    }

    public double getCost(){
        return  costofSoudjouk;
    }
}
