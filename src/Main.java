public class Main {
    public static boolean shouldWakeUp(boolean hav, int time) {
        if (!hav || time<0 || time>23){
            return false;
        }
        if (time <8 || time >= 20) {
            return  true;
        }
        return false;
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        if (age1>12 && age1<20 || age2>12 && age2<20 || age3>12 && age3<20){
            return true;
        }else {
            return false;
        }
    }


    public static boolean isCatPlaying(boolean isSummer, int temp){
        if(isSummer){
            return temp>25 && temp<46;
        }
        return temp>25 && temp<36;
    }


    public static double area(double x, double y){
        if (x<=0 || y<=0){
            System.out.println("Alan değeri 0 dan büyük olmalıdır.");
            return  -1;
        }
        return x*y;
    }
    public static double area(double radius){
        if (radius<0){
            System.out.println("Alan değeri 0 dan büyük olmalıdır.");
            return -1;
        }
        return radius*radius*Math.PI;
    }



    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("shouldWakeUp--------");
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

        System.out.println("hasTeen--------");
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println("isCatPlaying--------");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("area--------");
        System.out.println(area(5.0));
        System.out.println(area(-1));
    }

}
