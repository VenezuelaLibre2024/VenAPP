package p201kb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: kb.v */
/* loaded from: classes2.dex */
public final class C9247v extends AbstractC9219c {

    /* renamed from: a */
    private final int f22453a;

    /* renamed from: b */
    private final c f22454b;

    /* renamed from: kb.v$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private Integer f22455a;

        /* renamed from: b */
        private c f22456b;

        private b() {
            this.f22455a = null;
            this.f22456b = c.f22459d;
        }

        /* renamed from: a */
        public C9247v m27554a() {
            Integer num = this.f22455a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f22456b != null) {
                return new C9247v(num.intValue(), this.f22456b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        /* renamed from: b */
        public b m27555b(int i10) {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f22455a = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: c */
        public b m27556c(c cVar) {
            this.f22456b = cVar;
            return this;
        }
    }

    /* renamed from: kb.v$c */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: b */
        public static final c f22457b = new c("TINK");

        /* renamed from: c */
        public static final c f22458c = new c("CRUNCHY");

        /* renamed from: d */
        public static final c f22459d = new c("NO_PREFIX");

        /* renamed from: a */
        private final String f22460a;

        private c(String str) {
            this.f22460a = str;
        }

        public String toString() {
            return this.f22460a;
        }
    }

    private C9247v(int i10, c cVar) {
        this.f22453a = i10;
        this.f22454b = cVar;
    }

    /* renamed from: a */
    public static b m27550a() {
        return new b();
    }

    /* renamed from: b */
    public int m27551b() {
        return this.f22453a;
    }

    /* renamed from: c */
    public c m27552c() {
        return this.f22454b;
    }

    /* renamed from: d */
    public boolean m27553d() {
        return this.f22454b != c.f22459d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9247v)) {
            return false;
        }
        C9247v c9247v = (C9247v) obj;
        return c9247v.m27551b() == m27551b() && c9247v.m27552c() == m27552c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22453a), this.f22454b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f22454b + ", " + this.f22453a + "-byte key)";
    }
}
