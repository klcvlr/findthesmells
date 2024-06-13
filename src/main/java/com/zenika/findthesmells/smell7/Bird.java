package com.zenika.findthesmells.smell7;

class Bird {
    private final BirdRace type;
    private final boolean supportCold;
    private final int month;

    Bird(BirdRace type, boolean supportCold, int month) {
        this.type = type;
        this.supportCold = supportCold;
        this.month = month;
    }

    public double getSpeed() {
        switch (type) {
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                double multiplicateur = getLoadFactor();

                if (month == 12 || month == 1 || month == 2) {
                    multiplicateur = 1.3;
                } else if (month >= 3 && month <= 5) {
                    multiplicateur = 1.1;
                } else if (month >= 6 && month <= 8) {
                    multiplicateur = 0.9;
                } else if (month >= 9 && month <= 11) {
                    multiplicateur = 1.1;
                }

                return getBaseSpeed() * multiplicateur;
            case NORWEGIAN_BLUE:
                return (supportCold) ? getBaseSpeed() : 0;
        }
        throw new RuntimeException("Should be unreachable");
    }

    private double getLoadFactor() {
        return 1.0;
    }

    private double getBaseSpeed() {
        return 20;
    }
}
