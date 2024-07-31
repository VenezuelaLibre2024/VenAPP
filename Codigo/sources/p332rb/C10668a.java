package p332rb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p332rb.C10671d;
import p441xb.C12413a;
import p441xb.C12414b;

/* renamed from: rb.a */
/* loaded from: classes2.dex */
public final class C10668a extends AbstractC10683p {

    /* renamed from: a */
    private final C10671d f26967a;

    /* renamed from: b */
    private final C12414b f26968b;

    /* renamed from: c */
    private final C12413a f26969c;

    /* renamed from: d */
    private final Integer f26970d;

    /* renamed from: rb.a$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private C10671d f26971a;

        /* renamed from: b */
        private C12414b f26972b;

        /* renamed from: c */
        private Integer f26973c;

        private b() {
            this.f26971a = null;
            this.f26972b = null;
            this.f26973c = null;
        }

        /* renamed from: b */
        private C12413a m32462b() {
            if (this.f26971a.m32483e() == C10671d.c.f26985e) {
                return C12413a.m40067a(new byte[0]);
            }
            if (this.f26971a.m32483e() == C10671d.c.f26984d || this.f26971a.m32483e() == C10671d.c.f26983c) {
                return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f26973c.intValue()).array());
            }
            if (this.f26971a.m32483e() == C10671d.c.f26982b) {
                return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f26973c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f26971a.m32483e());
        }

        /* renamed from: a */
        public C10668a m32463a() {
            C10671d c10671d = this.f26971a;
            if (c10671d == null || this.f26972b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c10671d.m32481c() != this.f26972b.m40071b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f26971a.m32484f() && this.f26973c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f26971a.m32484f() && this.f26973c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C10668a(this.f26971a, this.f26972b, m32462b(), this.f26973c);
        }

        /* renamed from: c */
        public b m32464c(C12414b c12414b) {
            this.f26972b = c12414b;
            return this;
        }

        /* renamed from: d */
        public b m32465d(Integer num) {
            this.f26973c = num;
            return this;
        }

        /* renamed from: e */
        public b m32466e(C10671d c10671d) {
            this.f26971a = c10671d;
            return this;
        }
    }

    private C10668a(C10671d c10671d, C12414b c12414b, C12413a c12413a, Integer num) {
        this.f26967a = c10671d;
        this.f26968b = c12414b;
        this.f26969c = c12413a;
        this.f26970d = num;
    }

    /* renamed from: c */
    public static b m32458c() {
        return new b();
    }

    @Override // p332rb.AbstractC10683p
    /* renamed from: a */
    public C12413a mo32459a() {
        return this.f26969c;
    }

    @Override // p332rb.AbstractC10683p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C10671d mo32460b() {
        return this.f26967a;
    }
}
