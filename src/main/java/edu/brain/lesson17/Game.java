package edu.brain.lesson17;

import java.util.Objects;

class Game {
    private final String name;
    private final GameGenre genre;
    private final MediaType type;

    private Game(String name, GameGenre genre, MediaType type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public GameGenre getGenre() {
        return genre;
    }

    public MediaType getType() {
        return type;
    }

    static class GameDisk implements Comparable<GameDisk> {
        private final String description;
        private final Game data;

        private GameDisk(String name, GameGenre genre, String description) {
            this.data = new Game(name, genre, MediaType.PHYSICAL);
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public Game getData() {
            return data;
        }


        @Override
        public int compareTo(GameDisk object) {
            return object.getData().genre.compareTo(this.data.genre);
        }

        @Override
        public String toString() {
            return "GameDisk{" +
                    "description='" + description + '\'' +
                    ", data=" + data +
                    '}';
        }
    }

    static class VirtualGame implements Comparable<VirtualGame> {
        private GameRating rating;
        private final Game data;

        private VirtualGame(String name, GameGenre genre, GameRating rating) {
            this.rating = rating;
            this.data = new Game(name, genre, MediaType.VIRTUAL);
        }

        public GameRating getRating() {
            return rating;
        }

        public void setRating(GameRating rating) {
            this.rating = rating;
        }

        public Game getData() {
            return data;
        }

        @Override
        public int compareTo(VirtualGame object) {
            return object.getRating().point.compareTo(this.getRating().point);
        }

        @Override
        public String toString() {
            return "VirtualGame{" +
                    "rating=" + rating +
                    ", data=" + data +
                    '}';
        }
    }

    static GameDisk getDisk(String name, GameGenre genre, String description) {
        return new GameDisk(name, genre, description);
    }

    static VirtualGame createVirtualGame(String name, GameGenre genre, GameRating rating) {
        return new VirtualGame(name, genre, rating);
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game game)) return false;
        return getName().equals(game.getName()) && getGenre() == game.getGenre() && getType() == game.getType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGenre(), getType());
    }
}
