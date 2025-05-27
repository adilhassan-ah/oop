package com.adilhassan.accessmodifiers.publicaccessmodifier.two;

import com.adilhassan.accessmodifiers.publicaccessmodifier.one.Student;

/***
 * 1b. If a class is declared as public and belongs to a package then we can access that class from anywhere within that package
 * and from outside of that package.
 */
public class Client {
    public static void main(String[] args) {
        Student student = new Student();
    }
}
