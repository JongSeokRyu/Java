package JavaStudy.BlockChainPract.core;

import JavaStudy.BlockChainPract.util.Util;

public class BlockCainStarter {

	public static void main(String[] args) {
		
		int nonce = 0;
		while(true) {
			if(Util.getHash(nonce + "").substring(0,6).equals("000000")) {
				System.out.println("몇번째? " + nonce);
				System.out.println("해시값 : " + Util.getHash(nonce + ""));
				break;
			}
			nonce++;
		}

	}

}
