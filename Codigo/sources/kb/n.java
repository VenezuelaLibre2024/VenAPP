package kb;

import com.google.crypto.tink.internal.b;
import java.security.GeneralSecurityException;
import kb.i;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final xb.a f20591a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<i, com.google.crypto.tink.internal.p> f20592b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f20593c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<g, com.google.crypto.tink.internal.o> f20594d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f20595e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20596a;

        static {
            int[] iArr = new int[vb.i0.values().length];
            f20596a = iArr;
            try {
                iArr[vb.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20596a[vb.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20596a[vb.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20596a[vb.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        xb.a e10 = com.google.crypto.tink.internal.t.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f20591a = e10;
        f20592b = com.google.crypto.tink.internal.k.a(new j(), i.class, com.google.crypto.tink.internal.p.class);
        f20593c = com.google.crypto.tink.internal.j.a(new k(), e10, com.google.crypto.tink.internal.p.class);
        f20594d = com.google.crypto.tink.internal.c.a(new l(), g.class, com.google.crypto.tink.internal.o.class);
        f20595e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0169b() { // from class: kb.m
            @Override // com.google.crypto.tink.internal.b.InterfaceC0169b
            public final jb.g a(com.google.crypto.tink.internal.q qVar, jb.y yVar) {
                g b10;
                b10 = n.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g b(com.google.crypto.tink.internal.o oVar, jb.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            vb.i d02 = vb.i.d0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (d02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return g.a().e(i.a().c(d02.Z().size()).b(d02.a0().Y()).d(16).e(e(oVar.e())).a()).d(xb.b.a(d02.Z().w(), jb.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f20592b);
        iVar.g(f20593c);
        iVar.f(f20594d);
        iVar.e(f20595e);
    }

    private static i.c e(vb.i0 i0Var) {
        int i10 = a.f20596a[i0Var.ordinal()];
        if (i10 == 1) {
            return i.c.f20576b;
        }
        if (i10 == 2 || i10 == 3) {
            return i.c.f20577c;
        }
        if (i10 == 4) {
            return i.c.f20578d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
    }
}