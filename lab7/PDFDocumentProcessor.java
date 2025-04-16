package lab7;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class PDFDocumentProcessor extends DocumentProcessor{
    private PDDocument document;

    @Override
    protected void openFile(String filePath){
        try{
            this.document = PDDocument.load(new File(filePath));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void extractContent() {
        if (this.document == null) {
            System.out.println("Get da fuck outa here, this file is empty asf");
            return;
        }
        try{
            PDFTextStripper stripper = new PDFTextStripper();
            this.connect = stripper.getText(document);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void analyzeContent() {
        if (connect == null) return;

        String[] words = connect.split("\\W+");
        System.out.println("file " + filePath + "words amount " + words.length);


        Map<String, Integer> frequents = new HashMap<>();

        for(String word: words){
            word = word.toLowerCase();
            frequents.put(word, frequents.getOrDefault(word, 0) + 1);
        }


        String mostFreq = Collections.max(frequents.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("frequent: " + mostFreq);
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
