package sh;

import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sh.d */
/* loaded from: classes3.dex */
public final class EnumC10917d {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC10917d[] $VALUES;
    public static final EnumC10917d Current = new EnumC10917d("Current", 0);
    public static final EnumC10917d Max = new EnumC10917d("Max", 1);

    static {
        EnumC10917d[] m33365b = m33365b();
        $VALUES = m33365b;
        $ENTRIES = C8005b.m24582a(m33365b);
    }

    private EnumC10917d(String str, int i10) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC10917d[] m33365b() {
        return new EnumC10917d[]{Current, Max};
    }

    public static EnumC10917d valueOf(String str) {
        return (EnumC10917d) Enum.valueOf(EnumC10917d.class, str);
    }

    public static EnumC10917d[] values() {
        return (EnumC10917d[]) $VALUES.clone();
    }
}
