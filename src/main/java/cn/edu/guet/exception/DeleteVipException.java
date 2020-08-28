package cn.edu.guet.exception;

public class DeleteVipException extends RuntimeException {
    public DeleteVipException(){
        super();
    }
    public DeleteVipException(String errorMessage){
        super(errorMessage);
    }

}
