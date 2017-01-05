package com.github.dff;

import java.io.File;
import java.util.List;

/**
 * File Locator interface specification to be implemented by file searchers.
 *
 * @author Gonçalo Prendi (goncalo.prendi25@gmail.com)
 * @since 1.0.0
 */
public interface FileLocator {

    /**
     * Returns the list of files with a name that matches criteria defined in {@code expression}
     * inside the {@code rootDirectory} provided.
     *
     * @param expression    The expression used in the search.
     * @param rootDirectory The root directory where the search will begin.
     * @return              Returns a {@code List<File>} with the files that match the criteria.
     */
    List<File> getFileLocations(String expression, String rootDirectory);
}
