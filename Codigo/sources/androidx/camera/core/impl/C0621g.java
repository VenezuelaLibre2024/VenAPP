package androidx.camera.core.impl;

import androidx.camera.core.impl.C0701y1;
import java.util.List;
import p407w.C12048y;

/* renamed from: androidx.camera.core.impl.g */
/* loaded from: classes.dex */
final class C0621g extends C0701y1.e {

    /* renamed from: a */
    private final AbstractC0661r0 f2812a;

    /* renamed from: b */
    private final List<AbstractC0661r0> f2813b;

    /* renamed from: c */
    private final String f2814c;

    /* renamed from: d */
    private final int f2815d;

    /* renamed from: e */
    private final C12048y f2816e;

    /* renamed from: androidx.camera.core.impl.g$b */
    /* loaded from: classes.dex */
    static final class b extends C0701y1.e.a {

        /* renamed from: a */
        private AbstractC0661r0 f2817a;

        /* renamed from: b */
        private List<AbstractC0661r0> f2818b;

        /* renamed from: c */
        private String f2819c;

        /* renamed from: d */
        private Integer f2820d;

        /* renamed from: e */
        private C12048y f2821e;

        @Override // androidx.camera.core.impl.C0701y1.e.a
        /* renamed from: a */
        public C0701y1.e mo3078a() {
            String str = "";
            if (this.f2817a == null) {
                str = " surface";
            }
            if (this.f2818b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f2820d == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f2821e == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C0621g(this.f2817a, this.f2818b, this.f2819c, this.f2820d.intValue(), this.f2821e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.C0701y1.e.a
        /* renamed from: b */
        public C0701y1.e.a mo3079b(C12048y c12048y) {
            if (c12048y == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f2821e = c12048y;
            return this;
        }

        @Override // androidx.camera.core.impl.C0701y1.e.a
        /* renamed from: c */
        public C0701y1.e.a mo3080c(String str) {
            this.f2819c = str;
            return this;
        }

        @Override // androidx.camera.core.impl.C0701y1.e.a
        /* renamed from: d */
        public C0701y1.e.a mo3081d(List<AbstractC0661r0> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f2818b = list;
            return this;
        }

        @Override // androidx.camera.core.impl.C0701y1.e.a
        /* renamed from: e */
        public C0701y1.e.a mo3082e(int i10) {
            this.f2820d = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: f */
        public C0701y1.e.a m3083f(AbstractC0661r0 abstractC0661r0) {
            if (abstractC0661r0 == null) {
                throw new NullPointerException("Null surface");
            }
            this.f2817a = abstractC0661r0;
            return this;
        }
    }

    private C0621g(AbstractC0661r0 abstractC0661r0, List<AbstractC0661r0> list, String str, int i10, C12048y c12048y) {
        this.f2812a = abstractC0661r0;
        this.f2813b = list;
        this.f2814c = str;
        this.f2815d = i10;
        this.f2816e = c12048y;
    }

    @Override // androidx.camera.core.impl.C0701y1.e
    /* renamed from: b */
    public C12048y mo3073b() {
        return this.f2816e;
    }

    @Override // androidx.camera.core.impl.C0701y1.e
    /* renamed from: c */
    public String mo3074c() {
        return this.f2814c;
    }

    @Override // androidx.camera.core.impl.C0701y1.e
    /* renamed from: d */
    public List<AbstractC0661r0> mo3075d() {
        return this.f2813b;
    }

    @Override // androidx.camera.core.impl.C0701y1.e
    /* renamed from: e */
    public AbstractC0661r0 mo3076e() {
        return this.f2812a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0701y1.e)) {
            return false;
        }
        C0701y1.e eVar = (C0701y1.e) obj;
        return this.f2812a.equals(eVar.mo3076e()) && this.f2813b.equals(eVar.mo3075d()) && ((str = this.f2814c) != null ? str.equals(eVar.mo3074c()) : eVar.mo3074c() == null) && this.f2815d == eVar.mo3077f() && this.f2816e.equals(eVar.mo3073b());
    }

    @Override // androidx.camera.core.impl.C0701y1.e
    /* renamed from: f */
    public int mo3077f() {
        return this.f2815d;
    }

    public int hashCode() {
        int hashCode = (((this.f2812a.hashCode() ^ 1000003) * 1000003) ^ this.f2813b.hashCode()) * 1000003;
        String str = this.f2814c;
        return ((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f2815d) * 1000003) ^ this.f2816e.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f2812a + ", sharedSurfaces=" + this.f2813b + ", physicalCameraId=" + this.f2814c + ", surfaceGroupId=" + this.f2815d + ", dynamicRange=" + this.f2816e + "}";
    }
}
