package com.tugalsan.api.ide.netbeans.server;

import java.nio.file.*;
import com.tugalsan.api.file.server.*;

public class TS_NetbeansUtils {

    public static boolean isNetbeansExists() {
        return TS_DirectoryUtils
                .subDirectories(Path.of("C:", "Program Files"), false, false)
                .stream()
                .filter(dir -> dir.getFileName().toString().startsWith("NetBeans"))
                .findAny()
                .isPresent();
    }
}
