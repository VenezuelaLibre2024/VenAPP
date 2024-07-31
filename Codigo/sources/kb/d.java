package kb;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import jb.v;
import tb.b;

/* loaded from: classes2.dex */
public class d implements jb.w<jb.a, jb.a> {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f20543a = Logger.getLogger(d.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final d f20544b = new d();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b implements jb.a {

        /* renamed from: a, reason: collision with root package name */
        private final jb.v<jb.a> f20545a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f20546b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f20547c;

        private b(jb.v<jb.a> vVar) {
            b.a aVar;
            this.f20545a = vVar;
            if (vVar.i()) {
                tb.b a10 = com.google.crypto.tink.internal.g.b().a();
                tb.c a11 = com.google.crypto.tink.internal.f.a(vVar);
                this.f20546b = a10.a(a11, "aead", "encrypt");
                aVar = a10.a(a11, "aead", "decrypt");
            } else {
                aVar = com.google.crypto.tink.internal.f.f11289a;
                this.f20546b = aVar;
            }
            this.f20547c = aVar;
        }

        @Override // jb.a
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a10 = wb.f.a(this.f20545a.e().b(), this.f20545a.e().g().a(bArr, bArr2));
                this.f20546b.a(this.f20545a.e().d(), bArr.length);
                return a10;
            } catch (GeneralSecurityException e10) {
                this.f20546b.b();
                throw e10;
            }
        }

        @Override // jb.a
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c<jb.a> cVar : this.f20545a.f(copyOf)) {
                    try {
                        byte[] b10 = cVar.g().b(copyOfRange, bArr2);
                        this.f20547c.a(cVar.d(), copyOfRange.length);
                        return b10;
                    } catch (GeneralSecurityException e10) {
                        d.f20543a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (v.c<jb.a> cVar2 : this.f20545a.h()) {
                try {
                    byte[] b11 = cVar2.g().b(bArr, bArr2);
                    this.f20547c.a(cVar2.d(), bArr.length);
                    return b11;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f20547c.b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    d() {
    }

    public static void e() {
        jb.x.n(f20544b);
    }

    @Override // jb.w
    public Class<jb.a> b() {
        return jb.a.class;
    }

    @Override // jb.w
    public Class<jb.a> c() {
        return jb.a.class;
    }

    @Override // jb.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public jb.a a(jb.v<jb.a> vVar) {
        return new b(vVar);
    }
}
