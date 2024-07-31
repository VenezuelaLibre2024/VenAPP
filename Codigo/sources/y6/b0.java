package y6;

import java.util.Arrays;
import t6.u1;

/* loaded from: classes.dex */
public interface b0 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f31689a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f31690b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31691c;

        /* renamed from: d, reason: collision with root package name */
        public final int f31692d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f31689a = i10;
            this.f31690b = bArr;
            this.f31691c = i11;
            this.f31692d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f31689a == aVar.f31689a && this.f31691c == aVar.f31691c && this.f31692d == aVar.f31692d && Arrays.equals(this.f31690b, aVar.f31690b);
        }

        public int hashCode() {
            return (((((this.f31689a * 31) + Arrays.hashCode(this.f31690b)) * 31) + this.f31691c) * 31) + this.f31692d;
        }
    }

    default void a(t8.e0 e0Var, int i10) {
        d(e0Var, i10, 0);
    }

    void b(long j10, int i10, int i11, int i12, a aVar);

    void c(u1 u1Var);

    void d(t8.e0 e0Var, int i10, int i11);

    int e(s8.h hVar, int i10, boolean z10, int i11);

    default int f(s8.h hVar, int i10, boolean z10) {
        return e(hVar, i10, z10, 0);
    }
}
