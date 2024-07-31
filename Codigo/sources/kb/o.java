package kb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import kb.q;

/* loaded from: classes2.dex */
public final class o extends kb.b {

    /* renamed from: a, reason: collision with root package name */
    private final q f20597a;

    /* renamed from: b, reason: collision with root package name */
    private final xb.b f20598b;

    /* renamed from: c, reason: collision with root package name */
    private final xb.a f20599c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f20600d;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private q f20601a;

        /* renamed from: b, reason: collision with root package name */
        private xb.b f20602b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f20603c;

        private b() {
            this.f20601a = null;
            this.f20602b = null;
            this.f20603c = null;
        }

        private xb.a b() {
            if (this.f20601a.e() == q.c.f20615d) {
                return xb.a.a(new byte[0]);
            }
            if (this.f20601a.e() == q.c.f20614c) {
                return xb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f20603c.intValue()).array());
            }
            if (this.f20601a.e() == q.c.f20613b) {
                return xb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f20603c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f20601a.e());
        }

        public o a() {
            q qVar = this.f20601a;
            if (qVar == null || this.f20602b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (qVar.c() != this.f20602b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f20601a.f() && this.f20603c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f20601a.f() && this.f20603c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new o(this.f20601a, this.f20602b, b(), this.f20603c);
        }

        public b c(Integer num) {
            this.f20603c = num;
            return this;
        }

        public b d(xb.b bVar) {
            this.f20602b = bVar;
            return this;
        }

        public b e(q qVar) {
            this.f20601a = qVar;
            return this;
        }
    }

    private o(q qVar, xb.b bVar, xb.a aVar, Integer num) {
        this.f20597a = qVar;
        this.f20598b = bVar;
        this.f20599c = aVar;
        this.f20600d = num;
    }

    public static b a() {
        return new b();
    }
}
