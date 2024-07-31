package p201kb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p201kb.C9247v;
import p441xb.C12413a;
import p441xb.C12414b;

/* renamed from: kb.t */
/* loaded from: classes2.dex */
public final class C9245t extends AbstractC9217b {

    /* renamed from: a */
    private final C9247v f22445a;

    /* renamed from: b */
    private final C12414b f22446b;

    /* renamed from: c */
    private final C12413a f22447c;

    /* renamed from: d */
    private final Integer f22448d;

    /* renamed from: kb.t$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private C9247v f22449a;

        /* renamed from: b */
        private C12414b f22450b;

        /* renamed from: c */
        private Integer f22451c;

        private b() {
            this.f22449a = null;
            this.f22450b = null;
            this.f22451c = null;
        }

        /* renamed from: b */
        private C12413a m27534b() {
            if (this.f22449a.m27552c() == C9247v.c.f22459d) {
                return C12413a.m40067a(new byte[0]);
            }
            if (this.f22449a.m27552c() == C9247v.c.f22458c) {
                return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f22451c.intValue()).array());
            }
            if (this.f22449a.m27552c() == C9247v.c.f22457b) {
                return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f22451c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f22449a.m27552c());
        }

        /* renamed from: a */
        public C9245t m27535a() {
            C9247v c9247v = this.f22449a;
            if (c9247v == null || this.f22450b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c9247v.m27551b() != this.f22450b.m40071b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f22449a.m27553d() && this.f22451c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f22449a.m27553d() && this.f22451c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C9245t(this.f22449a, this.f22450b, m27534b(), this.f22451c);
        }

        /* renamed from: c */
        public b m27536c(Integer num) {
            this.f22451c = num;
            return this;
        }

        /* renamed from: d */
        public b m27537d(C12414b c12414b) {
            this.f22450b = c12414b;
            return this;
        }

        /* renamed from: e */
        public b m27538e(C9247v c9247v) {
            this.f22449a = c9247v;
            return this;
        }
    }

    private C9245t(C9247v c9247v, C12414b c12414b, C12413a c12413a, Integer num) {
        this.f22445a = c9247v;
        this.f22446b = c12414b;
        this.f22447c = c12413a;
        this.f22448d = num;
    }

    /* renamed from: a */
    public static b m27533a() {
        return new b();
    }
}
