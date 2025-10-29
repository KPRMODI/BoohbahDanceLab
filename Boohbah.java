public class Boohbah {
    private String name = "";
    private String danceMove = "";

    public Boohbah(String name, String danceMove) {
        this.name = name;
        this.danceMove = danceMove;
    }

    public String getName(){
        return name;
    }

        public String getDanceMove(){
        return danceMove;
    }

    public String performMove() {
        String result = name + " performs " + danceMove;
        return result;
    }
}