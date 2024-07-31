package p201kb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: kb.i */
/* loaded from: classes2.dex */
public final class C9231i extends AbstractC9219c {

    /* renamed from: a */
    private final int f22390a;

    /* renamed from: b */
    private final int f22391b;

    /* renamed from: c */
    private final int f22392c;

    /* renamed from: d */
    private final c f22393d;

    /* renamed from: kb.i$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private Integer f22394a;

        /* renamed from: b */
        private Integer f22395b;

        /* renamed from: c */
        private Integer f22396c;

        /* renamed from: d */
        private c f22397d;

        private b() {
            this.f22394a = null;
            this.f22395b = null;
            this.f22396c = null;
            this.f22397d = c.f22400d;
        }

        /* renamed from: a */
        public C9231i m27484a() {
            Integer num = this.f22394a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f22395b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f22397d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f22396c != null) {
                return new C9231i(num.intValue(), this.f22395b.intValue(), this.f22396c.intValue(), this.f22397d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        /* renamed from: b */
        public b m27485b(int i10) {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f22395b = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: c */
        public b m27486c(int i10) {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f22394a = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: d */
        public b m27487d(int i10) {
            if (i10 < 0 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i10)));
            }
            this.f22396c = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: e */
        public b m27488e(c cVar) {
            this.f22397d = cVar;
            return this;
        }
    }

    /* renamed from: kb.i$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: b */
        public static final c f22398b = new c("TINK");

        /* renamed from: c */
        public static final c f22399c = new c("CRUNCHY");

        /* renamed from: d */
        public static final c f22400d = new c("NO_PREFIX");

        /* renamed from: a */
        private final String f22401a;

        private c(String str) {
            this.f22401a = str;
        }

        public String toString() {
            return this.f22401a;
        }
    }

    private C9231i(int i10, int i11, int i12, c cVar) {
        this.f22390a = i10;
        this.f22391b = i11;
        this.f22392c = i12;
        this.f22393d = cVar;
    }

    /* renamed from: a */
    public static b m27478a() {
        return new b();
    }

    /* renamed from: b */
    public int m27479b() {
        return this.f22391b;
    }

    /* renamed from: c */
    public int m27480c() {
        return this.f22390a;
    }

    /* renamed from: d */
    public int m27481d() {
        return this.f22392c;
    }

    /* renamed from: e */
    public c m27482e() {
        return this.f22393d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9231i)) {
            return false;
        }
        C9231i c9231i = (C9231i) obj;
        return c9231i.m27480c() == m27480c() && c9231i.m27479b() == m27479b() && c9231i.m27481d() == m27481d() && c9231i.m27482e() == m27482e();
    }

    /* renamed from: f */
    public boolean m27483f() {
        return this.f22393d != c.f22400d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22390a), Integer.valueOf(this.f22391b), Integer.valueOf(this.f22392c), this.f22393d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f22393d + ", " + this.f22391b + "-byte IV, " + this.f22392c + "-byte tag, and " + this.f22390a + "-byte key)";
    }
}
