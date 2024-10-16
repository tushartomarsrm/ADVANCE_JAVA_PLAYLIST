// 1. Simple Hashing
// founded by sum of the ASCII values of all characters
// Use Cases: Basic data indexing, simple checksum validation.
// Example: Hash = (ASCII value of first character) + (ASCII value of second character) + ...
// 2. Division-Remainder Method
// Description: Hashes data by dividing the input value by a certain number (usually a prime) and using the remainder as the hash value.
// Use Cases: Hash tables, basic data structures.
// Example: Hash = (Key % TableSize)
// 3. Multiplicative Hashing
// Description: A hash function multiplies the key by a constant fraction and extracts the fractional part, which is then multiplied by the table size to get the hash value.
// Use Cases: More advanced hash tables.
// Example: Hash = floor(TableSize * (Key * constant fraction % 1))
// 4. Mid-Square Method
// Description: The input key is squared, and a portion of the resulting number is taken as the hash value.
// Use Cases: Simple hashing, where uniform distribution is needed.
// Example: If the key is 1234, square it to get 1522756, then take the middle part (e.g., 227).
// 5. Folding Method
// Description: Divides the input into several parts, processes each part separately, and then combines them into a final hash value.
// Use Cases: Hash tables, checksum algorithms.
// Example: For the input 987654321, split it into 98, 76, 54, and 321, then sum them up or combine them differently.
// 6. Cryptographic Hash Functions
// Description: Designed to be secure and provide properties like collision resistance (no two different inputs should produce the same hash). Widely used in cryptographic applications.
// Use Cases: Password hashing, data integrity, digital signatures.
// Examples:
// MD5: Produces a 128-bit hash value. Considered insecure due to vulnerabilities.
// SHA-1: Produces a 160-bit hash value. Also insecure.
// SHA-256: Part of the SHA-2 family, produces a 256-bit hash value and is widely used in secure applications.
// SHA-3: The latest member of the Secure Hash Algorithm family, with varying hash sizes (224, 256, 384, 512 bits).
// 7. Universal Hashing
// Description: Uses a set of hash functions chosen randomly to reduce the likelihood of collision, ensuring better performance on average.
// Use Cases: Cryptography, randomized algorithms.
// Example: Hash(x) = ((a * x + b) % p) % m, where a, b, p, and m are constants, with p being a prime number.
// 8. Perfect Hashing:
// 9. Consistent Hashing - distributed systems 
// 10. Double Hashing  Hash = (Hash1(key) + i * Hash2(key))  i is no of collisions
// 11. Linear Probing  if occupied slot check Hash(key) + 1, Hash(key) + 2, and so on.
// 12. Quadratic Probing " (e.g., 1, 4, 9, etc.) to resolve collisions.


package Hashing;

public class HashTable{

    int key_val_pairsno ;
    int size;
    ListNode[] heads;

    public HashTable(){
        this(10); //default value or size
    }
    public HashTable(int size){
        this.size=size;
        this.key_val_pairsno=0;
        heads = new ListNode[this.size];  //value ,next initialized to null (VERY IMPORTANT but int can't be null)
    }

    public class ListNode{
        int key;
        String value;
        ListNode next;
        public ListNode(int key,String value){
            this.key=key;
            this.value=value;
            this.next=null;
            key_val_pairsno++;

        } 
    }

    public int getHashIndex(int key){
        int size = this.size;
        return key%size;
    }

    public void insertKeyValue(int key,String value){
        int index = getHashIndex(key);
        if (heads[index]==null){
            heads[index] = new ListNode(key, value);
        }
        else{ 
            ListNode onemore = new ListNode(key, value);
            ListNode ptr = heads[index];
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=onemore;
        }
    }

    public void printData(){
        StringBuilder s = new StringBuilder();
        for (int i=0;i<size;i++){
            ListNode ptr = heads[i];
            s.append(i+" : ");
            while(ptr!=null){
                s.append("key:"+ptr.key+",value:"+ptr.value+"  ---->  ");
                ptr = ptr.next;
            }
            s.append("null\n");
        }
        System.out.println(s);
    }

    //get value by key
    public void getValueFromKey(int key){
        int index = getHashIndex(key);
        ListNode ptr =heads[index];
        while(ptr!=null){
            if (ptr.key==key){
                System.out.println("Value of given key is : "+ptr.value);
                return;
            }
            ptr=ptr.next;
        }
        if (ptr==null){
            System.out.println("Value with given key doesn't exist");
        }
    }

    //delete value with key
    public void deleteValueFromKey(int key){
        int index = getHashIndex(key);
        ListNode ptr = heads[index];
        ListNode preptr = null;
        while (ptr != null && ptr.key != key) {
            preptr = ptr;
            ptr = ptr.next;
        }
        if (ptr == null) {
            System.out.println("Value with given key doesn't exist");
            return;
        }
        if (preptr == null) {
            heads[index] = ptr.next;
            ptr=null;
        } else {
            preptr.next = ptr.next;
            ptr=null;
        }
    }
    


    public static void main(String[] args) {

        HashTable hashTable = new HashTable();
        hashTable.insertKeyValue(25,"Tushar" );
        hashTable.insertKeyValue(15,"Ansh" );
        hashTable.insertKeyValue(5,"Daksh" );
        hashTable.insertKeyValue(2,"Tamur" );
        hashTable.printData();
        System.out.println("No of nodes in HashTable are : "+hashTable.key_val_pairsno);
        System.out.println("\nSize of HashTable is : "+hashTable.size);
        System.out.println("Is HashTable is Empty: "+(hashTable.size==0));
        hashTable.getValueFromKey(15);
        hashTable.deleteValueFromKey(25);
        hashTable.deleteValueFromKey(5);
        hashTable.printData();
        
    }
}


// getValue from key  delete value from key
