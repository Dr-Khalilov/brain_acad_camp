package edu.brain.lesson_17;

import java.util.Arrays;
import java.util.Comparator;

class PlayRoom {
    public static void main(String[] args) {
        Game.GameDisk[] physicalGames = {
                Game.getDisk("God of War: Ragnarok", GameGenre.RPG, "Epic game"),
                Game.getDisk("Tekken", GameGenre.FIGHTING, "Like a Mortal Kombat"),
                Game.getDisk("Fable: The Lost Chapters", GameGenre.ADVENTURES, "Favorite game"),
                Game.getDisk("Darksiders", GameGenre.RPG, "Legendary game")
        };

        Game.VirtualGame[] virtualGames = {
                Game.createVirtualGame("FIFA", GameGenre.SPORT, GameRating.ONE_POINT),
                Game.createVirtualGame("Mortal Kombat X", GameGenre.FIGHTING, GameRating.THREE_POINTS),
                Game.createVirtualGame("Counter-Strike 1.6", GameGenre.SHOOTER, GameRating.FIVE_POINTS),
                Game.createVirtualGame("Resident Evil", GameGenre.HORROR, GameRating.FOUR_POINTS)
        };

        GameConsole playstation = new GameConsole(BrandConsole.Sony, "XC123QeWR");

        Arrays.sort(physicalGames, null);
        Arrays.sort(virtualGames, Comparator.reverseOrder());

        System.out.println("Physical games:");
        for (Game.GameDisk gameDisk : physicalGames) {
            System.out.println(gameDisk);
        }

        System.out.println("Virtual games:");
        for (Game.VirtualGame virtual : virtualGames) {
            System.out.println(virtual);
        }
        playstation.powerOn();
        playstation.loadGame(physicalGames[1].getData());
        int count = 0;
        while (count < 11) {
            playstation.playGame();
            count++;
        }

    }
}
