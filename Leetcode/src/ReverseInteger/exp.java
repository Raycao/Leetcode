package ReverseInteger;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int x = 56728 , y = -8963; //�|��ӨҤl�A�@���@�t�Ӹոլ�
		System.out.println(fun.reverse(x));
		System.out.println(fun.reverse(y));
	}
	
	public int reverse(int x) {
        int RevNum; //�����᪺���
        String IntToString = String.valueOf(x); //�N����ন�r��A�����O�ݷ|�নchar[]
        char[] ca = IntToString.toCharArray(); //�Nstring�নchar[]
        StringBuilder builder = new StringBuilder(); //���@��StringBuilder����X�Ӧs��r���A�ϥ�append�|���"+"���覡�Ӫ����Ĳv
        
        //�N�r���q����append��StringBuilder
        if(x>0){ //�p�G�쥻�N����ơA�N���ݭn�B�z�t��
            for(int i = ca.length-1 ; i>=0 ; i--){
				builder.append(ca[i]);					
			}
        }else{ //�t�����B�z
            for(int i = ca.length-1 ; i>0 ; i--){
				builder.append(ca[i]);					
			}
				builder.insert( 0 , "-" ); //�Ҧ����r��append����A�A�N�t��insert��̫e���A0��ܯx�}��l��m
        }
        
        //�ϥΨҥ~�����覡
        try{ 
			RevNum = Integer.parseInt(builder.toString()); //�N��誺StringBuilder�নint����A�p�G�W�Lint�d��|���Ϳ��~�ҥ~����
		}catch(NumberFormatException ex){ //��������~�ҥ~����ɪ��B�z
			RevNum = 0; //�N�^�ǭȪ������w��0
		}
        
        return RevNum; //�^�ǵ���
    }
}
