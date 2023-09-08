public class ToyShopApp {
    public static void main(String[] args) {
        ToyManager toyManager = new ToyManager();
        toyManager.addToy(new Toy(1, "Кукла", 10, 30));
        toyManager.addToy(new Toy(2, "Машинка", 20, 20));
        toyManager.addToy(new Toy(3, "Мяч", 15, 50));

        Toy prizeToy = toyManager.getPrizeToy();

        if (prizeToy != null) {
            FileManager.writeToTextFile(prizeToy);
            prizeToy.reduceQuantity();
        } else {
            System.out.println("Не удалось получить призовую игрушку.");
        }
    }
}
