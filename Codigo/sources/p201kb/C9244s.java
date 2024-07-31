package p201kb;

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
import p201kb.C9242q;
import p400vb.C11807l;
import p400vb.EnumC11802i0;
import p441xb.C12413a;
import p441xb.C12414b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kb.s */
/* loaded from: classes2.dex */
public final class C9244s {

    /* renamed from: a */
    private static final C12413a f22439a;

    /* renamed from: b */
    private static final AbstractC5939k<C9242q, C5944p> f22440b;

    /* renamed from: c */
    private static final AbstractC5938j<C5944p> f22441c;

    /* renamed from: d */
    private static final AbstractC5931c<C9240o, C5943o> f22442d;

    /* renamed from: e */
    private static final AbstractC5930b<C5943o> f22443e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kb.s$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22444a;

        static {
            int[] iArr = new int[EnumC11802i0.values().length];
            f22444a = iArr;
            try {
                iArr[EnumC11802i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22444a[EnumC11802i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22444a[EnumC11802i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22444a[EnumC11802i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C12413a m15290e = C5948t.m15290e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f22439a = m15290e;
        f22440b = AbstractC5939k.m15244a(new C9233j(), C9242q.class, C5944p.class);
        f22441c = AbstractC5938j.m15241a(new C9235k(), m15290e, C5944p.class);
        f22442d = AbstractC5931c.m15200a(new C9237l(), C9240o.class, C5943o.class);
        f22443e = AbstractC5930b.m15195a(new AbstractC5930b.b() { // from class: kb.r
            @Override // com.google.crypto.tink.internal.AbstractC5930b.b
            /* renamed from: a */
            public final AbstractC9015g mo15199a(InterfaceC5945q interfaceC5945q, C9033y c9033y) {
                C9240o m27529b;
                m27529b = C9244s.m27529b((C5943o) interfaceC5945q, c9033y);
                return m27529b;
            }
        }, m15290e, C5943o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C9240o m27529b(C5943o c5943o, C9033y c9033y) {
        if (!c5943o.m15269f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            C11807l m37529b0 = C11807l.m37529b0(c5943o.m15270g(), C5994p.m15932b());
            if (m37529b0.m37533Z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C9240o.m27501a().m27506e(C9242q.m27517a().m27525c(m37529b0.m37532Y().size()).m27524b(12).m27526d(16).m27527e(m27532e(c5943o.m15268e())).m27523a()).m27505d(C12414b.m40070a(m37529b0.m37532Y().m15502w(), C9033y.m26540b(c9033y))).m27504c(c5943o.m15266c()).m27503a();
        } catch (C5953b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    /* renamed from: c */
    public static void m27530c() {
        m27531d(C5937i.m15233a());
    }

    /* renamed from: d */
    public static void m27531d(C5937i c5937i) {
        c5937i.m15240h(f22440b);
        c5937i.m15239g(f22441c);
        c5937i.m15238f(f22442d);
        c5937i.m15237e(f22443e);
    }

    /* renamed from: e */
    private static C9242q.c m27532e(EnumC11802i0 enumC11802i0) {
        int i10 = a.f22444a[enumC11802i0.ordinal()];
        if (i10 == 1) {
            return C9242q.c.f22435b;
        }
        if (i10 == 2 || i10 == 3) {
            return C9242q.c.f22436c;
        }
        if (i10 == 4) {
            return C9242q.c.f22437d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC11802i0.mo15312a());
    }
}
