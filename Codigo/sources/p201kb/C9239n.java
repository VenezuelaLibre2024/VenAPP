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
import p201kb.C9231i;
import p400vb.C11801i;
import p400vb.EnumC11802i0;
import p441xb.C12413a;
import p441xb.C12414b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kb.n */
/* loaded from: classes2.dex */
public final class C9239n {

    /* renamed from: a */
    private static final C12413a f22413a;

    /* renamed from: b */
    private static final AbstractC5939k<C9231i, C5944p> f22414b;

    /* renamed from: c */
    private static final AbstractC5938j<C5944p> f22415c;

    /* renamed from: d */
    private static final AbstractC5931c<C9227g, C5943o> f22416d;

    /* renamed from: e */
    private static final AbstractC5930b<C5943o> f22417e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kb.n$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22418a;

        static {
            int[] iArr = new int[EnumC11802i0.values().length];
            f22418a = iArr;
            try {
                iArr[EnumC11802i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22418a[EnumC11802i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22418a[EnumC11802i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22418a[EnumC11802i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C12413a m15290e = C5948t.m15290e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f22413a = m15290e;
        f22414b = AbstractC5939k.m15244a(new C9233j(), C9231i.class, C5944p.class);
        f22415c = AbstractC5938j.m15241a(new C9235k(), m15290e, C5944p.class);
        f22416d = AbstractC5931c.m15200a(new C9237l(), C9227g.class, C5943o.class);
        f22417e = AbstractC5930b.m15195a(new AbstractC5930b.b() { // from class: kb.m
            @Override // com.google.crypto.tink.internal.AbstractC5930b.b
            /* renamed from: a */
            public final AbstractC9015g mo15199a(InterfaceC5945q interfaceC5945q, C9033y c9033y) {
                C9227g m27497b;
                m27497b = C9239n.m27497b((C5943o) interfaceC5945q, c9033y);
                return m27497b;
            }
        }, m15290e, C5943o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C9227g m27497b(C5943o c5943o, C9033y c9033y) {
        if (!c5943o.m15269f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            C11801i m37482d0 = C11801i.m37482d0(c5943o.m15270g(), C5994p.m15932b());
            if (m37482d0.m37488b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C9227g.m27452a().m27457e(C9231i.m27478a().m27486c(m37482d0.m37486Z().size()).m27485b(m37482d0.m37487a0().m37512Y()).m27487d(16).m27488e(m27500e(c5943o.m15268e())).m27484a()).m27456d(C12414b.m40070a(m37482d0.m37486Z().m15502w(), C9033y.m26540b(c9033y))).m27455c(c5943o.m15266c()).m27454a();
        } catch (C5953b0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    /* renamed from: c */
    public static void m27498c() {
        m27499d(C5937i.m15233a());
    }

    /* renamed from: d */
    public static void m27499d(C5937i c5937i) {
        c5937i.m15240h(f22414b);
        c5937i.m15239g(f22415c);
        c5937i.m15238f(f22416d);
        c5937i.m15237e(f22417e);
    }

    /* renamed from: e */
    private static C9231i.c m27500e(EnumC11802i0 enumC11802i0) {
        int i10 = a.f22418a[enumC11802i0.ordinal()];
        if (i10 == 1) {
            return C9231i.c.f22398b;
        }
        if (i10 == 2 || i10 == 3) {
            return C9231i.c.f22399c;
        }
        if (i10 == 4) {
            return C9231i.c.f22400d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC11802i0.mo15312a());
    }
}
