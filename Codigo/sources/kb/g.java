package kb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import kb.i;

/* loaded from: classes2.dex */
public final class g extends kb.b {

    /* renamed from: a, reason: collision with root package name */
    private final i f20555a;

    /* renamed from: b, reason: collision with root package name */
    private final xb.b f20556b;

    /* renamed from: c, reason: collision with root package name */
    private final xb.a f20557c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f20558d;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private i f20559a;

        /* renamed from: b, reason: collision with root package name */
        private xb.b f20560b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f20561c;

        private b() {
            this.f20559a = null;
            this.f20560b = null;
            this.f20561c = null;
        }

        private xb.a b() {
            if (this.f20559a.e() == i.c.f20578d) {
                return xb.a.a(new byte[0]);
            }
            if (this.f20559a.e() == i.c.f20577c) {
                return xb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f20561c.intValue()).array());
            }
            if (this.f20559a.e() == i.c.f20576b) {
                return xb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f20561c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f20559a.e());
        }

        public g a() {
            i iVar = this.f20559a;
            if (iVar == null || this.f20560b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (iVar.c() != this.f20560b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f20559a.f() && this.f20561c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f20559a.f() && this.f20561c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new g(this.f20559a, this.f20560b, b(), this.f20561c);
        }

        public b c(Integer num) {
            this.f20561c = num;
            return this;
        }

        public b d(xb.b bVar) {
            this.f20560b = bVar;
            return this;
        }

        public b e(i iVar) {
            this.f20559a = iVar;
            return this;
        }
    }

    private g(i iVar, xb.b bVar, xb.a aVar, Integer num) {
        this.f20555a = iVar;
        this.f20556b = bVar;
        this.f20557c = aVar;
        this.f20558d = num;
    }

    public static b a() {
        return new b();
    }
}
