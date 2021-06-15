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
public class print_array_elements_and_array_length {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cars = {"BMW", "AUDI", "PEUGEOT", "BENZ"};
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("Lenth of this cars array : " + cars.length);
    }
}
