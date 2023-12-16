package Week_08;

public class Question_08_03 {
    public static void main (String[]args){
        char [][] answers = new char[7][9];
        answers = fullfillTheArray();
        char [] key = {'A','C','D','E','C','B','B','D','A'};
        int counter=0;
        matchTheAnswers(answers,key);

    }
    public static char [][] fullfillTheArray(){
        char [][] array=new char[7][9];
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j]=(char) (((int)(Math.random()*5))+65);
            }
        }
        return array;
    }
    public static void matchTheAnswers(char answers[][],char key []){
        int counter=0;
        for (int i=0;i<answers.length;i++){

            for (int j=0;j<answers[i].length;j++){
                if (answers[i][j]==key[j])
                    counter++;
            }
            System.out.println("");
        }
    }

}
