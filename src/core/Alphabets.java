package core;

class Alphabets {
    private char characters = 'a';

    public static void main(String args[]) {
        Alphabets obj = new Alphabets();

        obj.AlphaFor();
        obj.AlphaWhile();
        obj.AlphaDoWhile();
    }

    private void AlphaFor() {
        char ch;
        for (ch = 'a'; ch <= 'z'; ch++)
            System.out.println(ch);
    }

    private void AlphaWhile() {
        while (characters <= 'z') {
            System.out.println(characters);
            characters++;
        }
    }

    private void AlphaDoWhile() {
        do {
            System.out.println(characters);
            characters++;
        } while (characters <= 'z');
    }
}