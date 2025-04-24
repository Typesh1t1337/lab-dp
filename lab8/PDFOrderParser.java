package lab8;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.IOException;
import java.io.File;
import java.util.Stack;

public class PDFOrderParser {
    private PDDocument document;
    private String content;

    public Box parsePdfToOrder(String filePath){
        try (PDDocument document = PDDocument.load(new File(filePath))) {
            PDFTextStripper stripper = new PDFTextStripper();
            String content = stripper.getText(document);

            String[] splitContent = content.split("\\r?\\n");
            Stack<Box> stack = new Stack<>();
            Box root = new Box("root");
            stack.push(root);

            for (String text: splitContent) {
                text = text.trim();
                if (text.isEmpty()) continue;

                if (text.equals("[Box]")) {
                    Box tempBox = new Box("Box");
                    stack.peek().add(tempBox);
                    stack.push(tempBox);
                } else if (text.startsWith("-")) {
                    String product = text.substring(1).trim();
                    if (product.equals("[Box]")) {
                        Box tempBox = new Box("Box");
                        stack.peek().add(tempBox);
                        stack.push(tempBox);
                    } else {
                        String[] products = product.split(":");
                        if (products.length == 2) {
                            String name = products[0].trim();
                            double price = Double.parseDouble(products[1].trim());
                            stack.peek().add(new Product(name, price));
                        }
                    }
                } else if (text.equals("]") && stack.size() > 1) {
                    stack.pop();
                }
            }

            return root;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
