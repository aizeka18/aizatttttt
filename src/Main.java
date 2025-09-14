public class Main {
    public static void main(String[] args) {
        Report report = new Report.Builder()
                .title("Clean Code in Practice")
                .author("Aizat")
                .year(2025)
                .content("This report demonstrates the application of the Builder pattern with Clean Code principles.")
                .reviewed(true)
                .confidential(false)
                .build();

        System.out.println(report);
    }
}
