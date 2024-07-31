package p405vk;

import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: vk.j */
/* loaded from: classes3.dex */
public final class EnumC11973j {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC11973j[] $VALUES;
    public static final EnumC11973j PUBLIC = new EnumC11973j("PUBLIC", 0);
    public static final EnumC11973j PROTECTED = new EnumC11973j("PROTECTED", 1);
    public static final EnumC11973j INTERNAL = new EnumC11973j("INTERNAL", 2);
    public static final EnumC11973j PRIVATE = new EnumC11973j("PRIVATE", 3);

    static {
        EnumC11973j[] m38394b = m38394b();
        $VALUES = m38394b;
        $ENTRIES = C8005b.m24582a(m38394b);
    }

    private EnumC11973j(String str, int i10) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC11973j[] m38394b() {
        return new EnumC11973j[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    public static EnumC11973j valueOf(String str) {
        return (EnumC11973j) Enum.valueOf(EnumC11973j.class, str);
    }

    public static EnumC11973j[] values() {
        return (EnumC11973j[]) $VALUES.clone();
    }
}
