package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.d */
/* loaded from: classes.dex */
final class C12421d extends AbstractC12426f0.a.AbstractC13271a {

    /* renamed from: a */
    private final String f33494a;

    /* renamed from: b */
    private final String f33495b;

    /* renamed from: c */
    private final String f33496c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.a.AbstractC13271a.AbstractC13272a {

        /* renamed from: a */
        private String f33497a;

        /* renamed from: b */
        private String f33498b;

        /* renamed from: c */
        private String f33499c;

        @Override // p442xc.AbstractC12426f0.a.AbstractC13271a.AbstractC13272a
        /* renamed from: a */
        public AbstractC12426f0.a.AbstractC13271a mo40156a() {
            String str = "";
            if (this.f33497a == null) {
                str = " arch";
            }
            if (this.f33498b == null) {
                str = str + " libraryName";
            }
            if (this.f33499c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C12421d(this.f33497a, this.f33498b, this.f33499c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.a.AbstractC13271a.AbstractC13272a
        /* renamed from: b */
        public AbstractC12426f0.a.AbstractC13271a.AbstractC13272a mo40157b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f33497a = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.a.AbstractC13271a.AbstractC13272a
        /* renamed from: c */
        public AbstractC12426f0.a.AbstractC13271a.AbstractC13272a mo40158c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f33499c = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.a.AbstractC13271a.AbstractC13272a
        /* renamed from: d */
        public AbstractC12426f0.a.AbstractC13271a.AbstractC13272a mo40159d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f33498b = str;
            return this;
        }
    }

    private C12421d(String str, String str2, String str3) {
        this.f33494a = str;
        this.f33495b = str2;
        this.f33496c = str3;
    }

    @Override // p442xc.AbstractC12426f0.a.AbstractC13271a
    /* renamed from: b */
    public String mo40153b() {
        return this.f33494a;
    }

    @Override // p442xc.AbstractC12426f0.a.AbstractC13271a
    /* renamed from: c */
    public String mo40154c() {
        return this.f33496c;
    }

    @Override // p442xc.AbstractC12426f0.a.AbstractC13271a
    /* renamed from: d */
    public String mo40155d() {
        return this.f33495b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.a.AbstractC13271a)) {
            return false;
        }
        AbstractC12426f0.a.AbstractC13271a abstractC13271a = (AbstractC12426f0.a.AbstractC13271a) obj;
        return this.f33494a.equals(abstractC13271a.mo40153b()) && this.f33495b.equals(abstractC13271a.mo40155d()) && this.f33496c.equals(abstractC13271a.mo40154c());
    }

    public int hashCode() {
        return ((((this.f33494a.hashCode() ^ 1000003) * 1000003) ^ this.f33495b.hashCode()) * 1000003) ^ this.f33496c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f33494a + ", libraryName=" + this.f33495b + ", buildId=" + this.f33496c + "}";
    }
}
