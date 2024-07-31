package zk;

import gk.Continuation;

/* loaded from: classes3.dex */
public final class p {
    public static final void a(m<?> mVar, c1 c1Var) {
        mVar.k(new d1(c1Var));
    }

    public static final <T> n<T> b(Continuation<? super T> continuation) {
        if (!(continuation instanceof el.j)) {
            return new n<>(continuation, 1);
        }
        n<T> m10 = ((el.j) continuation).m();
        if (m10 != null) {
            if (!m10.J()) {
                m10 = null;
            }
            if (m10 != null) {
                return m10;
            }
        }
        return new n<>(continuation, 2);
    }
}
