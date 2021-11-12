import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Вася", 10, false);
        allCats[1] = new Cat("Кузя", 20, false);
        allCats[2] = new Cat("Барсик", 15, false);
        allCats[3] = new Cat("Рыжик", 20, false);

        Bowl bowl = new Bowl(50);
        bowl.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].satiety == false && allCats[i].apetit < bowl.food){
                allCats[i].eat(bowl);
                allCats[i].satiety = true;
                System.out.println("Кот " + allCats[i].name + " поел");
            } else {
                System.out.println("Кот " + allCats[i].name + " не поел");
            }
        }
        bowl.info();
        System.out.println("Сколько еды надо добавить?");
        action = sc.nextInt();
        bowl.increaseFood(action);
        bowl.info();

    }
}