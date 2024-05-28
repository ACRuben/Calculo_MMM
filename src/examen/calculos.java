package examen;
import java.util.*;
public class calculos 
{
    double mediana,sumedios,cont1;
    double vec[];
    int i,j,cont,num;
    double aux,auxi,med;
    
    public int vector()
    {
        vec = new double [20];
       
        for(i=0;i<20;i++)
        {
            vec[i]=Math.random()*3;
        }
        for(i=0;i<20;i++)
        {
            System.out.println("\t"+vec[i]);
            
        } 
        System.out.println("-------------------------------------------");
        return i;
    }
   
    public int moda()
    {
       for(i=0;i<vec[20-1];i++)
       {
           cont=0;
           for(j=0;j<vec[20-1];j++)
           {
               if(vec[j]==vec[i])
                   cont++;
           }
           if(cont>aux)
           {
               aux=cont;
               auxi=vec[i];
               
           }
       }
       if(cont>0)
       {
           System.out.print("\tLa moda es=>"+auxi);
           System.out.println("\n-----------------------------------");
       }
         return 0;   
       }
      public int mediana()
              
      {
          
          if(20%2==0)
          {
               sumedios =vec[20/2]+vec[20/2-1];
               mediana = (double)sumedios/2;
               
          }
          else{
              mediana=vec[20/2];
          }
          System.out.println("\tLa mediana=>"+mediana);
          System.out.println("\n-----------------------------------");
         return 0;  
      }
      public int media()
      {
           cont1=0;
           for(num=0;num<=vec[i-1];num++)
           {
               cont1++;
               
           }
           med=cont1/20;
           System.out.println("\tLa media es=>"+med);
           System.out.println("\n-----------------------------------");
        return 0;
      }
    } 
   

    
