public class DanceRoutine {
    private Boohbah[] boohbahs = {};

    public DanceRoutine(Boohbah[] boohbahs){
        this.boohbahs = boohbahs;
    }

    public String buildRoutine(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(boohbahs[i].performMove() + "\n");
        }
        return sb.toString();
    }

    public StringBuilder modifyRoutine(){
        StringBuilder sb = new StringBuilder();
        //sb.replace("performs", "dances to", boohbahs);
        return sb;
    }

}
