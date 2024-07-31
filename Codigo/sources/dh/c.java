package dh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c DATA_MASK_000;
    public static final c DATA_MASK_001;
    public static final c DATA_MASK_010;
    public static final c DATA_MASK_011;
    public static final c DATA_MASK_100;
    public static final c DATA_MASK_101;
    public static final c DATA_MASK_110;
    public static final c DATA_MASK_111;

    /* loaded from: classes2.dex */
    enum a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // dh.c
        boolean b(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        DATA_MASK_000 = aVar;
        c cVar = new c("DATA_MASK_001", 1) { // from class: dh.c.b
            {
                a aVar2 = null;
            }

            @Override // dh.c
            boolean b(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        DATA_MASK_001 = cVar;
        c cVar2 = new c("DATA_MASK_010", 2) { // from class: dh.c.c
            {
                a aVar2 = null;
            }

            @Override // dh.c
            boolean b(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        DATA_MASK_010 = cVar2;
        c cVar3 = new c("DATA_MASK_011", 3) { // from class: dh.c.d
            {
                a aVar2 = null;
            }

            @Override // dh.c
            boolean b(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        DATA_MASK_011 = cVar3;
        c cVar4 = new c("DATA_MASK_100", 4) { // from class: dh.c.e
            {
                a aVar2 = null;
            }

            @Override // dh.c
            boolean b(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        DATA_MASK_100 = cVar4;
        c cVar5 = new c("DATA_MASK_101", 5) { // from class: dh.c.f
            {
                a aVar2 = null;
            }

            @Override // dh.c
            boolean b(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        DATA_MASK_101 = cVar5;
        c cVar6 = new c("DATA_MASK_110", 6) { // from class: dh.c.g
            {
                a aVar2 = null;
            }

            @Override // dh.c
            boolean b(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        DATA_MASK_110 = cVar6;
        c cVar7 = new c("DATA_MASK_111", 7) { // from class: dh.c.h
            {
                a aVar2 = null;
            }

            @Override // dh.c
            boolean b(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        DATA_MASK_111 = cVar7;
        $VALUES = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    private c(String str, int i10) {
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    abstract boolean b(int i10, int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(kg.b bVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (b(i11, i12)) {
                    bVar.e(i12, i11);
                }
            }
        }
    }
}
