/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.Library;
import Controller.SortProgramming;
import Model.Element;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        element.setSize_array(library.getInt("Enter number of array", 1, 100));
        element.setArray(library.createArray(element.size_array));
        new SortProgramming(element).run();
    }
}
