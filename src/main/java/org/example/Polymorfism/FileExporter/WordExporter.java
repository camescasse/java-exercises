package org.example.Polymorfism.FileExporter;

public class WordExporter implements Exporter {

    @Override
    public void export(Document document) {
        System.out.println("Exporting " + document.getName() + " as DOCX...");
    }

}
