package vi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import vi.l;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    private static final o f29172b = new o(new l.a(), l.b.f29160a);

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap<String, n> f29173a = new ConcurrentHashMap();

    o(n... nVarArr) {
        for (n nVar : nVarArr) {
            this.f29173a.put(nVar.a(), nVar);
        }
    }

    public static o a() {
        return f29172b;
    }

    public n b(String str) {
        return this.f29173a.get(str);
    }
}
