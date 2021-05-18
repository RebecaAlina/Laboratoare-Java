package ex3;

public class Punct {
    private double x;
    private double y;

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public Punct(){
        this(0,0);
    }
    public Punct(int x,int y){
        this.x=x;
        this.y=y;
    }
    public boolean equals(Punct punct){
        return this.x==punct.x && this.y==punct.y;
    }

    @Override
    public String toString(){
        return "X:"+x+"; Y:"+y;
    }
}
