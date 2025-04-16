package lab7;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class WordDocumentProcessor  extends DocumentProcessor{
    private XWPFDocument document;

    @Override
    protected void openFile(String filePath) {
        try {
            document = new XWPFDocument(new FileInputStream(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void extractContent(){
        StringBuilder builder = new StringBuilder();
        for (XWPFParagraph paragraph: document.getParagraphs()){
            builder.append(paragraph.getText()).append(" ");
        }

        this.connect = builder.toString();
    }

    @Override
    protected void analyzeContent(){
        if (this.connect == null) return;

        String[] words = connect.split("\\W+");
        System.out.println("file " + filePath);
        System.out.println("words " + words.length);

        Map<String, Integer> frequent = new HashMap<>();
        for(String word: words){
            frequent.put(word, frequent.getOrDefault(word, 0) + 1);
        }

        String mostFrequent = Collections.max(frequent.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Most frequent: " + mostFrequent);
    }

    @Override
    protected void closeFile() {
        try {
            if (document != null) {
                document.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
