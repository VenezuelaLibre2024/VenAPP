package p132h6;

import p098f6.AbstractC7299c;
import p098f6.C7298b;
import p098f6.InterfaceC7301e;
import p132h6.AbstractC7645o;

/* renamed from: h6.c */
/* loaded from: classes.dex */
final class C7633c extends AbstractC7645o {

    /* renamed from: a */
    private final AbstractC7646p f18053a;

    /* renamed from: b */
    private final String f18054b;

    /* renamed from: c */
    private final AbstractC7299c<?> f18055c;

    /* renamed from: d */
    private final InterfaceC7301e<?, byte[]> f18056d;

    /* renamed from: e */
    private final C7298b f18057e;

    /* renamed from: h6.c$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7645o.a {

        /* renamed from: a */
        private AbstractC7646p f18058a;

        /* renamed from: b */
        private String f18059b;

        /* renamed from: c */
        private AbstractC7299c<?> f18060c;

        /* renamed from: d */
        private InterfaceC7301e<?, byte[]> f18061d;

        /* renamed from: e */
        private C7298b f18062e;

        @Override // p132h6.AbstractC7645o.a
        /* renamed from: a */
        public AbstractC7645o mo23185a() {
            String str = "";
            if (this.f18058a == null) {
                str = " transportContext";
            }
            if (this.f18059b == null) {
                str = str + " transportName";
            }
            if (this.f18060c == null) {
                str = str + " event";
            }
            if (this.f18061d == null) {
                str = str + " transformer";
            }
            if (this.f18062e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C7633c(this.f18058a, this.f18059b, this.f18060c, this.f18061d, this.f18062e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p132h6.AbstractC7645o.a
        /* renamed from: b */
        AbstractC7645o.a mo23186b(C7298b c7298b) {
            if (c7298b == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f18062e = c7298b;
            return this;
        }

        @Override // p132h6.AbstractC7645o.a
        /* renamed from: c */
        AbstractC7645o.a mo23187c(AbstractC7299c<?> abstractC7299c) {
            if (abstractC7299c == null) {
                throw new NullPointerException("Null event");
            }
            this.f18060c = abstractC7299c;
            return this;
        }

        @Override // p132h6.AbstractC7645o.a
        /* renamed from: d */
        AbstractC7645o.a mo23188d(InterfaceC7301e<?, byte[]> interfaceC7301e) {
            if (interfaceC7301e == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f18061d = interfaceC7301e;
            return this;
        }

        @Override // p132h6.AbstractC7645o.a
        /* renamed from: e */
        public AbstractC7645o.a mo23189e(AbstractC7646p abstractC7646p) {
            if (abstractC7646p == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f18058a = abstractC7646p;
            return this;
        }

        @Override // p132h6.AbstractC7645o.a
        /* renamed from: f */
        public AbstractC7645o.a mo23190f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f18059b = str;
            return this;
        }
    }

    private C7633c(AbstractC7646p abstractC7646p, String str, AbstractC7299c<?> abstractC7299c, InterfaceC7301e<?, byte[]> interfaceC7301e, C7298b c7298b) {
        this.f18053a = abstractC7646p;
        this.f18054b = str;
        this.f18055c = abstractC7299c;
        this.f18056d = interfaceC7301e;
        this.f18057e = c7298b;
    }

    @Override // p132h6.AbstractC7645o
    /* renamed from: b */
    public C7298b mo23180b() {
        return this.f18057e;
    }

    @Override // p132h6.AbstractC7645o
    /* renamed from: c */
    AbstractC7299c<?> mo23181c() {
        return this.f18055c;
    }

    @Override // p132h6.AbstractC7645o
    /* renamed from: e */
    InterfaceC7301e<?, byte[]> mo23182e() {
        return this.f18056d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7645o)) {
            return false;
        }
        AbstractC7645o abstractC7645o = (AbstractC7645o) obj;
        return this.f18053a.equals(abstractC7645o.mo23183f()) && this.f18054b.equals(abstractC7645o.mo23184g()) && this.f18055c.equals(abstractC7645o.mo23181c()) && this.f18056d.equals(abstractC7645o.mo23182e()) && this.f18057e.equals(abstractC7645o.mo23180b());
    }

    @Override // p132h6.AbstractC7645o
    /* renamed from: f */
    public AbstractC7646p mo23183f() {
        return this.f18053a;
    }

    @Override // p132h6.AbstractC7645o
    /* renamed from: g */
    public String mo23184g() {
        return this.f18054b;
    }

    public int hashCode() {
        return ((((((((this.f18053a.hashCode() ^ 1000003) * 1000003) ^ this.f18054b.hashCode()) * 1000003) ^ this.f18055c.hashCode()) * 1000003) ^ this.f18056d.hashCode()) * 1000003) ^ this.f18057e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f18053a + ", transportName=" + this.f18054b + ", event=" + this.f18055c + ", transformer=" + this.f18056d + ", encoding=" + this.f18057e + "}";
    }
}
