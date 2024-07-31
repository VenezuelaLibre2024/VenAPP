package g6;

import g6.o;

/* loaded from: classes.dex */
final class i extends o {

    /* renamed from: a */
    private final o.c f15867a;

    /* renamed from: b */
    private final o.b f15868b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends o.a {

        /* renamed from: a */
        private o.c f15869a;

        /* renamed from: b */
        private o.b f15870b;

        @Override // g6.o.a
        public o a() {
            return new i(this.f15869a, this.f15870b);
        }

        @Override // g6.o.a
        public o.a b(o.b bVar) {
            this.f15870b = bVar;
            return this;
        }

        @Override // g6.o.a
        public o.a c(o.c cVar) {
            this.f15869a = cVar;
            return this;
        }
    }

    private i(o.c cVar, o.b bVar) {
        this.f15867a = cVar;
        this.f15868b = bVar;
    }

    /* synthetic */ i(o.c cVar, o.b bVar, a aVar) {
        this(cVar, bVar);
    }

    @Override // g6.o
    public o.b b() {
        return this.f15868b;
    }

    @Override // g6.o
    public o.c c() {
        return this.f15867a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.c cVar = this.f15867a;
        if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
            o.b bVar = this.f15868b;
            o.b b10 = oVar.b();
            if (bVar == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (bVar.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f15867a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f15868b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f15867a + ", mobileSubtype=" + this.f15868b + "}";
    }
}
