package entities;

import java.util.Random;

public class NumberGenerator {
    private final static Random random = new Random();

    public static int generateRandomNumber(byte bound) {
        return random.nextInt(bound);
    }
}
