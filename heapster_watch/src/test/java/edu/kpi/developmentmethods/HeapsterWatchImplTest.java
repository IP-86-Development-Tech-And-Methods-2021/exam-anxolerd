package edu.kpi.developmentmethods;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class HeapsterWatchImplTest {
    @Test
    public void test_watch_is_created_at_00_00() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl();
        assertThat(watch.display24h()).isEqualTo("00:00");
        assertThat(watch.display12h()).isEqualTo("12:00 AM");
    }

    // TODO: write your own tests here
}
