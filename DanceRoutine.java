public class DanceRoutine {
    private Boohbah[] boohbahs = {};

    public DanceRoutine(Boohbah[] boohbahs){
        this.boohbahs = boohbahs;
    }

    public String buildRoutine(){
        StringBuilder routine = new StringBuilder(); // string  builder
        for (int i = 0; i < 3; i++) { // iterates through list of 3 
            routine.append(boohbahs[i].performMove() + "\n"); //appends boobahs to string builder
        }
        return routine.toString(); //converts to string
    }

    public String modifyRoutine(){
        StringBuilder modifiedRoutine = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            modifiedRoutine.append(boohbahs[i].performMove() + "\n");
    }
    String Mod = modifiedRoutine.toString().replace("performs", "dances to");//converts string builder to string
    return Mod; //returns modified version
    }
}
