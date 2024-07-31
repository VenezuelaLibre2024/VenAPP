package kb;

import com.google.crypto.tink.internal.b;
import java.security.GeneralSecurityException;
import kb.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final xb.a f20617a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<q, com.google.crypto.tink.internal.p> f20618b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f20619c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<o, com.google.crypto.tink.internal.o> f20620d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f20621e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20622a;

        static {
            int[] iArr = new int[vb.i0.values().length];
            f20622a = iArr;
            try {
                iArr[vb.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20622a[vb.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20622a[vb.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20622a[vb.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        xb.a e10 = com.google.crypto.tink.internal.t.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f20617a = e10;
        f20618b = com.google.crypto.tink.internal.k.a(new j(), q.class, com.google.crypto.tink.internal.p.class);
        f20619c = com.google.crypto.tink.internal.j.a(new k(), e10, com.google.crypto.tink.internal.p.class);
        f20620d = com.google.crypto.tink.internal.c.a(new l(), o.class, com.google.crypto.tink.internal.o.class);
        f20621e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0169b() { // from class: kb.r
            @Override // com.google.crypto.tink.internal.b.InterfaceC0169b
            public final jb.g a(com.google.crypto.tink.internal.q qVar, jb.y yVar) {
                o b10;
                b10 = s.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o b(com.google.crypto.tink.internal.o oVar, jb.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            vb.l b02 = vb.l.b0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (b02.Z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return o.a().e(q.a().c(b02.Y().size()).b(12).d(16).e(e(oVar.e())).a()).d(xb.b.a(b02.Y().w(), jb.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f20618b);
        iVar.g(f20619c);
        iVar.f(f20620d);
        iVar.e(f20621e);
    }

    private static q.c e(vb.i0 i0Var) {
        int i10 = a.f20622a[i0Var.ordinal()];
        if (i10 == 1) {
            return q.c.f20613b;
        }
        if (i10 == 2 || i10 == 3) {
            return q.c.f20614c;
        }
        if (i10 == 4) {
            return q.c.f20615d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
    }
}
