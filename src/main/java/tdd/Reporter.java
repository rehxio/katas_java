package tdd;

public class Reporter {
    private UserFinder finder;
    private ReportWriter writer;

    public Reporter(UserFinder finder, ReportWriter writer) {
        this.finder = finder;
        this.writer = writer;
    }


    public void generateReportBy(String profile){
        // 1. Find users via finder

        // 2. Builds one UserReport instance with results

        // 3. Ask the writer to write the report
    }
}
