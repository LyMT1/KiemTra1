import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TestBt1 {
    baiTap1 bt1 = new baiTap1();

    @Test
    void testBt1() {
        String intput = "You Only Live Once. But if You do it right. once is Enough";
        assertThat(bt1.countUpperCase(intput)).isNotNull().isEqualTo("7");
    }

    @Test
    void testBt2() {
        String intput = "You Only Live Once. But if You do it right. once is Enough";
        assertThat(bt1.chuannHoa(intput)).isNotNull().isEqualTo("You Only Live Once. But If You Do It Right. Once Is Enough");
    }

    @Test
    void testBt3() {
        String intput = "You Only Live Once. But if You do it right. once is Enough";
        assertThat(bt1.chuanHoaChuoi(intput)).isNotNull().isEqualTo("You only live once. But if you do it right. Once is enough");
    }
}