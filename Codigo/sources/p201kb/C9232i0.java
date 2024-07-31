package p201kb;

import java.util.Objects;

/* renamed from: kb.i0 */
/* loaded from: classes2.dex */
public final class C9232i0 extends AbstractC9219c {

    /* renamed from: a */
    private final a f22402a;

    /* renamed from: kb.i0$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: b */
        public static final a f22403b = new a("TINK");

        /* renamed from: c */
        public static final a f22404c = new a("CRUNCHY");

        /* renamed from: d */
        public static final a f22405d = new a("NO_PREFIX");

        /* renamed from: a */
        private final String f22406a;

        private a(String str) {
            this.f22406a = str;
        }

        public String toString() {
            return this.f22406a;
        }
    }

    private C9232i0(a aVar) {
        this.f22402a = aVar;
    }

    /* renamed from: a */
    public static C9232i0 m27489a(a aVar) {
        return new C9232i0(aVar);
    }

    /* renamed from: b */
    public a m27490b() {
        return this.f22402a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9232i0) && ((C9232i0) obj).m27490b() == m27490b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f22402a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f22402a + ")";
    }
}
