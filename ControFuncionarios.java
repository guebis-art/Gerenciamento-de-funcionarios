import javax.swing.*;

public class ControFuncionarios {

    public static void main(String[] args) {

        Funcionario funcionario;
        funcionario = new Funcionario();


        funcionario.setMatricula(JOptionPane.showInputDialog("Digite sua matricula: "));
        funcionario.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        funcionario.setCargo(JOptionPane.showInputDialog("Digite seu cargo: "));
        funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario: ")));


        JOptionPane.showMessageDialog(null, "Matricula: " + funcionario.getMatricula());
        JOptionPane.showMessageDialog(null, "Nome: " + funcionario.getNome());
        JOptionPane.showMessageDialog(null, "Cargo: " + funcionario.getCargo());
        JOptionPane.showMessageDialog(null, "Salario: " + funcionario.getSalario());
        funcionario.reajustarSalario();

        JOptionPane.showMessageDialog(null, "Salario reajustado: " + funcionario.getSalario());
    }
}
