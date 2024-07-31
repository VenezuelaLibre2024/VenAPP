package y6;

/* loaded from: classes.dex */
public interface z {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final a0 f31796a;

        /* renamed from: b, reason: collision with root package name */
        public final a0 f31797b;

        public a(a0 a0Var) {
            this(a0Var, a0Var);
        }

        public a(a0 a0Var, a0 a0Var2) {
            this.f31796a = (a0) t8.a.e(a0Var);
            this.f31797b = (a0) t8.a.e(a0Var2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31796a.equals(aVar.f31796a) && this.f31797b.equals(aVar.f31797b);
        }

        public int hashCode() {
            return (this.f31796a.hashCode() * 31) + this.f31797b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f31796a);
            if (this.f31796a.equals(this.f31797b)) {
                str = "";
            } else {
                str = ", " + this.f31797b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements z {

        /* renamed from: a, reason: collision with root package name */
        private final long f31798a;

        /* renamed from: b, reason: collision with root package name */
        private final a f31799b;

        public b(long j10) {
            this(j10, 0L);
        }

        public b(long j10, long j11) {
            this.f31798a = j10;
            this.f31799b = new a(j11 == 0 ? a0.f31686c : new a0(0L, j11));
        }

        @Override // y6.z
        public a d(long j10) {
            return this.f31799b;
        }

        @Override // y6.z
        public boolean h() {
            return false;
        }

        @Override // y6.z
        public long i() {
            return this.f31798a;
        }
    }

    a d(long j10);

    boolean h();

    long i();
}
