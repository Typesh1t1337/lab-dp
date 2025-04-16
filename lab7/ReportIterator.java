package lab7;

import java.util.List;

public class ReportIterator implements Iterator<DocumentReport> {
    private final List<DocumentReport> reports;
    private int position = 0;

    public ReportIterator(List<DocumentReport> reports) {
        this.reports = reports;
    }

    @Override
    public boolean hasNext() {
        return position < reports.size();
    }

    @Override
    public DocumentReport next() {
        return reports.get(position++);
    }
}
