package md;

import java.lang.annotation.Annotation;
import md.InterfaceC9569d;

/* renamed from: md.a */
/* loaded from: classes.dex */
public final class C9566a {

    /* renamed from: a */
    private int f23274a;

    /* renamed from: b */
    private InterfaceC9569d.a f23275b = InterfaceC9569d.a.DEFAULT;

    /* renamed from: md.a$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC9569d {

        /* renamed from: a */
        private final int f23276a;

        /* renamed from: b */
        private final InterfaceC9569d.a f23277b;

        a(int i10, InterfaceC9569d.a aVar) {
            this.f23276a = i10;
            this.f23277b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return InterfaceC9569d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC9569d)) {
                return false;
            }
            InterfaceC9569d interfaceC9569d = (InterfaceC9569d) obj;
            return this.f23276a == interfaceC9569d.tag() && this.f23277b.equals(interfaceC9569d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f23276a) + (this.f23277b.hashCode() ^ 2041407134);
        }

        @Override // md.InterfaceC9569d
        public InterfaceC9569d.a intEncoding() {
            return this.f23277b;
        }

        @Override // md.InterfaceC9569d
        public int tag() {
            return this.f23276a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f23276a + "intEncoding=" + this.f23277b + ')';
        }
    }

    /* renamed from: b */
    public static C9566a m28451b() {
        return new C9566a();
    }

    /* renamed from: a */
    public InterfaceC9569d m28452a() {
        return new a(this.f23274a, this.f23275b);
    }

    /* renamed from: c */
    public C9566a m28453c(int i10) {
        this.f23274a = i10;
        return this;
    }
}
