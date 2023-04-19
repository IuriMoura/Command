package br.ufrn.imd.controller;

import br.ufrn.imd.modelo.Command;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
