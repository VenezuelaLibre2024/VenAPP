package sh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d Current = new d("Current", 0);
    public static final d Max = new d("Max", 1);

    static {
        d[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
    }

    private d(String str, int i10) {
    }

    private static final /* synthetic */ d[] b() {
        return new d[]{Current, Max};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
