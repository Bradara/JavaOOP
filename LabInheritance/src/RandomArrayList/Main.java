package RandomArrayList;


public class Main {
    public static void main(String[] args) {
        RandomArrayList<Object> randomList = new RandomArrayList<Object>();
        randomList.add(1);
        randomList.add(2);
        randomList.add(3);
        randomList.add(4);
        randomList.add(5);
        System.out.println(randomList.getRandomElement());
        System.out.println(randomList);
    }
}
