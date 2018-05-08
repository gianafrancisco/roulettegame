package fransis.games.roulette;

import java.util.function.Supplier;

public class Random implements Roulette {
    private Supplier<Integer> random;

    public Random(Supplier<Integer> random) {
        this.random = random;
    }

    public int spin() {
        return random.get();
    }
}
