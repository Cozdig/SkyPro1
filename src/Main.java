public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 4;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxersWeight = 0.0;
        boxersWeight = boxer2 + boxer1;
        System.out.println(boxersWeight);
        boxersWeight = boxer2 - boxer1;
        System.out.println(boxersWeight);
        var boxers = boxer2 % boxer1;
        System.out.println(boxers);
        var workers = 0;
        var hours = 640;
        var workHours = 8;
        workers = hours / workHours;
        System.out.println("Всего работников в компании — " + workers + " человек");
        workers = workers + 94;
        hours = hours / workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");

    }
}