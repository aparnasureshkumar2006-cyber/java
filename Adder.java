package CalculatorSystem;

public class Adder extends Calculator implements AdderInterface{

    public Adder(String calculatorId,UserInterface user){
        this.setCalculatorId(calculatorId);
        this.setUser(user);
    }
    public Adder(){

    }
    @Override
    public void compute(){
        this.setResult(getUser().getNum1()+getUser().getNum2()+getUser().getNum3());
        System.out.println(this.getResult());
    }


}
