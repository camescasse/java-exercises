package org.example;

import org.example.Polymorfism.FileExporter.Document;
import org.example.Polymorfism.FileExporter.PdfExporter;
import org.example.Polymorfism.FileExporter.TxtExporter;
import org.example.Polymorfism.FileExporter.WordExporter;

public class Main {
    public static void main(String[] args) {
    var document = new Document("employees.doc");
    var pdfExporter = new PdfExporter();
    pdfExporter.export(document);
    var txtExporter = new TxtExporter();
    txtExporter.export(document);
    var wordExporter = new WordExporter();
    wordExporter.export(document);
    }
}