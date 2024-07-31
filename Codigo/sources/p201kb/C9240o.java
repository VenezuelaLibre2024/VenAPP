package p201kb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p201kb.C9242q;
import p441xb.C12413a;
import p441xb.C12414b;

/* renamed from: kb.o */
/* loaded from: classes2.dex */
public final class C9240o extends AbstractC9217b {

    /* renamed from: a */
    private final C9242q f22419a;

    /* renamed from: b */
    private final C12414b f22420b;

    /* renamed from: c */
    private final C12413a f22421c;

    /* renamed from: d */
    private final Integer f22422d;

    /* renamed from: kb.o$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private C9242q f22423a;

        /* renamed from: b */
        private C12414b f22424b;

        /* renamed from: c */
        private Integer f22425c;

        private b() {
            this.f22423a = null;
            this.f22424b = null;
            this.f22425c = null;
        }

        /* renamed from: b */
        private C12413a m27502b() {
            if (this.f22423a.m27521e() == C9242q.c.f22437d) {
                return C12413a.m40067a(new byte[0]);
            }
            if (this.f22423a.m27521e() == C9242q.c.f22436c) {
                return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f22425c.intValue()).array());
            }
            if (this.f22423a.m27521e() == C9242q.c.f22435b) {
                return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f22425c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f22423a.m27521e());
        }

        /* renamed from: a */
        public C9240o m27503a() {
            C9242q c9242q = this.f22423a;
            if (c9242q == null || this.f22424b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c9242q.m27519c() != this.f22424b.m40071b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f22423a.m27522f() && this.f22425c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f22423a.m27522f() && this.f22425c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C9240o(this.f22423a, this.f22424b, m27502b(), this.f22425c);
        }

        /* renamed from: c */
        public b m27504c(Integer num) {
            this.f22425c = num;
            return this;
        }

        /* renamed from: d */
        public b m27505d(C12414b c12414b) {
            this.f22424b = c12414b;
            return this;
        }

        /* renamed from: e */
        public b m27506e(C9242q c9242q) {
            this.f22423a = c9242q;
            return this;
        }
    }

    private C9240o(C9242q c9242q, C12414b c12414b, C12413a c12413a, Integer num) {
        this.f22419a = c9242q;
        this.f22420b = c12414b;
        this.f22421c = c12413a;
        this.f22422d = num;
    }

    /* renamed from: a */
    public static b m27501a() {
        return new b();
    }
}
