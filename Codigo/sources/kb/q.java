package kb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q extends kb.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f20605a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20606b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20607c;

    /* renamed from: d, reason: collision with root package name */
    private final c f20608d;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f20609a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f20610b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f20611c;

        /* renamed from: d, reason: collision with root package name */
        private c f20612d;

        private b() {
            this.f20609a = null;
            this.f20610b = null;
            this.f20611c = null;
            this.f20612d = c.f20615d;
        }

        public q a() {
            Integer num = this.f20609a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f20612d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f20610b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f20611c != null) {
                return new q(num.intValue(), this.f20610b.intValue(), this.f20611c.intValue(), this.f20612d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.f20610b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f20609a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            if (i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f20611c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f20612d = cVar;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f20613b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f20614c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f20615d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f20616a;

        private c(String str) {
            this.f20616a = str;
        }

        public String toString() {
            return this.f20616a;
        }
    }

    private q(int i10, int i11, int i12, c cVar) {
        this.f20605a = i10;
        this.f20606b = i11;
        this.f20607c = i12;
        this.f20608d = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f20606b;
    }

    public int c() {
        return this.f20605a;
    }

    public int d() {
        return this.f20607c;
    }

    public c e() {
        return this.f20608d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c() == c() && qVar.b() == b() && qVar.d() == d() && qVar.e() == e();
    }

    public boolean f() {
        return this.f20608d != c.f20615d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f20605a), Integer.valueOf(this.f20606b), Integer.valueOf(this.f20607c), this.f20608d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f20608d + ", " + this.f20606b + "-byte IV, " + this.f20607c + "-byte tag, and " + this.f20605a + "-byte key)";
    }
}
