package lab7;
import java.util.ArrayList;
import java.util.List;

public class DocumentReportCollection {
    private final List<DocumentReport> reports = new ArrayList<>();

    public void addReport(DocumentReport report) {
        reports.add(report);
    }

    public ReportIterator iterator() {
        return new ReportIterator(reports);
    }
}
