package p442xc;

import java.util.List;
import p442xc.AbstractC12426f0;

/* renamed from: xc.r */
/* loaded from: classes.dex */
final class C12439r extends AbstractC12426f0.e.d.a.b.AbstractC13281e {

    /* renamed from: a */
    private final String f33642a;

    /* renamed from: b */
    private final int f33643b;

    /* renamed from: c */
    private final List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> f33644c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.r$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13282a {

        /* renamed from: a */
        private String f33645a;

        /* renamed from: b */
        private Integer f33646b;

        /* renamed from: c */
        private List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> f33647c;

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13282a
        /* renamed from: a */
        public AbstractC12426f0.e.d.a.b.AbstractC13281e mo40341a() {
            String str = "";
            if (this.f33645a == null) {
                str = " name";
            }
            if (this.f33646b == null) {
                str = str + " importance";
            }
            if (this.f33647c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C12439r(this.f33645a, this.f33646b.intValue(), this.f33647c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13282a
        /* renamed from: b */
        public AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13282a mo40342b(List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f33647c = list;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13282a
        /* renamed from: c */
        public AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13282a mo40343c(int i10) {
            this.f33646b = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13282a
        /* renamed from: d */
        public AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13282a mo40344d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f33645a = str;
            return this;
        }
    }

    private C12439r(String str, int i10, List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> list) {
        this.f33642a = str;
        this.f33643b = i10;
        this.f33644c = list;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e
    /* renamed from: b */
    public List<AbstractC12426f0.e.d.a.b.AbstractC13281e.AbstractC13283b> mo40338b() {
        return this.f33644c;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e
    /* renamed from: c */
    public int mo40339c() {
        return this.f33643b;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13281e
    /* renamed from: d */
    public String mo40340d() {
        return this.f33642a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.a.b.AbstractC13281e)) {
            return false;
        }
        AbstractC12426f0.e.d.a.b.AbstractC13281e abstractC13281e = (AbstractC12426f0.e.d.a.b.AbstractC13281e) obj;
        return this.f33642a.equals(abstractC13281e.mo40340d()) && this.f33643b == abstractC13281e.mo40339c() && this.f33644c.equals(abstractC13281e.mo40338b());
    }

    public int hashCode() {
        return ((((this.f33642a.hashCode() ^ 1000003) * 1000003) ^ this.f33643b) * 1000003) ^ this.f33644c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f33642a + ", importance=" + this.f33643b + ", frames=" + this.f33644c + "}";
    }
}
