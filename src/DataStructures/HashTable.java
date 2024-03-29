package DataStructures;
import java.util.*;


public class HashTable
{

  public  HashTable(int tableSz)
  {
   m_tableSize = tableSz;
   m_hashTable = new Object[m_tableSize];
   m_currentSize=0;
  }
  
  public boolean Insert(Object obj,String Id)
  {
     if(m_currentSize ==m_tableSize)
     return true;

   int hashcode  = (int)GenerateHashCode(Id);
   System.out.println("LOG: hashcode for:"+obj.toString()+" is: "+hashcode);
  
   if(m_hashTable[hashcode] == null)
   m_hashTable[hashcode] = new ArrayList();

   ((ArrayList) m_hashTable[hashcode]).add(obj);
   m_currentSize++;
   return false;
  }

  public List find(String ocurrence)
  {
   int hashcode  = GenerateHashCode(ocurrence);
  
      System.out.println("hash code for the search: "+hashcode);
      Object resultingList = m_hashTable[hashcode];
      if(resultingList==null)
      {
         System.out.println("ERORR:no hay resultados para la busqueda");
         return new ArrayList();
      }
      else
      return (ArrayList)resultingList;
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
  private int m_currentSize;
}