import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> allArticles = new ArrayList<>();

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            String[] date = scanner.nextLine().split(",\\s");
            Article article = new Article(date[0], date[1], date[2]);
            allArticles.add(article);
        }
        String command = scanner.nextLine();
        sortedByCommand(allArticles, command);
    }

    private static void sortedByCommand(List<Article> allArticles, String command) {
        switch (command) {
            case "title":
                allArticles.stream()
                        .sorted((a1,a2)-> a1.getTitle().compareTo(a2.getTitle()))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "content":
                allArticles.stream()
                        .sorted((a1,a2)-> a1.getContent().compareTo(a2.getContent()))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "author":
                allArticles.stream()
                        .sorted((a1,a2)-> a1.getAuthor().compareTo(a2.getAuthor()))
                        .forEach(article -> System.out.println(article.toString()));
                break;
        }
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
