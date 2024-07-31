package androidx.camera.core.impl;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public interface z1 {

    /* loaded from: classes.dex */
    public interface a {
    }

    void a(v1 v1Var);

    void b();

    void c();

    void d();

    default Set<Integer> e() {
        return Collections.emptySet();
    }

    default int f(n0 n0Var, a aVar) {
        return -1;
    }

    int g(a aVar);

    y1 h(w.o oVar, q1 q1Var, q1 q1Var2, q1 q1Var3);

    void i(n0 n0Var);

    int j(a aVar);
}
