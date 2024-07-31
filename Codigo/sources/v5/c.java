package v5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final int value;
    public static final c NotDetermined = new c("NotDetermined", 0, 0);
    public static final c Denied = new c("Denied", 1, 2);
    public static final c Authorized = new c("Authorized", 2, 3);
    public static final c Limited = new c("Limited", 3, 4);

    static {
        c[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
    }

    private c(String str, int i10, int i11) {
        this.value = i11;
    }

    private static final /* synthetic */ c[] b() {
        return new c[]{NotDetermined, Denied, Authorized, Limited};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
