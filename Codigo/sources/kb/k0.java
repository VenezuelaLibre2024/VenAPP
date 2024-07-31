package kb;

import com.google.crypto.tink.internal.b;
import java.security.GeneralSecurityException;
import kb.i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final xb.a f20585a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<i0, com.google.crypto.tink.internal.p> f20586b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f20587c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<g0, com.google.crypto.tink.internal.o> f20588d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f20589e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20590a;

        static {
            int[] iArr = new int[vb.i0.values().length];
            f20590a = iArr;
            try {
                iArr[vb.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20590a[vb.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20590a[vb.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20590a[vb.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        xb.a e10 = com.google.crypto.tink.internal.t.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f20585a = e10;
        f20586b = com.google.crypto.tink.internal.k.a(new j(), i0.class, com.google.crypto.tink.internal.p.class);
        f20587c = com.google.crypto.tink.internal.j.a(new k(), e10, com.google.crypto.tink.internal.p.class);
        f20588d = com.google.crypto.tink.internal.c.a(new l(), g0.class, com.google.crypto.tink.internal.o.class);
        f20589e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0169b() { // from class: kb.j0
            @Override // com.google.crypto.tink.internal.b.InterfaceC0169b
            public final jb.g a(com.google.crypto.tink.internal.q qVar, jb.y yVar) {
                g0 b10;
                b10 = k0.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g0 b(com.google.crypto.tink.internal.o oVar, jb.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            vb.k0 b02 = vb.k0.b0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (b02.Z() == 0) {
                return g0.a(e(oVar.e()), xb.b.a(b02.Y().w(), jb.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f20586b);
        iVar.g(f20587c);
        iVar.f(f20588d);
        iVar.e(f20589e);
    }

    private static i0.a e(vb.i0 i0Var) {
        int i10 = a.f20590a[i0Var.ordinal()];
        if (i10 == 1) {
            return i0.a.f20581b;
        }
        if (i10 == 2 || i10 == 3) {
            return i0.a.f20582c;
        }
        if (i10 == 4) {
            return i0.a.f20583d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
    }
}
