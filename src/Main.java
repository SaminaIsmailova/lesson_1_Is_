public class Main {
    public static void main(String[] args) {


        String[] commands = {"Сидеть", "Лежать"};

        Shelter shelter = new Shelter("Romashka","Lenina 1");
        Dog dog = new Dog("Rex",
                "Ovcharka", commands, shelter, ColorEnum.BROWN);

        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гув гув");
        dog.makeVoice("Гив гив");
    }
}