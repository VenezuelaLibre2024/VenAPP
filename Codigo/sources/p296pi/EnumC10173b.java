package p296pi;

import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pi.b */
/* loaded from: classes3.dex */
public final class EnumC10173b {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC10173b[] $VALUES;
    private final int intValue;
    public static final EnumC10173b NO_DUPLICATES = new EnumC10173b("NO_DUPLICATES", 0, 0);
    public static final EnumC10173b NORMAL = new EnumC10173b("NORMAL", 1, 1);
    public static final EnumC10173b UNRESTRICTED = new EnumC10173b("UNRESTRICTED", 2, 2);

    static {
        EnumC10173b[] m30449b = m30449b();
        $VALUES = m30449b;
        $ENTRIES = C8005b.m24582a(m30449b);
    }

    private EnumC10173b(String str, int i10, int i11) {
        this.intValue = i11;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC10173b[] m30449b() {
        return new EnumC10173b[]{NO_DUPLICATES, NORMAL, UNRESTRICTED};
    }

    public static EnumC10173b valueOf(String str) {
        return (EnumC10173b) Enum.valueOf(EnumC10173b.class, str);
    }

    public static EnumC10173b[] values() {
        return (EnumC10173b[]) $VALUES.clone();
    }

    /* renamed from: h */
    public final int m30450h() {
        return this.intValue;
    }
}
