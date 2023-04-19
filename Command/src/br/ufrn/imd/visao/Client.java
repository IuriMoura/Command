package br.ufrn.imd.visao;

import br.ufrn.imd.modelo.Receiver;
import br.ufrn.imd.controller.CopyCommand;
import br.ufrn.imd.controller.Invoker;
import br.ufrn.imd.controller.PrintCommand;
import br.ufrn.imd.controller.SaveCommand;

public class Client {
    public static void main(String[] args) {
        // Receiver é o responsavel por armazenar os comandos
        Receiver receiver = new Receiver();

        // São as classes concrete command, implementão Command e gera uma ação
        CopyCommand copyCommand = new CopyCommand(receiver);
        SaveCommand saveCommand = new SaveCommand(receiver);
        PrintCommand printCommand = new PrintCommand(receiver);

        // Invoker é responsavel por fazer a chamda de execução dos comandos
        Invoker invoker = new Invoker();

        // Invoker Chamando o execute de cada concret command class
        invoker.setCommand(copyCommand);
        invoker.executeCommand();

        invoker.setCommand(saveCommand);
        invoker.executeCommand();

        invoker.setCommand(printCommand);
        invoker.executeCommand();

        //imprime os logs que ficam em receiver
        System.out.println(receiver.getLogs());
    }
}
