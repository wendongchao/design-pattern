package composite;

public abstract class Corp {
private String name = "";
private String position = "";
private int salary = 0;
private Corp parent = null;
public Corp(String name,String position,int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
}
public String getInfo() {
        String info = "";
        info += "姓名："+this.name;
        info += "\t职位："+this.position;
        info += "\t薪水："+this.salary;
        return info;
}
protected void setParent(Corp corp){
    this.parent = corp;
}
public Corp getParent(){
    return this.parent;
}
}
