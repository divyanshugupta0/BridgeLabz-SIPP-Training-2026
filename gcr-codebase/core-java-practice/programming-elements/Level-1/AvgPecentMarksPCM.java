public class AvgPecentMarksPCM {
    public static void main(String[] args) {
        int physicsMarks = 85;
        int chemistryMarks = 90;
        int mathematicsMarks = 95;

        int totalMarks = physicsMarks + chemistryMarks + mathematicsMarks;
        double averageMarks = totalMarks / 3.0;

        System.out.println("Average Marks in PCM: " + averageMarks);
    }
}
