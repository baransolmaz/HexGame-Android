package com.example.hexgame;

public class Cell implements Cell_i{

    private	int y;
    private	char x,type;

    /**Default Contructor*/
    public Cell(){
    }
    /**Special Contructor*/
    public Cell(char _x_,int _y_){
        setY(_y_);
        setX(_x_);
    }
    /**Returns X Coordinate*/
    public char getX(){return x;}
    /**Sets X Coordinate*/
    public void setX(char _x_){x=_x_;}
    /**Returns Y Coordinate*/
    public int getY(){return y;}
    /**Sets Y Coordinate*/
    public void setY(int _y_){y=_y_;}
    /**Returns Cell Type*/
    public char getState(){return type;}
    /**Sets Cell Type*/
    public void setState(char _type_){type=_type_;}

}