package lesson11.firstinteface;

import lesson11.firstinteface.FirstInterface;

public class TestClass implements FirstInterface {
    private int test = 10;


    @Override
    public void send() {
        //some logic
    }

    @Override
    public String receive() {
        //some logic
        return null;
    }
}
