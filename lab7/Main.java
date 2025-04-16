package lab7;
public class Main {
    public static void main(String[] args) {
        DocumentProcessor pdfProcessor = new PDFDocumentProcessor();
        pdfProcessor.processDocument("example.pdf");

        DocumentProcessor wordProcessor = new WordDocumentProcessor();
        wordProcessor.processDocument("example.docx");

        DocumentReportCollection collection = new DocumentReportCollection();

        System.out.println("---------");
        collection.addReport(new DocumentReport("file1.pdf", 100, "java"));
        collection.addReport(new DocumentReport("file2.docx", 150, "design"));
        collection.addReport(new DocumentReport("file3.pdf", 80, "pattern"));

        Iterator<DocumentReport> iterator = collection.iterator();
        while (iterator.hasNext()) {
            DocumentReport report = iterator.next();
            System.out.println("File: " + report.getFileName()
                    + ", Words: " + report.getWordCount()
                    + ", Top word: " + report.getTopWord());
        }
    }
}
