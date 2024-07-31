package aj;

import aj.b;
import eb.o;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class b<S extends b<S>> {

    /* renamed from: a, reason: collision with root package name */
    private final vi.d f455a;

    /* renamed from: b, reason: collision with root package name */
    private final vi.c f456b;

    /* loaded from: classes3.dex */
    public interface a<T extends b<T>> {
        T a(vi.d dVar, vi.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(vi.d dVar, vi.c cVar) {
        this.f455a = (vi.d) o.p(dVar, "channel");
        this.f456b = (vi.c) o.p(cVar, "callOptions");
    }

    protected abstract S a(vi.d dVar, vi.c cVar);

    public final vi.c b() {
        return this.f456b;
    }

    public final vi.d c() {
        return this.f455a;
    }

    public final S d(long j10, TimeUnit timeUnit) {
        return a(this.f455a, this.f456b.m(j10, timeUnit));
    }
}
