package practiceClassEx;

public class main {

    public static void main(String[] args) {


        groceryStore houstonStore = new groceryStore();
        groceryStore seattleStore = new groceryStore();
        groceryStore orlandoStore = new groceryStore();

        double revenuOfHuston, revenueOfSeattle, rvenueOfOrlando;

        houstonStore.numberOfApples=534;
        houstonStore.priceOfApple=0.99;
        houstonStore.numberOfOranges=429;
        houstonStore.priceOfOranges=0.87;

        seattleStore.numberOfApples=765;
        seattleStore.priceOfApple=0.86;
        seattleStore.numberOfOranges=842;
        seattleStore.priceOfOranges=0.91;

        orlandoStore.numberOfApples=402;
        orlandoStore.priceOfApple=0.77;
        orlandoStore.numberOfOranges=398;
        orlandoStore.priceOfOranges=0.79;

        revenuOfHuston=(houstonStore.numberOfApples*houstonStore.priceOfApple) +
                (houstonStore.numberOfOranges*houstonStore.priceOfOranges);

        System.out.println(revenuOfHuston);

    }
}