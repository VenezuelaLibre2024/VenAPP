package hk;

import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: hk.a */
/* loaded from: classes3.dex */
public final class EnumC7749a {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC7749a[] $VALUES;
    public static final EnumC7749a COROUTINE_SUSPENDED = new EnumC7749a("COROUTINE_SUSPENDED", 0);
    public static final EnumC7749a UNDECIDED = new EnumC7749a("UNDECIDED", 1);
    public static final EnumC7749a RESUMED = new EnumC7749a("RESUMED", 2);

    static {
        EnumC7749a[] m23649b = m23649b();
        $VALUES = m23649b;
        $ENTRIES = C8005b.m24582a(m23649b);
    }

    private EnumC7749a(String str, int i10) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC7749a[] m23649b() {
        return new EnumC7749a[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    public static EnumC7749a valueOf(String str) {
        return (EnumC7749a) Enum.valueOf(EnumC7749a.class, str);
    }

    public static EnumC7749a[] values() {
        return (EnumC7749a[]) $VALUES.clone();
    }
}
