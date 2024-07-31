package xc;

import java.util.List;
import xc.f0;

/* loaded from: classes.dex */
final class f extends f0.d {

    /* renamed from: a, reason: collision with root package name */
    private final List<f0.d.b> f30996a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30997b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.d.a {

        /* renamed from: a, reason: collision with root package name */
        private List<f0.d.b> f30998a;

        /* renamed from: b, reason: collision with root package name */
        private String f30999b;

        @Override // xc.f0.d.a
        public f0.d a() {
            String str = "";
            if (this.f30998a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new f(this.f30998a, this.f30999b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.d.a
        public f0.d.a b(List<f0.d.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f30998a = list;
            return this;
        }

        @Override // xc.f0.d.a
        public f0.d.a c(String str) {
            this.f30999b = str;
            return this;
        }
    }

    private f(List<f0.d.b> list, String str) {
        this.f30996a = list;
        this.f30997b = str;
    }

    @Override // xc.f0.d
    public List<f0.d.b> b() {
        return this.f30996a;
    }

    @Override // xc.f0.d
    public String c() {
        return this.f30997b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d)) {
            return false;
        }
        f0.d dVar = (f0.d) obj;
        if (this.f30996a.equals(dVar.b())) {
            String str = this.f30997b;
            String c10 = dVar.c();
            if (str == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (str.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f30996a.hashCode() ^ 1000003) * 1000003;
        String str = this.f30997b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f30996a + ", orgId=" + this.f30997b + "}";
    }
}
