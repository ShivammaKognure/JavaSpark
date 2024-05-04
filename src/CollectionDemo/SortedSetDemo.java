package CollectionDemo;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Student implements Comparable{
    String name;
    Integer id;
    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student student=(Student) o;
        Integer id=student.getId();

        if(this.id>id){
            return 1;
        } else if (this.id<id) {
            return -1;
        }else {
            return 0;
        }
        //return Integer.compare(this.id,id);
    }
}

class MyComp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;
        Student s2=(Student) o2;
        Integer id1=((Student) o1).getId();
        Integer id2=((Student) o2).getId();
        if(id1>id2){
            return 1;
        } else if (id1<id2) {
            return -1;
        }else {
            return 0;
        }
    }
}
public class SortedSetDemo {
    public static void main(String[] args) {
        /*SortedSet<Integer> sortedSet=new TreeSet<>();// This automatically sort set beacuse Inetger internally implement Comparable
        sortedSet.add(10);
        sortedSet.add(1);
        sortedSet.add(5);
        System.out.println(sortedSet);*/

        SortedSet<Student> sortStu =new TreeSet<>(new MyComp());
        sortStu.add(new Student("raj",10));
        sortStu.add(new Student("Simran",5));
        sortStu.add(new Student("rohan",1));
        sortStu.add(new Student("ram",12));

        System.out.println(sortStu);

    }
}
