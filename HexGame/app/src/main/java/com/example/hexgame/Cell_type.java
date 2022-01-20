package com.example.hexgame;

/**Cell Type Enums*/
public enum Cell_type
{	/**Empty '.'*/
EMPTY('.'),
    /**Player 1 'x'*/
    PLAYER1('x'),
    /**Player 2 'o'*/
    PLAYER2('o'),
    /**Computer 'o'*/
    COMPUTER('o');
    /**Enum Type*/
    final public char type;
    /**Constructor For Cell Type*/
    Cell_type(char code){
        this.type = code;
    }

}
