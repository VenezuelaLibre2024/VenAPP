package dk;

import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: dk.t0 */
/* loaded from: classes3.dex */
final class EnumC7036t0 {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC7036t0[] $VALUES;
    public static final EnumC7036t0 Ready = new EnumC7036t0("Ready", 0);
    public static final EnumC7036t0 NotReady = new EnumC7036t0("NotReady", 1);
    public static final EnumC7036t0 Done = new EnumC7036t0("Done", 2);
    public static final EnumC7036t0 Failed = new EnumC7036t0("Failed", 3);

    static {
        EnumC7036t0[] m20594b = m20594b();
        $VALUES = m20594b;
        $ENTRIES = C8005b.m24582a(m20594b);
    }

    private EnumC7036t0(String str, int i10) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC7036t0[] m20594b() {
        return new EnumC7036t0[]{Ready, NotReady, Done, Failed};
    }

    public static EnumC7036t0 valueOf(String str) {
        return (EnumC7036t0) Enum.valueOf(EnumC7036t0.class, str);
    }

    public static EnumC7036t0[] values() {
        return (EnumC7036t0[]) $VALUES.clone();
    }
}
