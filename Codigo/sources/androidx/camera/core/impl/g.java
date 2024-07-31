package androidx.camera.core.impl;

import androidx.camera.core.impl.y1;
import java.util.List;

/* loaded from: classes.dex */
final class g extends y1.e {

    /* renamed from: a */
    private final r0 f2474a;

    /* renamed from: b */
    private final List<r0> f2475b;

    /* renamed from: c */
    private final String f2476c;

    /* renamed from: d */
    private final int f2477d;

    /* renamed from: e */
    private final w.y f2478e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends y1.e.a {

        /* renamed from: a */
        private r0 f2479a;

        /* renamed from: b */
        private List<r0> f2480b;

        /* renamed from: c */
        private String f2481c;

        /* renamed from: d */
        private Integer f2482d;

        /* renamed from: e */
        private w.y f2483e;

        @Override // androidx.camera.core.impl.y1.e.a
        public y1.e a() {
            String str = "";
            if (this.f2479a == null) {
                str = " surface";
            }
            if (this.f2480b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f2482d == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f2483e == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new g(this.f2479a, this.f2480b, this.f2481c, this.f2482d.intValue(), this.f2483e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.y1.e.a
        public y1.e.a b(w.y yVar) {
            if (yVar == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f2483e = yVar;
            return this;
        }

        @Override // androidx.camera.core.impl.y1.e.a
        public y1.e.a c(String str) {
            this.f2481c = str;
            return this;
        }

        @Override // androidx.camera.core.impl.y1.e.a
        public y1.e.a d(List<r0> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f2480b = list;
            return this;
        }

        @Override // androidx.camera.core.impl.y1.e.a
        public y1.e.a e(int i10) {
            this.f2482d = Integer.valueOf(i10);
            return this;
        }

        public y1.e.a f(r0 r0Var) {
            if (r0Var == null) {
                throw new NullPointerException("Null surface");
            }
            this.f2479a = r0Var;
            return this;
        }
    }

    private g(r0 r0Var, List<r0> list, String str, int i10, w.y yVar) {
        this.f2474a = r0Var;
        this.f2475b = list;
        this.f2476c = str;
        this.f2477d = i10;
        this.f2478e = yVar;
    }

    /* synthetic */ g(r0 r0Var, List list, String str, int i10, w.y yVar, a aVar) {
        this(r0Var, list, str, i10, yVar);
    }

    @Override // androidx.camera.core.impl.y1.e
    public w.y b() {
        return this.f2478e;
    }

    @Override // androidx.camera.core.impl.y1.e
    public String c() {
        return this.f2476c;
    }

    @Override // androidx.camera.core.impl.y1.e
    public List<r0> d() {
        return this.f2475b;
    }

    @Override // androidx.camera.core.impl.y1.e
    public r0 e() {
        return this.f2474a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y1.e)) {
            return false;
        }
        y1.e eVar = (y1.e) obj;
        return this.f2474a.equals(eVar.e()) && this.f2475b.equals(eVar.d()) && ((str = this.f2476c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f2477d == eVar.f() && this.f2478e.equals(eVar.b());
    }

    @Override // androidx.camera.core.impl.y1.e
    public int f() {
        return this.f2477d;
    }

    public int hashCode() {
        int hashCode = (((this.f2474a.hashCode() ^ 1000003) * 1000003) ^ this.f2475b.hashCode()) * 1000003;
        String str = this.f2476c;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f2477d) * 1000003) ^ this.f2478e.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f2474a + ", sharedSurfaces=" + this.f2475b + ", physicalCameraId=" + this.f2476c + ", surfaceGroupId=" + this.f2477d + ", dynamicRange=" + this.f2478e + "}";
    }
}
