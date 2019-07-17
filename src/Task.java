import java.io.*;
import java.util.Objects;

public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        task.createFile();
        task.outputDataFile();
        task.inputDataFile();
        task.wordFound("av");
    }

    public void createFile() {
        String fileName = "1.txt";
        String dirName = System.getProperty("user.dir");
        String fullName = dirName + File.separator + fileName;
        File file = new File(fullName);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists");
        }
    }

    public void outputDataFile() {
        FileWriter fileWriter = null;
        String data = "Java";
        try {
            fileWriter = new FileWriter("1.txt");
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                Objects.requireNonNull(fileWriter).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void inputDataFile() {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        FileWriter fileWriter = null;
        int b;
        try {
            fis = new FileInputStream("1.txt");
            isr = new InputStreamReader(fis);
            while ((b = isr.read()) != -1) {
                try {
                    fileWriter = new FileWriter("2.txt", true);
                    if (b == 97) {
                        b = 65;
                        fileWriter.write((char) b);
                    } else {
                        fileWriter.write((char) b);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        Objects.requireNonNull(fileWriter).close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                Objects.requireNonNull(isr).close();
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    Objects.requireNonNull(fis).close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                try {
                    Objects.requireNonNull(fileWriter).close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public void wordFound(String word) {
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("1.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    System.out.println(builder.append(line));
                } else {
                    System.out.println("Данного слова не существует в файле");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
