package p067dh;

import kg.C9264b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: dh.c */
/* loaded from: classes2.dex */
abstract class EnumC6964c {
    private static final /* synthetic */ EnumC6964c[] $VALUES;
    public static final EnumC6964c DATA_MASK_000;
    public static final EnumC6964c DATA_MASK_001;
    public static final EnumC6964c DATA_MASK_010;
    public static final EnumC6964c DATA_MASK_011;
    public static final EnumC6964c DATA_MASK_100;
    public static final EnumC6964c DATA_MASK_101;
    public static final EnumC6964c DATA_MASK_110;
    public static final EnumC6964c DATA_MASK_111;

    /* renamed from: dh.c$a */
    /* loaded from: classes2.dex */
    enum a extends EnumC6964c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p067dh.EnumC6964c
        /* renamed from: b */
        boolean mo20132b(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        DATA_MASK_000 = aVar;
        EnumC6964c enumC6964c = new EnumC6964c("DATA_MASK_001", 1) { // from class: dh.c.b
            {
                a aVar2 = null;
            }

            @Override // p067dh.EnumC6964c
            /* renamed from: b */
            boolean mo20132b(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        DATA_MASK_001 = enumC6964c;
        EnumC6964c enumC6964c2 = new EnumC6964c("DATA_MASK_010", 2) { // from class: dh.c.c
            {
                a aVar2 = null;
            }

            @Override // p067dh.EnumC6964c
            /* renamed from: b */
            boolean mo20132b(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        DATA_MASK_010 = enumC6964c2;
        EnumC6964c enumC6964c3 = new EnumC6964c("DATA_MASK_011", 3) { // from class: dh.c.d
            {
                a aVar2 = null;
            }

            @Override // p067dh.EnumC6964c
            /* renamed from: b */
            boolean mo20132b(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        DATA_MASK_011 = enumC6964c3;
        EnumC6964c enumC6964c4 = new EnumC6964c("DATA_MASK_100", 4) { // from class: dh.c.e
            {
                a aVar2 = null;
            }

            @Override // p067dh.EnumC6964c
            /* renamed from: b */
            boolean mo20132b(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        DATA_MASK_100 = enumC6964c4;
        EnumC6964c enumC6964c5 = new EnumC6964c("DATA_MASK_101", 5) { // from class: dh.c.f
            {
                a aVar2 = null;
            }

            @Override // p067dh.EnumC6964c
            /* renamed from: b */
            boolean mo20132b(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        DATA_MASK_101 = enumC6964c5;
        EnumC6964c enumC6964c6 = new EnumC6964c("DATA_MASK_110", 6) { // from class: dh.c.g
            {
                a aVar2 = null;
            }

            @Override // p067dh.EnumC6964c
            /* renamed from: b */
            boolean mo20132b(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        DATA_MASK_110 = enumC6964c6;
        EnumC6964c enumC6964c7 = new EnumC6964c("DATA_MASK_111", 7) { // from class: dh.c.h
            {
                a aVar2 = null;
            }

            @Override // p067dh.EnumC6964c
            /* renamed from: b */
            boolean mo20132b(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        DATA_MASK_111 = enumC6964c7;
        $VALUES = new EnumC6964c[]{aVar, enumC6964c, enumC6964c2, enumC6964c3, enumC6964c4, enumC6964c5, enumC6964c6, enumC6964c7};
    }

    private EnumC6964c(String str, int i10) {
    }

    /* synthetic */ EnumC6964c(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC6964c valueOf(String str) {
        return (EnumC6964c) Enum.valueOf(EnumC6964c.class, str);
    }

    public static EnumC6964c[] values() {
        return (EnumC6964c[]) $VALUES.clone();
    }

    /* renamed from: b */
    abstract boolean mo20132b(int i10, int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m20133h(C9264b c9264b, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (mo20132b(i11, i12)) {
                    c9264b.m27602e(i12, i11);
                }
            }
        }
    }
}
