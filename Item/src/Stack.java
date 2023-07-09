
import java.util.LinkedList;


public class Stack {
    
    
    private class Item{
        private String itemName;
        private int itemId;
        private Item link;
        
        public Item(){
            itemName=null;            
            itemId=0;           
            link=null;            
        }
        
        public Item(String itemName, int itemId, Item link  ){
            this.itemName=itemName;
            this.itemId=itemId;
            this.link=link;
            
        }

        
        public String getItemName() {
            return itemName;
        }

       
        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        
        public int getItemId() {
            return itemId;
        }

       
        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        
        public Item getLink() {
            return link;
        }

       
        public void setLink(Item link) {
            this.link = link;
        }
        public String toString(){
        
            return "Ad Soyad: " + itemName + "Numara: " + itemId;
    }
        
        
        
        
    }
    
    private Item head;
    
    private LinkedList list = new LinkedList();
   
    
    public Stack(){
        head= null;
    }
    
    public void push(String itemName, int itemId){
        head= new Item (itemName, itemId,head);
        list.addFirst(head);
    }
    
    public String  pop()
    {
        if (head== null) {                      
            return "Yığıt boş elemam alamaz"; 
            
            }                                 
        else{
        
            String returnItemName=head.getItemName();
            int returnItemId=head.getItemId();
            head = head.link;
            return returnItemName + returnItemId; 
        }
    }

    
    public boolean isEmpty(){
        return (head==null);
    }
    
}
