package com.kk.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PieceFactory {

    private Map<String,Piece> pieceContext;

    public PieceFactory() {
        this.pieceContext = new HashMap<>();
    }

    public Piece getPiece(String color){
        if (!pieceContext.containsKey(color)) {
            if(color.equals("White")){
                pieceContext.put(color,new WhitePiece());
            }else {
                pieceContext.put(color,new BlackPiece());
            }
        }
        return pieceContext.get(color);
    }

    public Integer getContextSize(){
        return pieceContext.size();
    }
}
