public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        // Пример 1: Рост 1.75 м, вес 70 кг
        int bmi1 = bmiService.calculate(1.75, 70);
        System.out.println("Индекс массы тела (BMI): " + bmi1); // Ожидаемый результат: 23

        // Пример 2: Рост 1.80 м, вес 85 кг
        int bmi2 = bmiService.calculate(1.80, 85);
        System.out.println("Индекс массы тела (BMI): " + bmi2); // Ожидаемый результат: 26

        // Пример 3: Рост 1.65 м, вес 50 кг
        int bmi3 = bmiService.calculate(1.65, 50);
        System.out.println("Индекс массы тела (BMI): " + bmi3); // Ожидаемый результат: 18
    }
}