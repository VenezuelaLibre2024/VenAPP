package p395v5;

import p166ik.C8005b;
import p166ik.InterfaceC8004a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v5.c */
/* loaded from: classes.dex */
public final class EnumC11629c {
    private static final /* synthetic */ InterfaceC8004a $ENTRIES;
    private static final /* synthetic */ EnumC11629c[] $VALUES;
    private final int value;
    public static final EnumC11629c NotDetermined = new EnumC11629c("NotDetermined", 0, 0);
    public static final EnumC11629c Denied = new EnumC11629c("Denied", 1, 2);
    public static final EnumC11629c Authorized = new EnumC11629c("Authorized", 2, 3);
    public static final EnumC11629c Limited = new EnumC11629c("Limited", 3, 4);

    static {
        EnumC11629c[] m36449b = m36449b();
        $VALUES = m36449b;
        $ENTRIES = C8005b.m24582a(m36449b);
    }

    private EnumC11629c(String str, int i10, int i11) {
        this.value = i11;
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC11629c[] m36449b() {
        return new EnumC11629c[]{NotDetermined, Denied, Authorized, Limited};
    }

    public static EnumC11629c valueOf(String str) {
        return (EnumC11629c) Enum.valueOf(EnumC11629c.class, str);
    }

    public static EnumC11629c[] values() {
        return (EnumC11629c[]) $VALUES.clone();
    }

    /* renamed from: h */
    public final int m36450h() {
        return this.value;
    }
}
