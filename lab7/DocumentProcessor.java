package lab7;

public abstract class DocumentProcessor {
    protected String connect;
    protected String filePath;

    public final void processDocument(String filePath) {
        this.filePath = filePath;
        openFile(filePath);
        extractContent();
        analyzeContent();
        closeFile();
    }

    protected abstract void openFile(String filePath);
    protected abstract void extractContent();
    protected abstract void analyzeContent();
    protected abstract void closeFile();

}
