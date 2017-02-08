package prova;

import interfaces.IPrototype;

class Motor implements IPrototype{
    
    private String potencia;

    public Motor() {
    }

    @Override
    public IPrototype clone() {
        Motor clone = new Motor();
        clone.potencia = this.potencia;
        return clone;
    }
    
}
