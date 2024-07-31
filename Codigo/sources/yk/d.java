package yk;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private final TimeUnit timeUnit;
    public static final d NANOSECONDS = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final d MICROSECONDS = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final d MILLISECONDS = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final d SECONDS = new d("SECONDS", 3, TimeUnit.SECONDS);
    public static final d MINUTES = new d("MINUTES", 4, TimeUnit.MINUTES);
    public static final d HOURS = new d("HOURS", 5, TimeUnit.HOURS);
    public static final d DAYS = new d("DAYS", 6, TimeUnit.DAYS);

    static {
        d[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
    }

    private d(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    private static final /* synthetic */ d[] b() {
        return new d[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final TimeUnit h() {
        return this.timeUnit;
    }
}
