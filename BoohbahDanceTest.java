public class BoohbahDanceTest {
    public static void main(String[] args) {
        Boohbah Boohbah1 = new Boohbah("Zing Zing Zingbah", "Ghost Dance"); // 3 constructors
        Boohbah Boohbah2 = new Boohbah("Humbah", "Belly Flop");
        Boohbah Boohbah3 = new Boohbah("Jumbah", "100 jumps");

        Boohbah[] Boohbahs = {Boohbah1, Boohbah2, Boohbah3}; // list of constructors
        DanceRoutine Routine = new DanceRoutine(Boohbahs); // creates new routine object

        System.out.println("Original Routine: " + "\n" + Routine.buildRoutine()); // prints original
        System.out.println("Modified Routine: " + "\n" + Routine.modifyRoutine()); // prints modify
        System.out.println("Remixed Routine: " + "\n" + Routine.remixRoutine()); // prints remix
    }
}
