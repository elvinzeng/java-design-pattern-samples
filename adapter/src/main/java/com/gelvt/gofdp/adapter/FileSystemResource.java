package com.gelvt.gofdp.adapter;

import java.io.File;
import java.net.URI;

/**
 * Desc: 文件系统中的资源
 * Author: Elvin Zeng
 * Date: 17-7-1.
 */
public class FileSystemResource implements Resource {
    private final File file;
    private final String path;

    public FileSystemResource(File file) {
        this.file = file;
        this.path = file.getPath();
    }

    public FileSystemResource(String path) {
        this.file = new File(path);
        this.path = path;
    }

    @Override
    public boolean exists() {
        return this.file.exists();
    }

    @Override
    public File getFile() {
        return this.file;
    }

    @Override
    public String getFilename() {
        return this.file.getName();
    }

    @Override
    public URI getURI() {
        return this.file.toURI();
    }
}
