package p472yk;

import java.util.concurrent.TimeUnit;
import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: yk.d */
/* loaded from: classes3.dex */
public final class EnumC12731d {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC12731d[] $VALUES;
    private final TimeUnit timeUnit;
    public static final EnumC12731d NANOSECONDS = new EnumC12731d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final EnumC12731d MICROSECONDS = new EnumC12731d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final EnumC12731d MILLISECONDS = new EnumC12731d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final EnumC12731d SECONDS = new EnumC12731d("SECONDS", 3, TimeUnit.SECONDS);
    public static final EnumC12731d MINUTES = new EnumC12731d("MINUTES", 4, TimeUnit.MINUTES);
    public static final EnumC12731d HOURS = new EnumC12731d("HOURS", 5, TimeUnit.HOURS);
    public static final EnumC12731d DAYS = new EnumC12731d("DAYS", 6, TimeUnit.DAYS);

    static {
        EnumC12731d[] m42043b = m42043b();
        $VALUES = m42043b;
        $ENTRIES = C8005b.m24582a(m42043b);
    }

    private EnumC12731d(String str, int i10, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC12731d[] m42043b() {
        return new EnumC12731d[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    public static EnumC12731d valueOf(String str) {
        return (EnumC12731d) Enum.valueOf(EnumC12731d.class, str);
    }

    public static EnumC12731d[] values() {
        return (EnumC12731d[]) $VALUES.clone();
    }

    /* renamed from: h */
    public final TimeUnit m42044h() {
        return this.timeUnit;
    }
}
