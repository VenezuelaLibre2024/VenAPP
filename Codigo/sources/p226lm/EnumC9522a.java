package p226lm;

import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lm.a */
/* loaded from: classes3.dex */
public final class EnumC9522a {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC9522a[] $VALUES;
    public static final EnumC9522a UNDEFINED = new EnumC9522a("UNDEFINED", 0);
    public static final EnumC9522a ENQUEUED = new EnumC9522a("ENQUEUED", 1);
    public static final EnumC9522a RUNNING = new EnumC9522a("RUNNING", 2);
    public static final EnumC9522a COMPLETE = new EnumC9522a("COMPLETE", 3);
    public static final EnumC9522a FAILED = new EnumC9522a("FAILED", 4);
    public static final EnumC9522a CANCELED = new EnumC9522a("CANCELED", 5);
    public static final EnumC9522a PAUSED = new EnumC9522a("PAUSED", 6);

    static {
        EnumC9522a[] m28328b = m28328b();
        $VALUES = m28328b;
        $ENTRIES = C8005b.m24582a(m28328b);
    }

    private EnumC9522a(String str, int i10) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC9522a[] m28328b() {
        return new EnumC9522a[]{UNDEFINED, ENQUEUED, RUNNING, COMPLETE, FAILED, CANCELED, PAUSED};
    }

    public static EnumC9522a valueOf(String str) {
        return (EnumC9522a) Enum.valueOf(EnumC9522a.class, str);
    }

    public static EnumC9522a[] values() {
        return (EnumC9522a[]) $VALUES.clone();
    }
}
