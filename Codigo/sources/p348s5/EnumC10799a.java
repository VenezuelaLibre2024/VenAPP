package p348s5;

import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s5.a */
/* loaded from: classes.dex */
public final class EnumC10799a {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC10799a[] $VALUES;
    public static final EnumC10799a Image = new EnumC10799a("Image", 0);
    public static final EnumC10799a Video = new EnumC10799a("Video", 1);
    public static final EnumC10799a Audio = new EnumC10799a("Audio", 2);

    static {
        EnumC10799a[] m32909b = m32909b();
        $VALUES = m32909b;
        $ENTRIES = C8005b.m24582a(m32909b);
    }

    private EnumC10799a(String str, int i10) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC10799a[] m32909b() {
        return new EnumC10799a[]{Image, Video, Audio};
    }

    public static EnumC10799a valueOf(String str) {
        return (EnumC10799a) Enum.valueOf(EnumC10799a.class, str);
    }

    public static EnumC10799a[] values() {
        return (EnumC10799a[]) $VALUES.clone();
    }
}
