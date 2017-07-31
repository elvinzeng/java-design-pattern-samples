package com.gelvt.gofdp.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 编辑器历史记录
 * @author: Elvin Zeng
 * @date: 17-7-31.
 */
public class History {
    private List<Version> versions = new LinkedList<>();

    public boolean contains(Object o) {
        return versions.contains(o);
    }

    public Iterator<Version> iterator() {
        return versions.iterator();
    }

    public boolean add(Version version) {
        return versions.add(version);
    }

    public boolean remove(Object o) {
        return versions.remove(o);
    }

    public void clear() {
        versions.clear();
    }

    public Version get(int index) {
        return versions.get(index);
    }

    public Version set(int index, Version element) {
        return versions.set(index, element);
    }

    public Version remove(int index) {
        return versions.remove(index);
    }

    public int indexOf(Object o) {
        return versions.indexOf(o);
    }

    public Version pop(){
        return this.versions.remove(versions.size() - 1);
    }
}
