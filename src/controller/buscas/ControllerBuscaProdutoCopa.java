package controller.buscas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaProdutoCopa;

public class ControllerBuscaProdutoCopa implements ActionListener {
    TelaBuscaProdutoCopa telaBuscaProdutoCopa;

    public ControllerBuscaProdutoCopa(TelaBuscaProdutoCopa telaBuscaProdutoCopa) {
        this.telaBuscaProdutoCopa = telaBuscaProdutoCopa;
        
        this.telaBuscaProdutoCopa.getjButtonCarregar().addActionListener(this);
        this.telaBuscaProdutoCopa.getjButtonCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaProdutoCopa.getjButtonCarregar()) {
            if (this.telaBuscaProdutoCopa.getjTableDados().getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum dado selecionado.");
            } else {
                JOptionPane.showMessageDialog(null, "Aguarde, carregando dados");
            }
        } else if (e.getSource() == this.telaBuscaProdutoCopa.getjButtonCancelar()) {
            this.telaBuscaProdutoCopa.dispose();
        }
    }
}