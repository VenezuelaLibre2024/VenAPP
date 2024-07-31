package p179jb;

import com.google.crypto.tink.shaded.protobuf.AbstractC5970h;
import p400vb.C11786a0;
import p400vb.EnumC11802i0;

/* renamed from: jb.l */
/* loaded from: classes2.dex */
public final class C9020l {

    /* renamed from: a */
    private final C11786a0 f21622a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jb.l$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21623a;

        /* renamed from: b */
        static final /* synthetic */ int[] f21624b;

        static {
            int[] iArr = new int[b.values().length];
            f21624b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21624b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21624b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21624b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[EnumC11802i0.values().length];
            f21623a = iArr2;
            try {
                iArr2[EnumC11802i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21623a[EnumC11802i0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21623a[EnumC11802i0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21623a[EnumC11802i0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: jb.l$b */
    /* loaded from: classes2.dex */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private C9020l(C11786a0 c11786a0) {
        this.f21622a = c11786a0;
    }

    /* renamed from: a */
    public static C9020l m26456a(String str, byte[] bArr, b bVar) {
        return new C9020l(C11786a0.m37293d0().m37301B(str).m37302C(AbstractC5970h.m15486k(bArr)).m37300A(m26457c(bVar)).build());
    }

    /* renamed from: c */
    static EnumC11802i0 m26457c(b bVar) {
        int i10 = a.f21624b[bVar.ordinal()];
        if (i10 == 1) {
            return EnumC11802i0.TINK;
        }
        if (i10 == 2) {
            return EnumC11802i0.LEGACY;
        }
        if (i10 == 3) {
            return EnumC11802i0.RAW;
        }
        if (i10 == 4) {
            return EnumC11802i0.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C11786a0 m26458b() {
        return this.f21622a;
    }
}
