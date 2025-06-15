package com.adilhassan.filehandling.v1;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        var sourceFile = "screenshot.png";
        var destinationFile = "screenshot2.png";

        InputStream inputStream = new FileInputStream(sourceFile);
        OutputStream outputStream = new FileOutputStream(destinationFile);

        int byteData;

        while ((byteData = inputStream.read()) != -1) {
            System.out.println(byteData);
            outputStream.write(byteData);
        }

        outputStream.flush();
        outputStream.close();

        System.out.println("File copied successfully.");
    }
}
