package md;

import java.lang.annotation.Annotation;
import md.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f21420a;

    /* renamed from: b, reason: collision with root package name */
    private d.a f21421b = d.a.DEFAULT;

    /* renamed from: md.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0344a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final int f21422a;

        /* renamed from: b, reason: collision with root package name */
        private final d.a f21423b;

        C0344a(int i10, d.a aVar) {
            this.f21422a = i10;
            this.f21423b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f21422a == dVar.tag() && this.f21423b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f21422a) + (this.f21423b.hashCode() ^ 2041407134);
        }

        @Override // md.d
        public d.a intEncoding() {
            return this.f21423b;
        }

        @Override // md.d
        public int tag() {
            return this.f21422a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f21422a + "intEncoding=" + this.f21423b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0344a(this.f21420a, this.f21421b);
    }

    public a c(int i10) {
        this.f21420a = i10;
        return this;
    }
}
