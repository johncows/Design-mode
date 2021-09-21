package com.kk.flyweight;

public class WhitePiece extends Piece{

    String color = "白色棋子";

    @Override
    public void operate(Coordinate coordinate) {
        System.out.println(color+"移动到"+coordinate);
    }
}
