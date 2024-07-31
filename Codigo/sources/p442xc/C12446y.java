package p442xc;

import java.util.List;
import p442xc.AbstractC12426f0;

/* renamed from: xc.y */
/* loaded from: classes.dex */
final class C12446y extends AbstractC12426f0.e.d.f {

    /* renamed from: a */
    private final List<AbstractC12426f0.e.d.AbstractC13287e> f33692a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.y$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.f.a {

        /* renamed from: a */
        private List<AbstractC12426f0.e.d.AbstractC13287e> f33693a;

        @Override // p442xc.AbstractC12426f0.e.d.f.a
        /* renamed from: a */
        public AbstractC12426f0.e.d.f mo40410a() {
            String str = "";
            if (this.f33693a == null) {
                str = " rolloutAssignments";
            }
            if (str.isEmpty()) {
                return new C12446y(this.f33693a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.f.a
        /* renamed from: b */
        public AbstractC12426f0.e.d.f.a mo40411b(List<AbstractC12426f0.e.d.AbstractC13287e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f33693a = list;
            return this;
        }
    }

    private C12446y(List<AbstractC12426f0.e.d.AbstractC13287e> list) {
        this.f33692a = list;
    }

    @Override // p442xc.AbstractC12426f0.e.d.f
    /* renamed from: b */
    public List<AbstractC12426f0.e.d.AbstractC13287e> mo40409b() {
        return this.f33692a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12426f0.e.d.f) {
            return this.f33692a.equals(((AbstractC12426f0.e.d.f) obj).mo40409b());
        }
        return false;
    }

    public int hashCode() {
        return this.f33692a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f33692a + "}";
    }
}
