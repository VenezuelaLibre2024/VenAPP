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
import p201kb.C9247v;
import p400vb.C11810n;
import p400vb.EnumC11802i0;
import p441xb.C12413a;
import p441xb.C12414b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kb.x */
/* loaded from: classes2.dex */
public final class C9249x {

    /* renamed from: a */
    private static final C12413a f22461a;

    /* renamed from: b */
    private static final AbstractC5939k<C9247v, C5944p> f22462b;

    /* renamed from: c */
    private static final AbstractC5938j<C5944p> f22463c;

    /* renamed from: d */
    private static final AbstractC5931c<C9245t, C5943o> f22464d;

    /* renamed from: e */
    private static final AbstractC5930b<C5943o> f22465e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kb.x$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22466a;

        static {
            int[] iArr = new int[EnumC11802i0.values().length];
            f22466a = iArr;
            try {
                iArr[EnumC11802i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22466a[EnumC11802i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22466a[EnumC11802i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22466a[EnumC11802i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C12413a m15290e = C5948t.m15290e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f22461a = m15290e;
        f22462b = AbstractC5939k.m15244a(new C9233j(), C9247v.class, C5944p.class);
        f22463c = AbstractC5938j.m15241a(new C9235k(), m15290e, C5944p.class);
        f22464d = AbstractC5931c.m15200a(new C9237l(), C9245t.class, C5943o.class);
        f22465e = AbstractC5930b.m15195a(new AbstractC5930b.b() { // from class: kb.w
            @Override // com.google.crypto.tink.internal.AbstractC5930b.b
            /* renamed from: a */
            public final AbstractC9015g mo15199a(InterfaceC5945q interfaceC5945q, C9033y c9033y) {
                C9245t m27558b;
                m27558b = C9249x.m27558b((C5943o) interfaceC5945q, c9033y);
                return m27558b;
            }
        }, m15290e, C5943o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C9245t m27558b(C5943o c5943o, C9033y c9033y) {
        if (!c5943o.m15269f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            C11810n m37550b0 = C11810n.m37550b0(c5943o.m15270g(), C5994p.m15932b());
            if (m37550b0.m37554Z() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C9245t.m27533a().m27538e(C9247v.m27550a().m27555b(m37550b0.m37553Y().size()).m27556c(m27561e(c5943o.m15268e())).m27554a()).m27537d(C12414b.m40070a(m37550b0.m37553Y().m15502w(), C9033y.m26540b(c9033y))).m27536c(c5943o.m15266c()).m27535a();
        } catch (C5953b0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    /* renamed from: c */
    public static void m27559c() {
        m27560d(C5937i.m15233a());
    }

    /* renamed from: d */
    public static void m27560d(C5937i c5937i) {
        c5937i.m15240h(f22462b);
        c5937i.m15239g(f22463c);
        c5937i.m15238f(f22464d);
        c5937i.m15237e(f22465e);
    }

    /* renamed from: e */
    private static C9247v.c m27561e(EnumC11802i0 enumC11802i0) {
        int i10 = a.f22466a[enumC11802i0.ordinal()];
        if (i10 == 1) {
            return C9247v.c.f22457b;
        }
        if (i10 == 2 || i10 == 3) {
            return C9247v.c.f22458c;
        }
        if (i10 == 4) {
            return C9247v.c.f22459d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC11802i0.mo15312a());
    }
}
