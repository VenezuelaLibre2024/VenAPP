package t;

import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.t1;
import java.util.Iterator;
import java.util.List;
import s.b0;
import s.g0;
import w.o0;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25696a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25697b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f25698c;

    public i(t1 t1Var, t1 t1Var2) {
        this.f25696a = t1Var2.a(g0.class);
        this.f25697b = t1Var.a(b0.class);
        this.f25698c = t1Var.a(s.j.class);
    }

    public void a(List<r0> list) {
        if (!b() || list == null) {
            return;
        }
        Iterator<r0> it = list.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        o0.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f25696a || this.f25697b || this.f25698c;
    }
}
