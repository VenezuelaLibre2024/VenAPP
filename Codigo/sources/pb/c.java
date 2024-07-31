package pb;

import com.google.crypto.tink.internal.f;
import com.google.crypto.tink.internal.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import jb.e;
import jb.v;
import jb.w;
import jb.x;
import tb.b;

/* loaded from: classes2.dex */
public class c implements w<e, e> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f22951a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final c f22952b = new c();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        private final v<e> f22953a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f22954b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f22955c;

        public a(v<e> vVar) {
            b.a aVar;
            this.f22953a = vVar;
            if (vVar.i()) {
                tb.b a10 = g.b().a();
                tb.c a11 = f.a(vVar);
                this.f22954b = a10.a(a11, "daead", "encrypt");
                aVar = a10.a(a11, "daead", "decrypt");
            } else {
                aVar = f.f11289a;
                this.f22954b = aVar;
            }
            this.f22955c = aVar;
        }

        @Override // jb.e
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a10 = wb.f.a(this.f22953a.e().b(), this.f22953a.e().g().a(bArr, bArr2));
                this.f22954b.a(this.f22953a.e().d(), bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f22954b.b();
                throw e10;
            }
        }

        @Override // jb.e
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c<e> cVar : this.f22953a.f(copyOf)) {
                    try {
                        byte[] b10 = cVar.g().b(copyOfRange, bArr2);
                        this.f22955c.a(cVar.d(), copyOfRange.length);
                        return b10;
                    } catch (GeneralSecurityException e10) {
                        c.f22951a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (v.c<e> cVar2 : this.f22953a.h()) {
                try {
                    byte[] b11 = cVar2.g().b(bArr, bArr2);
                    this.f22955c.a(cVar2.d(), bArr.length);
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f22955c.b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    c() {
    }

    public static void e() {
        x.n(f22952b);
    }

    @Override // jb.w
    public Class<e> b() {
        return e.class;
    }

    @Override // jb.w
    public Class<e> c() {
        return e.class;
    }

    @Override // jb.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public e a(v<e> vVar) {
        return new a(vVar);
    }
}
