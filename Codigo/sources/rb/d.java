package rb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f24860a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24861b;

    /* renamed from: c, reason: collision with root package name */
    private final c f24862c;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f24863a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f24864b;

        /* renamed from: c, reason: collision with root package name */
        private c f24865c;

        private b() {
            this.f24863a = null;
            this.f24864b = null;
            this.f24865c = c.f24869e;
        }

        public d a() {
            Integer num = this.f24863a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f24864b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f24865c != null) {
                return new d(num.intValue(), this.f24864b.intValue(), this.f24865c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i10) {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f24863a = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) {
            if (i10 >= 10 && 16 >= i10) {
                this.f24864b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        public b d(c cVar) {
            this.f24865c = cVar;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f24866b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f24867c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f24868d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f24869e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f24870a;

        private c(String str) {
            this.f24870a = str;
        }

        public String toString() {
            return this.f24870a;
        }
    }

    private d(int i10, int i11, c cVar) {
        this.f24860a = i10;
        this.f24861b = i11;
        this.f24862c = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f24861b;
    }

    public int c() {
        return this.f24860a;
    }

    public int d() {
        c cVar = this.f24862c;
        if (cVar == c.f24869e) {
            return b();
        }
        if (cVar == c.f24866b || cVar == c.f24867c || cVar == c.f24868d) {
            return b() + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public c e() {
        return this.f24862c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.c() == c() && dVar.d() == d() && dVar.e() == e();
    }

    public boolean f() {
        return this.f24862c != c.f24869e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24860a), Integer.valueOf(this.f24861b), this.f24862c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f24862c + ", " + this.f24861b + "-byte tags, and " + this.f24860a + "-byte key)";
    }
}
