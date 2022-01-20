package com.example.hexgame;

/**Interface For Hex Class*/
public interface Hex_i{
    /**Sets Board Size*/
    public	void setSize(int _size_);
    /**Returns Board Size*/
    public	int getSize();
    /**Sets Game Type*/
    public	void setType(int _type_);
    /**Returns Game Type*/
    public	int getType();
    /**Plays Computer's Move*/
    public	Cell play();
    /**Plays Player's Move*/
    public	void play(Cell cell);
    /**Returns The Number Of Marked Cell In Game*/
    public	int marked_cells();
    /**Checks The Game If It Is Finished Or Not*/
    public	int isFinished();
    /**Calculates And Returns The Score*/
    public	String userScore(char player);
}