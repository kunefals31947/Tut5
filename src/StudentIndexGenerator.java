class StudentIndexGenerator {
    private static int index = 0;

    public static int getNextIndex() {
        return ++index;
    }
}