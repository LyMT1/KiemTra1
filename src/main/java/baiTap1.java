public class baiTap1 {

    String countUpperCase(String s) {
        System.out.println("---- Bài Tập 1 ----");

        System.out.printf("1. Số từ viết in hoa trong chuỗi : " + String.valueOf(s.codePoints().filter(c-> c>='A' && c<='Z').count()));
        return String.valueOf(s.codePoints().filter(c-> c>='A' && c<='Z').count());

    }

    private long countLowerCase(String s) {
        return s.codePoints().filter(c-> c>='a' && c<='z').count();
    }

    public String chuannHoa(String s ) {
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] temp= s.split(" ");
        // sau khi tách xong, gán xâu st thành sâu rỗng
        s = "";
        for(int i=0;i<temp.length;i++) {
            s+= String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1) // nếu tempt[i] không phải từ cuối cùng
                s+=" ";   // cộng thêm một khoảng trắng
        }
        System.out.println("\n2. Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi: " + s);
        return s;
    }


    void stringToSTring(String s) {
        String message = s;
        char[] charArray = message.toCharArray();
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 97 && charArray[i] <= 122){
                charArray[i] -= 32;
            }
        }
        // chuyển đổi mảng char thành string
        message = String.valueOf(charArray);
        System.out.println("3. Chuỗi sau khi đổi: \n" + message);

    }

    public String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }

    public void chuanHoaChuoi(String str) {
        String firstLetter = str.substring(0, 1);
        // chuỗi remainingLetters chứa phần còn lại của name
        String remainingLetters = str.substring(1, str.length());

        //sử dụng phương thức toUpperCase() để chuyển đổi firstLetter thành chữ in hoa
        firstLetter = firstLetter.toUpperCase();

        //sau khi chuyển đổi thì gộp chúng lại
        str = firstLetter + remainingLetters;
        System.out.println("3. Chuỗi sau khi đổi: " + str);
    }

}
