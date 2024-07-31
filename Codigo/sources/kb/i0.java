package kb;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class i0 extends c {

    /* renamed from: a, reason: collision with root package name */
    private final a f20580a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20581b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f20582c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f20583d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f20584a;

        private a(String str) {
            this.f20584a = str;
        }

        public String toString() {
            return this.f20584a;
        }
    }

    private i0(a aVar) {
        this.f20580a = aVar;
    }

    public static i0 a(a aVar) {
        return new i0(aVar);
    }

    public a b() {
        return this.f20580a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof i0) && ((i0) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f20580a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f20580a + ")";
    }
}
