package controller.cadastros;

import controller.buscas.ControllerBuscaFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadFornecedor;
import view.TelaBuscaFornecedor;

public class ControllerCadFornecedor implements ActionListener {
    TelaCadFornecedor telaCadFornecedor;

    public ControllerCadFornecedor(TelaCadFornecedor telaCadFornecedor) {
        this.telaCadFornecedor = telaCadFornecedor;
        
        this.telaCadFornecedor.getjButtonNovo().addActionListener(this);
        this.telaCadFornecedor.getjButtonBuscar().addActionListener(this);
        this.telaCadFornecedor.getjButtonSalvar().addActionListener(this);
        this.telaCadFornecedor.getjButtonCancelar().addActionListener(this);
        this.telaCadFornecedor.getjButtonFechar().addActionListener(this);
        
        utilities.Utilities.ativaDesativa(this.telaCadFornecedor.getjPanelBotoes(), true);
        utilities.Utilities.limpaComponentes(this.telaCadFornecedor.getjPanelDados(), false);       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaCadFornecedor.getjButtonNovo()) {
            utilities.Utilities.ativaDesativa(this.telaCadFornecedor.getjPanelBotoes(), false);
            utilities.Utilities.limpaComponentes(this.telaCadFornecedor.getjPanelDados(), true);
            
        }else if(e.getSource() == this.telaCadFornecedor.getjButtonBuscar()) {
            TelaBuscaFornecedor telaBuscaFornecedor = new TelaBuscaFornecedor(null, true);
            ControllerBuscaFornecedor controllerBuscaFornecedor = new ControllerBuscaFornecedor(telaBuscaFornecedor);
            telaBuscaFornecedor.setVisible(true);
            
        }else if(e.getSource() == this.telaCadFornecedor.getjButtonSalvar()) {
            utilities.Utilities.ativaDesativa(this.telaCadFornecedor.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadFornecedor.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadFornecedor.getjButtonCancelar()) {
            utilities.Utilities.ativaDesativa(this.telaCadFornecedor.getjPanelBotoes(), true);
            utilities.Utilities.limpaComponentes(this.telaCadFornecedor.getjPanelDados(), false);
            
        }else if(e.getSource() == this.telaCadFornecedor.getjButtonFechar()) {
            this.telaCadFornecedor.dispose();
        }
    }
}