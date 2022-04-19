package interfaces;

import java.util.List;

public interface IFilesManager {

    void delFile(String filePath);

    void delDir(String dirPath);

    void mkFile(String filePath);

    void mkDir(String dirPath);

    List<String> readLines(String filePath);

    void writeLines(String filePath, List<String> fileLine,boolean append);
}
