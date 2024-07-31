package p332rb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p332rb.C10679l;
import p441xb.C12413a;
import p441xb.C12414b;

/* renamed from: rb.i */
/* loaded from: classes2.dex */
public final class C10676i extends AbstractC10683p {

    /* renamed from: a */
    private final C10679l f26995a;

    /* renamed from: b */
    private final C12414b f26996b;

    /* renamed from: c */
    private final C12413a f26997c;

    /* renamed from: d */
    private final Integer f26998d;

    /* renamed from: rb.i$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        private C10679l f26999a;

        /* renamed from: b */
        private C12414b f27000b;

        /* renamed from: c */
        private Integer f27001c;

        private b() {
            this.f26999a = null;
            this.f27000b = null;
            this.f27001c = null;
        }

        /* renamed from: b */
        private C12413a m32498b() {
            if (this.f26999a.m32520f() == C10679l.d.f27022e) {
                return C12413a.m40067a(new byte[0]);
            }
            if (this.f26999a.m32520f() == C10679l.d.f27021d || this.f26999a.m32520f() == C10679l.d.f27020c) {
                return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f27001c.intValue()).array());
            }
            if (this.f26999a.m32520f() == C10679l.d.f27019b) {
                return C12413a.m40067a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f27001c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f26999a.m32520f());
        }

        /* renamed from: a */
        public C10676i m32499a() {
            C10679l c10679l = this.f26999a;
            if (c10679l == null || this.f27000b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c10679l.m32518d() != this.f27000b.m40071b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f26999a.m32521g() && this.f27001c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f26999a.m32521g() && this.f27001c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C10676i(this.f26999a, this.f27000b, m32498b(), this.f27001c);
        }

        /* renamed from: c */
        public b m32500c(Integer num) {
            this.f27001c = num;
            return this;
        }

        /* renamed from: d */
        public b m32501d(C12414b c12414b) {
            this.f27000b = c12414b;
            return this;
        }

        /* renamed from: e */
        public b m32502e(C10679l c10679l) {
            this.f26999a = c10679l;
            return this;
        }
    }

    private C10676i(C10679l c10679l, C12414b c12414b, C12413a c12413a, Integer num) {
        this.f26995a = c10679l;
        this.f26996b = c12414b;
        this.f26997c = c12413a;
        this.f26998d = num;
    }

    /* renamed from: c */
    public static b m32496c() {
        return new b();
    }

    @Override // p332rb.AbstractC10683p
    /* renamed from: a */
    public C12413a mo32459a() {
        return this.f26997c;
    }

    @Override // p332rb.AbstractC10683p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C10679l mo32460b() {
        return this.f26995a;
    }
}
