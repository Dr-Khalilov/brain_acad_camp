package edu.brain.lesson17;

enum GameRating {
    ONE_POINT(1), TWO_POINTS(2), THREE_POINTS(3), FOUR_POINTS(4), FIVE_POINTS(5);

    final Integer point;

    GameRating(Integer point) {
        this.point = point;
    }
}
