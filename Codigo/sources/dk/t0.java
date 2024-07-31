package dk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class t0 {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 Ready = new t0("Ready", 0);
    public static final t0 NotReady = new t0("NotReady", 1);
    public static final t0 Done = new t0("Done", 2);
    public static final t0 Failed = new t0("Failed", 3);

    static {
        t0[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
    }

    private t0(String str, int i10) {
    }

    private static final /* synthetic */ t0[] b() {
        return new t0[]{Ready, NotReady, Done, Failed};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }
}
