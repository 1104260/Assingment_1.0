package Student;

public class StudentName 
{
    String[] Names=new String[10];
    int NameL;
    //Sets Students Names
    private boolean setName(String Name)
    {
        if(NameL<Names.length)
        {
            Names[NameL]=Name;
                    NameL++;
                    return true;
        }
        else
        {
            return false;
        }
    }
    void Insert(String Name)
    {
        if(setName(Name)==true)
        {
            System.out.println("The Name "+Name+" Added in Index["+FInd(Name)+"]");
        }
        else
        {
            System.out.println("Oops! It seems your array is full\nThe Name "+Name+" is not takken");
        }
    }
    //treverse the List of names
    void getNames()
    {
        for(int i=0;i<Names.length;i++)
        {
            System.out.println(Names[i]+" ["+i+"]");
        }
    }
    //Searches a Data and gives the Index
    private int FInd(String Name)
    {
        int Val= -1;
        for(int i=0;i<Names.length;i++)
        {
            if(Names[i]==Name)
            {
                Val= i;
                break;
            }
        }
        return Val;
    }
    void Search(String Name)
    {
        if(FInd(Name)>=0)
        {
            System.out.println("Yes the name:"+Name+" is found in Index["+FInd(Name)+"]");
        }
        else
        {
            System.out.println("Oops The Name "+Name+" wasn't Found");
        }
    }
    //Delete a Data from Data Structure
    private boolean Del(int Index)
    {
        if(Index<Names.length&&Index>=0)
        {
            for(int i=Index+1;i<Names.length;i++)
            {
                Names[i - 1]=Names[i];
                if(i== Names.length -1)
                {
                    Names[i]="";
                    break;
                }
            }
            if(Index+1==Names.length)
            {
                Names[Index]="";
            }
            return true;
        }
        else
        {
            return false;
        }
    }
    void Delete(int Index)
    {
        if(Del(Index)==true)
        {
            System.out.println("The Data of Index["+Index+"] is permenintly deleted");
            NameL--;
        }
        else
        {
            System.out.println("The Index["+Index+"] wasn't Found");
        }
    }
}
