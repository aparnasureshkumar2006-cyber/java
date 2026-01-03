package CalculatorSystem;

public class Multiplier extends Calculator implements MultiplierInterface{
    ;

    public Multiplier(String calculatorId,UserInterface user){
        this.setCalculatorId(calculatorId);
        this.setUser(user);
    }
    public Multiplier(){

    }
    @Override
    public void compute(){
        this.setResult(getUser().getNum1()*getUser().getNum2()*getUser().getNum3());
        System.out.println(this.getResult());
    }
}
