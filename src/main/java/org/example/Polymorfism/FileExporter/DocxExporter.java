package org.example.Polymorfism.FileExporter;

public class DocxExporter implements Exporter {

    @Override
    public void export(Document document) {
        System.out.println("Exporting " + document.getName() + " as DOCX...");
    }

}
