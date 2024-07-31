package p201kb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: kb.q */
/* loaded from: classes2.dex */
public final class C9242q extends AbstractC9219c {

    /* renamed from: a */
    private final int f22427a;

    /* renamed from: b */
    private final int f22428b;

    /* renamed from: c */
    private final int f22429c;

    /* renamed from: d */
    private final c f22430d;

    /* renamed from: kb.q$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private Integer f22431a;

        /* renamed from: b */
        private Integer f22432b;

        /* renamed from: c */
        private Integer f22433c;

        /* renamed from: d */
        private c f22434d;

        private b() {
            this.f22431a = null;
            this.f22432b = null;
            this.f22433c = null;
            this.f22434d = c.f22437d;
        }

        /* renamed from: a */
        public C9242q m27523a() {
            Integer num = this.f22431a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f22434d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f22432b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f22433c != null) {
                return new C9242q(num.intValue(), this.f22432b.intValue(), this.f22433c.intValue(), this.f22434d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        /* renamed from: b */
        public b m27524b(int i10) {
            if (i10 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i10)));
            }
            this.f22432b = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: c */
        public b m27525c(int i10) {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f22431a = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: d */
        public b m27526d(int i10) {
            if (i10 != 12 && i10 != 13 && i10 != 14 && i10 != 15 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i10)));
            }
            this.f22433c = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: e */
        public b m27527e(c cVar) {
            this.f22434d = cVar;
            return this;
        }
    }

    /* renamed from: kb.q$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: b */
        public static final c f22435b = new c("TINK");

        /* renamed from: c */
        public static final c f22436c = new c("CRUNCHY");

        /* renamed from: d */
        public static final c f22437d = new c("NO_PREFIX");

        /* renamed from: a */
        private final String f22438a;

        private c(String str) {
            this.f22438a = str;
        }

        public String toString() {
            return this.f22438a;
        }
    }

    private C9242q(int i10, int i11, int i12, c cVar) {
        this.f22427a = i10;
        this.f22428b = i11;
        this.f22429c = i12;
        this.f22430d = cVar;
    }

    /* renamed from: a */
    public static b m27517a() {
        return new b();
    }

    /* renamed from: b */
    public int m27518b() {
        return this.f22428b;
    }

    /* renamed from: c */
    public int m27519c() {
        return this.f22427a;
    }

    /* renamed from: d */
    public int m27520d() {
        return this.f22429c;
    }

    /* renamed from: e */
    public c m27521e() {
        return this.f22430d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9242q)) {
            return false;
        }
        C9242q c9242q = (C9242q) obj;
        return c9242q.m27519c() == m27519c() && c9242q.m27518b() == m27518b() && c9242q.m27520d() == m27520d() && c9242q.m27521e() == m27521e();
    }

    /* renamed from: f */
    public boolean m27522f() {
        return this.f22430d != c.f22437d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22427a), Integer.valueOf(this.f22428b), Integer.valueOf(this.f22429c), this.f22430d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f22430d + ", " + this.f22428b + "-byte IV, " + this.f22429c + "-byte tag, and " + this.f22427a + "-byte key)";
    }
}
