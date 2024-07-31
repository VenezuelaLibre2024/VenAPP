package p396v6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p082eb.C7155k;
import p363t8.C11172r0;

/* renamed from: v6.i */
/* loaded from: classes.dex */
public interface InterfaceC11647i {

    /* renamed from: a */
    public static final ByteBuffer f30409a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: v6.i$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e */
        public static final a f30410e = new a(-1, -1, -1);

        /* renamed from: a */
        public final int f30411a;

        /* renamed from: b */
        public final int f30412b;

        /* renamed from: c */
        public final int f30413c;

        /* renamed from: d */
        public final int f30414d;

        public a(int i10, int i11, int i12) {
            this.f30411a = i10;
            this.f30412b = i11;
            this.f30413c = i12;
            this.f30414d = C11172r0.m34951u0(i12) ? C11172r0.m34919e0(i12, i11) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30411a == aVar.f30411a && this.f30412b == aVar.f30412b && this.f30413c == aVar.f30413c;
        }

        public int hashCode() {
            return C7155k.m21290b(Integer.valueOf(this.f30411a), Integer.valueOf(this.f30412b), Integer.valueOf(this.f30413c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f30411a + ", channelCount=" + this.f30412b + ", encoding=" + this.f30413c + ']';
        }
    }

    /* renamed from: v6.i$b */
    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* renamed from: a */
    boolean mo36621a();

    /* renamed from: b */
    ByteBuffer mo36622b();

    /* renamed from: c */
    a mo36623c(a aVar);

    /* renamed from: d */
    void mo36464d(ByteBuffer byteBuffer);

    /* renamed from: e */
    boolean mo36624e();

    /* renamed from: f */
    void mo36625f();

    void flush();

    void reset();
}
