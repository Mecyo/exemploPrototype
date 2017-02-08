package prova;

import interfaces.IPrototype;

class Pneu implements IPrototype{

    private String tamanho;

    public Pneu() {
    }

    @Override
    public IPrototype clone() {
        Pneu clone = new Pneu();
        clone.tamanho = this.tamanho;
        return clone;
    }
    
}
