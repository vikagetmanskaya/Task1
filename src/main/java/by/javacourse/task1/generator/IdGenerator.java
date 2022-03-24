package by.javacourse.task1.generator;

public class IdGenerator {
    private static final long MIN_ID = 100000;
    private static final long MAX_ID = 999999;
    private static long idValue = MIN_ID;

    public static long idGenerator() {
        idValue++;
        if (idValue > MAX_ID) {
            idValue = MIN_ID;
        }
        return idValue;
    }
}
