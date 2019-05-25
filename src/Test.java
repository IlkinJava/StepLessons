public class Test {
    public static void main(String[] args) {
        Developer developer = new Developer(1, "Gunay", "Junior Back-end Developer", 800, 200);
        developer.raiseSalary(10);
        System.out.println(developer);
        /**
         неявный параметр представляет собой ссылку на объект типа Developer, который указывается
         перед именем метода (developer) ,
         явный параметр  указывается как число в скобках после имени данного метода(10)

         В каждом методе ключевое слово this обозначает неявный параметр.
         По желанию метод raiseSalary () можно было бы переписать следующим образом:
         public void raiseSalary(double byPercent)
         {
         double raise = this.salary * byPercent / 100;
         this.salary += raise;
         }
         */
        /**
         * В сигнатуру метода входит название метода и входящие параметры,тип возвращаемого значения не входит в сигнатуру метода
         */
        /**
         * Перегрузка метода это когда у метода одиннаковые имена но разные параметры.В классе string имеются четыре
         * открытых метода под названием indexOf ()
         */
        String str = "Test";
        System.out.println(str.indexOf('s'));
        System.out.println(str.indexOf('t', 1));
        System.out.println(str.indexOf("Te"));
        System.out.println(str.indexOf("st", 1));

    }
}