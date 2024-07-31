package t;

import androidx.camera.camera2.internal.x2;
import androidx.camera.core.impl.t1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final s.h f25695a;

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface a {
        void a(x2 x2Var);
    }

    public h(t1 t1Var) {
        this.f25695a = (s.h) t1Var.b(s.h.class);
    }

    private void a(Set<x2> set) {
        for (x2 x2Var : set) {
            x2Var.c().p(x2Var);
        }
    }

    private void b(Set<x2> set) {
        for (x2 x2Var : set) {
            x2Var.c().q(x2Var);
        }
    }

    public void c(x2 x2Var, List<x2> list, List<x2> list2, a aVar) {
        x2 next;
        x2 next2;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<x2> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != x2Var) {
                linkedHashSet.add(next2);
            }
            b(linkedHashSet);
        }
        aVar.a(x2Var);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<x2> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != x2Var) {
                linkedHashSet2.add(next);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f25695a != null;
    }
}
