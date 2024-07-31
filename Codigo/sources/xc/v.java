package xc;

import xc.f0;

/* loaded from: classes.dex */
final class v extends f0.e.d.AbstractC0518d {

    /* renamed from: a, reason: collision with root package name */
    private final String f31158a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.AbstractC0518d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f31159a;

        @Override // xc.f0.e.d.AbstractC0518d.a
        public f0.e.d.AbstractC0518d a() {
            String str = "";
            if (this.f31159a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new v(this.f31159a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.AbstractC0518d.a
        public f0.e.d.AbstractC0518d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f31159a = str;
            return this;
        }
    }

    private v(String str) {
        this.f31158a = str;
    }

    @Override // xc.f0.e.d.AbstractC0518d
    public String b() {
        return this.f31158a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.AbstractC0518d) {
            return this.f31158a.equals(((f0.e.d.AbstractC0518d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f31158a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f31158a + "}";
    }
}
