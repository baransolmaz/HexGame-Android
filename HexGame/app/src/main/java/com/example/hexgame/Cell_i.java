package com.example.hexgame;

/**Interface For Cell Class*/
public interface Cell_i{
    /**Returns X-Axis*/
    public	char getX();
    /**Sets X-Axis*/
    public	void setX(char _x_);
    /**Returns Y-Axis*/
    public	int getY();
    /**Sets y-Axis*/
    public	void setY(int  _y_);
    /**Returns Type of Cell*/
    public	char getState();
    /**Sets Type of Cell*/
    public	void setState(char _type_);
}
