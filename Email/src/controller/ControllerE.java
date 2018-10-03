package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelE;
import view.ViewE;
import javax.swing.JOptionPane;
/**
 *
 * @author Dani
 */
public class ControllerE implements ActionListener {
    
    private final ModelE model;
    private final ViewE view;

    public ControllerE(ModelE model, ViewE view){
        this.model = model;
        this.view = view;
        view.jb_guardar.addActionListener(this);
        view.jb_nuevo.addActionListener(this);
         
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.jb_guardar){
            model.setPath("C:\\Users\\gabii\\Documents\\ArchivoLE\\archivo.txt");
            String name = view.jtf_nombre.getText();
            String email = view.jtf_email.getText();
            System.out.println("buuuuuuuh");
            System.out.println(email);
            String message="";
            message+=name+","+email+"\n";
            model.setMessage(message);
            model.writeFile(model.getPath(), model.getMessage());
            JOptionPane.showMessageDialog(view, "Mensaje Guardado!");
        }else if(e.getSource()==view.jb_nuevo){
            view.jtf_email.setText(null);
            view.jtf_nombre.setText(null);
            
        }
        
    }
    private void initView() {
        view.setTitle("CSV v 0.1");
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    } 
    
}

