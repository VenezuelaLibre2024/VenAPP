package p266o6;

import java.util.Set;
import p266o6.AbstractC9798f;

/* renamed from: o6.c */
/* loaded from: classes.dex */
final class C9795c extends AbstractC9798f.b {

    /* renamed from: a */
    private final long f24176a;

    /* renamed from: b */
    private final long f24177b;

    /* renamed from: c */
    private final Set<AbstractC9798f.c> f24178c;

    /* renamed from: o6.c$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC9798f.b.a {

        /* renamed from: a */
        private Long f24179a;

        /* renamed from: b */
        private Long f24180b;

        /* renamed from: c */
        private Set<AbstractC9798f.c> f24181c;

        @Override // p266o6.AbstractC9798f.b.a
        /* renamed from: a */
        public AbstractC9798f.b mo29433a() {
            String str = "";
            if (this.f24179a == null) {
                str = " delta";
            }
            if (this.f24180b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f24181c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C9795c(this.f24179a.longValue(), this.f24180b.longValue(), this.f24181c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p266o6.AbstractC9798f.b.a
        /* renamed from: b */
        public AbstractC9798f.b.a mo29434b(long j10) {
            this.f24179a = Long.valueOf(j10);
            return this;
        }

        @Override // p266o6.AbstractC9798f.b.a
        /* renamed from: c */
        public AbstractC9798f.b.a mo29435c(Set<AbstractC9798f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f24181c = set;
            return this;
        }

        @Override // p266o6.AbstractC9798f.b.a
        /* renamed from: d */
        public AbstractC9798f.b.a mo29436d(long j10) {
            this.f24180b = Long.valueOf(j10);
            return this;
        }
    }

    private C9795c(long j10, long j11, Set<AbstractC9798f.c> set) {
        this.f24176a = j10;
        this.f24177b = j11;
        this.f24178c = set;
    }

    @Override // p266o6.AbstractC9798f.b
    /* renamed from: b */
    long mo29430b() {
        return this.f24176a;
    }

    @Override // p266o6.AbstractC9798f.b
    /* renamed from: c */
    Set<AbstractC9798f.c> mo29431c() {
        return this.f24178c;
    }

    @Override // p266o6.AbstractC9798f.b
    /* renamed from: d */
    long mo29432d() {
        return this.f24177b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9798f.b)) {
            return false;
        }
        AbstractC9798f.b bVar = (AbstractC9798f.b) obj;
        return this.f24176a == bVar.mo29430b() && this.f24177b == bVar.mo29432d() && this.f24178c.equals(bVar.mo29431c());
    }

    public int hashCode() {
        long j10 = this.f24176a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f24177b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f24178c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f24176a + ", maxAllowedDelay=" + this.f24177b + ", flags=" + this.f24178c + "}";
    }
}
