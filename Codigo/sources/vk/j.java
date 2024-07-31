package vk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j PUBLIC = new j("PUBLIC", 0);
    public static final j PROTECTED = new j("PROTECTED", 1);
    public static final j INTERNAL = new j("INTERNAL", 2);
    public static final j PRIVATE = new j("PRIVATE", 3);

    static {
        j[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
    }

    private j(String str, int i10) {
    }

    private static final /* synthetic */ j[] b() {
        return new j[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
