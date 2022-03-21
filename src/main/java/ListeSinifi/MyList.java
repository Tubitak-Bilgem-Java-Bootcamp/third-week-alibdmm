package ListeSinifi;

public class MyList<T> {
    private T list[];
    private int myListLength = 10;
    public MyList(){
        list = (T[]) new Object[myListLength];
    }
    public MyList(int n){
        list = (T[]) new Object[n];
        myListLength = n;
    }

    public int size(){
        int i = 0;
        for(T t: list) {
            if(t == null)
                break;
            i++;
        }
        return i;
    }

    public int getCapacity(){
        return this.list.length;
    }

    public void add(T data){
        if(this.size() >= this.myListLength){
            this.extendingList();
        }
        list[this.size()] = data;
    }

    //listenin boyutunu 2 katına çıkarma işlemi
    public void extendingList(){
        System.out.println("Liste 2 katına çıkartılacak güncel liste boyutu: "+this.myListLength);
        this.myListLength = myListLength*2;
        T[] cloneList = this.list.clone();
        this.list = (T[]) new Object[myListLength];
        for(T t: cloneList){
            this.add(t);
        }
        System.out.println("Liste 2 katına çıkartıldı: "+this.myListLength);
    }
}

