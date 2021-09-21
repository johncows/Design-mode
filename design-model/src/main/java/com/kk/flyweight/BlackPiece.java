package com.kk.flyweight;

public class BlackPiece extends Piece{

    String color = "黑色棋子";

    @Override
    public void operate(Coordinate coordinate) {
        System.out.println(color+"移动到"+coordinate);
    }
}
