package xc;

import java.util.List;
import xc.f0;

/* loaded from: classes.dex */
final class p extends f0.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f31106a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31107b;

    /* renamed from: c, reason: collision with root package name */
    private final List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> f31108c;

    /* renamed from: d, reason: collision with root package name */
    private final f0.e.d.a.b.c f31109d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31110e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.a.b.c.AbstractC0510a {

        /* renamed from: a, reason: collision with root package name */
        private String f31111a;

        /* renamed from: b, reason: collision with root package name */
        private String f31112b;

        /* renamed from: c, reason: collision with root package name */
        private List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> f31113c;

        /* renamed from: d, reason: collision with root package name */
        private f0.e.d.a.b.c f31114d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f31115e;

        @Override // xc.f0.e.d.a.b.c.AbstractC0510a
        public f0.e.d.a.b.c a() {
            String str = "";
            if (this.f31111a == null) {
                str = " type";
            }
            if (this.f31113c == null) {
                str = str + " frames";
            }
            if (this.f31115e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new p(this.f31111a, this.f31112b, this.f31113c, this.f31114d, this.f31115e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.a.b.c.AbstractC0510a
        public f0.e.d.a.b.c.AbstractC0510a b(f0.e.d.a.b.c cVar) {
            this.f31114d = cVar;
            return this;
        }

        @Override // xc.f0.e.d.a.b.c.AbstractC0510a
        public f0.e.d.a.b.c.AbstractC0510a c(List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f31113c = list;
            return this;
        }

        @Override // xc.f0.e.d.a.b.c.AbstractC0510a
        public f0.e.d.a.b.c.AbstractC0510a d(int i10) {
            this.f31115e = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.d.a.b.c.AbstractC0510a
        public f0.e.d.a.b.c.AbstractC0510a e(String str) {
            this.f31112b = str;
            return this;
        }

        @Override // xc.f0.e.d.a.b.c.AbstractC0510a
        public f0.e.d.a.b.c.AbstractC0510a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f31111a = str;
            return this;
        }
    }

    private p(String str, String str2, List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> list, f0.e.d.a.b.c cVar, int i10) {
        this.f31106a = str;
        this.f31107b = str2;
        this.f31108c = list;
        this.f31109d = cVar;
        this.f31110e = i10;
    }

    @Override // xc.f0.e.d.a.b.c
    public f0.e.d.a.b.c b() {
        return this.f31109d;
    }

    @Override // xc.f0.e.d.a.b.c
    public List<f0.e.d.a.b.AbstractC0513e.AbstractC0515b> c() {
        return this.f31108c;
    }

    @Override // xc.f0.e.d.a.b.c
    public int d() {
        return this.f31110e;
    }

    @Override // xc.f0.e.d.a.b.c
    public String e() {
        return this.f31107b;
    }

    public boolean equals(Object obj) {
        String str;
        f0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.c)) {
            return false;
        }
        f0.e.d.a.b.c cVar2 = (f0.e.d.a.b.c) obj;
        return this.f31106a.equals(cVar2.f()) && ((str = this.f31107b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f31108c.equals(cVar2.c()) && ((cVar = this.f31109d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f31110e == cVar2.d();
    }

    @Override // xc.f0.e.d.a.b.c
    public String f() {
        return this.f31106a;
    }

    public int hashCode() {
        int hashCode = (this.f31106a.hashCode() ^ 1000003) * 1000003;
        String str = this.f31107b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f31108c.hashCode()) * 1000003;
        f0.e.d.a.b.c cVar = this.f31109d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f31110e;
    }

    public String toString() {
        return "Exception{type=" + this.f31106a + ", reason=" + this.f31107b + ", frames=" + this.f31108c + ", causedBy=" + this.f31109d + ", overflowCount=" + this.f31110e + "}";
    }
}
