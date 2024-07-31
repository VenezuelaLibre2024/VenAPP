package v7;

import android.os.Handler;
import t6.c2;
import t6.d4;
import u6.m3;

/* loaded from: classes.dex */
public interface a0 {

    /* loaded from: classes.dex */
    public interface a {
        a0 a(c2 c2Var);

        a b(x6.x xVar);

        a c(s8.d0 d0Var);
    }

    /* loaded from: classes.dex */
    public static final class b extends z {
        public b(Object obj) {
            super(obj);
        }

        public b(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public b(Object obj, long j10) {
            super(obj, j10);
        }

        public b(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        public b(z zVar) {
            super(zVar);
        }

        public b c(Object obj) {
            return new b(super.a(obj));
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(a0 a0Var, d4 d4Var);
    }

    void a(c cVar, s8.m0 m0Var, m3 m3Var);

    void b(c cVar);

    void c(c cVar);

    c2 d();

    y e(b bVar, s8.b bVar2, long j10);

    void f(c cVar);

    void g(h0 h0Var);

    void j(Handler handler, h0 h0Var);

    void l(y yVar);

    void n();

    default boolean o() {
        return true;
    }

    default d4 p() {
        return null;
    }

    void q(x6.u uVar);

    void s(Handler handler, x6.u uVar);
}
