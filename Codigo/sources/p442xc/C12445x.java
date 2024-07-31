package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.x */
/* loaded from: classes.dex */
final class C12445x extends AbstractC12426f0.e.d.AbstractC13287e.b {

    /* renamed from: a */
    private final String f33688a;

    /* renamed from: b */
    private final String f33689b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.x$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.AbstractC13287e.b.a {

        /* renamed from: a */
        private String f33690a;

        /* renamed from: b */
        private String f33691b;

        @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e.b.a
        /* renamed from: a */
        public AbstractC12426f0.e.d.AbstractC13287e.b mo40405a() {
            String str = "";
            if (this.f33690a == null) {
                str = " rolloutId";
            }
            if (this.f33691b == null) {
                str = str + " variantId";
            }
            if (str.isEmpty()) {
                return new C12445x(this.f33690a, this.f33691b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e.b.a
        /* renamed from: b */
        public AbstractC12426f0.e.d.AbstractC13287e.b.a mo40406b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f33690a = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e.b.a
        /* renamed from: c */
        public AbstractC12426f0.e.d.AbstractC13287e.b.a mo40407c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f33691b = str;
            return this;
        }
    }

    private C12445x(String str, String str2) {
        this.f33688a = str;
        this.f33689b = str2;
    }

    @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e.b
    /* renamed from: b */
    public String mo40403b() {
        return this.f33688a;
    }

    @Override // p442xc.AbstractC12426f0.e.d.AbstractC13287e.b
    /* renamed from: c */
    public String mo40404c() {
        return this.f33689b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.AbstractC13287e.b)) {
            return false;
        }
        AbstractC12426f0.e.d.AbstractC13287e.b bVar = (AbstractC12426f0.e.d.AbstractC13287e.b) obj;
        return this.f33688a.equals(bVar.mo40403b()) && this.f33689b.equals(bVar.mo40404c());
    }

    public int hashCode() {
        return ((this.f33688a.hashCode() ^ 1000003) * 1000003) ^ this.f33689b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f33688a + ", variantId=" + this.f33689b + "}";
    }
}
