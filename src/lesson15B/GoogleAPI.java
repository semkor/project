package lesson15B;

import java.util.Date;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        int number=0;
        Room roomTemp = new Room(0, price, persons, null, hotel,city);

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(roomTemp)) {
                count++;
            }
        }

        if(count==0){
            System.err.println("Cовпадений по заданному параметру  не найдено");
            return null;
        }

        Room[] methodRoom3 = new Room[count];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals(roomTemp))  {
                methodRoom3[number] = rooms[i];
                number++;
            }
        }
        return methodRoom3;
    }


//метод находит все самые  дешевые комнаты из массива
    @Override
    public Room[] getAll() {
        int count = 0;
        int resultRooms = rooms[0].getPrice();
        for (int i = 1; i < rooms.length; i++) {
            if (resultRooms >= rooms[i].getPrice()) {
                resultRooms = rooms[i].getPrice();
                count++;
            }
        }

        Room[] resRoom = new Room[count];
        int number = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (resultRooms == rooms[i].getPrice()) {
                resRoom[number] = rooms[i];
                number++;
            }
        }
        return resRoom;
    }
}
