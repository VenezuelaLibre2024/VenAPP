package p005a3;

/* renamed from: a3.a */
/* loaded from: classes.dex */
public enum EnumC0026a {
    denied,
    deniedForever,
    whileInUse,
    always;

    /* renamed from: a3.a$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f58a;

        static {
            int[] iArr = new int[EnumC0026a.values().length];
            f58a = iArr;
            try {
                iArr[EnumC0026a.denied.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58a[EnumC0026a.deniedForever.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58a[EnumC0026a.whileInUse.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58a[EnumC0026a.always.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: h */
    public int m92h() {
        int i10 = a.f58a[ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new IndexOutOfBoundsException();
    }
}
