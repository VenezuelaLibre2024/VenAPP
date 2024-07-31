package a3;

/* loaded from: classes.dex */
public enum a {
    denied,
    deniedForever,
    whileInUse,
    always;

    /* renamed from: a3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0001a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58a;

        static {
            int[] iArr = new int[a.values().length];
            f58a = iArr;
            try {
                iArr[a.denied.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58a[a.deniedForever.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f58a[a.whileInUse.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f58a[a.always.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public int h() {
        int i10 = C0001a.f58a[ordinal()];
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
