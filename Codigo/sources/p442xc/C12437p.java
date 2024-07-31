package p442xc;

import java.util.List;
import p442xc.AbstractC12426f0;

/* renamed from: xc.p */
/* loaded from: classes.dex */
final class C12437p extends AbstractC12426f0.e.d.a.b.c {

    /* renamed from: a */
    private final String f33626a;

    /* renamed from: b */
    private final String f33627b;

    /* renamed from: c */
    private final List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> f33628c;

    /* renamed from: d */
    private final AbstractC12426f0.e.d.a.b.c f33629d;

    /* renamed from: e */
    private final int f33630e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.p$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.a.b.c.AbstractC13278a {

        /* renamed from: a */
        private String f33631a;

        /* renamed from: b */
        private String f33632b;

        /* renamed from: c */
        private List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> f33633c;

        /* renamed from: d */
        private AbstractC12426f0.e.d.a.b.c f33634d;

        /* renamed from: e */
        private Integer f33635e;

        @Override // p442xc.AbstractC12426f0.e.d.a.b.c.AbstractC13278a
        /* renamed from: a */
        public AbstractC12426f0.e.d.a.b.c mo40323a() {
            String str = "";
            if (this.f33631a == null) {
                str = " type";
            }
            if (this.f33633c == null) {
                str = str + " frames";
            }
            if (this.f33635e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C12437p(this.f33631a, this.f33632b, this.f33633c, this.f33634d, this.f33635e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.c.AbstractC13278a
        /* renamed from: b */
        public AbstractC12426f0.e.d.a.b.c.AbstractC13278a mo40324b(AbstractC12426f0.e.d.a.b.c cVar) {
            this.f33634d = cVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.c.AbstractC13278a
        /* renamed from: c */
        public AbstractC12426f0.e.d.a.b.c.AbstractC13278a mo40325c(List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f33633c = list;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.c.AbstractC13278a
        /* renamed from: d */
        public AbstractC12426f0.e.d.a.b.c.AbstractC13278a mo40326d(int i10) {
            this.f33635e = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.c.AbstractC13278a
        /* renamed from: e */
        public AbstractC12426f0.e.d.a.b.c.AbstractC13278a mo40327e(String str) {
            this.f33632b = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.c.AbstractC13278a
        /* renamed from: f */
        public AbstractC12426f0.e.d.a.b.c.AbstractC13278a mo40328f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f33631a = str;
            return this;
        }
    }

    private C12437p(String str, String str2, List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> list, AbstractC12426f0.e.d.a.b.c cVar, int i10) {
        this.f33626a = str;
        this.f33627b = str2;
        this.f33628c = list;
        this.f33629d = cVar;
        this.f33630e = i10;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.c
    /* renamed from: b */
    public AbstractC12426f0.e.d.a.b.c mo40318b() {
        return this.f33629d;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.c
    /* renamed from: c */
    public List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> mo40319c() {
        return this.f33628c;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.c
    /* renamed from: d */
    public int mo40320d() {
        return this.f33630e;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.c
    /* renamed from: e */
    public String mo40321e() {
        return this.f33627b;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC12426f0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.a.b.c)) {
            return false;
        }
        AbstractC12426f0.e.d.a.b.c cVar2 = (AbstractC12426f0.e.d.a.b.c) obj;
        return this.f33626a.equals(cVar2.mo40322f()) && ((str = this.f33627b) != null ? str.equals(cVar2.mo40321e()) : cVar2.mo40321e() == null) && this.f33628c.equals(cVar2.mo40319c()) && ((cVar = this.f33629d) != null ? cVar.equals(cVar2.mo40318b()) : cVar2.mo40318b() == null) && this.f33630e == cVar2.mo40320d();
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.c
    /* renamed from: f */
    public String mo40322f() {
        return this.f33626a;
    }

    public int hashCode() {
        int hashCode = (this.f33626a.hashCode() ^ 1000003) * 1000003;
        String str = this.f33627b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f33628c.hashCode()) * 1000003;
        AbstractC12426f0.e.d.a.b.c cVar = this.f33629d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f33630e;
    }

    public String toString() {
        return "Exception{type=" + this.f33626a + ", reason=" + this.f33627b + ", frames=" + this.f33628c + ", causedBy=" + this.f33629d + ", overflowCount=" + this.f33630e + "}";
    }
}
