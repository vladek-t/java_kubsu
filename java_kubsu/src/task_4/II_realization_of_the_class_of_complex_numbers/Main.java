package task_4.II_realization_of_the_class_of_complex_numbers;

public class Main {
    public static void main(String[] args) {
    	ComplexNumber z = new ComplexNumber(3, 4);
    	ComplexNumber inverseZ = z.inverse();

    	System.out.println("Оригинальное комплексное число: " + z.getReal() + " + " + z.getImaginary() + "i");
    	System.out.println("Обратное комплексное число: " + inverseZ.getReal() + " + " + inverseZ.getImaginary() + "i");
    }
}