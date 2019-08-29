package calculadora;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lista {

    ArrayList listaCalculo = new ArrayList();

    public void salvar(String item) {
        if (!item.equals("")) {

            listaCalculo.add(item);

        }
    }

    public String Lista() {
        String r = "Lista de Itens Calculados\n\n" + "Seq            Item                    Resultado\n";
        if (!listaCalculo.isEmpty()) {
            for (int i = 0; i < listaCalculo.size(); i++) {
                r += " " + (1 + i) + "    : " + listaCalculo.get(i) + "\n";
            }
        } else {
            r = "Sua lista está vazia!!";
        }
        return r;

    }

    public void excluir(int indice) {
        if (listaCalculo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não é possivel excluir\n Código inexistente");
        } else if (indice <= listaCalculo.size()) {
            if (JOptionPane.showConfirmDialog(null, "Você tem certeza que desaja EXCLUIR o item :  "
                +listaCalculo.get(indice - 1) + "?", "Exclusão", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                listaCalculo.remove(indice - 1);
            } else {
                JOptionPane.showMessageDialog(null, "Exclusão Cancelada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossivel Excluír\n CÓDIGO INEXISTENTE");
        }

    }

    public void editar(int indice) {
        if (listaCalculo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não é possivel Editar\n Código inexistente");
        
        } else if (indice <= listaCalculo.size()) {

            listaCalculo.set((indice - 1),
            JOptionPane.showInputDialog(null, "Informe o novo Código"));
        } else {
            JOptionPane.showMessageDialog(null, "Edição Cancelada");
        }
        

        

    }
    
   public void limpar(){
       if(JOptionPane.showConfirmDialog(null," Tem certeza que deseja limpar?","Limpeza Geral",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
               listaCalculo.clear();
               JOptionPane.showMessageDialog(null," Resultados Limpos");
       }else{
           JOptionPane.showMessageDialog(null," Limpeza cancelada");
       }
   }
}

