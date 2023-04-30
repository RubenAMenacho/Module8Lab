/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module8lab;

/**
 *
 * @author ramlifting
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new ExceptionC("Exception C arose.");
        } catch (ExceptionA e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
