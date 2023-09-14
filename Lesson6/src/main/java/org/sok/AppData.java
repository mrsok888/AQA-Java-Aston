import java.io.*;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public void save(String filePath) {
        try (FileWriter writer = new FileWriter(filePath);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (int i = 0; i < header.length; i++) {
                if (i > 0) {
                    bufferedWriter.write(";");
                }
                bufferedWriter.write(header[i]);
            }
            bufferedWriter.newLine();

            for (int i = 0; i < data.length; i++) {
                int[] row = data[i];
                for (int j = 0; j < row.length; j++) {
                    if (j > 0) {
                        bufferedWriter.write(";");
                    }
                    bufferedWriter.write(String.valueOf(row[j]));
                }
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String filePath) {
        try (FileReader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String headerLine = bufferedReader.readLine();
            header = headerLine.split(";");

            String line;
            int rowCount = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] rowValues = line.split(";");
                if (rowCount == 0) {
                    data = new int[1][header.length];
                } else {
                    data = Arrays.copyOf(data, rowCount + 1);
                }
                data[rowCount] = new int[header.length];
                for (int i = 0; i < header.length; i++) {
                    data[rowCount][i] = Integer.parseInt(rowValues[i]);
                }
                rowCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public static void main(String[] args) {
        String[] header = {"Value1", "Value2", "Value3"};
        int[][] data = {
                {100, 200, 123},
                {300, 400, 500}
        };
        AppData appData = new AppData(header, data);
        appData.save("data.csv");
        AppData loadedData = new AppData(new String[]{}, new int[][]{});
        loadedData.load("data.csv");
    }
}