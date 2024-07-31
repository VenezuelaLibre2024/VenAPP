package rb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import rb.l;

/* loaded from: classes2.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    private final l f24879a;

    /* renamed from: b, reason: collision with root package name */
    private final xb.b f24880b;

    /* renamed from: c, reason: collision with root package name */
    private final xb.a f24881c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f24882d;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private l f24883a;

        /* renamed from: b, reason: collision with root package name */
        private xb.b f24884b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f24885c;

        private b() {
            this.f24883a = null;
            this.f24884b = null;
            this.f24885c = null;
        }

        private xb.a b() {
            if (this.f24883a.f() == l.d.f24906e) {
                return xb.a.a(new byte[0]);
            }
            if (this.f24883a.f() == l.d.f24905d || this.f24883a.f() == l.d.f24904c) {
                return xb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f24885c.intValue()).array());
            }
            if (this.f24883a.f() == l.d.f24903b) {
                return xb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f24885c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f24883a.f());
        }

        public i a() {
            l lVar = this.f24883a;
            if (lVar == null || this.f24884b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (lVar.d() != this.f24884b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f24883a.g() && this.f24885c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f24883a.g() && this.f24885c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f24883a, this.f24884b, b(), this.f24885c);
        }

        public b c(Integer num) {
            this.f24885c = num;
            return this;
        }

        public b d(xb.b bVar) {
            this.f24884b = bVar;
            return this;
        }

        public b e(l lVar) {
            this.f24883a = lVar;
            return this;
        }
    }

    private i(l lVar, xb.b bVar, xb.a aVar, Integer num) {
        this.f24879a = lVar;
        this.f24880b = bVar;
        this.f24881c = aVar;
        this.f24882d = num;
    }

    public static b c() {
        return new b();
    }

    @Override // rb.p
    public xb.a a() {
        return this.f24881c;
    }

    @Override // rb.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l b() {
        return this.f24879a;
    }
}
