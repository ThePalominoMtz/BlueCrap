package arranque;

import test.Pruebas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cruzh
 */
public class ClassPrincipal {
        public static void main(String[] args) {
        // TODO code application logic here
        PantallaCarga itsuki = new PantallaCarga();
        itsuki.setVisible(true);

        try {
            for (int i = 0; i <= 200; i++) {
                Thread.sleep(20);
                if (i == 200) {
                    Pruebas obj = new Pruebas();
                    itsuki.setVisible(false);
                    obj.setVisible(true);
                }
            }
        } catch (Exception e) {
        }

    }
    
}
