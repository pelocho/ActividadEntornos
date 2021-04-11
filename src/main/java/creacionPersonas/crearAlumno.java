package creacionPersonas;

import mainView.MainView;
import personal.Alumno;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class crearAlumno {
	private JFrame frmCrearAlumno;

    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    crearAlumno window = new crearAlumno();
                    window.frmCrearAlumno.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public crearAlumno() {
        initialize();
    }

    private void initialize() {
        frmCrearAlumno = new JFrame();
        frmCrearAlumno.getContentPane().setForeground(Color.GRAY);
        frmCrearAlumno.setTitle("Personas App");
        frmCrearAlumno.setBounds(100, 100, 273, 308);
        frmCrearAlumno.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCrearAlumno.getContentPane().setLayout(null);

        JButton btnCrear = new JButton("Crear Alumno");
        btnCrear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnCrear.setBackground(Color.LIGHT_GRAY);
        btnCrear.setBounds(127, 235, 120, 23);
        frmCrearAlumno.getContentPane().add(btnCrear);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(10, 56, 61, 23);
        frmCrearAlumno.getContentPane().add(lblNombre);

        JTextField inputName = new JTextField();
        inputName.setBounds(62, 57, 106, 20);
        frmCrearAlumno.getContentPane().add(inputName);
        inputName.setColumns(10);
        
        JLabel lblEdad = new JLabel("Edad");
        lblEdad.setBounds(10, 90, 61, 23);
        frmCrearAlumno.getContentPane().add(lblEdad);

        JTextField inputAge = new JTextField();
        inputAge.setBounds(62, 90, 106, 20);
        frmCrearAlumno.getContentPane().add(inputAge);
        inputAge.setColumns(10);
        
        JLabel lblEstatura = new JLabel("Estatura");
        lblEstatura.setBounds(10, 124, 61, 23);
        frmCrearAlumno.getContentPane().add(lblEstatura);

        JTextField inputSize = new JTextField();
        inputSize.setBounds(62, 124, 106, 20);
        frmCrearAlumno.getContentPane().add(inputSize);
        inputSize.setColumns(10);
        
        JLabel lblCurso = new JLabel("Curso");
        lblCurso.setBounds(10, 158, 61, 23);
        frmCrearAlumno.getContentPane().add(lblCurso);

        JTextField inputGrade = new JTextField();
        inputGrade.setBounds(62, 158, 106, 20);
        frmCrearAlumno.getContentPane().add(inputGrade);
        inputGrade.setColumns(10);

        JLabel lblCoeficiente = new JLabel("Coeficiente");
        lblCoeficiente.setBounds(10, 192, 61, 23);
        frmCrearAlumno.getContentPane().add(lblCoeficiente);

        JTextField inputCI = new JTextField();
        inputCI.setBounds(62, 192, 106, 20);
        frmCrearAlumno.getContentPane().add(inputCI);
        inputCI.setColumns(10);

        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Alumno a = new Alumno(Integer.parseInt(inputAge.getText()), Float.parseFloat(inputSize.getText()), inputName.getText(), Integer.parseInt(inputGrade.getText()), Integer.parseInt(inputCI.getText()));
                MainView.guardarAlumno(a);
                frmCrearAlumno.dispose();
            }
        });
    }
}
