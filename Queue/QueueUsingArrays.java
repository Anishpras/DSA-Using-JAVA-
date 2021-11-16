
class Queue{
    int capacity;
    int rear=-1;
    int a[];
    Queue(int size){
      capacity=size;
      a = new int[capacity];
    }
    int enqueue(int data){
        if(rear==capacity-1){
            System.out.println("Queue is FuLL");
        return -1;
        }
        rear++;
        a[rear]=data;
        return a[rear];
    }
    int dequeue(){
        if(rear==-1){
            System.out.println("Queue is Empty");
            return -1;
        }
       int del=a[0];
        for(int i=0;i<rear;i++){
            a[i]=a[i+1];
        }
        rear--;
        return del;
    }
    int getFront(){
        if(rear==-1){
            return -1;
        }
        return a[0];
    }
    void display(){
     if(rear==-1){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Elements are : ");
            for(int i=0;i<=rear;i++){
                System.out.println(a[i]);
            }
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
		System.out.println(q.getFront());
	}
}
