package p332rb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: rb.d */
/* loaded from: classes2.dex */
public final class C10671d extends AbstractC10684q {

    /* renamed from: a */
    private final int f26976a;

    /* renamed from: b */
    private final int f26977b;

    /* renamed from: c */
    private final c f26978c;

    /* renamed from: rb.d$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private Integer f26979a;

        /* renamed from: b */
        private Integer f26980b;

        /* renamed from: c */
        private c f26981c;

        private b() {
            this.f26979a = null;
            this.f26980b = null;
            this.f26981c = c.f26985e;
        }

        /* renamed from: a */
        public C10671d m32485a() {
            Integer num = this.f26979a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f26980b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f26981c != null) {
                return new C10671d(num.intValue(), this.f26980b.intValue(), this.f26981c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        /* renamed from: b */
        public b m32486b(int i10) {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
            }
            this.f26979a = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: c */
        public b m32487c(int i10) {
            if (i10 >= 10 && 16 >= i10) {
                this.f26980b = Integer.valueOf(i10);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i10);
        }

        /* renamed from: d */
        public b m32488d(c cVar) {
            this.f26981c = cVar;
            return this;
        }
    }

    /* renamed from: rb.d$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: b */
        public static final c f26982b = new c("TINK");

        /* renamed from: c */
        public static final c f26983c = new c("CRUNCHY");

        /* renamed from: d */
        public static final c f26984d = new c("LEGACY");

        /* renamed from: e */
        public static final c f26985e = new c("NO_PREFIX");

        /* renamed from: a */
        private final String f26986a;

        private c(String str) {
            this.f26986a = str;
        }

        public String toString() {
            return this.f26986a;
        }
    }

    private C10671d(int i10, int i11, c cVar) {
        this.f26976a = i10;
        this.f26977b = i11;
        this.f26978c = cVar;
    }

    /* renamed from: a */
    public static b m32479a() {
        return new b();
    }

    /* renamed from: b */
    public int m32480b() {
        return this.f26977b;
    }

    /* renamed from: c */
    public int m32481c() {
        return this.f26976a;
    }

    /* renamed from: d */
    public int m32482d() {
        c cVar = this.f26978c;
        if (cVar == c.f26985e) {
            return m32480b();
        }
        if (cVar == c.f26982b || cVar == c.f26983c || cVar == c.f26984d) {
            return m32480b() + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    /* renamed from: e */
    public c m32483e() {
        return this.f26978c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10671d)) {
            return false;
        }
        C10671d c10671d = (C10671d) obj;
        return c10671d.m32481c() == m32481c() && c10671d.m32482d() == m32482d() && c10671d.m32483e() == m32483e();
    }

    /* renamed from: f */
    public boolean m32484f() {
        return this.f26978c != c.f26985e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26976a), Integer.valueOf(this.f26977b), this.f26978c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f26978c + ", " + this.f26977b + "-byte tags, and " + this.f26976a + "-byte key)";
    }
}
