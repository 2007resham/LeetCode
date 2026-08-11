class ParkingSystem {
    int big_count;
    int medium_count;
    int small_count;
    int big = 1;
    int medium = 2;
    int small = 3;
    public ParkingSystem(int big, int medium, int small) {
        this.big_count = big;
        this.medium_count = medium;
        this.small_count = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == big) {
        if (big_count > 0) {
            big_count--;
            return true;
        }
    }

    else if (carType == medium) {
        if (medium_count > 0) {
            medium_count--;
            return true;
        }
    }

    else if (carType == small) {
        if (small_count > 0) {
            small_count--;
            return true;
        }
    }

    return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */