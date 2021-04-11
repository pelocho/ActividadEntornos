package creacionPersonas;

import mainView.MainView;
import personal.Profesor;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class crearProfesor {
	private JFrame frmCrearProfesor;

    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	crearProfesor window = new crearProfesor();
                    window.frmCrearProfesor.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public crearProfesor() {
        initialize();
    }

    private void initialize() {
        frmCrearProfesor = new JFrame();
        frmCrearProfesor.getContentPane().setForeground(Color.GRAY);
        frmCrearProfesor.setTitle("Personas App");
        frmCrearProfesor.setBounds(100, 100, 273, 308);
        frmCrearProfesor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCrearProfesor.getContentPane().setLayout(null);

        JButton btnCrear = new JButton("Crear Profesor");
        btnCrear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnCrear.setBackground(Color.LIGHT_GRAY);
        btnCrear.setBounds(76, 235, 120, 23);
        frmCrearProfesor.getContentPane().add(btnCrear);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(10, 56, 61, 23);
        frmCrearProfesor.getContentPane().add(lblNombre);

        JTextField inputName = new JTextField();
        inputName.setBounds(62, 57, 106, 20);
        frmCrearProfesor.getContentPane().add(inputName);
        inputName.setColumns(10);
        
        JLabel lblEdad = new JLabel("Edad");
        lblEdad.setBounds(10, 90, 61, 23);
        frmCrearProfesor.getContentPane().add(lblEdad);

        JTextField inputAge = new JTextField();
        inputAge.setBounds(62, 90, 106, 20);
        frmCrearProfesor.getContentPane().add(inputAge);
        inputAge.setColumns(10);
        
        JLabel lblEstatura = new JLabel("Estatura");
        lblEstatura.setBounds(10, 124, 61, 23);
        frmCrearProfesor.getContentPane().add(lblEstatura);

        JTextField inputSize = new JTextField();
        inputSize.setBounds(62, 124, 106, 20);
        frmCrearProfesor.getContentPane().add(inputSize);
        inputSize.setColumns(10);
        
        JLabel lblCurso = new JLabel("Curso");
        lblCurso.setBounds(10, 158, 61, 23);
        frmCrearProfesor.getContentPane().add(lblCurso);

        JTextField inputGrade = new JTextField();
        inputGrade.setBounds(62, 158, 106, 20);
        frmCrearProfesor.getContentPane().add(inputGrade);
        inputGrade.setColumns(10);

        JLabel lblSueldo = new JLabel("Sueldo");
        lblSueldo.setBounds(10, 192, 61, 23);
        frmCrearProfesor.getContentPane().add(lblSueldo);

        JTextField inputSueldo = new JTextField();
        inputSueldo.setBounds(62, 192, 106, 20);
        frmCrearProfesor.getContentPane().add(inputSueldo);
        inputSueldo.setColumns(10);

        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Profesor p = new Profesor(Integer.parseInt(inputAge.getText()), Float.parseFloat(inputSize.getText()), inputName.getText(), Integer.parseInt(inputGrade.getText()), Integer.parseInt(inputSueldo.getText()));
                MainView.guardarProfesor(p);
                frmCrearProfesor.dispose();
            }
        });
    }
}
