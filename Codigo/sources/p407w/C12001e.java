package p407w;

import android.graphics.Rect;
import android.util.Size;
import p407w.C12041u0;

/* renamed from: w.e */
/* loaded from: classes.dex */
final class C12001e extends C12041u0.a {

    /* renamed from: a */
    private final Size f31908a;

    /* renamed from: b */
    private final Rect f31909b;

    /* renamed from: c */
    private final int f31910c;

    /* renamed from: w.e$b */
    /* loaded from: classes.dex */
    static final class b extends C12041u0.a.AbstractC13261a {

        /* renamed from: a */
        private Size f31911a;

        /* renamed from: b */
        private Rect f31912b;

        /* renamed from: c */
        private Integer f31913c;

        @Override // p407w.C12041u0.a.AbstractC13261a
        /* renamed from: a */
        C12041u0.a mo38578a() {
            String str = "";
            if (this.f31911a == null) {
                str = " resolution";
            }
            if (this.f31912b == null) {
                str = str + " cropRect";
            }
            if (this.f31913c == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new C12001e(this.f31911a, this.f31912b, this.f31913c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p407w.C12041u0.a.AbstractC13261a
        /* renamed from: b */
        C12041u0.a.AbstractC13261a mo38579b(Rect rect) {
            if (rect == null) {
                throw new NullPointerException("Null cropRect");
            }
            this.f31912b = rect;
            return this;
        }

        @Override // p407w.C12041u0.a.AbstractC13261a
        /* renamed from: c */
        C12041u0.a.AbstractC13261a mo38580c(int i10) {
            this.f31913c = Integer.valueOf(i10);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public C12041u0.a.AbstractC13261a m38581d(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f31911a = size;
            return this;
        }
    }

    private C12001e(Size size, Rect rect, int i10) {
        this.f31908a = size;
        this.f31909b = rect;
        this.f31910c = i10;
    }

    @Override // p407w.C12041u0.a
    /* renamed from: a */
    Rect mo38575a() {
        return this.f31909b;
    }

    @Override // p407w.C12041u0.a
    /* renamed from: b */
    Size mo38576b() {
        return this.f31908a;
    }

    @Override // p407w.C12041u0.a
    /* renamed from: c */
    int mo38577c() {
        return this.f31910c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12041u0.a)) {
            return false;
        }
        C12041u0.a aVar = (C12041u0.a) obj;
        return this.f31908a.equals(aVar.mo38576b()) && this.f31909b.equals(aVar.mo38575a()) && this.f31910c == aVar.mo38577c();
    }

    public int hashCode() {
        return ((((this.f31908a.hashCode() ^ 1000003) * 1000003) ^ this.f31909b.hashCode()) * 1000003) ^ this.f31910c;
    }

    public String toString() {
        return "ResolutionInfoInternal{resolution=" + this.f31908a + ", cropRect=" + this.f31909b + ", rotationDegrees=" + this.f31910c + "}";
    }
}
