package kb;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class a0 extends c {

    /* renamed from: a, reason: collision with root package name */
    private final a f20532a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20533b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f20534c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f20535d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f20536a;

        private a(String str) {
            this.f20536a = str;
        }

        public String toString() {
            return this.f20536a;
        }
    }

    private a0(a aVar) {
        this.f20532a = aVar;
    }

    public static a0 a(a aVar) {
        return new a0(aVar);
    }

    public a b() {
        return this.f20532a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a0) && ((a0) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f20532a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f20532a + ")";
    }
}
