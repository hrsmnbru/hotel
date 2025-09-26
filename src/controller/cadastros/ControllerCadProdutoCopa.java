package controller.cadastros;

import controller.buscas.ControllerBuscaProdutoCopa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadProdutoCopa;
import view.TelaBuscaProdutoCopa;

public class ControllerCadProdutoCopa implements ActionListener {
    TelaCadProdutoCopa telaCadProdutoCopa;

    public ControllerCadProdutoCopa(TelaCadProdutoCopa telaCadProdutoCopa) {
        this.telaCadProdutoCopa = telaCadProdutoCopa;
        
        this.telaCadProdutoCopa.getjButtonNovo().addActionListener(this);
        this.telaCadProdutoCopa.getjButtonBuscar().addActionListener(this);
        this.telaCadProdutoCopa.getjButtonSalvar().addActionListener(this);
        this.telaCadProdutoCopa.getjButtonCancelar().addActionListener(this);
        this.telaCadProdutoCopa.getjButtonFechar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadProdutoCopa.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadProdutoCopa.getjPanelDados(), false);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadProdutoCopa.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadProdutoCopa.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadProdutoCopa.getjPanelDados(), true);
            
        }else if(e.getSource() == this.telaCadProdutoCopa.getjButtonBuscar()) {
            TelaBuscaProdutoCopa telaBuscaProdutoCopa = new TelaBuscaProdutoCopa(null, true);
            ControllerBuscaProdutoCopa controllerBuscaProdutoCopa = new ControllerBuscaProdutoCopa(telaBuscaProdutoCopa);
            telaBuscaProdutoCopa.setVisible(true);
            
        }else if(e.getSource() == this.telaCadProdutoCopa.getjButtonSalvar()) {
            utilities.Utilities.ativaDesativa(this.telaCadProdutoCopa.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadProdutoCopa.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadProdutoCopa.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadProdutoCopa.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadProdutoCopa.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadProdutoCopa.getjButtonFechar()) {
            this.telaCadProdutoCopa.dispose();
        }
    }
}