package superKeyword;

public class Main {
    public static void main(String[] args) {
        // super = keyword regers to the superclass (parent) of an object
        // similiar to the this keyword

        Hero hero1 = new Hero("Batman", 20, "None");
        Hero hero2 = new Hero("Superman", 24, "super");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
        System.out.println(hero2.name);
        System.out.println(hero2.age);
        System.out.println(hero2.power);

        // now when I call just the first hero
        // it should return our to string method which does a super call to the person
        // class and appends its unique values to whatever string person returns
        System.out.println(hero1);
    }
}
