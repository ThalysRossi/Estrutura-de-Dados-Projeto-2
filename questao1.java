public class questao1 {

	public static void main(String[] args) {
        byte check = 0;
      String [][] dic = { 
              { "camelo", "camel" }, 
              { "gato", "cat" } , 
              { "alcol", "alcohol" }, 
              { "cachorro", "dog" }, 
              { "agua", "water" }, 
              { "bola", "ball" }, 
              { "peixe", "fish" }, 
              { "baleia", "whale" }, 
              { "papagaio", "parrot" }, 
              { "formiga", "ant" } 
              };

      Scanner scan = new Scanner(System.in);
      System.out.println("Digite o tipo de ordem que deseja utilizar: (1. PT-ENG, 2. ENG-PT)");
      check = scan.nextByte();
      while(check <= 0 || check > 2) {
          System.out.println("Seleção inválida! Tente novamente: ");
          check = scan.nextByte();
      }
      if(check == 1) {
      System.out.println("BUBBLE - Ordenação em PT-BR");
	      for(int lastUnsortedIndex = dic.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
	          for(int i = 0; i < lastUnsortedIndex; i++) {
	              int comparison = dic[i][0].compareToIgnoreCase(dic[i+1][0]);
	              if(comparison > 0) {
	                  swap(dic, i, i+1);
	              }
	          }
	      }
	      for(int i = 0; i < dic.length; i++) {
	          for(int j = 0; j < dic[i].length; j++) {
	              System.out.print(" - ");
	              System.out.print("[" + dic[i][j] +"]");
	          }
	          System.out.println();
	      }
      }
      else {
          System.out.println();
          System.out.println("BUBBLE - Ordenação em ENG");
          for(int lastUnsortedIndex = dic.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
              for(int i = 0; i < lastUnsortedIndex; i++) {
                  int comparison = dic[i][1].compareToIgnoreCase(dic[i+1][1]);
                  if(comparison > 0) {
                      swap(dic, i, i+1);
                  }
              }
          }
          for(int i = 0; i < dic.length; i++) {
              for(int j = 0; j < dic[i].length; j++) {
                  System.out.print(" - ");
                  System.out.print("[" + dic[i][j] +"]");
              }
              System.out.println();
          }
      }
	}
      
      public static void swap(String[][] arr, int i, int j) {
          if(i == j) {
              return;
          }
          String tempPtBR = arr[i][0];
          String tempEng = arr[i][1];
          arr[i][0] = arr[j][0];
          arr[i][1] = arr[j][1];
          arr[j][0] = tempPtBR;
          arr[j][1] = tempEng;
      }

  }
