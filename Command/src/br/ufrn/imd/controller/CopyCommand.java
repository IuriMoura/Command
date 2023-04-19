package br.ufrn.imd.controller;

import br.ufrn.imd.modelo.Command;
import br.ufrn.imd.modelo.Receiver;

public class CopyCommand implements Command{
    private Receiver receiver;

    public CopyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.copy();
    }
}
