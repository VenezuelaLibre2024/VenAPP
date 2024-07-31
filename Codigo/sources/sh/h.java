package sh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    private final long value;
    public static final h High = new h("High", 0, 50);
    public static final h Medium = new h("Medium", 1, 100);
    public static final h Low = new h("Low", 2, 200);

    static {
        h[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
    }

    private h(String str, int i10, long j10) {
        this.value = j10;
    }

    private static final /* synthetic */ h[] b() {
        return new h[]{High, Medium, Low};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final long h() {
        return this.value;
    }
}
