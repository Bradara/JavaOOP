package BookShop;

class Book {
    private String title;
    private String author;
    private double price;

    Book(String author, String title, double price) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    void setTitle(String title) {
        if (title.length() >2) {
            this.title = title;
        } else{
            throw new IllegalArgumentException("Title not valid!");
        }
    }

    void setAuthor(String author) {
        Character firstChar = (author.split("\\s+"))[1].charAt(0);
        if (firstChar > 47 && firstChar < 58 ) {
            throw new IllegalArgumentException("Author not valid!");
        } else{
            this.author = author;
        }
    }

    void setPrice(double price) {
        if (price >0) {
            this.price = price;
        } else{
            throw new IllegalArgumentException("Price not valid!");
        }
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nTitle: %s%nAuthor: %s%nPrice: %.1f%n",
                this.getClass().getSimpleName(), this.title, this.author, this.price);
    }
}
