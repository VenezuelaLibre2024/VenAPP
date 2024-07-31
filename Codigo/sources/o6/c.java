package o6;

import java.util.Set;
import o6.f;

/* loaded from: classes.dex */
final class c extends f.b {

    /* renamed from: a */
    private final long f22243a;

    /* renamed from: b */
    private final long f22244b;

    /* renamed from: c */
    private final Set<f.c> f22245c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f.b.a {

        /* renamed from: a */
        private Long f22246a;

        /* renamed from: b */
        private Long f22247b;

        /* renamed from: c */
        private Set<f.c> f22248c;

        @Override // o6.f.b.a
        public f.b a() {
            String str = "";
            if (this.f22246a == null) {
                str = " delta";
            }
            if (this.f22247b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f22248c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f22246a.longValue(), this.f22247b.longValue(), this.f22248c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o6.f.b.a
        public f.b.a b(long j10) {
            this.f22246a = Long.valueOf(j10);
            return this;
        }

        @Override // o6.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f22248c = set;
            return this;
        }

        @Override // o6.f.b.a
        public f.b.a d(long j10) {
            this.f22247b = Long.valueOf(j10);
            return this;
        }
    }

    private c(long j10, long j11, Set<f.c> set) {
        this.f22243a = j10;
        this.f22244b = j11;
        this.f22245c = set;
    }

    /* synthetic */ c(long j10, long j11, Set set, a aVar) {
        this(j10, j11, set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o6.f.b
    public long b() {
        return this.f22243a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o6.f.b
    public Set<f.c> c() {
        return this.f22245c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o6.f.b
    public long d() {
        return this.f22244b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f22243a == bVar.b() && this.f22244b == bVar.d() && this.f22245c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f22243a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f22244b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f22245c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f22243a + ", maxAllowedDelay=" + this.f22244b + ", flags=" + this.f22245c + "}";
    }
}
