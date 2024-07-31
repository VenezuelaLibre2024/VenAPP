package p118g6;

import p118g6.AbstractC7463o;

/* renamed from: g6.i */
/* loaded from: classes.dex */
final class C7457i extends AbstractC7463o {

    /* renamed from: a */
    private final AbstractC7463o.c f17449a;

    /* renamed from: b */
    private final AbstractC7463o.b f17450b;

    /* renamed from: g6.i$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7463o.a {

        /* renamed from: a */
        private AbstractC7463o.c f17451a;

        /* renamed from: b */
        private AbstractC7463o.b f17452b;

        @Override // p118g6.AbstractC7463o.a
        /* renamed from: a */
        public AbstractC7463o mo22571a() {
            return new C7457i(this.f17451a, this.f17452b);
        }

        @Override // p118g6.AbstractC7463o.a
        /* renamed from: b */
        public AbstractC7463o.a mo22572b(AbstractC7463o.b bVar) {
            this.f17452b = bVar;
            return this;
        }

        @Override // p118g6.AbstractC7463o.a
        /* renamed from: c */
        public AbstractC7463o.a mo22573c(AbstractC7463o.c cVar) {
            this.f17451a = cVar;
            return this;
        }
    }

    private C7457i(AbstractC7463o.c cVar, AbstractC7463o.b bVar) {
        this.f17449a = cVar;
        this.f17450b = bVar;
    }

    @Override // p118g6.AbstractC7463o
    /* renamed from: b */
    public AbstractC7463o.b mo22569b() {
        return this.f17450b;
    }

    @Override // p118g6.AbstractC7463o
    /* renamed from: c */
    public AbstractC7463o.c mo22570c() {
        return this.f17449a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7463o)) {
            return false;
        }
        AbstractC7463o abstractC7463o = (AbstractC7463o) obj;
        AbstractC7463o.c cVar = this.f17449a;
        if (cVar != null ? cVar.equals(abstractC7463o.mo22570c()) : abstractC7463o.mo22570c() == null) {
            AbstractC7463o.b bVar = this.f17450b;
            AbstractC7463o.b mo22569b = abstractC7463o.mo22569b();
            if (bVar == null) {
                if (mo22569b == null) {
                    return true;
                }
            } else if (bVar.equals(mo22569b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC7463o.c cVar = this.f17449a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC7463o.b bVar = this.f17450b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f17449a + ", mobileSubtype=" + this.f17450b + "}";
    }
}
