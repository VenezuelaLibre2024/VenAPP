package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, g0> f4949a = new LinkedHashMap();

    public final void a() {
        Iterator<g0> it = this.f4949a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f4949a.clear();
    }

    public final g0 b(String key) {
        kotlin.jvm.internal.n.e(key, "key");
        return this.f4949a.get(key);
    }

    public final Set<String> c() {
        return new HashSet(this.f4949a.keySet());
    }

    public final void d(String key, g0 viewModel) {
        kotlin.jvm.internal.n.e(key, "key");
        kotlin.jvm.internal.n.e(viewModel, "viewModel");
        g0 put = this.f4949a.put(key, viewModel);
        if (put != null) {
            put.d();
        }
    }
}
