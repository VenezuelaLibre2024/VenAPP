package p332rb;

import com.google.crypto.tink.internal.AbstractC5930b;
import com.google.crypto.tink.internal.AbstractC5931c;
import com.google.crypto.tink.internal.AbstractC5938j;
import com.google.crypto.tink.internal.AbstractC5939k;
import com.google.crypto.tink.internal.C5937i;
import com.google.crypto.tink.internal.C5943o;
import com.google.crypto.tink.internal.C5944p;
import com.google.crypto.tink.internal.C5948t;
import com.google.crypto.tink.internal.InterfaceC5945q;
import com.google.crypto.tink.shaded.protobuf.C5953b0;
import com.google.crypto.tink.shaded.protobuf.C5994p;
import java.security.GeneralSecurityException;
import p179jb.AbstractC9015g;
import p179jb.C9033y;
import p201kb.C9233j;
import p201kb.C9235k;
import p201kb.C9237l;
import p332rb.C10679l;
import p400vb.C11818v;
import p400vb.EnumC11802i0;
import p400vb.EnumC11817u;
import p441xb.C12413a;
import p441xb.C12414b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.n */
/* loaded from: classes2.dex */
public final class C10681n {

    /* renamed from: a */
    private static final C12413a f27024a;

    /* renamed from: b */
    private static final AbstractC5939k<C10679l, C5944p> f27025b;

    /* renamed from: c */
    private static final AbstractC5938j<C5944p> f27026c;

    /* renamed from: d */
    private static final AbstractC5931c<C10676i, C5943o> f27027d;

    /* renamed from: e */
    private static final AbstractC5930b<C5943o> f27028e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rb.n$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f27029a;

        /* renamed from: b */
        static final /* synthetic */ int[] f27030b;

        static {
            int[] iArr = new int[EnumC11802i0.values().length];
            f27030b = iArr;
            try {
                iArr[EnumC11802i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27030b[EnumC11802i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27030b[EnumC11802i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27030b[EnumC11802i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[EnumC11817u.values().length];
            f27029a = iArr2;
            try {
                iArr2[EnumC11817u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27029a[EnumC11817u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27029a[EnumC11817u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27029a[EnumC11817u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27029a[EnumC11817u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        C12413a m15290e = C5948t.m15290e("type.googleapis.com/google.crypto.tink.HmacKey");
        f27024a = m15290e;
        f27025b = AbstractC5939k.m15244a(new C9233j(), C10679l.class, C5944p.class);
        f27026c = AbstractC5938j.m15241a(new C9235k(), m15290e, C5944p.class);
        f27027d = AbstractC5931c.m15200a(new C9237l(), C10676i.class, C5943o.class);
        f27028e = AbstractC5930b.m15195a(new AbstractC5930b.b() { // from class: rb.m
            @Override // com.google.crypto.tink.internal.AbstractC5930b.b
            /* renamed from: a */
            public final AbstractC9015g mo15199a(InterfaceC5945q interfaceC5945q, C9033y c9033y) {
                C10676i m32529b;
                m32529b = C10681n.m32529b((C5943o) interfaceC5945q, c9033y);
                return m32529b;
            }
        }, m15290e, C5943o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C10676i m32529b(C5943o c5943o, C9033y c9033y) {
        if (!c5943o.m15269f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            C11818v m37614e0 = C11818v.m37614e0(c5943o.m15270g(), C5994p.m15932b());
            if (m37614e0.m37620c0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C10676i.m32496c().m32502e(C10679l.m32515a().m32525c(m37614e0.m37618a0().size()).m32526d(m37614e0.m37619b0().m37644a0()).m32524b(m32532e(m37614e0.m37619b0().m37643Z())).m32527e(m32533f(c5943o.m15268e())).m32523a()).m32501d(C12414b.m40070a(m37614e0.m37618a0().m15502w(), C9033y.m26540b(c9033y))).m32500c(c5943o.m15266c()).m32499a();
        } catch (C5953b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    /* renamed from: c */
    public static void m32530c() {
        m32531d(C5937i.m15233a());
    }

    /* renamed from: d */
    public static void m32531d(C5937i c5937i) {
        c5937i.m15240h(f27025b);
        c5937i.m15239g(f27026c);
        c5937i.m15238f(f27027d);
        c5937i.m15237e(f27028e);
    }

    /* renamed from: e */
    private static C10679l.c m32532e(EnumC11817u enumC11817u) {
        int i10 = a.f27029a[enumC11817u.ordinal()];
        if (i10 == 1) {
            return C10679l.c.f27013b;
        }
        if (i10 == 2) {
            return C10679l.c.f27014c;
        }
        if (i10 == 3) {
            return C10679l.c.f27015d;
        }
        if (i10 == 4) {
            return C10679l.c.f27016e;
        }
        if (i10 == 5) {
            return C10679l.c.f27017f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + enumC11817u.mo15312a());
    }

    /* renamed from: f */
    private static C10679l.d m32533f(EnumC11802i0 enumC11802i0) {
        int i10 = a.f27030b[enumC11802i0.ordinal()];
        if (i10 == 1) {
            return C10679l.d.f27019b;
        }
        if (i10 == 2) {
            return C10679l.d.f27020c;
        }
        if (i10 == 3) {
            return C10679l.d.f27021d;
        }
        if (i10 == 4) {
            return C10679l.d.f27022e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC11802i0.mo15312a());
    }
}
