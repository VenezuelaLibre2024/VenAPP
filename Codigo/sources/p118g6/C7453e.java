package p118g6;

import p118g6.AbstractC7459k;

/* renamed from: g6.e */
/* loaded from: classes.dex */
final class C7453e extends AbstractC7459k {

    /* renamed from: a */
    private final AbstractC7459k.b f17416a;

    /* renamed from: b */
    private final AbstractC7449a f17417b;

    /* renamed from: g6.e$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7459k.a {

        /* renamed from: a */
        private AbstractC7459k.b f17418a;

        /* renamed from: b */
        private AbstractC7449a f17419b;

        @Override // p118g6.AbstractC7459k.a
        /* renamed from: a */
        public AbstractC7459k mo22535a() {
            return new C7453e(this.f17418a, this.f17419b);
        }

        @Override // p118g6.AbstractC7459k.a
        /* renamed from: b */
        public AbstractC7459k.a mo22536b(AbstractC7449a abstractC7449a) {
            this.f17419b = abstractC7449a;
            return this;
        }

        @Override // p118g6.AbstractC7459k.a
        /* renamed from: c */
        public AbstractC7459k.a mo22537c(AbstractC7459k.b bVar) {
            this.f17418a = bVar;
            return this;
        }
    }

    private C7453e(AbstractC7459k.b bVar, AbstractC7449a abstractC7449a) {
        this.f17416a = bVar;
        this.f17417b = abstractC7449a;
    }

    @Override // p118g6.AbstractC7459k
    /* renamed from: b */
    public AbstractC7449a mo22533b() {
        return this.f17417b;
    }

    @Override // p118g6.AbstractC7459k
    /* renamed from: c */
    public AbstractC7459k.b mo22534c() {
        return this.f17416a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7459k)) {
            return false;
        }
        AbstractC7459k abstractC7459k = (AbstractC7459k) obj;
        AbstractC7459k.b bVar = this.f17416a;
        if (bVar != null ? bVar.equals(abstractC7459k.mo22534c()) : abstractC7459k.mo22534c() == null) {
            AbstractC7449a abstractC7449a = this.f17417b;
            AbstractC7449a mo22533b = abstractC7459k.mo22533b();
            if (abstractC7449a == null) {
                if (mo22533b == null) {
                    return true;
                }
            } else if (abstractC7449a.equals(mo22533b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC7459k.b bVar = this.f17416a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC7449a abstractC7449a = this.f17417b;
        return hashCode ^ (abstractC7449a != null ? abstractC7449a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f17416a + ", androidClientInfo=" + this.f17417b + "}";
    }
}
