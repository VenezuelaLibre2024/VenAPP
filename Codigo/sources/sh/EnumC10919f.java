package sh;

import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sh.f */
/* loaded from: classes3.dex */
public final class EnumC10919f {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC10919f[] $VALUES;
    public static final EnumC10919f Loop = new EnumC10919f("Loop", 0, 0);
    public static final EnumC10919f Pause = new EnumC10919f("Pause", 1, 1);
    public static final EnumC10919f Stop = new EnumC10919f("Stop", 2, 2);
    private final int value;

    static {
        EnumC10919f[] m33366b = m33366b();
        $VALUES = m33366b;
        $ENTRIES = C8005b.m24582a(m33366b);
    }

    private EnumC10919f(String str, int i10, int i11) {
        this.value = i11;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC10919f[] m33366b() {
        return new EnumC10919f[]{Loop, Pause, Stop};
    }

    public static EnumC10919f valueOf(String str) {
        return (EnumC10919f) Enum.valueOf(EnumC10919f.class, str);
    }

    public static EnumC10919f[] values() {
        return (EnumC10919f[]) $VALUES.clone();
    }
}
