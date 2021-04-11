package creacionPersonas;

import mainView.MainView;
import personal.Director;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class crearDirector {
	private JFrame frmCrearDirector;

    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	crearDirector window = new crearDirector();
                    window.frmCrearDirector.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public crearDirector() {
        initialize();
    }

    private void initialize() {
        frmCrearDirector = new JFrame();
        frmCrearDirector.getContentPane().setForeground(Color.GRAY);
        frmCrearDirector.setTitle("Personas App");
        frmCrearDirector.setBounds(100, 100, 273, 308);
        frmCrearDirector.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCrearDirector.getContentPane().setLayout(null);

        JButton btnCrear = new JButton("Crear Director");
        btnCrear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnCrear.setBackground(Color.LIGHT_GRAY);
        btnCrear.setBounds(76, 235, 120, 23);
        frmCrearDirector.getContentPane().add(btnCrear);
        
        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(10, 56, 61, 23);
        frmCrearDirector.getContentPane().add(lblNombre);

        JTextField inputName = new JTextField();
        inputName.setBounds(62, 57, 106, 20);
        frmCrearDirector.getContentPane().add(inputName);
        inputName.setColumns(10);
        
        JLabel lblEdad = new JLabel("Edad");
        lblEdad.setBounds(10, 90, 61, 23);
        frmCrearDirector.getContentPane().add(lblEdad);

        JTextField inputAge = new JTextField();
        inputAge.setBounds(62, 90, 106, 20);
        frmCrearDirector.getContentPane().add(inputAge);
        inputAge.setColumns(10);
        
        JLabel lblEstatura = new JLabel("Estatura");
        lblEstatura.setBounds(10, 124, 61, 23);
        frmCrearDirector.getContentPane().add(lblEstatura);

        JTextField inputSize = new JTextField();
        inputSize.setBounds(62, 124, 106, 20);
        frmCrearDirector.getContentPane().add(inputSize);
        inputSize.setColumns(10);
        
        JLabel lblCurso = new JLabel("Curso");
        lblCurso.setBounds(10, 158, 61, 23);
        frmCrearDirector.getContentPane().add(lblCurso);

        JTextField inputGrade = new JTextField();
        inputGrade.setBounds(62, 158, 106, 20);
        frmCrearDirector.getContentPane().add(inputGrade);
        inputGrade.setColumns(10);
        
        JLabel lblSueldo = new JLabel("Sueldo");
        lblSueldo.setBounds(10, 192, 61, 23);
        frmCrearDirector.getContentPane().add(lblSueldo);

        JTextField inputSueldo = new JTextField();
        inputSueldo.setBounds(62, 192, 106, 20);
        frmCrearDirector.getContentPane().add(inputSueldo);
        inputSueldo.setColumns(10);

        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Director d = new Director(Integer.parseInt(inputAge.getText()), Float.parseFloat(inputSize.getText()), inputName.getText(), Integer.parseInt(inputGrade.getText()), Integer.parseInt(inputSueldo.getText()));
                MainView.guardarDirector(d);
                frmCrearDirector.dispose();
            }
        });
    }
}
