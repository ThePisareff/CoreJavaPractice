package pisareff.patterns.abstractModel.Util;

import pisareff.patterns.abstractModel.classes.Rankable;

public class RankComporator {

    public static int compareRank(Rankable a, Rankable b) {
        if (a.getRank() < b.getRank()) {
            return -1;
        } else if (b.getRank() < a.getRank()) {
            return 1;
        } else
            return 0;
        }

    }
