

public class calculator {

    double numberOne, numberTwo;
    String calculatorName;

    calculator(double thisNumberOne, double thisNumberTwo, String thisCalcName){
        numberOne = thisNumberOne;
        numberTwo = thisNumberTwo;
        calculatorName = thisCalcName;
    }
 
    
    void displayResults(){
        System.out.println("------------" +calculatorName+ "--------------");
        System.out.println(">>RESULTS FOR " + numberOne + " & " + numberTwo + " ARE: ");
        System.out.println("Addition: " + add(numberOne,numberTwo));
        System.out.println("Subtraction: " +subtract(numberOne,numberTwo));
        System.out.println("Multiply: " +multiply(numberOne,numberTwo));
        System.out.println("Divide: " +divide(numberOne,numberTwo));
    }

    double add(double thisNumberOne, double thisNumberTwo){
        return thisNumberOne + thisNumberTwo;
    }
    
    double subtract(double thisNumberOne, double thisNumberTwo){
        return thisNumberOne - thisNumberTwo;
    }

    double multiply(double thisNumberOne, double thisNumberTwo){
        return thisNumberOne * thisNumberTwo;
    }

    double divide(double thisNumberOne, double thisNumberTwo){
        return thisNumberOne / thisNumberTwo;
    }

    public static void main(String[] args) {
        calculator calc1 = new calculator(10, 20, "caclulator 1");
        calculator calc2 = new calculator(20, 10, "calculator 2");
        calc1.displayResults();
        calc2.displayResults();

    }
}
