public class Queue {
    int front, rear;
    int size = 5;
    int[] items = new int[size];
    Queue() {
        front = -1;
        rear = -1;
    }
    //check if Queue is full
    boolean isFull(){
        return (front == 0 && rear == size - 1);
    }

    // check if Queue is empty
    boolean isEmpty() {
        return front == -1;
    }

    // insert to queue
    void insert(int i){
        if(isFull()){
            System.out.println("Queue is full");

        }
        else {
            if(front == -1 ){
                front =0;
            }
            rear ++;
            items[rear]= i;
            System.out.println("Insert " + i);
        }
    }

    void delete(){
        int el;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        el = items[front];
        if(front>rear){
            front=-1;
            rear = -1;
        }
        else{
            front++;
        }
        System.out.println("Deleted "+ el);
    }

    public static void main(String[] args) {

        // insert new value to queue
        Queue q = new Queue();
        q.delete();
        for(int i =1; i<=6; i++){
            q.insert(i);
        }
        q.delete();
    }
}
