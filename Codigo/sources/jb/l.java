package jb;

import vb.a0;
import vb.i0;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final a0 f19843a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19844a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f19845b;

        static {
            int[] iArr = new int[b.values().length];
            f19845b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19845b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19845b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19845b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i0.values().length];
            f19844a = iArr2;
            try {
                iArr2[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19844a[i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19844a[i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19844a[i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private l(a0 a0Var) {
        this.f19843a = a0Var;
    }

    public static l a(String str, byte[] bArr, b bVar) {
        return new l(a0.d0().B(str).C(com.google.crypto.tink.shaded.protobuf.h.k(bArr)).A(c(bVar)).build());
    }

    static i0 c(b bVar) {
        int i10 = a.f19845b[bVar.ordinal()];
        if (i10 == 1) {
            return i0.TINK;
        }
        if (i10 == 2) {
            return i0.LEGACY;
        }
        if (i10 == 3) {
            return i0.RAW;
        }
        if (i10 == 4) {
            return i0.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0 b() {
        return this.f19843a;
    }
}
