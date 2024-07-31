package w;

import android.graphics.Rect;
import android.util.Size;
import w.u0;

/* loaded from: classes.dex */
final class e extends u0.a {

    /* renamed from: a */
    private final Size f29453a;

    /* renamed from: b */
    private final Rect f29454b;

    /* renamed from: c */
    private final int f29455c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u0.a.AbstractC0473a {

        /* renamed from: a */
        private Size f29456a;

        /* renamed from: b */
        private Rect f29457b;

        /* renamed from: c */
        private Integer f29458c;

        @Override // w.u0.a.AbstractC0473a
        u0.a a() {
            String str = "";
            if (this.f29456a == null) {
                str = " resolution";
            }
            if (this.f29457b == null) {
                str = str + " cropRect";
            }
            if (this.f29458c == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new e(this.f29456a, this.f29457b, this.f29458c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // w.u0.a.AbstractC0473a
        u0.a.AbstractC0473a b(Rect rect) {
            if (rect == null) {
                throw new NullPointerException("Null cropRect");
            }
            this.f29457b = rect;
            return this;
        }

        @Override // w.u0.a.AbstractC0473a
        u0.a.AbstractC0473a c(int i10) {
            this.f29458c = Integer.valueOf(i10);
            return this;
        }

        public u0.a.AbstractC0473a d(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f29456a = size;
            return this;
        }
    }

    private e(Size size, Rect rect, int i10) {
        this.f29453a = size;
        this.f29454b = rect;
        this.f29455c = i10;
    }

    /* synthetic */ e(Size size, Rect rect, int i10, a aVar) {
        this(size, rect, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // w.u0.a
    public Rect a() {
        return this.f29454b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // w.u0.a
    public Size b() {
        return this.f29453a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // w.u0.a
    public int c() {
        return this.f29455c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0.a)) {
            return false;
        }
        u0.a aVar = (u0.a) obj;
        return this.f29453a.equals(aVar.b()) && this.f29454b.equals(aVar.a()) && this.f29455c == aVar.c();
    }

    public int hashCode() {
        return ((((this.f29453a.hashCode() ^ 1000003) * 1000003) ^ this.f29454b.hashCode()) * 1000003) ^ this.f29455c;
    }

    public String toString() {
        return "ResolutionInfoInternal{resolution=" + this.f29453a + ", cropRect=" + this.f29454b + ", rotationDegrees=" + this.f29455c + "}";
    }
}
