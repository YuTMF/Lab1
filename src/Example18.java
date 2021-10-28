public class Example18 {
    /*TODO: 11. Добавьте в пример расчета гипотенузы (см. раздел 2) метод, вычисляющий a^b.
        Используйте для этого функции расчета натурального логарифма и экспоненты (y=exp(b*log(a));
*/
    //глобальные переменные
    static double a =10.0, b=4.0, c;

    //метод расчета гипотенузы
    public static double hyp(){
        return c = Math.sqrt(a*a + b*b);
    }
    public  static double expMethod(){
        return Math.exp(b * Math.log(a));
    }

    public static void main(String[] args) {
        System.out.println("katet а=" + a);
        System.out.println("katet b=" + b);
        System.out.println(
                "hypotenuse с= " + hyp()
                + "\nexp(b*log(a) = " + expMethod()
        );
    }
}
