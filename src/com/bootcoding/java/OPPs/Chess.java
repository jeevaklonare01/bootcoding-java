package com.bootcoding.java.OPPs;

public class Chess {
    String King;
    String Queen;
    String Bishop;
    String Rook;
    String Knight;
    String Pawn;

    //move-set of pieces
    public void King_movement(){
        System.out.println("King can step only once in any 8 squares");
    }

    public void Queen_movement(){
        System.out.println("Queen can step anywhere freely in straight lines or diagonaly");
    }

    public void Bishop_movement(){
        System.out.println("Bishop can move only diagonally");
    }

    public void Rook_movement(){
        System.out.println("Rooke can only move in a straight line");
    }

    public void Knight_movement(){
        System.out.println("Knight steps twice then goes to the side");
    }

    public void Pawn_movement(){
        System.out.println("Pawn steps only one step and kills diagonally");
    }
    public void print(){
        System.out.println("King"+King);
        System.out.println("Queen"+Queen);
        System.out.println("Bishop"+Bishop);
        System.out.println("Rook"+Rook);
        System.out.println("Knight"+Knight);
        System.out.println("Pawn"+Pawn);

    }

    public static void main(String[] args) {
        Chess chess = new Chess();

        chess.King = "If king dies the game ends";
        chess.Queen= "The queen in one of the most valuable piece of all";
        chess.Bishop = "Bishop kills diagonally";
        chess.Rook = "Rook kills in a Straight Line";
        chess.Knight = "Knight kills at 2 and a 1/2 step";
        chess.Pawn = "Pawn kills diagonally 1 step only";

        chess.King_movement();
        chess.Queen_movement();
        chess.Bishop_movement();
        chess.Rook_movement();
        chess.Knight_movement();
        chess.Pawn_movement();
        chess.print();
    }
}

