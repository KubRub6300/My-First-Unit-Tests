package labs;

public class Flat {//Класс квартира

    public Room a, b, c;
    public float add_area;
    public String name;


    public Flat(Room one, Room two, Room three, float area, String name){
        a = one;
        b = two;
        c = three;
        add_area = area;
        this.name = name;
    }


    public void Display() {
        System.out.println("Комната 1:");
        a.Display();
        System.out.println("-----------------------------");
        System.out.println("Комната 2:");
        b.Display();
        System.out.println("-----------------------------");
        System.out.println("Комната 3:");
        c.Display();
        System.out.println("-----------------------------");
    }

    public void Read() {
        System.out.println("Название: "+name +"\n");
        System.out.println("Комната 1:");
        a.Read();
        System.out.println("-----------------------------");
        System.out.println("Комната 2:");
        b.Read();
        System.out.println("-----------------------------");
        System.out.println("Комната 3:");
        c.Read();
        System.out.println("-----------------------------");
    }

    public float Average_area() {
        float square = a.square + b.square + c.square + add_area;
        int count_people = (int) (a.count_people + b.count_people + c.count_people);
        return square / count_people;
    }

    public Room Min_area() {

        if(a.square==0 || b.square==0 || c.square == 0){
            throw new NullPointerException("all areas are equal to 0");
        }
        float a_square = a.Square_on_people();
        float b_square = b.Square_on_people();
        float c_square = c.Square_on_people();
        if (a_square < b_square) {
            if (a_square < c_square)
            {
                return a;
            }
            else return c;
        }
        else if (b_square < c_square) {

            return b;
        }
        else
        {
            return c;
        }


    }
}
