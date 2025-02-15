public class BmiService {
    public int calculate(double heightInMeters, double weightInKilograms) {
        // Формула BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Округляем BMI до целого числа
        return (int) Math.round(bmi);
    }
}

