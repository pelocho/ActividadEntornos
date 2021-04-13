package mainView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import personal.Alumno;
import personal.Director;
import personal.Profesor;
import seleccionarTipo.seleccionarTipoView;
import visualizacion.visualizacionView;

public class MainView {

    private JFrame frmMainView;
    private static final ArrayList<Object> personas = new ArrayList<>();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainView window = new MainView();
                    window.frmMainView.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void guardarAlumno(Alumno alumno) {
        personas.add(alumno);
    }

    public static void guardarProfesor(Profesor profesor) {
        personas.add(profesor);
    }

    public static void guardarDirector(Director director) {
        personas.add(director);
    }


    public MainView() {
        initialize();
    }

    private void initialize() {
        frmMainView = new JFrame();
        frmMainView.getContentPane().setForeground(Color.GRAY);
        frmMainView.setTitle("Personas App");
        frmMainView.setBounds(100, 100, 353, 156);
        frmMainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMainView.getContentPane().setLayout(null);

        JButton btnCrear = new JButton("Crear Persona");
        btnCrear.setBackground(Color.LIGHT_GRAY);
        btnCrear.setBounds(26, 44, 120, 23);
        frmMainView.getContentPane().add(btnCrear);

        JButton btnVer = new JButton("Ver Personas");
        btnVer.setBackground(Color.LIGHT_GRAY);
        btnVer.setBounds(181, 44, 128, 23);
        frmMainView.getContentPane().add(btnVer);

        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seleccionarTipoView.main();
            }
        });

        btnVer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visualizacionView.main(personas);
            }
        });
    }
}
