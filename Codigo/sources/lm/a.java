package lm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a UNDEFINED = new a("UNDEFINED", 0);
    public static final a ENQUEUED = new a("ENQUEUED", 1);
    public static final a RUNNING = new a("RUNNING", 2);
    public static final a COMPLETE = new a("COMPLETE", 3);
    public static final a FAILED = new a("FAILED", 4);
    public static final a CANCELED = new a("CANCELED", 5);
    public static final a PAUSED = new a("PAUSED", 6);

    static {
        a[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] b() {
        return new a[]{UNDEFINED, ENQUEUED, RUNNING, COMPLETE, FAILED, CANCELED, PAUSED};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
