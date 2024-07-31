package sh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class f {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f Loop = new f("Loop", 0, 0);
    public static final f Pause = new f("Pause", 1, 1);
    public static final f Stop = new f("Stop", 2, 2);
    private final int value;

    static {
        f[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
    }

    private f(String str, int i10, int i11) {
        this.value = i11;
    }

    private static final /* synthetic */ f[] b() {
        return new f[]{Loop, Pause, Stop};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
