package kb;

import com.google.crypto.tink.internal.b;
import java.security.GeneralSecurityException;
import kb.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final xb.a f20537a;

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.k<a0, com.google.crypto.tink.internal.p> f20538b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f20539c;

    /* renamed from: d, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.c<y, com.google.crypto.tink.internal.o> f20540d;

    /* renamed from: e, reason: collision with root package name */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f20541e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20542a;

        static {
            int[] iArr = new int[vb.i0.values().length];
            f20542a = iArr;
            try {
                iArr[vb.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20542a[vb.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20542a[vb.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20542a[vb.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        xb.a e10 = com.google.crypto.tink.internal.t.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f20537a = e10;
        f20538b = com.google.crypto.tink.internal.k.a(new j(), a0.class, com.google.crypto.tink.internal.p.class);
        f20539c = com.google.crypto.tink.internal.j.a(new k(), e10, com.google.crypto.tink.internal.p.class);
        f20540d = com.google.crypto.tink.internal.c.a(new l(), y.class, com.google.crypto.tink.internal.o.class);
        f20541e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0169b() { // from class: kb.b0
            @Override // com.google.crypto.tink.internal.b.InterfaceC0169b
            public final jb.g a(com.google.crypto.tink.internal.q qVar, jb.y yVar) {
                y b10;
                b10 = c0.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y b(com.google.crypto.tink.internal.o oVar, jb.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            vb.r b02 = vb.r.b0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (b02.Z() == 0) {
                return y.a(e(oVar.e()), xb.b.a(b02.Y().w(), jb.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.b0 unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f20538b);
        iVar.g(f20539c);
        iVar.f(f20540d);
        iVar.e(f20541e);
    }

    private static a0.a e(vb.i0 i0Var) {
        int i10 = a.f20542a[i0Var.ordinal()];
        if (i10 == 1) {
            return a0.a.f20533b;
        }
        if (i10 == 2 || i10 == 3) {
            return a0.a.f20534c;
        }
        if (i10 == 4) {
            return a0.a.f20535d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
    }
}
