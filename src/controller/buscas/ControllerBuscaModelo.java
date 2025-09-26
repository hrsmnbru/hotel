package controller.buscas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaModelo;

public class ControllerBuscaModelo implements ActionListener {
    TelaBuscaModelo telaBuscaModelo;

    public ControllerBuscaModelo(TelaBuscaModelo telaBuscaModelo) {
        this.telaBuscaModelo = telaBuscaModelo;
        
        this.telaBuscaModelo.getjButtonCarregar().addActionListener(this);
        this.telaBuscaModelo.getjButtonCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaModelo.getjButtonCarregar()) {
            if (this.telaBuscaModelo.getjTableDados().getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum dado selecionado.");
            } else {
                JOptionPane.showMessageDialog(null, "Aguarde, carregando dados");
            }
        } else if (e.getSource() == this.telaBuscaModelo.getjButtonCancelar()) {
            this.telaBuscaModelo.dispose();
        }
    }
}