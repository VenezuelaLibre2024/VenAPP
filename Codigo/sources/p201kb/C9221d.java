package p201kb;

import com.google.crypto.tink.internal.C5934f;
import com.google.crypto.tink.internal.C5935g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p179jb.C9030v;
import p179jb.C9032x;
import p179jb.InterfaceC9009a;
import p179jb.InterfaceC9031w;
import p366tb.C11236c;
import p366tb.InterfaceC11235b;
import p419wb.C12134f;

/* renamed from: kb.d */
/* loaded from: classes2.dex */
public class C9221d implements InterfaceC9031w<InterfaceC9009a, InterfaceC9009a> {

    /* renamed from: a */
    private static final Logger f22365a = Logger.getLogger(C9221d.class.getName());

    /* renamed from: b */
    private static final C9221d f22366b = new C9221d();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kb.d$b */
    /* loaded from: classes2.dex */
    public static class b implements InterfaceC9009a {

        /* renamed from: a */
        private final C9030v<InterfaceC9009a> f22367a;

        /* renamed from: b */
        private final InterfaceC11235b.a f22368b;

        /* renamed from: c */
        private final InterfaceC11235b.a f22369c;

        private b(C9030v<InterfaceC9009a> c9030v) {
            InterfaceC11235b.a aVar;
            this.f22367a = c9030v;
            if (c9030v.m26506i()) {
                InterfaceC11235b m15225a = C5935g.m15224b().m15225a();
                C11236c m15219a = C5934f.m15219a(c9030v);
                this.f22368b = m15225a.mo15226a(m15219a, "aead", "encrypt");
                aVar = m15225a.mo15226a(m15219a, "aead", "decrypt");
            } else {
                aVar = C5934f.f12504a;
                this.f22368b = aVar;
            }
            this.f22369c = aVar;
        }

        @Override // p179jb.InterfaceC9009a
        /* renamed from: a */
        public byte[] mo26424a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] m38881a = C12134f.m38881a(this.f22367a.m26502e().m26513b(), this.f22367a.m26502e().m26518g().mo26424a(bArr, bArr2));
                this.f22368b.mo15222a(this.f22367a.m26502e().m26515d(), bArr.length);
                return m38881a;
            } catch (GeneralSecurityException e10) {
                this.f22368b.mo15223b();
                throw e10;
            }
        }

        @Override // p179jb.InterfaceC9009a
        /* renamed from: b */
        public byte[] mo26425b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C9030v.c<InterfaceC9009a> cVar : this.f22367a.m26503f(copyOf)) {
                    try {
                        byte[] mo26425b = cVar.m26518g().mo26425b(copyOfRange, bArr2);
                        this.f22369c.mo15222a(cVar.m26515d(), copyOfRange.length);
                        return mo26425b;
                    } catch (GeneralSecurityException e10) {
                        C9221d.f22365a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (C9030v.c<InterfaceC9009a> cVar2 : this.f22367a.m26505h()) {
                try {
                    byte[] mo26425b2 = cVar2.m26518g().mo26425b(bArr, bArr2);
                    this.f22369c.mo15222a(cVar2.m26515d(), bArr.length);
                    return mo26425b2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f22369c.mo15223b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    C9221d() {
    }

    /* renamed from: e */
    public static void m27413e() {
        C9032x.m26537n(f22366b);
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: b */
    public Class<InterfaceC9009a> mo26522b() {
        return InterfaceC9009a.class;
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: c */
    public Class<InterfaceC9009a> mo26523c() {
        return InterfaceC9009a.class;
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC9009a mo26521a(C9030v<InterfaceC9009a> c9030v) {
        return new b(c9030v);
    }
}
