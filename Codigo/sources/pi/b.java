package pi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int intValue;
    public static final b NO_DUPLICATES = new b("NO_DUPLICATES", 0, 0);
    public static final b NORMAL = new b("NORMAL", 1, 1);
    public static final b UNRESTRICTED = new b("UNRESTRICTED", 2, 2);

    static {
        b[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
    }

    private b(String str, int i10, int i11) {
        this.intValue = i11;
    }

    private static final /* synthetic */ b[] b() {
        return new b[]{NO_DUPLICATES, NORMAL, UNRESTRICTED};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int h() {
        return this.intValue;
    }
}
