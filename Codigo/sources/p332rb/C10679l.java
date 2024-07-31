package p332rb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: rb.l */
/* loaded from: classes2.dex */
public final class C10679l extends AbstractC10684q {

    /* renamed from: a */
    private final int f27005a;

    /* renamed from: b */
    private final int f27006b;

    /* renamed from: c */
    private final d f27007c;

    /* renamed from: d */
    private final c f27008d;

    /* renamed from: rb.l$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private Integer f27009a;

        /* renamed from: b */
        private Integer f27010b;

        /* renamed from: c */
        private c f27011c;

        /* renamed from: d */
        private d f27012d;

        private b() {
            this.f27009a = null;
            this.f27010b = null;
            this.f27011c = null;
            this.f27012d = d.f27022e;
        }

        /* renamed from: f */
        private static void m32522f(int i10, c cVar) {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            if (cVar == c.f27013b) {
                if (i10 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f27014c) {
                if (i10 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i10)));
                }
                return;
            }
            if (cVar == c.f27015d) {
                if (i10 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i10)));
                }
            } else if (cVar == c.f27016e) {
                if (i10 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i10)));
                }
            } else {
                if (cVar != c.f27017f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i10 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i10)));
                }
            }
        }

        /* renamed from: a */
        public C10679l m32523a() {
            Integer num = this.f27009a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f27010b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f27011c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f27012d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f27009a));
            }
            m32522f(this.f27010b.intValue(), this.f27011c);
            return new C10679l(this.f27009a.intValue(), this.f27010b.intValue(), this.f27012d, this.f27011c);
        }

        /* renamed from: b */
        public b m32524b(c cVar) {
            this.f27011c = cVar;
            return this;
        }

        /* renamed from: c */
        public b m32525c(int i10) {
            this.f27009a = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: d */
        public b m32526d(int i10) {
            this.f27010b = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: e */
        public b m32527e(d dVar) {
            this.f27012d = dVar;
            return this;
        }
    }

    /* renamed from: rb.l$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: b */
        public static final c f27013b = new c("SHA1");

        /* renamed from: c */
        public static final c f27014c = new c("SHA224");

        /* renamed from: d */
        public static final c f27015d = new c("SHA256");

        /* renamed from: e */
        public static final c f27016e = new c("SHA384");

        /* renamed from: f */
        public static final c f27017f = new c("SHA512");

        /* renamed from: a */
        private final String f27018a;

        private c(String str) {
            this.f27018a = str;
        }

        public String toString() {
            return this.f27018a;
        }
    }

    /* renamed from: rb.l$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: b */
        public static final d f27019b = new d("TINK");

        /* renamed from: c */
        public static final d f27020c = new d("CRUNCHY");

        /* renamed from: d */
        public static final d f27021d = new d("LEGACY");

        /* renamed from: e */
        public static final d f27022e = new d("NO_PREFIX");

        /* renamed from: a */
        private final String f27023a;

        private d(String str) {
            this.f27023a = str;
        }

        public String toString() {
            return this.f27023a;
        }
    }

    private C10679l(int i10, int i11, d dVar, c cVar) {
        this.f27005a = i10;
        this.f27006b = i11;
        this.f27007c = dVar;
        this.f27008d = cVar;
    }

    /* renamed from: a */
    public static b m32515a() {
        return new b();
    }

    /* renamed from: b */
    public int m32516b() {
        return this.f27006b;
    }

    /* renamed from: c */
    public c m32517c() {
        return this.f27008d;
    }

    /* renamed from: d */
    public int m32518d() {
        return this.f27005a;
    }

    /* renamed from: e */
    public int m32519e() {
        d dVar = this.f27007c;
        if (dVar == d.f27022e) {
            return m32516b();
        }
        if (dVar == d.f27019b || dVar == d.f27020c || dVar == d.f27021d) {
            return m32516b() + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10679l)) {
            return false;
        }
        C10679l c10679l = (C10679l) obj;
        return c10679l.m32518d() == m32518d() && c10679l.m32519e() == m32519e() && c10679l.m32520f() == m32520f() && c10679l.m32517c() == m32517c();
    }

    /* renamed from: f */
    public d m32520f() {
        return this.f27007c;
    }

    /* renamed from: g */
    public boolean m32521g() {
        return this.f27007c != d.f27022e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f27005a), Integer.valueOf(this.f27006b), this.f27007c, this.f27008d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f27007c + ", hashType: " + this.f27008d + ", " + this.f27006b + "-byte tags, and " + this.f27005a + "-byte key)";
    }
}
