package rb;

import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.shaded.protobuf.b0;
import java.security.GeneralSecurityException;
import jb.y;
import rb.l;
import vb.i0;
import vb.u;
import vb.v;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a */
    private static final xb.a f24908a;

    /* renamed from: b */
    private static final com.google.crypto.tink.internal.k<l, com.google.crypto.tink.internal.p> f24909b;

    /* renamed from: c */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f24910c;

    /* renamed from: d */
    private static final com.google.crypto.tink.internal.c<i, com.google.crypto.tink.internal.o> f24911d;

    /* renamed from: e */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f24912e;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24913a;

        /* renamed from: b */
        static final /* synthetic */ int[] f24914b;

        static {
            int[] iArr = new int[i0.values().length];
            f24914b = iArr;
            try {
                iArr[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24914b[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24914b[i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24914b[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[u.values().length];
            f24913a = iArr2;
            try {
                iArr2[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24913a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24913a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24913a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24913a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        xb.a e10 = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
        f24908a = e10;
        f24909b = com.google.crypto.tink.internal.k.a(new kb.j(), l.class, com.google.crypto.tink.internal.p.class);
        f24910c = com.google.crypto.tink.internal.j.a(new kb.k(), e10, com.google.crypto.tink.internal.p.class);
        f24911d = com.google.crypto.tink.internal.c.a(new kb.l(), i.class, com.google.crypto.tink.internal.o.class);
        f24912e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0169b() { // from class: rb.m
            @Override // com.google.crypto.tink.internal.b.InterfaceC0169b
            public final jb.g a(com.google.crypto.tink.internal.q qVar, y yVar) {
                i b10;
                b10 = n.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    public static i b(com.google.crypto.tink.internal.o oVar, y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            v e02 = v.e0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (e02.c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return i.c().e(l.a().c(e02.a0().size()).d(e02.b0().a0()).b(e(e02.b0().Z())).e(f(oVar.e())).a()).d(xb.b.a(e02.a0().w(), y.b(yVar))).c(oVar.c()).a();
        } catch (b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f24909b);
        iVar.g(f24910c);
        iVar.f(f24911d);
        iVar.e(f24912e);
    }

    private static l.c e(u uVar) {
        int i10 = a.f24913a[uVar.ordinal()];
        if (i10 == 1) {
            return l.c.f24897b;
        }
        if (i10 == 2) {
            return l.c.f24898c;
        }
        if (i10 == 3) {
            return l.c.f24899d;
        }
        if (i10 == 4) {
            return l.c.f24900e;
        }
        if (i10 == 5) {
            return l.c.f24901f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.a());
    }

    private static l.d f(i0 i0Var) {
        int i10 = a.f24914b[i0Var.ordinal()];
        if (i10 == 1) {
            return l.d.f24903b;
        }
        if (i10 == 2) {
            return l.d.f24904c;
        }
        if (i10 == 3) {
            return l.d.f24905d;
        }
        if (i10 == 4) {
            return l.d.f24906e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
    }
}
