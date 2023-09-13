package part01;

abstract class Taxpayer {
    private String id;
    public String getId(){
        return id;
    }
    abstract double pay();
}
