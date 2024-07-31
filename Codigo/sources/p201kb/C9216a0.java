package p201kb;

import java.util.Objects;

/* renamed from: kb.a0 */
/* loaded from: classes2.dex */
public final class C9216a0 extends AbstractC9219c {

    /* renamed from: a */
    private final a f22354a;

    /* renamed from: kb.a0$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: b */
        public static final a f22355b = new a("TINK");

        /* renamed from: c */
        public static final a f22356c = new a("CRUNCHY");

        /* renamed from: d */
        public static final a f22357d = new a("NO_PREFIX");

        /* renamed from: a */
        private final String f22358a;

        private a(String str) {
            this.f22358a = str;
        }

        public String toString() {
            return this.f22358a;
        }
    }

    private C9216a0(a aVar) {
        this.f22354a = aVar;
    }

    /* renamed from: a */
    public static C9216a0 m27405a(a aVar) {
        return new C9216a0(aVar);
    }

    /* renamed from: b */
    public a m27406b() {
        return this.f22354a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9216a0) && ((C9216a0) obj).m27406b() == m27406b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f22354a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f22354a + ")";
    }
}
