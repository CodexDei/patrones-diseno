package org.codexdei.patrones.composite;

public class File extends Component{

    public File(String name) {
        super(name);
    }

    @Override
    public String show(int level) {
        return "\t".repeat(level) + name;
    }

    @Override
    public boolean search(String name) {
        return this.name.equalsIgnoreCase(name);
    }
}
