package Task_1;

public class Main {

    public static void main(String[] args) {

        String numberDoc = "5557-UbN-9922-ToX-1q3c";
        StringBuilder strbNum = new StringBuilder("9379-UbU-9735-NtU-5G7r");

        System.out.println(NumbDoc.outNumb(numberDoc));
        System.out.println(NumbDoc.resizeLetter(numberDoc));
        System.out.println(NumbDoc.resizeFormat(numberDoc));
        System.out.println("Буквы:" + NumbDoc.resizeFormatStrB(strbNum));
        System.out.println(NumbDoc.isHaveABC(numberDoc));
        System.out.println(NumbDoc.isBegin(numberDoc));
        System.out.println(NumbDoc.isEnd(numberDoc));
    }
}
