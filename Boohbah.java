public class Boohbah {
    private static String name = "";
    private static String danceMove = "";

    public Boohbah(String name, String danceMove) {
        this.name = name;
        this.danceMove = danceMove;
    }

    public String getname(){
        return name;
    }

        public String getdanceMove(){
        return danceMove;
    }

    public static String performMove() {
        String result = name + " performs " + danceMove;
        return result;
    }
}