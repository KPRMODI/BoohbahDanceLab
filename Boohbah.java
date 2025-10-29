public class Boohbah {
    private String name = ""; //defines private variables
    private String danceMove = "";

    public Boohbah(String name, String danceMove) {
        this.name = name; // constructor
        this.danceMove = danceMove;
    }

    public String getName(){
        return name; // name getter
    }

        public String getDanceMove(){
        return danceMove; // dance getter
    }

    public String performMove() {
        String result = name + " performs " + danceMove; // returns boohbah + dancemove in a formatted string
        return result;
    }
}