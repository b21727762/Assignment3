import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Neopolitan implements ToppingDecorator   {
    String nameOfNapolitan = "Neopolitan";
    double costofNapolitan = 10;
    public Neopolitan(){

    }
    public Neopolitan(ToppingDecorator topping){
        costofNapolitan += topping.getCost();
        nameOfNapolitan += " "+topping.getTopping();
    }
    public void addTopping(ToppingDecorator object) {
        costofNapolitan += object.getCost();
        nameOfNapolitan += " "+object.getTopping();
    }

    public String getTopping(){
        return nameOfNapolitan;
    }

    public double getCost(){
        return  costofNapolitan;
    }
}
