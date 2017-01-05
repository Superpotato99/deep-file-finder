package com.github.dff;
import java.io.File;
import java.util.List;

/**
 * Created by André Ferreira <andreferreira_92@hotmail.com> on 05/01/2017.
 */
public class LocalFileLocator implements FileLocator {


    @Override
    public List<File> getFileLocations(String expression, String rootDirectory) {
        return null;
    }

    @Override
    public List<File> getFileLocations(String file) {
        return null;
    }

    @Override
    public List<File> findExactDuplicates(File file) {
        return null;
    }

    @Override
    public List<File> findHashDuplicates(File file) {
        return null;
    }

    @Override
    public List<File> findNameDuplicates(String filename) {
        return null;
    }
}
