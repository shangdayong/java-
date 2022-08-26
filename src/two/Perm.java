package two;
public class Perm {
    public static void main(String[] args) {
        int list[] = { 1, 2, 3 };
        Perm(list, 0, 2);
    }
    static void Perm(int list[],int k,int m) //产生list[k:m]的所有排列
    {
        int temp;
        if(k==m) {
            for(int i=0; i<=m; i++)
                System.out.print(list[i]);
            System.out.println();
        }
        else
        {
            for(int i=k; i<=m; i++)
            {
                temp=list[k];
                list[k]=list[i];
                list[i]=temp;
                Perm(list,k+1,m);
                temp=list[k];
                list[k]=list[i];
                list[i]=temp;
            }
        }
    }
}