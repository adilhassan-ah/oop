package com.adilhassan.filehandling.v2;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        var sourceFile = "screenshot.png";
        var destinationFile = "screenshot2.png";

        InputStream inputStream = new FileInputStream(sourceFile);
        OutputStream outputStream = new FileOutputStream(destinationFile);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

        int byteData;
        while ((byteData = bufferedInputStream.read()) != -1) {
            System.out.println(byteData);
            bufferedOutputStream.write(byteData);
        }

        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        System.out.println("File copied successfully.");
    }
}
