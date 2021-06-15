import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
}