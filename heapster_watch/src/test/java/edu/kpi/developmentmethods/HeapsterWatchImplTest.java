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

    @Test
    public void test_watch_display_12h_midnight() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl(0, 0);
        assertThat(watch.display12h()).isEqualTo("12:00 AM");
    }

    @Test
    public void test_watch_display_12h_noon() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl(12, 0);
        assertThat(watch.display12h()).isEqualTo("12:00 PM");
    }

    @Test
    public void test_watch_display_12h_before_noon() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl(11, 21);
        assertThat(watch.display12h()).isEqualTo("11:21 AM");
    }

    @Test
    public void test_watch_display_12h_after_noon() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl(23, 21);
        assertThat(watch.display12h()).isEqualTo("11:21 PM");
    }

    @Test
    public void test_exception_is_thrown_when_trying_to_create_watch_with_invalid_hours_value() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new HeapsterWatchImpl(-1, 0);
        });
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new HeapsterWatchImpl(24, 0);
        });
    }

    @Test
    public void test_exception_is_thrown_when_trying_to_create_watch_with_invalid_minutes_value() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new HeapsterWatchImpl(13, -1);
        });
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new HeapsterWatchImpl(13, 60);
        });
    }

    @Test
    public void test_increase_hour() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl(12, 0);
        watch.increaseHours();
        assertThat(watch.display24h()).isEqualTo("13:00");
    }

    @Test
    public void test_increase_hour_wraps() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl(23, 0);
        watch.increaseHours();
        assertThat(watch.display24h()).isEqualTo("00:00");
    }

    @Test
    public void test_decrease_hour() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl(12, 0);
        watch.decreaseHours();
        assertThat(watch.display24h()).isEqualTo("11:00");
    }

    @Test
    public void test_decrease_hour_wraps() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl(0, 0);
        watch.decreaseHours();
        assertThat(watch.display24h()).isEqualTo("23:00");
    }

    @Test
    public void test_increase_minutes() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl(12, 12);
        watch.increaseMinutes();
        assertThat(watch.display24h()).isEqualTo("12:13");
    }

    @Test
    public void test_increase_minutes_wraps_hour() {
        HeapsterWatchImpl watch = new HeapsterWatchImpl(12, 59);
        watch.increaseMinutes();
        assertThat(watch.display24h()).isEqualTo("13:00");
    }
}
