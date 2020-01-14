import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter homeWork = new FileWriter("HomeWork.txt");
        homeWork.write("1. Полиморфизм - это использование метода в других классах свзанные наследованием\n");
        homeWork.write("2. Cast означает, что нужно взять объект одного определенного типа и «превратить его» " +
                "в другой тип Объекта. Этот процесс называется Cast\n");
        homeWork.write("3. Все объекты имеют обшую основу (типа все умеют плавать) но разные по своему\n");
        homeWork.write("3. Считаю что нет оганичений для Swimmables\n");
        homeWork.write("4. Если просто прописать код, будет ошибка что не может найти ссылку которая не создана");
        homeWork.close();

        FileReader fileReader = new FileReader("HomeWork.txt");
        Scanner scanner = new Scanner(fileReader);
        scanner.hasNext();
        homeWork.close();
    }
}
