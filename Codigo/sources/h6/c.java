package h6;

import h6.o;

/* loaded from: classes.dex */
final class c extends o {

    /* renamed from: a */
    private final p f16416a;

    /* renamed from: b */
    private final String f16417b;

    /* renamed from: c */
    private final f6.c<?> f16418c;

    /* renamed from: d */
    private final f6.e<?, byte[]> f16419d;

    /* renamed from: e */
    private final f6.b f16420e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends o.a {

        /* renamed from: a */
        private p f16421a;

        /* renamed from: b */
        private String f16422b;

        /* renamed from: c */
        private f6.c<?> f16423c;

        /* renamed from: d */
        private f6.e<?, byte[]> f16424d;

        /* renamed from: e */
        private f6.b f16425e;

        @Override // h6.o.a
        public o a() {
            String str = "";
            if (this.f16421a == null) {
                str = " transportContext";
            }
            if (this.f16422b == null) {
                str = str + " transportName";
            }
            if (this.f16423c == null) {
                str = str + " event";
            }
            if (this.f16424d == null) {
                str = str + " transformer";
            }
            if (this.f16425e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f16421a, this.f16422b, this.f16423c, this.f16424d, this.f16425e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h6.o.a
        public o.a b(f6.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f16425e = bVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h6.o.a
        public o.a c(f6.c<?> cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f16423c = cVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // h6.o.a
        public o.a d(f6.e<?, byte[]> eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f16424d = eVar;
            return this;
        }

        @Override // h6.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f16421a = pVar;
            return this;
        }

        @Override // h6.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f16422b = str;
            return this;
        }
    }

    private c(p pVar, String str, f6.c<?> cVar, f6.e<?, byte[]> eVar, f6.b bVar) {
        this.f16416a = pVar;
        this.f16417b = str;
        this.f16418c = cVar;
        this.f16419d = eVar;
        this.f16420e = bVar;
    }

    /* synthetic */ c(p pVar, String str, f6.c cVar, f6.e eVar, f6.b bVar, a aVar) {
        this(pVar, str, cVar, eVar, bVar);
    }

    @Override // h6.o
    public f6.b b() {
        return this.f16420e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h6.o
    public f6.c<?> c() {
        return this.f16418c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h6.o
    public f6.e<?, byte[]> e() {
        return this.f16419d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f16416a.equals(oVar.f()) && this.f16417b.equals(oVar.g()) && this.f16418c.equals(oVar.c()) && this.f16419d.equals(oVar.e()) && this.f16420e.equals(oVar.b());
    }

    @Override // h6.o
    public p f() {
        return this.f16416a;
    }

    @Override // h6.o
    public String g() {
        return this.f16417b;
    }

    public int hashCode() {
        return ((((((((this.f16416a.hashCode() ^ 1000003) * 1000003) ^ this.f16417b.hashCode()) * 1000003) ^ this.f16418c.hashCode()) * 1000003) ^ this.f16419d.hashCode()) * 1000003) ^ this.f16420e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f16416a + ", transportName=" + this.f16417b + ", event=" + this.f16418c + ", transformer=" + this.f16419d + ", encoding=" + this.f16420e + "}";
    }
}
