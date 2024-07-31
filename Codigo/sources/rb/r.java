package rb;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import jb.t;
import jb.v;
import jb.w;
import jb.x;
import tb.b;
import vb.i0;

/* loaded from: classes2.dex */
class r implements w<t, t> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f24919a = Logger.getLogger(r.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f24920b = {0};

    /* renamed from: c, reason: collision with root package name */
    private static final r f24921c = new r();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b implements t {

        /* renamed from: a, reason: collision with root package name */
        private final v<t> f24922a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f24923b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f24924c;

        private b(v<t> vVar) {
            b.a aVar;
            this.f24922a = vVar;
            if (vVar.i()) {
                tb.b a10 = com.google.crypto.tink.internal.g.b().a();
                tb.c a11 = com.google.crypto.tink.internal.f.a(vVar);
                this.f24923b = a10.a(a11, "mac", "compute");
                aVar = a10.a(a11, "mac", "verify");
            } else {
                aVar = com.google.crypto.tink.internal.f.f11289a;
                this.f24923b = aVar;
            }
            this.f24924c = aVar;
        }

        @Override // jb.t
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length <= 5) {
                this.f24924c.b();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (v.c<t> cVar : this.f24922a.f(copyOf)) {
                try {
                    cVar.g().a(copyOfRange, cVar.f().equals(i0.LEGACY) ? wb.f.a(bArr2, r.f24920b) : bArr2);
                    this.f24924c.a(cVar.d(), r3.length);
                    return;
                } catch (GeneralSecurityException e10) {
                    r.f24919a.info("tag prefix matches a key, but cannot verify: " + e10);
                }
            }
            for (v.c<t> cVar2 : this.f24922a.h()) {
                try {
                    cVar2.g().a(bArr, bArr2);
                    this.f24924c.a(cVar2.d(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f24924c.b();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // jb.t
        public byte[] b(byte[] bArr) {
            if (this.f24922a.e().f().equals(i0.LEGACY)) {
                bArr = wb.f.a(bArr, r.f24920b);
            }
            try {
                byte[] a10 = wb.f.a(this.f24922a.e().b(), this.f24922a.e().g().b(bArr));
                this.f24923b.a(this.f24922a.e().d(), bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f24923b.b();
                throw e10;
            }
        }
    }

    r() {
    }

    public static void f() {
        x.n(f24921c);
    }

    private void g(v<t> vVar) {
        Iterator<List<v.c<t>>> it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c<t> cVar : it.next()) {
                if (cVar.c() instanceof p) {
                    p pVar = (p) cVar.c();
                    xb.a a10 = xb.a.a(cVar.b());
                    if (!a10.equals(pVar.a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + pVar.b() + " has wrong output prefix (" + pVar.a() + ") instead of (" + a10 + ")");
                    }
                }
            }
        }
    }

    @Override // jb.w
    public Class<t> b() {
        return t.class;
    }

    @Override // jb.w
    public Class<t> c() {
        return t.class;
    }

    @Override // jb.w
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public t a(v<t> vVar) {
        g(vVar);
        return new b(vVar);
    }
}
