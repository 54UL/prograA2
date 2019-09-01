package DataStructures;
import java.util.*;


public class HashTable
{

  public  HashTable(int tableSz)
  {
   m_tableSize = tableSz;
   m_hashTable = new Object[m_tableSize];
  }
  
  public void Insert(Object obj,String Id)
  {
   int hashcode  = (int)GenerateHashCode(Id);

   System.out.println("LOG: hashcode for:"+obj.toString()+" is: "+hashcode);
  
   if(m_hashTable[hashcode] == null)
   m_hashTable[hashcode] = new ArrayList();

   ((ArrayList) m_hashTable[hashcode]).add(obj);
  }

  public List find(String ocurrence)
  {
   int hashcode  = GenerateHashCode(ocurrence);
   return (ArrayList)m_hashTable[hashcode];
  }

  private  int  GenerateHashCode(String stringHash)
  {
      int hashcode=0;
      char[] CharString  = stringHash.toCharArray();
      
      for(int is=0; is< CharString.length; is++)
      {
         hashcode +=(int)CharString[is];
      }  
   return (hashcode % m_tableSize);
  }
 
  private Object[] m_hashTable;
  private int m_tableSize;
}