package q8;

import java.util.List;
import t6.d4;
import t6.u1;
import v7.a0;
import v7.d1;

/* loaded from: classes.dex */
public interface r extends u {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final d1 f23717a;

        /* renamed from: b */
        public final int[] f23718b;

        /* renamed from: c */
        public final int f23719c;

        public a(d1 d1Var, int... iArr) {
            this(d1Var, iArr, 0);
        }

        public a(d1 d1Var, int[] iArr, int i10) {
            if (iArr.length == 0) {
                t8.s.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f23717a = d1Var;
            this.f23718b = iArr;
            this.f23719c = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        r[] a(a[] aVarArr, s8.e eVar, a0.b bVar, d4 d4Var);
    }

    void f();

    void g(long j10, long j11, long j12, List<? extends x7.n> list, x7.o[] oVarArr);

    int h();

    boolean i(int i10, long j10);

    boolean j(int i10, long j10);

    default boolean k(long j10, x7.f fVar, List<? extends x7.n> list) {
        return false;
    }

    void l(float f10);

    Object m();

    default void n() {
    }

    default void o(boolean z10) {
    }

    void p();

    int q(long j10, List<? extends x7.n> list);

    int r();

    u1 s();

    int t();

    default void u() {
    }
}
