package controller.buscas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaMarca;

public class ControllerBuscaMarca implements ActionListener {
    TelaBuscaMarca telaBuscaMarca;

    public ControllerBuscaMarca(TelaBuscaMarca telaBuscaMarca) {
        this.telaBuscaMarca = telaBuscaMarca;
        
        this.telaBuscaMarca.getjButtonCarregar().addActionListener(this);
        this.telaBuscaMarca.getjButtonCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaMarca.getjButtonCarregar()) {
            if (this.telaBuscaMarca.getjTableDados().getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum dado selecionado.");
            } else {
                JOptionPane.showMessageDialog(null, "Aguarde, carregando dados");
            }
        } else if (e.getSource() == this.telaBuscaMarca.getjButtonCancelar()) {
            this.telaBuscaMarca.dispose();
        }
    }
}