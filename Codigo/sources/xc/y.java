package xc;

import java.util.List;
import xc.f0;

/* loaded from: classes.dex */
final class y extends f0.e.d.f {

    /* renamed from: a, reason: collision with root package name */
    private final List<f0.e.d.AbstractC0519e> f31172a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.f.a {

        /* renamed from: a, reason: collision with root package name */
        private List<f0.e.d.AbstractC0519e> f31173a;

        @Override // xc.f0.e.d.f.a
        public f0.e.d.f a() {
            String str = "";
            if (this.f31173a == null) {
                str = " rolloutAssignments";
            }
            if (str.isEmpty()) {
                return new y(this.f31173a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.f.a
        public f0.e.d.f.a b(List<f0.e.d.AbstractC0519e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f31173a = list;
            return this;
        }
    }

    private y(List<f0.e.d.AbstractC0519e> list) {
        this.f31172a = list;
    }

    @Override // xc.f0.e.d.f
    public List<f0.e.d.AbstractC0519e> b() {
        return this.f31172a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.d.f) {
            return this.f31172a.equals(((f0.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f31172a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f31172a + "}";
    }
}
