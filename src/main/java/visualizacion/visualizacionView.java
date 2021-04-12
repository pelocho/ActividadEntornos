package visualizacion;

import creacionPersonas.crearAlumno;
import creacionPersonas.crearDirector;
import creacionPersonas.crearProfesor;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class visualizacionView {
    private JFrame frmViewObjets;

    public static void main(ArrayList<Object> personas) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    visualizacionView window = new visualizacionView(personas);
                    window.frmViewObjets.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public visualizacionView(ArrayList<Object> personas) {
        initialize(personas);
    }

    private void initialize(ArrayList<Object> personas) {
        frmViewObjets = new JFrame();
        frmViewObjets.getContentPane().setForeground(Color.GRAY);
        frmViewObjets.setTitle("Personas App");
        frmViewObjets.setBounds(100, 100, 571, 373);
        frmViewObjets.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmViewObjets.getContentPane().setLayout(null);
        
        JLabel lblPersonas = new JLabel();
        lblPersonas.setBounds(0, 0, 966, 334);
        frmViewObjets.getContentPane().add(lblPersonas);

        String textToDisplay = createObjectsText(personas);
        lblPersonas.setText(textToDisplay);
    }

    private String createObjectsText(ArrayList<Object> personas) {
        String textToDisplay = "<html>";
        for (Object persona : personas) {
            textToDisplay = textToDisplay + persona.toString() + "<br/>";
        }
        return (textToDisplay + "</html>");
    }
}
