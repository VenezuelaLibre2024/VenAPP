package kb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class i extends kb.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f20568a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20569b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20570c;

    /* renamed from: d, reason: collision with root package name */
    private final c f20571d;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f20572a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f20573b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f20574c;

        /* renamed from: d, reason: collision with root package name */
        private c f20575d;

        private b() {
            this.f20572a = null;
            this.f20573b = null;
            this.f20574c = null;
            this.f20575d = c.f20578d;
        }

        public i a() {
            Integer num = this.f20572a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f20573b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f20575d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f20574c != null) {
                return new i(num.intValue(), this.f20573b.intValue(), this.f20574c.intValue(), this.f20575d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i10) {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f20573b = Integer.valueOf(i10);
            return this;
        }

        public b c(int i10) {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f20572a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f20574c = Integer.valueOf(i10);
            return this;
        }

        public b e(c cVar) {
            this.f20575d = cVar;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f20576b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f20577c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f20578d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f20579a;

        private c(String str) {
            this.f20579a = str;
        }

        public String toString() {
            return this.f20579a;
        }
    }

    private i(int i10, int i11, int i12, c cVar) {
        this.f20568a = i10;
        this.f20569b = i11;
        this.f20570c = i12;
        this.f20571d = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f20569b;
    }

    public int c() {
        return this.f20568a;
    }

    public int d() {
        return this.f20570c;
    }

    public c e() {
        return this.f20571d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return iVar.c() == c() && iVar.b() == b() && iVar.d() == d() && iVar.e() == e();
    }

    public boolean f() {
        return this.f20571d != c.f20578d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f20568a), Integer.valueOf(this.f20569b), Integer.valueOf(this.f20570c), this.f20571d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f20571d + ", " + this.f20569b + "-byte IV, " + this.f20570c + "-byte tag, and " + this.f20568a + "-byte key)";
    }
}
