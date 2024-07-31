package p332rb;

import com.google.crypto.tink.internal.C5934f;
import com.google.crypto.tink.internal.C5935g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import p179jb.C9030v;
import p179jb.C9032x;
import p179jb.InterfaceC9028t;
import p179jb.InterfaceC9031w;
import p366tb.C11236c;
import p366tb.InterfaceC11235b;
import p400vb.EnumC11802i0;
import p419wb.C12134f;
import p441xb.C12413a;

/* renamed from: rb.r */
/* loaded from: classes2.dex */
class C10685r implements InterfaceC9031w<InterfaceC9028t, InterfaceC9028t> {

    /* renamed from: a */
    private static final Logger f27035a = Logger.getLogger(C10685r.class.getName());

    /* renamed from: b */
    private static final byte[] f27036b = {0};

    /* renamed from: c */
    private static final C10685r f27037c = new C10685r();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rb.r$b */
    /* loaded from: classes2.dex */
    public static class b implements InterfaceC9028t {

        /* renamed from: a */
        private final C9030v<InterfaceC9028t> f27038a;

        /* renamed from: b */
        private final InterfaceC11235b.a f27039b;

        /* renamed from: c */
        private final InterfaceC11235b.a f27040c;

        private b(C9030v<InterfaceC9028t> c9030v) {
            InterfaceC11235b.a aVar;
            this.f27038a = c9030v;
            if (c9030v.m26506i()) {
                InterfaceC11235b m15225a = C5935g.m15224b().m15225a();
                C11236c m15219a = C5934f.m15219a(c9030v);
                this.f27039b = m15225a.mo15226a(m15219a, "mac", "compute");
                aVar = m15225a.mo15226a(m15219a, "mac", "verify");
            } else {
                aVar = C5934f.f12504a;
                this.f27039b = aVar;
            }
            this.f27040c = aVar;
        }

        @Override // p179jb.InterfaceC9028t
        /* renamed from: a */
        public void mo26495a(byte[] bArr, byte[] bArr2) {
            if (bArr.length <= 5) {
                this.f27040c.mo15223b();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (C9030v.c<InterfaceC9028t> cVar : this.f27038a.m26503f(copyOf)) {
                try {
                    cVar.m26518g().mo26495a(copyOfRange, cVar.m26517f().equals(EnumC11802i0.LEGACY) ? C12134f.m38881a(bArr2, C10685r.f27036b) : bArr2);
                    this.f27040c.mo15222a(cVar.m26515d(), r3.length);
                    return;
                } catch (GeneralSecurityException e10) {
                    C10685r.f27035a.info("tag prefix matches a key, but cannot verify: " + e10);
                }
            }
            for (C9030v.c<InterfaceC9028t> cVar2 : this.f27038a.m26505h()) {
                try {
                    cVar2.m26518g().mo26495a(bArr, bArr2);
                    this.f27040c.mo15222a(cVar2.m26515d(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f27040c.mo15223b();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // p179jb.InterfaceC9028t
        /* renamed from: b */
        public byte[] mo26496b(byte[] bArr) {
            if (this.f27038a.m26502e().m26517f().equals(EnumC11802i0.LEGACY)) {
                bArr = C12134f.m38881a(bArr, C10685r.f27036b);
            }
            try {
                byte[] m38881a = C12134f.m38881a(this.f27038a.m26502e().m26513b(), this.f27038a.m26502e().m26518g().mo26496b(bArr));
                this.f27039b.mo15222a(this.f27038a.m26502e().m26515d(), bArr.length);
                return m38881a;
            } catch (GeneralSecurityException e10) {
                this.f27039b.mo15223b();
                throw e10;
            }
        }
    }

    C10685r() {
    }

    /* renamed from: f */
    public static void m32538f() {
        C9032x.m26537n(f27037c);
    }

    /* renamed from: g */
    private void m32539g(C9030v<InterfaceC9028t> c9030v) {
        Iterator<List<C9030v.c<InterfaceC9028t>>> it = c9030v.m26500c().iterator();
        while (it.hasNext()) {
            for (C9030v.c<InterfaceC9028t> cVar : it.next()) {
                if (cVar.m26514c() instanceof AbstractC10683p) {
                    AbstractC10683p abstractC10683p = (AbstractC10683p) cVar.m26514c();
                    C12413a m40067a = C12413a.m40067a(cVar.m26513b());
                    if (!m40067a.equals(abstractC10683p.mo32459a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + abstractC10683p.mo32460b() + " has wrong output prefix (" + abstractC10683p.mo32459a() + ") instead of (" + m40067a + ")");
                    }
                }
            }
        }
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: b */
    public Class<InterfaceC9028t> mo26522b() {
        return InterfaceC9028t.class;
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: c */
    public Class<InterfaceC9028t> mo26523c() {
        return InterfaceC9028t.class;
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InterfaceC9028t mo26521a(C9030v<InterfaceC9028t> c9030v) {
        m32539g(c9030v);
        return new b(c9030v);
    }
}
