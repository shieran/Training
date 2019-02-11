import java.util.ArrayList;

public class AppRun {
    public static void main(String[] args) {
        Fraction firstFraction = new Fraction(3, 4);
        Fraction secondFraction = new Fraction(1, 4);
        Fraction thirdFraction = new Fraction(2, 4);
        Fraction fourthFraction = new Fraction(-1, 4);//попытка создания невалидного объекта
        System.out.println();

        ArrayList<Fraction> fractions = new ArrayList<>();//создание коллекции для проверки метода compareTo
        fractions.add(firstFraction);
        fractions.add(secondFraction);
        fractions.add(thirdFraction);

        fractions.sort(Fraction::compareTo);//проверка метода compareTo
        for (Fraction fraction: fractions) {
            System.out.println(fraction.toString());
        }
        System.out.println();


        System.out.println(firstFraction.addFractions(secondFraction));//сложение дробей
        System.out.println(firstFraction.multiplyFractions(secondFraction));//умножение дробей
        System.out.println();

        System.out.println(Fraction.fractionReduction(new Fraction(21, 14)).toString() + "\n");//сокращение дробей
        System.out.println(Fraction.fractionReduction(new Fraction(16, 3)).toString() + "\n");
        System.out.println(Fraction.fractionReduction(new Fraction(16, 24)).toString() + "\n");
    }
}
