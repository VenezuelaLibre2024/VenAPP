package rb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class l extends q {

    /* renamed from: a, reason: collision with root package name */
    private final int f24889a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24890b;

    /* renamed from: c, reason: collision with root package name */
    private final d f24891c;

    /* renamed from: d, reason: collision with root package name */
    private final c f24892d;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f24893a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f24894b;

        /* renamed from: c, reason: collision with root package name */
        private c f24895c;

        /* renamed from: d, reason: collision with root package name */
        private d f24896d;

        private b() {
            this.f24893a = null;
            this.f24894b = null;
            this.f24895c = null;
            this.f24896d = d.f24906e;
        }

        private static void f(int i10, c cVar) {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.f24897b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f24898c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f24899d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f24900e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f24901f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        public l a() {
            Integer num = this.f24893a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f24894b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f24895c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f24896d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f24893a));
            }
            f(this.f24894b.intValue(), this.f24895c);
            return new l(this.f24893a.intValue(), this.f24894b.intValue(), this.f24896d, this.f24895c);
        }

        public b b(c cVar) {
            this.f24895c = cVar;
            return this;
        }

        public b c(int i10) {
            this.f24893a = Integer.valueOf(i10);
            return this;
        }

        public b d(int i10) {
            this.f24894b = Integer.valueOf(i10);
            return this;
        }

        public b e(d dVar) {
            this.f24896d = dVar;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f24897b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f24898c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f24899d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f24900e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f24901f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        private final String f24902a;

        private c(String str) {
            this.f24902a = str;
        }

        public String toString() {
            return this.f24902a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f24903b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f24904c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f24905d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f24906e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f24907a;

        private d(String str) {
            this.f24907a = str;
        }

        public String toString() {
            return this.f24907a;
        }
    }

    private l(int i10, int i11, d dVar, c cVar) {
        this.f24889a = i10;
        this.f24890b = i11;
        this.f24891c = dVar;
        this.f24892d = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f24890b;
    }

    public c c() {
        return this.f24892d;
    }

    public int d() {
        return this.f24889a;
    }

    public int e() {
        d dVar = this.f24891c;
        if (dVar == d.f24906e) {
            return b();
        }
        if (dVar == d.f24903b || dVar == d.f24904c || dVar == d.f24905d) {
            return b() + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.d() == d() && lVar.e() == e() && lVar.f() == f() && lVar.c() == c();
    }

    public d f() {
        return this.f24891c;
    }

    public boolean g() {
        return this.f24891c != d.f24906e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f24889a), Integer.valueOf(this.f24890b), this.f24891c, this.f24892d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f24891c + ", hashType: " + this.f24892d + ", " + this.f24890b + "-byte tags, and " + this.f24889a + "-byte key)";
    }
}
