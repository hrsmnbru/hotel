package controller.cadastros;

import controller.buscas.ControllerBuscaMarca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadMarca;
import view.TelaBuscaMarca;

public class ControllerCadMarca implements ActionListener {
    TelaCadMarca telaCadMarca;

    public ControllerCadMarca(TelaCadMarca telaCadMarca) {
        this.telaCadMarca = telaCadMarca;
        
        this.telaCadMarca.getjButtonNovo().addActionListener(this);
        this.telaCadMarca.getjButtonBuscar().addActionListener(this);
        this.telaCadMarca.getjButtonSalvar().addActionListener(this);
        this.telaCadMarca.getjButtonCancelar().addActionListener(this);
        this.telaCadMarca.getjButtonFechar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadMarca.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadMarca.getjPanelDados(), false);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadMarca.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadMarca.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadMarca.getjPanelDados(), true);
            
        }else if(e.getSource() == this.telaCadMarca.getjButtonBuscar()) {
            TelaBuscaMarca telaBuscaMarca = new TelaBuscaMarca(null, true);
            ControllerBuscaMarca controllerBuscaMarca = new ControllerBuscaMarca(telaBuscaMarca);
            telaBuscaMarca.setVisible(true);
            
        }else if(e.getSource() == this.telaCadMarca.getjButtonSalvar()) {
            utilities.Utilities.ativaDesativa(this.telaCadMarca.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadMarca.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadMarca.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadMarca.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadMarca.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadMarca.getjButtonFechar()) {
            this.telaCadMarca.dispose();
        }
    }
}