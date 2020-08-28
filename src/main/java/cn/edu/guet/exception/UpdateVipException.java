package cn.edu.guet.exception;

public class UpdateVipException extends RuntimeException {
    public UpdateVipException(){
        super();
    }
    public UpdateVipException(String errorMessage){
        super(errorMessage);
    }

}
