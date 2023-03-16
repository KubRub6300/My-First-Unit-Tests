package labs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlatTest {// тесты класса flat

    @Test
    void flat_init() {// тест конструктора с параметрами
        Room r1 = new Room();
        Room r2 = new Room();
        Room r3 = new Room();
        float area = 15F;
        String name = "квартира 231";
        Flat flat = new Flat(r1,r2,r3,area,name);

        assertEquals(r1,flat.a);
        assertEquals(r2,flat.b);
        assertEquals(r3,flat.c);
        assertEquals(area,flat.add_area);
        assertEquals(name,flat.name);
    }

    @Test
    void average_area() {// тест метода подсчёта площади
        Room r1 = new Room();
        Room r2 = new Room();
        Room r3 = new Room();
        float area = 15F;
        String name = "квартира 231";
        Flat flat = new Flat(r1,r2,r3,area,name);

        assertEquals((r1.square + r2.square + r3.square + area)/(r1.count_people + r2.count_people +
                r3.count_people),flat.Average_area());
    }

    @Test
    void min_area_first() {// 1 тест метода нахождения комнаты с мин площадь на 1 человека
        Room[] rooms = new Room[3];

        rooms[0] = new Room(30,5);
        rooms[1] = new Room(30,3);
        rooms[2] = new Room(30,6);

        float area = 15F;
        String name = "квартира 231";
        Flat flat = new Flat(rooms[0],rooms[1],rooms[2],area,name);
        float min_sq = Math.min(Math.min(rooms[0].square,rooms[1].square),rooms[2].square);


        assertEquals(min_sq,flat.Min_area().square);

    }

    @Test
    void min_area_second() {// 2 тест метода нахождения комнаты с мин площадь на 1 человека
        Room[] rooms = new Room[3];

        rooms[0] = new Room(30,7);
        rooms[1] = new Room(30,5);
        rooms[2] = new Room(30,4);

        float area = 15F;
        String name = "квартира 231";
        Flat flat = new Flat(rooms[0],rooms[1],rooms[2],area,name);
        float min_sq = Math.min(Math.min(rooms[0].square,rooms[1].square),rooms[2].square);


        assertEquals(min_sq,flat.Min_area().square);

    }

    @Test
    void min_area_third() {// 3 тест метода нахождения комнаты с мин площадь на 1 человека
        Room[] rooms = new Room[3];

        rooms[0] = new Room(30,5);
        rooms[1] = new Room(30,6);
        rooms[2] = new Room(30,7);

        float area = 15F;
        String name = "квартира 231";
        Flat flat = new Flat(rooms[0],rooms[1],rooms[2],area,name);
        float min_sq = Math.min(Math.min(rooms[0].square,rooms[1].square),rooms[2].square);


        assertEquals(min_sq,flat.Min_area().square);

    }

    @Test
    void min_area_fourth() {// 4 тест метода нахождения комнаты с мин площадь на 1 человека
        Room[] rooms = new Room[3];

        rooms[0] = new Room(30,5);
        rooms[1] = new Room(30,10);
        rooms[2] = new Room(30,7);

        float area = 15F;
        String name = "квартира 231";
        Flat flat = new Flat(rooms[0],rooms[1],rooms[2],area,name);
        float min_sq = Math.min(Math.min(rooms[0].square,rooms[1].square),rooms[2].square);


        assertEquals(min_sq,flat.Min_area().square);

    }

    @Test
    void min_area_except() {// тест метода нахождения комнаты с мин площадь на 1 человека с ошибкой
        Room room = new Room();
        float area = 15F;
        String name = "квартира 231";
        Flat flat = new Flat(room,room,room,area,name);


        assertThrows(NullPointerException.class,
                () -> {
            flat.Min_area();
                });

    }
}