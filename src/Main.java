public class Main {
    public static void main(String[] args) {
        Gamer[] peoples = {
            new Gamer("Иван", true),
            new Gamer("Алексей", false),
            new Gamer("Егор", true),
            new Gamer("Михаил", false),
            new Gamer("Андрей", false),
        };
        System.out.println("Количество Игроков  " + peoples.length);
        for (int i = 0; i < peoples.length; i++) {
            Gamer gamer = peoples[i];
            System.out.println(gamer.getIsActiv());
        }
    }

}
