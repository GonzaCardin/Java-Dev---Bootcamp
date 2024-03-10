package com.educacionit.statics;

public class classVariables {
    private static int var=0;;
    private String name;
    
    public classVariables(String name) {
        super();
        var++;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getVar() {
        return var;
    }
    @Override
    protected void finalize() throws Throwable {
        var--;
        System.err.println("Finalize: " + this.name);
    }
}
