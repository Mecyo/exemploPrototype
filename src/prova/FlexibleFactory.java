package prova;

import interfaces.IPrototype;
import java.util.HashMap;

class FlexibleFactory {
    
    private HashMap<String, IPrototype> listaPrototypes = new HashMap<>();
    
    public Boolean addPrototype(String nome, IPrototype prototype){
        if(listaPrototypes.containsKey(nome))
            return Boolean.FALSE;

        listaPrototypes.put(nome, prototype);
        return Boolean.TRUE;
    }
    
    public Boolean removePrototype(String nome){
        if(!listaPrototypes.containsKey(nome)) 
            return Boolean.FALSE;
        
        listaPrototypes.remove(nome);
        return Boolean.TRUE;
    }
    
    public Object create(String nome) {
        IPrototype prototype = listaPrototypes.get(nome);
        if(prototype == null)
            return null;
        return prototype.clone();
    }
}
