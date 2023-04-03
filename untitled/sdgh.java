public class sdgh {
    List<Player> players = something();
    float multiplier = somethingElse();

    var points = players.stream()
            .map(p -> p.getLevelsCompleted()
                    .stream()
                    .reduce(0, (acc, next) -> acc + next, (lt, rt) -> lt))
            .map(n -> n * multipler)
            .toList();

    var playerToPoints = new HashMap<Player, Integer>();
for (int i = 0; i < players.size(); i++) {
        playerToPoints.put(players.get(i), points.get(i))
    }

playerToPoints.entrySet().stream()
    .reduce(
        (acc, next) -> next.getValue() < acc.getValue() ? next : acc
    )
            .get()
    .getKey()
    .setLoser(true);

playerToPoints.entrySet().stream()
    .reduce(
        (acc, next) -> next.getValue() > acc.getValue() ? next : acc
    )
            .get()
    .getKey()
    .setWinner(true);
}
