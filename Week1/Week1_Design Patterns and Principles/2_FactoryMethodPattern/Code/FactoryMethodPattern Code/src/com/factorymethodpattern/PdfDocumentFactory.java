package com.factorymethodpattern;

public class PdfDocumentFactory extends DocumentFactory {
   
    public Document createDocument() {
        return new PdfDocument();
    }
}
