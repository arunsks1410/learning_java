class ArrayExample {
    public static void main(String[] args) {
        // Class Work
        String[] electronicItems = { "LG_AC", "Moto G45", "RAM", "Projector", "Mic" };
        int[] prices = { 30000, 10000, 8000, 15490, 2450 };

        for (int i = 0; i < electronicItems.length; i++) {
            System.out.println("Items name : " + electronicItems[i] + "Price : " + prices[i]);
        }

        // Home Work

        String[] books = { "Think like a Monk", "Magic of thinking big", "who move my cheese", "rich dad poor dad",
                "APJ Auto Biography" };
        int[] bookPrices = { 300, 100, 80, 1590, 2450 };

        for (int i = 0; i < books.length; i++) {
            System.out.println("Name : " + books[i] + "Price : " + bookPrices[i]);
        }

    }
}
