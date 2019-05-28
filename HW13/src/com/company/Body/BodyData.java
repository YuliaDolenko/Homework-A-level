package com.company.Body;

public class BodyData {
    private String[] data;
    private int counter;

    public BodyData(String[] data) {
        this.data = data;
        this.counter = data.length;
    }

    public BodyData() {
        data = new String[10];
        counter = 0;
    }

    public void add(String data) {
        if (counter == data.length() - 1) ;
        {
            String[] currentData = new String[data.length() + data.length() / 2 + 1];
            System.arraycopy(this.data, 0, currentData, 0, data.length());
            this.data[counter++] = data;
        }

    }

}
