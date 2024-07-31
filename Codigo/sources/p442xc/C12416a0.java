package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.a0 */
/* loaded from: classes.dex */
final class C12416a0 extends AbstractC12426f0.e.f {

    /* renamed from: a */
    private final String f33443a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.a0$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.f.a {

        /* renamed from: a */
        private String f33444a;

        @Override // p442xc.AbstractC12426f0.e.f.a
        /* renamed from: a */
        public AbstractC12426f0.e.f mo40099a() {
            String str = "";
            if (this.f33444a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new C12416a0(this.f33444a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.f.a
        /* renamed from: b */
        public AbstractC12426f0.e.f.a mo40100b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f33444a = str;
            return this;
        }
    }

    private C12416a0(String str) {
        this.f33443a = str;
    }

    @Override // p442xc.AbstractC12426f0.e.f
    /* renamed from: b */
    public String mo40098b() {
        return this.f33443a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12426f0.e.f) {
            return this.f33443a.equals(((AbstractC12426f0.e.f) obj).mo40098b());
        }
        return false;
    }

    public int hashCode() {
        return this.f33443a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f33443a + "}";
    }
}
