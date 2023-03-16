package labs;

import java.util.Scanner;

public class Room {//Класс комната
    public float square;
    public int count_people;
    private Scanner sc = new Scanner(System.in);



    public Room(){

    }

    public Room(float square, int count_people){
        this.square = square;
        this.count_people = count_people;
    }

    public void Init(float sq, int cp) {
        square = sq;
        count_people = cp;
    }

    public void Read() {
        System.out.print("Площадь комнаты= ");
        square = sc.nextFloat();
        System.out.print("Кол-во людей проживающих в комнате= ");
        count_people = sc.nextInt();
    }

    public void Display() {
        System.out.println("Площадь комнаты: " + square);
        System.out.println("Кол-во людей проживающих в комнате: " + count_people);
    }

    public float Square_on_people() {
        return square / count_people;
    }

}
