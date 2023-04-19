package br.ufrn.imd.controller;

import br.ufrn.imd.modelo.*;

public class SaveCommand implements Command{
    private Receiver receiver;

    public SaveCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.save();
    }
}
