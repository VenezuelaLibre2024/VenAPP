package s5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ ik.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a Image = new a("Image", 0);
    public static final a Video = new a("Video", 1);
    public static final a Audio = new a("Audio", 2);

    static {
        a[] b10 = b();
        $VALUES = b10;
        $ENTRIES = ik.b.a(b10);
    }

    private a(String str, int i10) {
    }

    private static final /* synthetic */ a[] b() {
        return new a[]{Image, Video, Audio};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}