package edu.brain.lesson4;

class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Stephen King", "The Dark Tower");
        book1.setName("The Dark Tower");
        book1.setPages(1000);
        System.out.println(book1.getPublisher());
        System.out.println(book1.getAUTHOR());
        System.out.println(book1.getName() + ", " + book1.getPages());
        System.out.println(book1.getProgressReadByPage(200));
        System.out.println(book1);

        Book book2 = new Book("Arthur Doyle", "Sherlock Holmes");
        book2.setName("It");
        book2.setPages(1138);
        System.out.println(book2.getName() + ", " + book2.getPages());
        System.out.println(book2.getProgressReadByPage(322));
        System.out.println(book2);

        Book book3 = new Book("Robert Stevenson", "The Treasure island");
        book3.setName("The Shining");
        book3.setPages(447);
        System.out.println(book3.getName() + ", " + book3.getPages());
        System.out.println(book3.getProgressReadByPage(50));
        System.out.println(book3);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        PostOffice post = new PostOffice("Lviv, Kulparkivska street 133", 100);
        post.setAddress("Pasichna street 44");
        post.setClients(1000);
        System.out.println(post.getAddress() + ", " + post.getClients() + ", " + post.getCOMPANY());
        post.setAddress("Livarna street 52");
        post.setClients(422);
        System.out.println(post.getAddress() + ", " + post.getClients());
        post.setAddress("Lychakivska street 442");
        post.setClients(2000);
        System.out.println(post.getAddress() + ", " + post.getClients());
        System.out.println();
        System.out.println(post.calcVolumetricWeight(2, 4, 8));
        System.out.println(post.packingShipping(3));
        System.out.println(post);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Market supMarket = new Market("Metro", 10000);
        supMarket.setClients(100000);
        System.out.println(Market.getDIRECTORS());
        System.out.println(supMarket.getName() + ", " + supMarket.getClients());
        supMarket.setName("Silpo");
        supMarket.setClients(40000);
        System.out.println(supMarket.getName() + ", " + supMarket.getClients());
        supMarket.addCart("Умар");
        System.out.println();
        System.out.println(supMarket.getBonusCash(10));
        System.out.println();
        System.out.println(supMarket.buyProduct(10000, "Кредитка"));
        System.out.println(supMarket);
    }
}
