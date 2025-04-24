package lab7;
public class Main {
    public static void main(String[] args) {
        DocumentProcessor pdfProcessor = new PDFDocumentProcessor();
        pdfProcessor.processDocument("example.pdf");

        DocumentProcessor wordProcessor = new WordDocumentProcessor();
        wordProcessor.processDocument("example.docx");

        DocumentReportCollection collection = new DocumentReportCollection();

        System.out.println("---------");
        collection.addReport(new DocumentReport("first.pdf", 100, "iterator"));
        collection.addReport(new DocumentReport("second.docx", 150, "typeshi"));
        collection.addReport(new DocumentReport("third.pdf", 80, "legitimate"));

        Iterator<DocumentReport> iterator = collection.iterator();
        while (iterator.hasNext()) {
            DocumentReport report = iterator.next();
            System.out.println("File: " + report.getFileName()
                    + ", Words: " + report.getWordCount()
                    + ", Top word: " + report.getTopWord());
        }
    }
}
