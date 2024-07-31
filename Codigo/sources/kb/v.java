package kb;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class v extends kb.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f20631a;

    /* renamed from: b, reason: collision with root package name */
    private final c f20632b;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Integer f20633a;

        /* renamed from: b, reason: collision with root package name */
        private c f20634b;

        private b() {
            this.f20633a = null;
            this.f20634b = c.f20637d;
        }

        public v a() {
            Integer num = this.f20633a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f20634b != null) {
                return new v(num.intValue(), this.f20634b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i10) {
            if (i10 != 16 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.f20633a = Integer.valueOf(i10);
            return this;
        }

        public b c(c cVar) {
            this.f20634b = cVar;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f20635b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f20636c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f20637d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f20638a;

        private c(String str) {
            this.f20638a = str;
        }

        public String toString() {
            return this.f20638a;
        }
    }

    private v(int i10, c cVar) {
        this.f20631a = i10;
        this.f20632b = cVar;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f20631a;
    }

    public c c() {
        return this.f20632b;
    }

    public boolean d() {
        return this.f20632b != c.f20637d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == b() && vVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f20631a), this.f20632b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f20632b + ", " + this.f20631a + "-byte key)";
    }
}
