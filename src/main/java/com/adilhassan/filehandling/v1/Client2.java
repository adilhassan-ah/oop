package com.adilhassan.filehandling.v1;

import java.io.*;

public class Client2 {
    public static void main(String[] args) throws IOException {
        var sourceFile = "screenshot.png";
        var destinationFile = "screenshot2.png";

        InputStream inputStream = new FileInputStream(sourceFile);
        OutputStream outputStream = new FileOutputStream(destinationFile);

        byte[] bytes = new byte[100];
        int byteData;
        while ((byteData = inputStream.read(bytes)) != -1) {
            System.out.println(byteData);
            outputStream.write(bytes);
        }

        outputStream.flush();
        outputStream.close();

        System.out.println("File copied successfully.");
    }
}
