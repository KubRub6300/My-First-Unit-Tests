package labs;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void room_init() { // Тетс инициализации класса
        int square = 15;
        int count_people = 2;

        Room actual = new Room(square,count_people);

        assertEquals(square,actual.square);
        assertEquals(count_people,actual.count_people);
    }

    @org.junit.jupiter.api.Test
    void room_null_init() {// тест пустого конструктора

        Room actual = new Room();

        assertEquals(0,actual.square);
        assertEquals(0,actual.count_people);
    }

    @org.junit.jupiter.api.Test
    void room_init_method() {//тест метода init (иницализации)
        int square = 15;
        int count_people = 2;

        Room actual = new Room();
        actual.Init(square,count_people);

        assertEquals(square,actual.square);
        assertEquals(count_people,actual.count_people);
    }


    @org.junit.jupiter.api.Test
    void room_square() {//тест подсчёта площади на одного человека
        float square = 15.0F;
        int count_people = 2;

        Room actual = new Room(square,count_people);

        assertEquals(square,actual.square);
        assertEquals(square/count_people,actual.Square_on_people());
    }


}