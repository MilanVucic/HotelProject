package lesson_24;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Path path = Path.of("files\\highscores.txt");
        try {
            List<Player> highscores;
            if (Files.exists(path)) {
                highscores = createPlayersFromFile(Files.readAllLines(path));
            } else {
                highscores = new ArrayList<>();
            }
            loop: while (true) {
                System.out.println("What to do:");
                System.out.println("1. View highscores");
                System.out.println("2. Add new highscore");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> {
                        for (int i = 0; i < highscores.size(); i++) {
                            System.out.println((i + 1) + ". " + highscores.get(i));
                        }
                    }
                    case 2 -> {
                        System.out.println("Enter your name?");
                        String name = scanner.nextLine();
                        System.out.println("Enter your points?");
                        int points = Integer.parseInt(scanner.nextLine());
                        highscores.add(new Player(name, points));
                        highscores.sort(new Comparator<Player>() {
                            @Override
                            public int compare(Player o1, Player o2) {
                                return o2.getPoints() - o1.getPoints();
                            }
                        });
                    }
                    default -> {
                        break loop;
                    }
                }
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (Player player : highscores) {
                stringBuilder.append(player).append("\n");
            }
            Files.writeString(path, stringBuilder.toString(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static List<Player> createPlayersFromFile(List<String> allLines) {
        List<Player> players = new ArrayList<>();
        for (String line : allLines) {
            String[] parts = line.split(" ");
            Player p = new Player(parts[0], Integer.parseInt(parts[1]));
            players.add(p);
        }
        return players;
    }

    private static void nioExamples() {
        Path path = Path.of("files\\test.txt");
        Path path2 = Path.of("files\\test_creating.txt");
        try {
            Files.writeString(path2, "Add something more", StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void example() {
        varArgsExample("");
        varArgsExample("asd", "asdasd");
        varArgsExample("asdf", "asdasd", "asdj");
        varArgsExample("qwekqwke", "asdasd", "asdj", "ajwejq");
    }

    private static void varArgsExample(String mandatory, String... arguments) {
        for (int i = 0; i < arguments.length; i++) {
            System.out.println(arguments[i]);
        }
    }

    private static void readFile(Path path) {
        try {
            List<String> allLines = Files.readAllLines(path);
            for (String line: allLines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
