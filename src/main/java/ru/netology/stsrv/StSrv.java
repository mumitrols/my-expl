package ru.netology.stsrv;

public class StSrv {
    public float sumAllSales(float[] sellings) {
        float sum = 0;
        for (float selling : sellings) {
            sum += selling;
        }
        return sum;
    }

}
