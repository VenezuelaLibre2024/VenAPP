package p015aj;

import java.util.concurrent.TimeUnit;
import p015aj.AbstractC0126b;
import p082eb.C7159o;
import vi.AbstractC11904d;
import vi.C11901c;

/* renamed from: aj.b */
/* loaded from: classes3.dex */
public abstract class AbstractC0126b<S extends AbstractC0126b<S>> {

    /* renamed from: a */
    private final AbstractC11904d f520a;

    /* renamed from: b */
    private final C11901c f521b;

    /* renamed from: aj.b$a */
    /* loaded from: classes3.dex */
    public interface a<T extends AbstractC0126b<T>> {
        /* renamed from: a */
        T mo580a(AbstractC11904d abstractC11904d, C11901c c11901c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0126b(AbstractC11904d abstractC11904d, C11901c c11901c) {
        this.f520a = (AbstractC11904d) C7159o.m21313p(abstractC11904d, "channel");
        this.f521b = (C11901c) C7159o.m21313p(c11901c, "callOptions");
    }

    /* renamed from: a */
    protected abstract S mo576a(AbstractC11904d abstractC11904d, C11901c c11901c);

    /* renamed from: b */
    public final C11901c m577b() {
        return this.f521b;
    }

    /* renamed from: c */
    public final AbstractC11904d m578c() {
        return this.f520a;
    }

    /* renamed from: d */
    public final S m579d(long j10, TimeUnit timeUnit) {
        return mo576a(this.f520a, this.f521b.m38089m(j10, timeUnit));
    }
}
