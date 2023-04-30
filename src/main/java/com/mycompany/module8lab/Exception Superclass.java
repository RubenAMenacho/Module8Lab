/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module8lab;

/**
 *
 * @author ramlifting
 */
class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message);
    }
}

