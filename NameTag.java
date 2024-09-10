public class NameTag {
    String name = "Unknown";
//constructor/default
public NameTag() {
    name = "Unknown";
}
//constructor/full
public NameTag(String newName) {
    name = newName;
}

public NameTag(NameTag nameTag) {
    name = nameTag.name;//chatGPT
}
//getter
public String getName() {
    return name;
}
//setter
public void SetName(String newName) {
    name = newName;
}
//toString
public String toString() {
    return name;
}
//equals
public boolean equals(NameTag nameTag) {
    return name.equals(nameTag.name);//chatGPT;
    //  = is assingning a value
// == is comparing two values
}
}
