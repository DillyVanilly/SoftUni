import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s");

        Article article = new Article(input[0], input[1], input[2]);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            String[] command = scanner.nextLine().split(":\\s");

            switch (command[0]) {
                case "Edit":
                    article.editContent(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    article.renameTitle(command[1]);
                    break;
            }
        }
        System.out.println(article);
    }

    static class Article {
        String title;
        String content;
        String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void renameTitle(String title) {
            this.title = title;
        }

        public void editContent(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
        }
    }
}