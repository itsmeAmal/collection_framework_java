/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection_framework_1;

/**
 *
 * @author root_user
 */
public class print_array_elements_using_for_loop {

    public static void main(String[] args) {
        String[] Cars = {"BMW", "AUDI", "BENZ", "PEUGEOT", "LAMBORGHINI", "FERRARI"};
        for (int i = 0; i < Cars.length; i++) {
            System.out.println(Cars[i]);
        }
    }
}
