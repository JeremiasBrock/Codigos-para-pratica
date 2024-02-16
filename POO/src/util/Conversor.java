package util;

public class Conversor {
    public static final double IOF = 1.06;

    public static double conversao(double precoDolar, double dolaresComprados) {
        return precoDolar * dolaresComprados * IOF;
    }
}