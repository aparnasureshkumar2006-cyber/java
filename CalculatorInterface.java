package CalculatorSystem;

public interface CalculatorInterface {
    public String getCalculatorId();
    public void setCalculatorId(String calculatorId);
    public int getResult();
    public void setResult(int result);
    public UserInterface getUser();
    public void setUser(UserInterface user);
    public int calculate(int a);
    public int calculate(int a,int b);
    public int calculate(int a,int b,int c);
}
