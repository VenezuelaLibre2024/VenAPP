package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.v */
/* loaded from: classes.dex */
final class C12443v extends AbstractC12426f0.e.d.AbstractC13286d {

    /* renamed from: a */
    private final String f33678a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.v$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.AbstractC13286d.a {

        /* renamed from: a */
        private String f33679a;

        @Override // p442xc.AbstractC12426f0.e.d.AbstractC13286d.a
        /* renamed from: a */
        public AbstractC12426f0.e.d.AbstractC13286d mo40390a() {
            String str = "";
            if (this.f33679a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new C12443v(this.f33679a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.AbstractC13286d.a
        /* renamed from: b */
        public AbstractC12426f0.e.d.AbstractC13286d.a mo40391b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f33679a = str;
            return this;
        }
    }

    private C12443v(String str) {
        this.f33678a = str;
    }

    @Override // p442xc.AbstractC12426f0.e.d.AbstractC13286d
    /* renamed from: b */
    public String mo40389b() {
        return this.f33678a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12426f0.e.d.AbstractC13286d) {
            return this.f33678a.equals(((AbstractC12426f0.e.d.AbstractC13286d) obj).mo40389b());
        }
        return false;
    }

    public int hashCode() {
        return this.f33678a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f33678a + "}";
    }
}
