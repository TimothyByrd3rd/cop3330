public class Main {

    public static void main(String[] args) {

        // Undergrad student
        UndergraduateStudent us = new UndergraduateStudent("Alice Smith");
        us.setYearLevel(1);
        us.registerCourse(new Course("COP3502", "Computer Science I", 3));

        System.out.println("=== Undergraduate ===");
        us.introduce();
        System.out.println();

        // Convert to honors
        HonorsStudent hs1 = new HonorsStudent(us);
        hs1.setThesisTitle("AI in Education");
        hs1.addCommitteeMember("Dr. Johnson");
        hs1.addCommitteeMember("Dr. Lee");

        System.out.println("=== Honors Student 1 ===");
        System.out.println("Name: " + hs1.getName());
        System.out.println("Thesis: " + hs1.getThesisTitle());
        System.out.println("Committee:");
        hs1.printCommittee();
        System.out.println("Count: " + hs1.getCommitteeCount());
        System.out.printf("Tuition Due: %.2f\n", hs1.getTuitionDue());

        // Copy
        HonorsStudent hs2 = new HonorsStudent(hs1);
        hs2.addCommitteeMember("Dr. Patel");
        hs2.addCommitteeMember("Dr. Brown"); // ignored
        hs1.setThesisTitle("Updated Thesis Title");

        System.out.println();
        System.out.println("=== Honors Student 2 (Copy) ===");
        System.out.println("Name: " + hs2.getName());
        System.out.println("Thesis: " + hs2.getThesisTitle());
        System.out.println("Committee:");
        hs2.printCommittee();
        System.out.println("Count: " + hs2.getCommitteeCount());
        System.out.printf("Tuition Due: %.2f\n", hs2.getTuitionDue());
    }
}