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
import p201kb.C9232i0;
import p400vb.C11806k0;
import p400vb.EnumC11802i0;
import p441xb.C12413a;
import p441xb.C12414b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kb.k0 */
/* loaded from: classes2.dex */
public final class C9236k0 {

    /* renamed from: a */
    private static final C12413a f22407a;

    /* renamed from: b */
    private static final AbstractC5939k<C9232i0, C5944p> f22408b;

    /* renamed from: c */
    private static final AbstractC5938j<C5944p> f22409c;

    /* renamed from: d */
    private static final AbstractC5931c<C9228g0, C5943o> f22410d;

    /* renamed from: e */
    private static final AbstractC5930b<C5943o> f22411e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kb.k0$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22412a;

        static {
            int[] iArr = new int[EnumC11802i0.values().length];
            f22412a = iArr;
            try {
                iArr[EnumC11802i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22412a[EnumC11802i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22412a[EnumC11802i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22412a[EnumC11802i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C12413a m15290e = C5948t.m15290e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f22407a = m15290e;
        f22408b = AbstractC5939k.m15244a(new C9233j(), C9232i0.class, C5944p.class);
        f22409c = AbstractC5938j.m15241a(new C9235k(), m15290e, C5944p.class);
        f22410d = AbstractC5931c.m15200a(new C9237l(), C9228g0.class, C5943o.class);
        f22411e = AbstractC5930b.m15195a(new AbstractC5930b.b() { // from class: kb.j0
            @Override // com.google.crypto.tink.internal.AbstractC5930b.b
            /* renamed from: a */
            public final AbstractC9015g mo15199a(InterfaceC5945q interfaceC5945q, C9033y c9033y) {
                C9228g0 m27492b;
                m27492b = C9236k0.m27492b((C5943o) interfaceC5945q, c9033y);
                return m27492b;
            }
        }, m15290e, C5943o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C9228g0 m27492b(C5943o c5943o, C9033y c9033y) {
        if (!c5943o.m15269f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            C11806k0 m37518b0 = C11806k0.m37518b0(c5943o.m15270g(), C5994p.m15932b());
            if (m37518b0.m37522Z() == 0) {
                return C9228g0.m27458a(m27495e(c5943o.m15268e()), C12414b.m40070a(m37518b0.m37521Y().m15502w(), C9033y.m26540b(c9033y)), c5943o.m15266c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (C5953b0 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    /* renamed from: c */
    public static void m27493c() {
        m27494d(C5937i.m15233a());
    }

    /* renamed from: d */
    public static void m27494d(C5937i c5937i) {
        c5937i.m15240h(f22408b);
        c5937i.m15239g(f22409c);
        c5937i.m15238f(f22410d);
        c5937i.m15237e(f22411e);
    }

    /* renamed from: e */
    private static C9232i0.a m27495e(EnumC11802i0 enumC11802i0) {
        int i10 = a.f22412a[enumC11802i0.ordinal()];
        if (i10 == 1) {
            return C9232i0.a.f22403b;
        }
        if (i10 == 2 || i10 == 3) {
            return C9232i0.a.f22404c;
        }
        if (i10 == 4) {
            return C9232i0.a.f22405d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC11802i0.mo15312a());
    }
}
