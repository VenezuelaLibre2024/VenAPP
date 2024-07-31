package kb;

import com.google.crypto.tink.internal.b;
import java.security.GeneralSecurityException;
import kb.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final xb.a f20639a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<v, com.google.crypto.tink.internal.p> f20640b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f20641c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<t, com.google.crypto.tink.internal.o> f20642d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f20643e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20644a;

        static {
            int[] iArr = new int[vb.i0.values().length];
            f20644a = iArr;
            try {
                iArr[vb.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20644a[vb.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20644a[vb.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20644a[vb.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        xb.a e10 = com.google.crypto.tink.internal.t.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f20639a = e10;
        f20640b = com.google.crypto.tink.internal.k.a(new j(), v.class, com.google.crypto.tink.internal.p.class);
        f20641c = com.google.crypto.tink.internal.j.a(new k(), e10, com.google.crypto.tink.internal.p.class);
        f20642d = com.google.crypto.tink.internal.c.a(new l(), t.class, com.google.crypto.tink.internal.o.class);
        f20643e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0169b() { // from class: kb.w
            @Override // com.google.crypto.tink.internal.b.InterfaceC0169b
            public final jb.g a(com.google.crypto.tink.internal.q qVar, jb.y yVar) {
                t b10;
                b10 = x.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t b(com.google.crypto.tink.internal.o oVar, jb.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            vb.n b02 = vb.n.b0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (b02.Z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return t.a().e(v.a().b(b02.Y().size()).c(e(oVar.e())).a()).d(xb.b.a(b02.Y().w(), jb.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f20640b);
        iVar.g(f20641c);
        iVar.f(f20642d);
        iVar.e(f20643e);
    }

    private static v.c e(vb.i0 i0Var) {
        int i10 = a.f20644a[i0Var.ordinal()];
        if (i10 == 1) {
            return v.c.f20635b;
        }
        if (i10 == 2 || i10 == 3) {
            return v.c.f20636c;
        }
        if (i10 == 4) {
            return v.c.f20637d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
    }
}
