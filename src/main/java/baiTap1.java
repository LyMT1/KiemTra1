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

    public String chuanHoaChuoi(String input) {
        int pos = 0;
        boolean capitalize = false;
        StringBuilder sb = new StringBuilder(input);
        while (pos < sb.length()) {
            if (!Character.isWhitespace(sb.charAt(pos)) && capitalize) {
                sb.setCharAt(pos, Character.toUpperCase(sb.charAt(pos)));
                capitalize = false;
            } else {
                sb.setCharAt(pos, Character.toLowerCase(sb.charAt(pos)));
            }
            if (pos == 0)
                sb.setCharAt(pos, Character.toUpperCase(sb.charAt(pos)));
            if (sb.charAt(pos) == '.') {
                capitalize = true;
            }
            pos++;
        }
        System.out.println("\n3. Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa, các chữ con lại viết thường: ");

        System.out.println(sb.toString());
        return sb.toString();
    }

}
