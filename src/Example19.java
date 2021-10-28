public class Example19 {
    /*TODO: 12. Используйте новый метод для расчета гипотенузы. Сделайте вариант
       метода hyp() с параметрами.
*/
    //глобальные переменные
    static double m =10.0, l=4.0;

    //метод расчета гипотенузы
    public static double hyp(double a, double b){
        return Math.sqrt(a*a + b*b);
    }

    public static void main(String[] args) {
        System.out.println("katet а=" + m);
        System.out.println("katet b=" + l);
        System.out.println(
                "hypotenuse с= " + hyp(m, l)
        );
    }
}
