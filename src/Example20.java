public class Example20 {
    /*TODO: 13. Сделайте вариант вычисление a^b
        с помощью встроенного метода (искать в Math).
*/
    //глобальные переменные
    static double m =10.0, l=4.0;

    //метод расчета гипотенузы
    public static double Calculate(double a, double b){
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        System.out.println("Число а=" + m);
        System.out.println("Число b=" + l);
        System.out.println(
                "a^b = " + Calculate(m, l)
        );
    }
}
