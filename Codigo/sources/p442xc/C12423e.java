package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.e */
/* loaded from: classes.dex */
final class C12423e extends AbstractC12426f0.c {

    /* renamed from: a */
    private final String f33509a;

    /* renamed from: b */
    private final String f33510b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.e$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.c.a {

        /* renamed from: a */
        private String f33511a;

        /* renamed from: b */
        private String f33512b;

        @Override // p442xc.AbstractC12426f0.c.a
        /* renamed from: a */
        public AbstractC12426f0.c mo40171a() {
            String str = "";
            if (this.f33511a == null) {
                str = " key";
            }
            if (this.f33512b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C12423e(this.f33511a, this.f33512b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.c.a
        /* renamed from: b */
        public AbstractC12426f0.c.a mo40172b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f33511a = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.c.a
        /* renamed from: c */
        public AbstractC12426f0.c.a mo40173c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f33512b = str;
            return this;
        }
    }

    private C12423e(String str, String str2) {
        this.f33509a = str;
        this.f33510b = str2;
    }

    @Override // p442xc.AbstractC12426f0.c
    /* renamed from: b */
    public String mo40169b() {
        return this.f33509a;
    }

    @Override // p442xc.AbstractC12426f0.c
    /* renamed from: c */
    public String mo40170c() {
        return this.f33510b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.c)) {
            return false;
        }
        AbstractC12426f0.c cVar = (AbstractC12426f0.c) obj;
        return this.f33509a.equals(cVar.mo40169b()) && this.f33510b.equals(cVar.mo40170c());
    }

    public int hashCode() {
        return ((this.f33509a.hashCode() ^ 1000003) * 1000003) ^ this.f33510b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f33509a + ", value=" + this.f33510b + "}";
    }
}
