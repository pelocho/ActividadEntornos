package seleccionarTipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import creacionPersonas.crearAlumno;
import creacionPersonas.crearProfesor;
import creacionPersonas.crearDirector;

public class seleccionarTipoView {
	
	private JFrame frmSelectType;

	public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	seleccionarTipoView window = new seleccionarTipoView();
                    window.frmSelectType.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public seleccionarTipoView() {
    	initialize();
    }
    
    private void initialize() {
    	frmSelectType = new JFrame();
    	frmSelectType.getContentPane().setForeground(Color.GRAY);
    	frmSelectType.setTitle("Personas App");
    	frmSelectType.setBounds(100, 100, 501, 156);
    	frmSelectType.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	frmSelectType.getContentPane().setLayout(null);

        JButton btnAlumno = new JButton("Alumno");
        btnAlumno.setBackground(Color.LIGHT_GRAY);
        btnAlumno.setBounds(26, 44, 120, 23);
        frmSelectType.getContentPane().add(btnAlumno);

        JButton btnProfesor = new JButton("Profesor");
        btnProfesor.setBackground(Color.LIGHT_GRAY);
        btnProfesor.setBounds(181, 44, 128, 23);
        frmSelectType.getContentPane().add(btnProfesor);
        
        JButton btnDirector = new JButton("Director");
        btnDirector.setBackground(Color.LIGHT_GRAY);
        btnDirector.setBounds(345, 44, 120, 23);
        frmSelectType.getContentPane().add(btnDirector);
        
        btnAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearAlumno.main();
			}
		});
        
        btnProfesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearProfesor.main();
			}
		});
        
        btnDirector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearDirector.main();
			}
		});
    }
}
