package xc;

import xc.f0;

/* loaded from: classes.dex */
final class t extends f0.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f31138a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31139b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31140c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31141d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.a.c.AbstractC0517a {

        /* renamed from: a, reason: collision with root package name */
        private String f31142a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f31143b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f31144c;

        /* renamed from: d, reason: collision with root package name */
        private Boolean f31145d;

        @Override // xc.f0.e.d.a.c.AbstractC0517a
        public f0.e.d.a.c a() {
            String str = "";
            if (this.f31142a == null) {
                str = " processName";
            }
            if (this.f31143b == null) {
                str = str + " pid";
            }
            if (this.f31144c == null) {
                str = str + " importance";
            }
            if (this.f31145d == null) {
                str = str + " defaultProcess";
            }
            if (str.isEmpty()) {
                return new t(this.f31142a, this.f31143b.intValue(), this.f31144c.intValue(), this.f31145d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.a.c.AbstractC0517a
        public f0.e.d.a.c.AbstractC0517a b(boolean z10) {
            this.f31145d = Boolean.valueOf(z10);
            return this;
        }

        @Override // xc.f0.e.d.a.c.AbstractC0517a
        public f0.e.d.a.c.AbstractC0517a c(int i10) {
            this.f31144c = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.d.a.c.AbstractC0517a
        public f0.e.d.a.c.AbstractC0517a d(int i10) {
            this.f31143b = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.d.a.c.AbstractC0517a
        public f0.e.d.a.c.AbstractC0517a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f31142a = str;
            return this;
        }
    }

    private t(String str, int i10, int i11, boolean z10) {
        this.f31138a = str;
        this.f31139b = i10;
        this.f31140c = i11;
        this.f31141d = z10;
    }

    @Override // xc.f0.e.d.a.c
    public int b() {
        return this.f31140c;
    }

    @Override // xc.f0.e.d.a.c
    public int c() {
        return this.f31139b;
    }

    @Override // xc.f0.e.d.a.c
    public String d() {
        return this.f31138a;
    }

    @Override // xc.f0.e.d.a.c
    public boolean e() {
        return this.f31141d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.c)) {
            return false;
        }
        f0.e.d.a.c cVar = (f0.e.d.a.c) obj;
        return this.f31138a.equals(cVar.d()) && this.f31139b == cVar.c() && this.f31140c == cVar.b() && this.f31141d == cVar.e();
    }

    public int hashCode() {
        return ((((((this.f31138a.hashCode() ^ 1000003) * 1000003) ^ this.f31139b) * 1000003) ^ this.f31140c) * 1000003) ^ (this.f31141d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f31138a + ", pid=" + this.f31139b + ", importance=" + this.f31140c + ", defaultProcess=" + this.f31141d + "}";
    }
}
