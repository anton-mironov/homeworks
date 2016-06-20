package New_HWs.KidsAndSweets;

public class CandyShop {

    public void purchase(Kid kid) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (kid) {
                    Sweet sweet;

                    if (kid.getSex() == 0) {
                        if (kid.getPreference() == 0) {
                            sweet = new Candy("lollipop", "vanilla");
                        } else {
                            sweet = new Candy("caramel", "fruit");
                        }
                    } else {
                        if (kid.getPreference() == 0) {
                            sweet = new IceCream("plombyro", "chocolate");
                        } else {
                            sweet = new IceCream("ice-cream", "pistachio");
                        }
                    }
                    kid.setLocalSweet(sweet);

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}