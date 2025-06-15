package com.adilhassan.filehandling.v4;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        var sourceFile = "sample.txt";
        var destinationFile = "sample2.txt";

        Reader reader = new FileReader(sourceFile);
        Writer writer = new FileWriter(destinationFile);

        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        int byteData;
        while ((byteData = bufferedReader.read()) != -1) {
            System.out.println(byteData);
            bufferedWriter.write(byteData);
        }

        bufferedWriter.flush();
        bufferedWriter.close();

        System.out.println("File copied successfully.");
    }
}
