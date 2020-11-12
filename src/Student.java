public class Student {
    private int id;
    private String name;
    public String showInfo(){
        return "id : " + id + "-----name : " + name;
    }
    public Student[] add(Student[] arr, Student s){
        Student[] newArr = new Student[arr.length + 1];
        newArr[newArr.length - 1] = s;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
