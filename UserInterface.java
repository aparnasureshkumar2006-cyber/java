package CalculatorSystem;

public interface UserInterface {
    public int getNum1();
    public void setNum1(int num1);
    public int getNum2();
    public void setNum2(int num2);
    public int getNum3();
    public void setNum3(int num3);
    public String getCalculatorType();
    public void setCalculatorType(String calculatorType);
    public CalculatorInterface getAdder();
    public void setAdder(CalculatorInterface adder);
    public CalculatorInterface getMultiplier();
    public void setMultiplier(CalculatorInterface multiplier);

}
