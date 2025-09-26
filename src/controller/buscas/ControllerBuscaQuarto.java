package controller.buscas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import view.TelaBuscaQuarto;

public class ControllerBuscaQuarto implements ActionListener {
    TelaBuscaQuarto telaBuscaQuarto;

    public ControllerBuscaQuarto(TelaBuscaQuarto telaBuscaQuarto) {
        this.telaBuscaQuarto = telaBuscaQuarto;
        
        this.telaBuscaQuarto.getjButtonCarregar().addActionListener(this);
        this.telaBuscaQuarto.getjButtonCancelar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaBuscaQuarto.getjButtonCarregar()) {
            if (this.telaBuscaQuarto.getjTableDados().getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Nenhum dado selecionado.");
            } else {
                JOptionPane.showMessageDialog(null, "Aguarde, carregando dados");
            }
        } else if (e.getSource() == this.telaBuscaQuarto.getjButtonCancelar()) {
            this.telaBuscaQuarto.dispose();
        }
    }
}