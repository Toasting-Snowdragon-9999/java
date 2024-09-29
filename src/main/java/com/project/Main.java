import com.math.ComplexNumbers;

public class Main {
    public static void main(String[] args) {
        ComplexNumbers test1 = new ComplexNumbers(3, 2);
        ComplexNumbers test2 = new ComplexNumbers(5, 4);
        ComplexNumbers result = test1.multiplication(test2);
        result.print();
        ComplexNumbers test3 = new ComplexNumbers(3, 2);
        ComplexNumbers test4 = new ComplexNumbers(5, 4);
        ComplexNumbers result2 = test3.add(test4);
        ComplexNumbers test5 = new ComplexNumbers(1, 4);
        ComplexNumbers result3 = test3.sub(test5);

        result2.print();
        result3.print();
    }
}