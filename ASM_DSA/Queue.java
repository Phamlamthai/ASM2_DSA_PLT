/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ASM_DSA;

public class Queue {
    int first, last, size;
    int length;
    Message message[];
    
    public Queue(int length){
        this.first=this.size=0;
        this.last=length-1;
        this.length = length;
        message = new Message[length];
    }
     public boolean isEmpty(Queue queue){
            return (queue.size==0);
        }
     public boolean isFull(Queue queue){
         return (queue.size==queue.length);
     }
     public void enQueue(Message item){   
         
         if(isEmpty(this)) {
             this.last=(this.last + 1) % this.length;
             this.message[this.last]=item; 
             this.size=this.size+1;           
             System.out.println("Add Succesfully"); 
         } else{
             System.out.println("The stack is full");
         }
         
     
     }
     public Message deQueue(){
             if(isEmpty(this)){
             System.out.println("Queue is Empty");
             return null;
             }
             Message item = this.message[this.first];
             this.first=(this.first+1) % this.length;
             this.size=this.size-1;
             System.out.println("Delete Successfully ");
             return item;
     }
     public void show(){ 
         int i = 0;
         if(isEmpty(this)){
             System.out.println("The queue is empty");
         }
         else{
           System.out.println("Name : " + message[i].getName());               
           System.out.println("Here is your Message: " + message[i].getMessage());
         }
     }
}
