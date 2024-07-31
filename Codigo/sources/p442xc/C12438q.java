package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.q */
/* loaded from: classes.dex */
final class C12438q extends AbstractC12426f0.e.d.a.b.AbstractC13279d {

    /* renamed from: a */
    private final String f33636a;

    /* renamed from: b */
    private final String f33637b;

    /* renamed from: c */
    private final long f33638c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.q$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.a.b.AbstractC13279d.AbstractC13280a {

        /* renamed from: a */
        private String f33639a;

        /* renamed from: b */
        private String f33640b;

        /* renamed from: c */
        private Long f33641c;

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13279d.AbstractC13280a
        /* renamed from: a */
        public AbstractC12426f0.e.d.a.b.AbstractC13279d mo40333a() {
            String str = "";
            if (this.f33639a == null) {
                str = " name";
            }
            if (this.f33640b == null) {
                str = str + " code";
            }
            if (this.f33641c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C12438q(this.f33639a, this.f33640b, this.f33641c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13279d.AbstractC13280a
        /* renamed from: b */
        public AbstractC12426f0.e.d.a.b.AbstractC13279d.AbstractC13280a mo40334b(long j10) {
            this.f33641c = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13279d.AbstractC13280a
        /* renamed from: c */
        public AbstractC12426f0.e.d.a.b.AbstractC13279d.AbstractC13280a mo40335c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f33640b = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13279d.AbstractC13280a
        /* renamed from: d */
        public AbstractC12426f0.e.d.a.b.AbstractC13279d.AbstractC13280a mo40336d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f33639a = str;
            return this;
        }
    }

    private C12438q(String str, String str2, long j10) {
        this.f33636a = str;
        this.f33637b = str2;
        this.f33638c = j10;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13279d
    /* renamed from: b */
    public long mo40330b() {
        return this.f33638c;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13279d
    /* renamed from: c */
    public String mo40331c() {
        return this.f33637b;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a.b.AbstractC13279d
    /* renamed from: d */
    public String mo40332d() {
        return this.f33636a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.a.b.AbstractC13279d)) {
            return false;
        }
        AbstractC12426f0.e.d.a.b.AbstractC13279d abstractC13279d = (AbstractC12426f0.e.d.a.b.AbstractC13279d) obj;
        return this.f33636a.equals(abstractC13279d.mo40332d()) && this.f33637b.equals(abstractC13279d.mo40331c()) && this.f33638c == abstractC13279d.mo40330b();
    }

    public int hashCode() {
        int hashCode = (((this.f33636a.hashCode() ^ 1000003) * 1000003) ^ this.f33637b.hashCode()) * 1000003;
        long j10 = this.f33638c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f33636a + ", code=" + this.f33637b + ", address=" + this.f33638c + "}";
    }
}
