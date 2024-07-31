package p201kb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p201kb.C9231i;
import p441xb.C12413a;
import p441xb.C12414b;

/* renamed from: kb.g */
/* loaded from: classes2.dex */
public final class C9227g extends AbstractC9217b {

    /* renamed from: a */
    private final C9231i f22377a;

    /* renamed from: b */
    private final C12414b f22378b;

    /* renamed from: c */
    private final C12413a f22379c;

    /* renamed from: d */
    private final Integer f22380d;

    /* renamed from: kb.g$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private C9231i f22381a;

        /* renamed from: b */
        private C12414b f22382b;

        /* renamed from: c */
        private Integer f22383c;

        private b() {
            this.f22381a = null;
            this.f22382b = null;
            this.f22383c = null;
        }

        /* renamed from: b */
        private C12413a m27453b() {
            if (this.f22381a.m27482e() == C9231i.c.f22400d) {
                return C12413a.m40067a(new byte[0]);
            }
            if (this.f22381a.m27482e() == C9231i.c.f22399c) {
                return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f22383c.intValue()).array());
            }
            if (this.f22381a.m27482e() == C9231i.c.f22398b) {
                return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f22383c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f22381a.m27482e());
        }

        /* renamed from: a */
        public C9227g m27454a() {
            C9231i c9231i = this.f22381a;
            if (c9231i == null || this.f22382b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c9231i.m27480c() != this.f22382b.m40071b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f22381a.m27483f() && this.f22383c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f22381a.m27483f() && this.f22383c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C9227g(this.f22381a, this.f22382b, m27453b(), this.f22383c);
        }

        /* renamed from: c */
        public b m27455c(Integer num) {
            this.f22383c = num;
            return this;
        }

        /* renamed from: d */
        public b m27456d(C12414b c12414b) {
            this.f22382b = c12414b;
            return this;
        }

        /* renamed from: e */
        public b m27457e(C9231i c9231i) {
            this.f22381a = c9231i;
            return this;
        }
    }

    private C9227g(C9231i c9231i, C12414b c12414b, C12413a c12413a, Integer num) {
        this.f22377a = c9231i;
        this.f22378b = c12414b;
        this.f22379c = c12413a;
        this.f22380d = num;
    }

    /* renamed from: a */
    public static b m27452a() {
        return new b();
    }
}
