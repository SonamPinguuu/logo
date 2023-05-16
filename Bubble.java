public class Bubble{


	public static void main (String[] args){
		
		int[] array = {4,10,2,3,6,1};
		
			for(int i=0;i<array.length;i++)
			{
				int flag =0;
				for(int j=0;j<array.length-1-i;j++)
				{
					int temp;
					if(array[j]>array[j+1])
					{
						
						temp = array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
						flag = flag+1;
					}
		 		}
				if(flag == 0)
				{
				break;
				}
			
			}
			
		for(int i = 0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
	}
}