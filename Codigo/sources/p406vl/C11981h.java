package p406vl;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import p319ql.C10529e0;

/* renamed from: vl.h */
/* loaded from: classes3.dex */
public final class C11981h {

    /* renamed from: a */
    private final Set<C10529e0> f31831a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m38501a(C10529e0 route) {
        C9322n.m27781e(route, "route");
        this.f31831a.remove(route);
    }

    /* renamed from: b */
    public final synchronized void m38502b(C10529e0 failedRoute) {
        C9322n.m27781e(failedRoute, "failedRoute");
        this.f31831a.add(failedRoute);
    }

    /* renamed from: c */
    public final synchronized boolean m38503c(C10529e0 route) {
        C9322n.m27781e(route, "route");
        return this.f31831a.contains(route);
    }
}
