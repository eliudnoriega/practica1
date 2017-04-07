/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.practica1;

import com.jtattoo.plaf.texture.TextureLookAndFeel;
import gt.umg.practica1.GUI.MenuPrincipal;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author melvin.noriega@megapaca.com
 */
public class Practica1 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Properties props = new Properties();

        props.put("logoString", "UMG");

        TextureLookAndFeel.setCurrentTheme(props);
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Practica1.class.getName()).log(Level.SEVERE, null, ex);
        }

        MenuPrincipal mP = new MenuPrincipal();
        mP.setVisible(true);

    }

}
