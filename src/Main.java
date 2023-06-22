
public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("Задача 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 4");
        var  friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var  frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxerWeight = boxer1 + boxer2;
        System.out.println("Общий вес боксеров: " + boxerWeight + " кг");
        System.out.println("Задача 7");
        var res1 = boxer2 - boxer1;
        System.out.println("Первый метод разницы боксеров в весе: " + res1 + " кг");
        var res2 = boxer2 % boxer1;
        System.out.println("Второй метод разницы боксеров в весе: " + res2 + " кг");
        System.out.println("Задача 8");
        var workingHouse = 640;
        var oneDayEmployee = 8;
        var totalEmployee = workingHouse / oneDayEmployee;
        System.out.println("Всего работников в компании- " + totalEmployee + " человек");
        var totalEmployee2 = 94;
        var oneDayEmployee2 = workingHouse / totalEmployee2;
        System.out.println("Если в компании работает " + totalEmployee2 +
                " человек, то всего " + oneDayEmployee2 +
                " часов работы может быть поделено между сотрудниками");

    }
}