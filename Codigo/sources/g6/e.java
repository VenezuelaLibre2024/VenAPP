package g6;

import g6.k;

/* loaded from: classes.dex */
final class e extends k {

    /* renamed from: a */
    private final k.b f15834a;

    /* renamed from: b */
    private final g6.a f15835b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends k.a {

        /* renamed from: a */
        private k.b f15836a;

        /* renamed from: b */
        private g6.a f15837b;

        @Override // g6.k.a
        public k a() {
            return new e(this.f15836a, this.f15837b);
        }

        @Override // g6.k.a
        public k.a b(g6.a aVar) {
            this.f15837b = aVar;
            return this;
        }

        @Override // g6.k.a
        public k.a c(k.b bVar) {
            this.f15836a = bVar;
            return this;
        }
    }

    private e(k.b bVar, g6.a aVar) {
        this.f15834a = bVar;
        this.f15835b = aVar;
    }

    /* synthetic */ e(k.b bVar, g6.a aVar, a aVar2) {
        this(bVar, aVar);
    }

    @Override // g6.k
    public g6.a b() {
        return this.f15835b;
    }

    @Override // g6.k
    public k.b c() {
        return this.f15834a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.b bVar = this.f15834a;
        if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
            g6.a aVar = this.f15835b;
            g6.a b10 = kVar.b();
            if (aVar == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (aVar.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f15834a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        g6.a aVar = this.f15835b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f15834a + ", androidClientInfo=" + this.f15835b + "}";
    }
}
