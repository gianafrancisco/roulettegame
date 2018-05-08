package fransis.games.roulette;

enum BetType {
    RED,
    ODD,
    _1_12,
    _13_24,
    _25_36,
    _C12A,
    _C12B,
    _C12C,
    _1_18,
    _19_36,
    _0_2,
    _0_3,
    _1_3,
    _4_6,
    _7_9,
    _10_12,
    _13_15,
    _16_18,
    _19_21,
    _22_24,
    _25_27,
    _28_30,
    _31_33,
    _34_36,
    _1_6,
    _7_12,
    _13_18,
    _19_24,
    _25_30,
    _31_36,

}

public class BetIndex {
    final BetType betType;
    final double win;

    public BetIndex(BetType betType, double win) {
        this.betType = betType;
        this.win = win;
    }
}
