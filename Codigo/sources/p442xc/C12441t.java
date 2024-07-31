package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.t */
/* loaded from: classes.dex */
final class C12441t extends AbstractC12426f0.e.d.a.c {

    /* renamed from: a */
    private final String f33658a;

    /* renamed from: b */
    private final int f33659b;

    /* renamed from: c */
    private final int f33660c;

    /* renamed from: d */
    private final boolean f33661d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.t$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.a.c.AbstractC13285a {

        /* renamed from: a */
        private String f33662a;

        /* renamed from: b */
        private Integer f33663b;

        /* renamed from: c */
        private Integer f33664c;

        /* renamed from: d */
        private Boolean f33665d;

        @Override // p442xc.AbstractC12426f0.e.d.a.c.AbstractC13285a
        /* renamed from: a */
        public AbstractC12426f0.e.d.a.c mo40362a() {
            String str = "";
            if (this.f33662a == null) {
                str = " processName";
            }
            if (this.f33663b == null) {
                str = str + " pid";
            }
            if (this.f33664c == null) {
                str = str + " importance";
            }
            if (this.f33665d == null) {
                str = str + " defaultProcess";
            }
            if (str.isEmpty()) {
                return new C12441t(this.f33662a, this.f33663b.intValue(), this.f33664c.intValue(), this.f33665d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.c.AbstractC13285a
        /* renamed from: b */
        public AbstractC12426f0.e.d.a.c.AbstractC13285a mo40363b(boolean z10) {
            this.f33665d = Boolean.valueOf(z10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.c.AbstractC13285a
        /* renamed from: c */
        public AbstractC12426f0.e.d.a.c.AbstractC13285a mo40364c(int i10) {
            this.f33664c = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.c.AbstractC13285a
        /* renamed from: d */
        public AbstractC12426f0.e.d.a.c.AbstractC13285a mo40365d(int i10) {
            this.f33663b = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.c.AbstractC13285a
        /* renamed from: e */
        public AbstractC12426f0.e.d.a.c.AbstractC13285a mo40366e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f33662a = str;
            return this;
        }
    }

    private C12441t(String str, int i10, int i11, boolean z10) {
        this.f33658a = str;
        this.f33659b = i10;
        this.f33660c = i11;
        this.f33661d = z10;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.c
    /* renamed from: b */
    public int mo40358b() {
        return this.f33660c;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.c
    /* renamed from: c */
    public int mo40359c() {
        return this.f33659b;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.c
    /* renamed from: d */
    public String mo40360d() {
        return this.f33658a;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.c
    /* renamed from: e */
    public boolean mo40361e() {
        return this.f33661d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.a.c)) {
            return false;
        }
        AbstractC12426f0.e.d.a.c cVar = (AbstractC12426f0.e.d.a.c) obj;
        return this.f33658a.equals(cVar.mo40360d()) && this.f33659b == cVar.mo40359c() && this.f33660c == cVar.mo40358b() && this.f33661d == cVar.mo40361e();
    }

    public int hashCode() {
        return ((((((this.f33658a.hashCode() ^ 1000003) * 1000003) ^ this.f33659b) * 1000003) ^ this.f33660c) * 1000003) ^ (this.f33661d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f33658a + ", pid=" + this.f33659b + ", importance=" + this.f33660c + ", defaultProcess=" + this.f33661d + "}";
    }
}
