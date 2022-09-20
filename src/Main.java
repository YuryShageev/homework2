public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("Вторая часть домашки:");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Дальше №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Третья часть домашки:");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println(totalWeight);
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println(weightDifference);
        System.out.println("Задача №7");
        var weightViaDividing = (secondBoxer / firstBoxer) % totalWeight;
        System.out.println(weightViaDividing);

        System.out.println("Задача №8");
        var totalHours = 640;
        var oneEmployee = 8;
        var totalEmployees = totalHours / oneEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек!");
        var ifMoreEmployees = totalEmployees + 94;
        var hoursIfMoreEmployees = totalHours / ifMoreEmployees;
        System.out.println("Если в компании работает " + ifMoreEmployees + " человек, то всего по " + hoursIfMoreEmployees + " часа работы может быть поделено между сотрудниками.");

    }
}