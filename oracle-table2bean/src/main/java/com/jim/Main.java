package com.jim;

/**
 * JimQiao
 * 2014-11-21 11:22
 */
public class Main {
    public static void main(String[] args) {
        // Setting folder path...
        String folderPath = "D:\\temp";

        // Generating Java Beans in the specified folder...
        TableBeanMapping.generateBean(folderPath, "third_party_summary");
    }
}
