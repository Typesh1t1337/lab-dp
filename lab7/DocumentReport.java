package lab7;

public class DocumentReport {
    private final String fileName;
    private final int wordCount;
    private final String topWord;

    public DocumentReport(String fileName, int wordCount, String topWord) {
        this.fileName = fileName;
        this.wordCount = wordCount;
        this.topWord = topWord;
    }

    public String getFileName() {
        return fileName;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getTopWord() {
        return topWord;
    }
}
