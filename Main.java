package CalculatorSystem;

/* *Assignment: Calculator System*

*Entities:* User, Adder, Multiplier

─────────────────
*LEVEL 1: Basic (V1)*
─────────────────

*User.java*
• num1, num2, num3, calculatorType
• calculatorId, result
• getters/setters

*Adder.java*
• calculatorId, result
• num1, num2, num3
• getters/setters
• compute() → num1 + num2 + num3

*Multiplier.java*
• calculatorId, result
• num1, num2, num3
• getters/setters
• compute() → num1 * num2 * num3

*Main:* Pass data User → Main → Adder/Multiplier → Main → User


*Note all should be with Terminal inputs*

─────────────────
*LEVEL 2: Association (V2)*
─────────────────

*Problem:* Main is middleman

*Solution:* Share addresses!

*User:*
• Remove: calculatorId, result
• Add: adder variable, multiplier variable

*Adder:*
• Remove: num1, num2, num3
• Add: user variable

*Multiplier:*
• Remove: num1, num2, num3
• Add: user variable

─────────────────
*LEVEL 3: Redundancy (Abstract)*
─────────────────

*Problem:* Adder & Multiplier have duplicate code

*Solution:* Create abstract class!
─────────────────
*LEVEL 4: Security (Interface)*
─────────────────

*Problem:* Implementation exposed

*Solution:* Create interfaces!

*CalculatorInterface*
• getCalculatorId(), setCalculatorId()
• getResult(), setResult()
• compute()

*AdderInterface extends CalculatorInterface*

*MultiplierInterface extends CalculatorInterface*

*Updated Classes:*
• Calculator implements CalculatorInterface
• Adder extends Calculator implements AdderInterface
• Multiplier extends Calculator implements MultiplierInterface

─────────────────
*LEVEL 5: Overloading*
─────────────────

*Concept:* Same method name, different parameters

*Add to Calculator.java:*

calculate(int a) → return a + a

calculate(int a, int b) → return a + b

calculate(int a, int b, int c) → return a + b + c

*Usage in Main:*
calculator.calculate(5) → 10
calculator.calculate(5, 3) → 8
calculator.calculate(5, 3, 2) → 10

─────────────────
*LEVEL 6: Overriding*
─────────────────

*Concept:* Child changes parent's method

*Calculator (Parent):*
compute() → num1 + num2

*Adder (Child) - OVERRIDES:*
@Override compute() → num1 + num2 + num3

*Multiplier (Child) - OVERRIDES:*
@Override compute() → num1 * num2 * num3
─────────────────
*INPUT:*
─────────────────

User1: num1=5, num2=3, num3=2, type=Adder
User2: num1=4, num2=3, num3=2, type=Multiplier

─────────────────
*OUTPUT:*
─────────────────

*USER1 (Adder):*
Overload: 10, 8, 10
Override: 10

*USER2 (Multiplier):*
Overload: 8, 7, 9
Override: 24

─────────────────
*PROGRESSION:*
─────────────────

 Level 1 → V1 Basic (Separate classes, Main passes data)
 Level 2 → V2 Association (Objects hold references)
 Level 3 → Abstract class (Remove redundancy)
 Level 4 → Interface (Add security)
 Level 5 → Overloading (Same name, different params)
 Level 6 → Overriding (Child changes parent method)
 */

import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        UserInterface user1=new User();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1:");
        BigInteger inputNo1=new BigInteger(sc.nextLine());
        System.out.println("Enter number 2:");
        BigInteger inputNo2=new BigInteger(sc.nextLine());
        System.out.println("Enter number 3:");
        BigInteger inputNo3=new BigInteger(sc.nextLine());
        System.out.println("Enter Calculator Type:");
        String inputType=sc.nextLine();

        user1.setNum1(inputNo1.intValue());
        user1.setNum2(inputNo2.intValue());
        user1.setNum3(inputNo3.intValue());
        user1.setCalculatorType(inputType);

        if(user1.getCalculatorType().equals("Adder")){
            AdderInterface add=new Adder("AZ1",user1);
            System.out.println("====Adder1====");
            add.setUser(user1);
            System.out.println("Overload");
            System.out.println(add.calculate(5));
            System.out.println(add.calculate(5,5));
            System.out.println(add.calculate(5,5,5));
            System.out.println("Override");
            add.compute();

        }
        else{
            MultiplierInterface mul=new Multiplier("BE1",user1);
            System.out.println("====Multiplier1====");
            mul.setUser(user1);
            System.out.println("Override");
            mul.compute();
        }

        UserInterface user2=new User();

        Scanner sca=new Scanner(System.in);
        System.out.println("Enter number 1:");
        BigInteger inputNo=new BigInteger(sca.nextLine());
        System.out.println("Enter number 2:");
        BigInteger inputNo4=new BigInteger(sca.nextLine());
        System.out.println("Enter number 3:");
        BigInteger inputNo5=new BigInteger(sca.nextLine());
        System.out.println("Enter Calculator Type:");
        String inputType1=sca.nextLine();

        user2.setNum1(inputNo.intValue());
        user2.setNum2(inputNo4.intValue());
        user2.setNum3(inputNo5.intValue());
        user2.setCalculatorType(inputType1);

        if(user2.getCalculatorType().equals("Adder")){
            AdderInterface add=new Adder("AZ1",user2);
            System.out.println("====Adder2====");
            add.setUser(user2);
            System.out.println("Overload");
            System.out.println(add.calculate(5));
            System.out.println(add.calculate(5,5));
            System.out.println(add.calculate(5,5,5));
            System.out.println("Override");
            add.compute();
        }
        else{
            MultiplierInterface mul=new Multiplier("BE1",user2);
            System.out.println("====Multiplier2====");
            mul.setUser(user2);
            System.out.println("Override");
            mul.compute();
        }
    }
}
