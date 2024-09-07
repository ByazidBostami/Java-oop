public class Reader {
    public String name;
    public int capacity;
    public String[] books;
    public int bookCount;

    
    public Reader() {
        this.name = "New user";
        this.capacity = 0;
        this.books = new String[0];
        this.bookCount = 0;
    }

  
    public void createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new String[capacity];
    }


    public void addBook(String book) {
        if (bookCount < capacity) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("No more space for new book");
        }
    }

 
    public void increaseCapacity(int newCapacity) {
        if (newCapacity > capacity) {
            String[] newBooks = new String[newCapacity];
            System.arraycopy(books, 0, newBooks, 0, bookCount);
            this.books = newBooks;
            this.capacity = newCapacity;
            System.out.println(name + "'s capacity increased to " + newCapacity);
        }
    }


    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books:");
        if (bookCount == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println("Book " + (i + 1) + ": " + books[i]);
            }
        }
    }
}
