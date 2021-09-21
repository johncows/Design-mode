package com.kk.flyweight;

public class Client {
    /**
     *  这里将棋子颜色定为内部状态，不随外界变化而变化
     *  棋子的位置为外部状态，通过参数注入
     *
     *  可以看出享元模式是在同等对象到达一定数量后，使用才有意义；本质上就是一个带缓存的工厂方法
     */
    public static void main(String[] args) {
        PieceFactory pieceFactory = new PieceFactory();
        // 第一轮 下棋
        Piece whitePiece1 = pieceFactory.getPiece("White");
        whitePiece1.operate(new Coordinate(5,5));
        Piece blackPiece1 = pieceFactory.getPiece("Black");
        blackPiece1.operate(new Coordinate(5,6));

        // 第二轮 下棋
        Piece whitePiece2 = pieceFactory.getPiece("White");
        whitePiece2.operate(new Coordinate(6,5));
        Piece blackPiece2 = pieceFactory.getPiece("Black");
        blackPiece2.operate(new Coordinate(7,5));

        System.out.println("当前容器中有"+pieceFactory.getContextSize()+"个棋子");
    }
}
