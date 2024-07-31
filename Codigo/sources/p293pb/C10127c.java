package p293pb;

import com.google.crypto.tink.internal.C5934f;
import com.google.crypto.tink.internal.C5935g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import p179jb.C9030v;
import p179jb.C9032x;
import p179jb.InterfaceC9013e;
import p179jb.InterfaceC9031w;
import p366tb.C11236c;
import p366tb.InterfaceC11235b;
import p419wb.C12134f;

/* renamed from: pb.c */
/* loaded from: classes2.dex */
public class C10127c implements InterfaceC9031w<InterfaceC9013e, InterfaceC9013e> {

    /* renamed from: a */
    private static final Logger f24884a = Logger.getLogger(C10127c.class.getName());

    /* renamed from: b */
    private static final C10127c f24885b = new C10127c();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pb.c$a */
    /* loaded from: classes2.dex */
    public static class a implements InterfaceC9013e {

        /* renamed from: a */
        private final C9030v<InterfaceC9013e> f24886a;

        /* renamed from: b */
        private final InterfaceC11235b.a f24887b;

        /* renamed from: c */
        private final InterfaceC11235b.a f24888c;

        public a(C9030v<InterfaceC9013e> c9030v) {
            InterfaceC11235b.a aVar;
            this.f24886a = c9030v;
            if (c9030v.m26506i()) {
                InterfaceC11235b m15225a = C5935g.m15224b().m15225a();
                C11236c m15219a = C5934f.m15219a(c9030v);
                this.f24887b = m15225a.mo15226a(m15219a, "daead", "encrypt");
                aVar = m15225a.mo15226a(m15219a, "daead", "decrypt");
            } else {
                aVar = C5934f.f12504a;
                this.f24887b = aVar;
            }
            this.f24888c = aVar;
        }

        @Override // p179jb.InterfaceC9013e
        /* renamed from: a */
        public byte[] mo26431a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] m38881a = C12134f.m38881a(this.f24886a.m26502e().m26513b(), this.f24886a.m26502e().m26518g().mo26431a(bArr, bArr2));
                this.f24887b.mo15222a(this.f24886a.m26502e().m26515d(), bArr.length);
                return m38881a;
            } catch (GeneralSecurityException e10) {
                this.f24887b.mo15223b();
                throw e10;
            }
        }

        @Override // p179jb.InterfaceC9013e
        /* renamed from: b */
        public byte[] mo26432b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (C9030v.c<InterfaceC9013e> cVar : this.f24886a.m26503f(copyOf)) {
                    try {
                        byte[] mo26432b = cVar.m26518g().mo26432b(copyOfRange, bArr2);
                        this.f24888c.mo15222a(cVar.m26515d(), copyOfRange.length);
                        return mo26432b;
                    } catch (GeneralSecurityException e10) {
                        C10127c.f24884a.info("ciphertext prefix matches a key, but cannot decrypt: " + e10);
                    }
                }
            }
            for (C9030v.c<InterfaceC9013e> cVar2 : this.f24886a.m26505h()) {
                try {
                    byte[] mo26432b2 = cVar2.m26518g().mo26432b(bArr, bArr2);
                    this.f24888c.mo15222a(cVar2.m26515d(), bArr.length);
                    return mo26432b2;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f24888c.mo15223b();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    C10127c() {
    }

    /* renamed from: e */
    public static void m30253e() {
        C9032x.m26537n(f24885b);
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: b */
    public Class<InterfaceC9013e> mo26522b() {
        return InterfaceC9013e.class;
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: c */
    public Class<InterfaceC9013e> mo26523c() {
        return InterfaceC9013e.class;
    }

    @Override // p179jb.InterfaceC9031w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC9013e mo26521a(C9030v<InterfaceC9013e> c9030v) {
        return new a(c9030v);
    }
}
