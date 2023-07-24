public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean hav, int time) {
        if (time<0 || time>23){
            return false;
        }else if (!hav) return false;

    }

}
