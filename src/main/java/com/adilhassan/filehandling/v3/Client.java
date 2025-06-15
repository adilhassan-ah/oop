package com.adilhassan.filehandling.v3;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        var sourceFile = "sample.txt";
        var destinationFile = "sample2.txt";

        Reader reader = new FileReader(sourceFile);
        Writer writer = new FileWriter(destinationFile);

        int byteData;
        while ((byteData = reader.read()) != -1) {
            System.out.println(byteData);
            writer.write(byteData);
        }

        writer.flush();
        writer.close();

        System.out.println("File copied successfully.");
    }
}
