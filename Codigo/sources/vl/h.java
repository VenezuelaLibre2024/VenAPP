package vl;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.n;
import ql.e0;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Set<e0> f29393a = new LinkedHashSet();

    public final synchronized void a(e0 route) {
        n.e(route, "route");
        this.f29393a.remove(route);
    }

    public final synchronized void b(e0 failedRoute) {
        n.e(failedRoute, "failedRoute");
        this.f29393a.add(failedRoute);
    }

    public final synchronized boolean c(e0 route) {
        n.e(route, "route");
        return this.f29393a.contains(route);
    }
}
