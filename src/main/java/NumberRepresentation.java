public class NumberRepresentation {
    int[][] myMatrice = new int[3][3];

    private boolean isZero(int[][] number){
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if(number[i][j] == 1) return false;
            }
        }
        return true;
    }
    private boolean isOne(int[][] number){
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if(number[i][j] == 1) count ++;
            }
        }
        return (count == 2 && number[1][2] == 1 && number[2][2] == 1);
    }

    private int matchTheRightNumber(int[][] numberMatrice){
        if(isZero(numberMatrice)) return 0;
        if(isOne(numberMatrice)) return 1;
        else return -1; // UserStory 4
    }

    private int[][] createMatrice(char[][] entry){

        int[][] result = new int[4][27];

        for (int i = 0; i < entry.length; i++) {
            for (int j = 0; j < entry[i].length; j++) {
                result[i][j] = (entry[i][j] == '_' || entry[i][j] == '|') ? 1 : 0;
            }
        }

        return result;
    }

    public String getCode(int[][] numberMatrice ){
        String code = "";
        /*
        extraire la sous-matrice 3x3,
        for (int i = 0; i < numberMatrice.length; i++) {
            for (int j = 0; j < numberMatrice[i].length; j++) {
                code += match(sousMatrice) != -1 ? match(sousMatrice) : "?" //anticipe le userStory4
            }
        }

         */
        return code;
    }

    public static void main(String[] args) {
        System.out.println(("hello world"));
    }
}
