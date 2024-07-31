package p442xc;

import java.util.List;
import p442xc.AbstractC12426f0;

/* renamed from: xc.n */
/* loaded from: classes.dex */
final class C12435n extends AbstractC12426f0.e.d.a.b {

    /* renamed from: a */
    private final List<AbstractC12426f0.e.d.a.b.AbstractC13281e> f33608a;

    /* renamed from: b */
    private final AbstractC12426f0.e.d.a.b.c f33609b;

    /* renamed from: c */
    private final AbstractC12426f0.a f33610c;

    /* renamed from: d */
    private final AbstractC12426f0.e.d.a.b.AbstractC13279d f33611d;

    /* renamed from: e */
    private final List<AbstractC12426f0.e.d.a.b.AbstractC13275a> f33612e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.n$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.a.b.AbstractC13277b {

        /* renamed from: a */
        private List<AbstractC12426f0.e.d.a.b.AbstractC13281e> f33613a;

        /* renamed from: b */
        private AbstractC12426f0.e.d.a.b.c f33614b;

        /* renamed from: c */
        private AbstractC12426f0.a f33615c;

        /* renamed from: d */
        private AbstractC12426f0.e.d.a.b.AbstractC13279d f33616d;

        /* renamed from: e */
        private List<AbstractC12426f0.e.d.a.b.AbstractC13275a> f33617e;

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13277b
        /* renamed from: a */
        public AbstractC12426f0.e.d.a.b mo40311a() {
            String str = "";
            if (this.f33616d == null) {
                str = " signal";
            }
            if (this.f33617e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C12435n(this.f33613a, this.f33614b, this.f33615c, this.f33616d, this.f33617e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13277b
        /* renamed from: b */
        public AbstractC12426f0.e.d.a.b.AbstractC13277b mo40312b(AbstractC12426f0.a aVar) {
            this.f33615c = aVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13277b
        /* renamed from: c */
        public AbstractC12426f0.e.d.a.b.AbstractC13277b mo40313c(List<AbstractC12426f0.e.d.a.b.AbstractC13275a> list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f33617e = list;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13277b
        /* renamed from: d */
        public AbstractC12426f0.e.d.a.b.AbstractC13277b mo40314d(AbstractC12426f0.e.d.a.b.c cVar) {
            this.f33614b = cVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13277b
        /* renamed from: e */
        public AbstractC12426f0.e.d.a.b.AbstractC13277b mo40315e(AbstractC12426f0.e.d.a.b.AbstractC13279d abstractC13279d) {
            if (abstractC13279d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f33616d = abstractC13279d;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13277b
        /* renamed from: f */
        public AbstractC12426f0.e.d.a.b.AbstractC13277b mo40316f(List<AbstractC12426f0.e.d.a.b.AbstractC13281e> list) {
            this.f33613a = list;
            return this;
        }
    }

    private C12435n(List<AbstractC12426f0.e.d.a.b.AbstractC13281e> list, AbstractC12426f0.e.d.a.b.c cVar, AbstractC12426f0.a aVar, AbstractC12426f0.e.d.a.b.AbstractC13279d abstractC13279d, List<AbstractC12426f0.e.d.a.b.AbstractC13275a> list2) {
        this.f33608a = list;
        this.f33609b = cVar;
        this.f33610c = aVar;
        this.f33611d = abstractC13279d;
        this.f33612e = list2;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b
    /* renamed from: b */
    public AbstractC12426f0.a mo40294b() {
        return this.f33610c;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b
    /* renamed from: c */
    public List<AbstractC12426f0.e.d.a.b.AbstractC13275a> mo40295c() {
        return this.f33612e;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b
    /* renamed from: d */
    public AbstractC12426f0.e.d.a.b.c mo40296d() {
        return this.f33609b;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b
    /* renamed from: e */
    public AbstractC12426f0.e.d.a.b.AbstractC13279d mo40297e() {
        return this.f33611d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.a.b)) {
            return false;
        }
        AbstractC12426f0.e.d.a.b bVar = (AbstractC12426f0.e.d.a.b) obj;
        List<AbstractC12426f0.e.d.a.b.AbstractC13281e> list = this.f33608a;
        if (list != null ? list.equals(bVar.mo40298f()) : bVar.mo40298f() == null) {
            AbstractC12426f0.e.d.a.b.c cVar = this.f33609b;
            if (cVar != null ? cVar.equals(bVar.mo40296d()) : bVar.mo40296d() == null) {
                AbstractC12426f0.a aVar = this.f33610c;
                if (aVar != null ? aVar.equals(bVar.mo40294b()) : bVar.mo40294b() == null) {
                    if (this.f33611d.equals(bVar.mo40297e()) && this.f33612e.equals(bVar.mo40295c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b
    /* renamed from: f */
    public List<AbstractC12426f0.e.d.a.b.AbstractC13281e> mo40298f() {
        return this.f33608a;
    }

    public int hashCode() {
        List<AbstractC12426f0.e.d.a.b.AbstractC13281e> list = this.f33608a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC12426f0.e.d.a.b.c cVar = this.f33609b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        AbstractC12426f0.a aVar = this.f33610c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f33611d.hashCode()) * 1000003) ^ this.f33612e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f33608a + ", exception=" + this.f33609b + ", appExitInfo=" + this.f33610c + ", signal=" + this.f33611d + ", binaries=" + this.f33612e + "}";
    }
}
