import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public void run() {

        System.out.println("할 일 관리 앱 시작");

        try (Scanner scanner = new Scanner(System.in); ) {

            List<Todo> todos = new ArrayList<>();

            long todosLastId = 0;

            while (true) {
                System.out.print("명령) ");
                String cmd = scanner.nextLine().trim();

                System.out.printf("입력한 명령: %s\n", cmd);

                if (cmd.equals("quit")) {
                    break;
                } else if (cmd.equals("add")) {
                    System.out.print("할일: ");
                    long a = todosLastId + 1;
                    todosLastId = a;
                    String content = scanner.nextLine().trim();

                    Todo todo = new Todo(a, content);

                    todos.add(todo);

                    System.out.printf(todo.getContent() + "ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");

                    System.out.printf("%d번 할 일이 생성되었습니다. ", a);

                } else if (cmd.equals("list")) {
                    for (Todo todo : todos) {

                        System.out.printf("%d     ", todo.getId());
                        System.out.printf("%s\n", todo.getContent());

                    }

                    todos.forEach(todo -> {
                        System.out.print("포이치로 실행");
                        System.out.printf("%d     ", todo.getId());
                        System.out.printf("%s\n", todo.getContent());

                    });
                }
            }
//        scanner.close();
        }
        System.out.println("할 일 관리 앱 끝");
    }
}
