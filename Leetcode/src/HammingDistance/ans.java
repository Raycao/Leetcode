package HammingDistance;

//source: https://leetcode.com/problems/hamming-distance/#/description

public class ans {
	public int hammingDistance(int x, int y) {
        String a =  Integer.toBinaryString(x^y); ///�Q��XOR����z�A�ӧ�X���@�˪��줸�A�ھ�xor��z�A���@�˦줸�|����1�A���ন�r��
		char[] ca = a.toCharArray(); //��r���নchar[]����
		int sum = 0; //�x�s���@�˦줸�ƶq�A�b�o��N�O�`��1���ƶq
		
		for(int i = 0;i < ca.length ;i++){ //���X�}�C�A�ݬݦ��h��1
			if(ca[i] == '1'){ //�]���Ochar���A�A�ҥH�p�G�g==1�A�|����i��1���P�_��
				sum++; //��1�N++
			}
		}
		
		return sum;
    }
}
