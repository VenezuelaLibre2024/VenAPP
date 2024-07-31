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
import p332rb.C10671d;
import p400vb.C11785a;
import p400vb.EnumC11802i0;
import p441xb.C12413a;
import p441xb.C12414b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rb.f */
/* loaded from: classes2.dex */
public final class C10673f {

    /* renamed from: a */
    private static final C12413a f26987a;

    /* renamed from: b */
    private static final AbstractC5939k<C10671d, C5944p> f26988b;

    /* renamed from: c */
    private static final AbstractC5938j<C5944p> f26989c;

    /* renamed from: d */
    private static final AbstractC5931c<C10668a, C5943o> f26990d;

    /* renamed from: e */
    private static final AbstractC5930b<C5943o> f26991e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rb.f$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26992a;

        static {
            int[] iArr = new int[EnumC11802i0.values().length];
            f26992a = iArr;
            try {
                iArr[EnumC11802i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26992a[EnumC11802i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26992a[EnumC11802i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26992a[EnumC11802i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C12413a m15290e = C5948t.m15290e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f26987a = m15290e;
        f26988b = AbstractC5939k.m15244a(new C9233j(), C10671d.class, C5944p.class);
        f26989c = AbstractC5938j.m15241a(new C9235k(), m15290e, C5944p.class);
        f26990d = AbstractC5931c.m15200a(new C9237l(), C10668a.class, C5943o.class);
        f26991e = AbstractC5930b.m15195a(new AbstractC5930b.b() { // from class: rb.e
            @Override // com.google.crypto.tink.internal.AbstractC5930b.b
            /* renamed from: a */
            public final AbstractC9015g mo15199a(InterfaceC5945q interfaceC5945q, C9033y c9033y) {
                C10668a m32490b;
                m32490b = C10673f.m32490b((C5943o) interfaceC5945q, c9033y);
                return m32490b;
            }
        }, m15290e, C5943o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C10668a m32490b(C5943o c5943o, C9033y c9033y) {
        if (!c5943o.m15269f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            C11785a m37278d0 = C11785a.m37278d0(c5943o.m15270g(), C5994p.m15932b());
            if (m37278d0.m37284b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C10668a.m32458c().m32466e(C10671d.m32479a().m32486b(m37278d0.m37282Z().size()).m32487c(m37278d0.m37283a0().m37320Y()).m32488d(m32493e(c5943o.m15268e())).m32485a()).m32464c(C12414b.m40070a(m37278d0.m37282Z().m15502w(), C9033y.m26540b(c9033y))).m32465d(c5943o.m15266c()).m32463a();
        } catch (C5953b0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    /* renamed from: c */
    public static void m32491c() {
        m32492d(C5937i.m15233a());
    }

    /* renamed from: d */
    public static void m32492d(C5937i c5937i) {
        c5937i.m15240h(f26988b);
        c5937i.m15239g(f26989c);
        c5937i.m15238f(f26990d);
        c5937i.m15237e(f26991e);
    }

    /* renamed from: e */
    private static C10671d.c m32493e(EnumC11802i0 enumC11802i0) {
        int i10 = a.f26992a[enumC11802i0.ordinal()];
        if (i10 == 1) {
            return C10671d.c.f26982b;
        }
        if (i10 == 2) {
            return C10671d.c.f26983c;
        }
        if (i10 == 3) {
            return C10671d.c.f26984d;
        }
        if (i10 == 4) {
            return C10671d.c.f26985e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC11802i0.mo15312a());
    }
}
