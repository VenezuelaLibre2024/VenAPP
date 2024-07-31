package rb;

import com.google.crypto.tink.internal.b;
import com.google.crypto.tink.internal.t;
import com.google.crypto.tink.shaded.protobuf.b0;
import java.security.GeneralSecurityException;
import jb.y;
import rb.d;
import vb.i0;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a */
    private static final xb.a f24871a;

    /* renamed from: b */
    private static final com.google.crypto.tink.internal.k<d, com.google.crypto.tink.internal.p> f24872b;

    /* renamed from: c */
    private static final com.google.crypto.tink.internal.j<com.google.crypto.tink.internal.p> f24873c;

    /* renamed from: d */
    private static final com.google.crypto.tink.internal.c<rb.a, com.google.crypto.tink.internal.o> f24874d;

    /* renamed from: e */
    private static final com.google.crypto.tink.internal.b<com.google.crypto.tink.internal.o> f24875e;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24876a;

        static {
            int[] iArr = new int[i0.values().length];
            f24876a = iArr;
            try {
                iArr[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24876a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24876a[i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24876a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        xb.a e10 = t.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f24871a = e10;
        f24872b = com.google.crypto.tink.internal.k.a(new kb.j(), d.class, com.google.crypto.tink.internal.p.class);
        f24873c = com.google.crypto.tink.internal.j.a(new kb.k(), e10, com.google.crypto.tink.internal.p.class);
        f24874d = com.google.crypto.tink.internal.c.a(new kb.l(), rb.a.class, com.google.crypto.tink.internal.o.class);
        f24875e = com.google.crypto.tink.internal.b.a(new b.InterfaceC0169b() { // from class: rb.e
            @Override // com.google.crypto.tink.internal.b.InterfaceC0169b
            public final jb.g a(com.google.crypto.tink.internal.q qVar, y yVar) {
                a b10;
                b10 = f.b((com.google.crypto.tink.internal.o) qVar, yVar);
                return b10;
            }
        }, e10, com.google.crypto.tink.internal.o.class);
    }

    public static rb.a b(com.google.crypto.tink.internal.o oVar, y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            vb.a d02 = vb.a.d0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (d02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return rb.a.c().e(d.a().b(d02.Z().size()).c(d02.a0().Y()).d(e(oVar.e())).a()).c(xb.b.a(d02.Z().w(), y.b(yVar))).d(oVar.c()).a();
        } catch (b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static void c() {
        d(com.google.crypto.tink.internal.i.a());
    }

    public static void d(com.google.crypto.tink.internal.i iVar) {
        iVar.h(f24872b);
        iVar.g(f24873c);
        iVar.f(f24874d);
        iVar.e(f24875e);
    }

    private static d.c e(i0 i0Var) {
        int i10 = a.f24876a[i0Var.ordinal()];
        if (i10 == 1) {
            return d.c.f24866b;
        }
        if (i10 == 2) {
            return d.c.f24867c;
        }
        if (i10 == 3) {
            return d.c.f24868d;
        }
        if (i10 == 4) {
            return d.c.f24869e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.a());
    }
}
