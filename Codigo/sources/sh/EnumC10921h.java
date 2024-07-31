package sh;

import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sh.h */
/* loaded from: classes3.dex */
public final class EnumC10921h {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC10921h[] $VALUES;
    private final long value;
    public static final EnumC10921h High = new EnumC10921h("High", 0, 50);
    public static final EnumC10921h Medium = new EnumC10921h("Medium", 1, 100);
    public static final EnumC10921h Low = new EnumC10921h("Low", 2, 200);

    static {
        EnumC10921h[] m33367b = m33367b();
        $VALUES = m33367b;
        $ENTRIES = C8005b.m24582a(m33367b);
    }

    private EnumC10921h(String str, int i10, long j10) {
        this.value = j10;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC10921h[] m33367b() {
        return new EnumC10921h[]{High, Medium, Low};
    }

    public static EnumC10921h valueOf(String str) {
        return (EnumC10921h) Enum.valueOf(EnumC10921h.class, str);
    }

    public static EnumC10921h[] values() {
        return (EnumC10921h[]) $VALUES.clone();
    }

    /* renamed from: h */
    public final long m33368h() {
        return this.value;
    }
}
