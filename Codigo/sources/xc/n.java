package xc;

import java.util.List;
import xc.f0;

/* loaded from: classes.dex */
final class n extends f0.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final List<f0.e.d.a.b.AbstractC0513e> f31088a;

    /* renamed from: b, reason: collision with root package name */
    private final f0.e.d.a.b.c f31089b;

    /* renamed from: c, reason: collision with root package name */
    private final f0.a f31090c;

    /* renamed from: d, reason: collision with root package name */
    private final f0.e.d.a.b.AbstractC0511d f31091d;

    /* renamed from: e, reason: collision with root package name */
    private final List<f0.e.d.a.b.AbstractC0507a> f31092e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.a.b.AbstractC0509b {

        /* renamed from: a, reason: collision with root package name */
        private List<f0.e.d.a.b.AbstractC0513e> f31093a;

        /* renamed from: b, reason: collision with root package name */
        private f0.e.d.a.b.c f31094b;

        /* renamed from: c, reason: collision with root package name */
        private f0.a f31095c;

        /* renamed from: d, reason: collision with root package name */
        private f0.e.d.a.b.AbstractC0511d f31096d;

        /* renamed from: e, reason: collision with root package name */
        private List<f0.e.d.a.b.AbstractC0507a> f31097e;

        @Override // xc.f0.e.d.a.b.AbstractC0509b
        public f0.e.d.a.b a() {
            String str = "";
            if (this.f31096d == null) {
                str = " signal";
            }
            if (this.f31097e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new n(this.f31093a, this.f31094b, this.f31095c, this.f31096d, this.f31097e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.a.b.AbstractC0509b
        public f0.e.d.a.b.AbstractC0509b b(f0.a aVar) {
            this.f31095c = aVar;
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0509b
        public f0.e.d.a.b.AbstractC0509b c(List<f0.e.d.a.b.AbstractC0507a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f31097e = list;
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0509b
        public f0.e.d.a.b.AbstractC0509b d(f0.e.d.a.b.c cVar) {
            this.f31094b = cVar;
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0509b
        public f0.e.d.a.b.AbstractC0509b e(f0.e.d.a.b.AbstractC0511d abstractC0511d) {
            if (abstractC0511d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f31096d = abstractC0511d;
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0509b
        public f0.e.d.a.b.AbstractC0509b f(List<f0.e.d.a.b.AbstractC0513e> list) {
            this.f31093a = list;
            return this;
        }
    }

    private n(List<f0.e.d.a.b.AbstractC0513e> list, f0.e.d.a.b.c cVar, f0.a aVar, f0.e.d.a.b.AbstractC0511d abstractC0511d, List<f0.e.d.a.b.AbstractC0507a> list2) {
        this.f31088a = list;
        this.f31089b = cVar;
        this.f31090c = aVar;
        this.f31091d = abstractC0511d;
        this.f31092e = list2;
    }

    @Override // xc.f0.e.d.a.b
    public f0.a b() {
        return this.f31090c;
    }

    @Override // xc.f0.e.d.a.b
    public List<f0.e.d.a.b.AbstractC0507a> c() {
        return this.f31092e;
    }

    @Override // xc.f0.e.d.a.b
    public f0.e.d.a.b.c d() {
        return this.f31089b;
    }

    @Override // xc.f0.e.d.a.b
    public f0.e.d.a.b.AbstractC0511d e() {
        return this.f31091d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b)) {
            return false;
        }
        f0.e.d.a.b bVar = (f0.e.d.a.b) obj;
        List<f0.e.d.a.b.AbstractC0513e> list = this.f31088a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            f0.e.d.a.b.c cVar = this.f31089b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                f0.a aVar = this.f31090c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f31091d.equals(bVar.e()) && this.f31092e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // xc.f0.e.d.a.b
    public List<f0.e.d.a.b.AbstractC0513e> f() {
        return this.f31088a;
    }

    public int hashCode() {
        List<f0.e.d.a.b.AbstractC0513e> list = this.f31088a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        f0.e.d.a.b.c cVar = this.f31089b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        f0.a aVar = this.f31090c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f31091d.hashCode()) * 1000003) ^ this.f31092e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f31088a + ", exception=" + this.f31089b + ", appExitInfo=" + this.f31090c + ", signal=" + this.f31091d + ", binaries=" + this.f31092e + "}";
    }
}
