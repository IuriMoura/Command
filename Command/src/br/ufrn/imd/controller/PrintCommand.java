package br.ufrn.imd.controller;

import br.ufrn.imd.modelo.*;

public class PrintCommand implements Command{
    private Receiver receiver;

    public PrintCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.print();
    }
}
