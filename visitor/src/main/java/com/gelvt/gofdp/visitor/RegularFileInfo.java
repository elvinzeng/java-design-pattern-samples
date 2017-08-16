package com.gelvt.gofdp.visitor;

import java.util.Arrays;

/**
 * 普通文件的描述信息
 * @author: Elvin Zeng
 * @date: 17-8-16.
 */
public class RegularFileInfo extends FileInfo {
    private byte[] data;  //  文件内容

    public RegularFileInfo(String name) {
        super(name);
    }

    @Override
    public void traverseFileTree(FileInfoVisitor visitor) {
        visitor.visitFile(this);
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RegularFileInfo{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
