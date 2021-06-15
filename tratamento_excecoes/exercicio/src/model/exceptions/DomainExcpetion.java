package model.exceptions;

public class DomainExcpetion extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DomainExcpetion(String msg){
        super(msg);
    }
}
