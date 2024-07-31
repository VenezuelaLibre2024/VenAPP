package p442xc;

import java.util.List;
import p442xc.AbstractC12426f0;

/* renamed from: xc.f */
/* loaded from: classes.dex */
final class C12425f extends AbstractC12426f0.d {

    /* renamed from: a */
    private final List<AbstractC12426f0.d.b> f33516a;

    /* renamed from: b */
    private final String f33517b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.f$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.d.a {

        /* renamed from: a */
        private List<AbstractC12426f0.d.b> f33518a;

        /* renamed from: b */
        private String f33519b;

        @Override // p442xc.AbstractC12426f0.d.a
        /* renamed from: a */
        public AbstractC12426f0.d mo40179a() {
            String str = "";
            if (this.f33518a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new C12425f(this.f33518a, this.f33519b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.d.a
        /* renamed from: b */
        public AbstractC12426f0.d.a mo40180b(List<AbstractC12426f0.d.b> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f33518a = list;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.d.a
        /* renamed from: c */
        public AbstractC12426f0.d.a mo40181c(String str) {
            this.f33519b = str;
            return this;
        }
    }

    private C12425f(List<AbstractC12426f0.d.b> list, String str) {
        this.f33516a = list;
        this.f33517b = str;
    }

    @Override // p442xc.AbstractC12426f0.d
    /* renamed from: b */
    public List<AbstractC12426f0.d.b> mo40177b() {
        return this.f33516a;
    }

    @Override // p442xc.AbstractC12426f0.d
    /* renamed from: c */
    public String mo40178c() {
        return this.f33517b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.d)) {
            return false;
        }
        AbstractC12426f0.d dVar = (AbstractC12426f0.d) obj;
        if (this.f33516a.equals(dVar.mo40177b())) {
            String str = this.f33517b;
            String mo40178c = dVar.mo40178c();
            if (str == null) {
                if (mo40178c == null) {
                    return true;
                }
            } else if (str.equals(mo40178c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f33516a.hashCode() ^ 1000003) * 1000003;
        String str = this.f33517b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f33516a + ", orgId=" + this.f33517b + "}";
    }
}
