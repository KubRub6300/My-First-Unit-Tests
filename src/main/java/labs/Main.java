package labs;

public class Main {
    public static void main(String[] args) {
        Room r = new Room();
        Room r1 = new Room();
        Room r2 = new Room();

        Flat flat = new Flat(r,r1,r2,0,"квартира 35");
        flat.Read();

        System.out.println("\nИнформация о квартире:");
        flat.Display();
        System.out.println("Сердняя площадь на одного человека с учетом общей площади: " + flat.Average_area());
        System.out.println("Комната с минимальной площадью на человека:");
        flat.Min_area().Display();
    }
}
