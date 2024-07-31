package v6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f28059a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f28060e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f28061a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28062b;

        /* renamed from: c, reason: collision with root package name */
        public final int f28063c;

        /* renamed from: d, reason: collision with root package name */
        public final int f28064d;

        public a(int i10, int i11, int i12) {
            this.f28061a = i10;
            this.f28062b = i11;
            this.f28063c = i12;
            this.f28064d = t8.r0.u0(i12) ? t8.r0.e0(i12, i11) : -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28061a == aVar.f28061a && this.f28062b == aVar.f28062b && this.f28063c == aVar.f28063c;
        }

        public int hashCode() {
            return eb.k.b(Integer.valueOf(this.f28061a), Integer.valueOf(this.f28062b), Integer.valueOf(this.f28063c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f28061a + ", channelCount=" + this.f28062b + ", encoding=" + this.f28063c + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    boolean a();

    ByteBuffer b();

    a c(a aVar);

    void d(ByteBuffer byteBuffer);

    boolean e();

    void f();

    void flush();

    void reset();
}
