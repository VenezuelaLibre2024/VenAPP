package rb;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import rb.d;

/* loaded from: classes2.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    private final d f24851a;

    /* renamed from: b, reason: collision with root package name */
    private final xb.b f24852b;

    /* renamed from: c, reason: collision with root package name */
    private final xb.a f24853c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f24854d;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private d f24855a;

        /* renamed from: b, reason: collision with root package name */
        private xb.b f24856b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f24857c;

        private b() {
            this.f24855a = null;
            this.f24856b = null;
            this.f24857c = null;
        }

        private xb.a b() {
            if (this.f24855a.e() == d.c.f24869e) {
                return xb.a.a(new byte[0]);
            }
            if (this.f24855a.e() == d.c.f24868d || this.f24855a.e() == d.c.f24867c) {
                return xb.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f24857c.intValue()).array());
            }
            if (this.f24855a.e() == d.c.f24866b) {
                return xb.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f24857c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f24855a.e());
        }

        public a a() {
            d dVar = this.f24855a;
            if (dVar == null || this.f24856b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (dVar.c() != this.f24856b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f24855a.f() && this.f24857c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f24855a.f() && this.f24857c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f24855a, this.f24856b, b(), this.f24857c);
        }

        public b c(xb.b bVar) {
            this.f24856b = bVar;
            return this;
        }

        public b d(Integer num) {
            this.f24857c = num;
            return this;
        }

        public b e(d dVar) {
            this.f24855a = dVar;
            return this;
        }
    }

    private a(d dVar, xb.b bVar, xb.a aVar, Integer num) {
        this.f24851a = dVar;
        this.f24852b = bVar;
        this.f24853c = aVar;
        this.f24854d = num;
    }

    public static b c() {
        return new b();
    }

    @Override // rb.p
    public xb.a a() {
        return this.f24853c;
    }

    @Override // rb.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d b() {
        return this.f24851a;
    }
}
