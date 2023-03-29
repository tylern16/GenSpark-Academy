package org.example;


//-----------------------------------------REQUIREMENTS
//Everything is object - land/human/goblins
//ovreride toString
//create a grid
//use UTF characters for players, goblins and land
//game is turn based: NESW
//when a human and goblin collide, combat starts
//combat uses math.random
//extras:
//-   human has inventory
//-   goblin has drops
//-   stats can be modified by equipment
//-   map gen random treasure chest after each combat
//-   goblins pursue player


//todo
//create land
//goblin and human location


//combat
//human moving

public class Main {
    public static void main(String[] args) {
        System.out.println("You are in a world of Goblins fighting to survive!");

        Land land = new Land();
        System.out.println(land.drawLand());
    }
}