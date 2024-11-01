package org.example;
    /**
     * Kelas ini merepresentasikan sebuah buku dengan judul dan harga.
     */
    class Book {
        /**
         * Judul buku.
         */
        private String title;

        /**
         * Harga buku.
         */
        private double price;

        /**
         * Konstruktor untuk membuat objek Book.
         *
         * @param title Judul buku.
         * @param price Harga buku.
         */
        public Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        /**
         * Mendapatkan judul buku.
         *
         * @return Judul buku.
         */
        public String getTitle() {
            return title;
        }

        /**
         * Mendapatkan harga buku.
         *
         * @return Harga buku.
         */
        public double getPrice() {
            return price;
        }
    }

}