package kb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import kb.v;

/* loaded from: classes2.dex */
public final class t extends kb.b {

    /* renamed from: a, reason: collision with root package name */
    private final v f20623a;

    /* renamed from: b, reason: collision with root package name */
    private final xb.b f20624b;

    /* renamed from: c, reason: collision with root package name */
    private final xb.a f20625c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f20626d;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private v f20627a;

        /* renamed from: b, reason: collision with root package name */
        private xb.b f20628b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f20629c;

        private b() {
            this.f20627a = null;
            this.f20628b = null;
            this.f20629c = null;
        }

        private xb.a b() {
            if (this.f20627a.c() == v.c.f20637d) {
                return xb.a.a(new byte[0]);
            }
            if (this.f20627a.c() == v.c.f20636c) {
                return xb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f20629c.intValue()).array());
            }
            if (this.f20627a.c() == v.c.f20635b) {
                return xb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f20629c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f20627a.c());
        }

        public t a() {
            v vVar = this.f20627a;
            if (vVar == null || this.f20628b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (vVar.b() != this.f20628b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f20627a.d() && this.f20629c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f20627a.d() && this.f20629c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t(this.f20627a, this.f20628b, b(), this.f20629c);
        }

        public b c(Integer num) {
            this.f20629c = num;
            return this;
        }

        public b d(xb.b bVar) {
            this.f20628b = bVar;
            return this;
        }

        public b e(v vVar) {
            this.f20627a = vVar;
            return this;
        }
    }

    private t(v vVar, xb.b bVar, xb.a aVar, Integer num) {
        this.f20623a = vVar;
        this.f20624b = bVar;
        this.f20625c = aVar;
        this.f20626d = num;
    }

    public static b a() {
        return new b();
    }
}
