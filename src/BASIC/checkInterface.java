package BASIC;

public interface checkInterface {
    public abstract int run();

    default int jog(){
        return 1;
    }
}
