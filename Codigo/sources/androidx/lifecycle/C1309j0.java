package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C9322n;

/* renamed from: androidx.lifecycle.j0 */
/* loaded from: classes.dex */
public class C1309j0 {

    /* renamed from: a */
    private final Map<String, AbstractC1303g0> f5703a = new LinkedHashMap();

    /* renamed from: a */
    public final void m7347a() {
        Iterator<AbstractC1303g0> it = this.f5703a.values().iterator();
        while (it.hasNext()) {
            it.next().m7333a();
        }
        this.f5703a.clear();
    }

    /* renamed from: b */
    public final AbstractC1303g0 m7348b(String key) {
        C9322n.m27781e(key, "key");
        return this.f5703a.get(key);
    }

    /* renamed from: c */
    public final Set<String> m7349c() {
        return new HashSet(this.f5703a.keySet());
    }

    /* renamed from: d */
    public final void m7350d(String key, AbstractC1303g0 viewModel) {
        C9322n.m27781e(key, "key");
        C9322n.m27781e(viewModel, "viewModel");
        AbstractC1303g0 put = this.f5703a.put(key, viewModel);
        if (put != null) {
            put.mo7144d();
        }
    }
}
