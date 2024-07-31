package qe;

import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes.dex */
public final class f implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f23976a;

    public f(a aVar) {
        this.f23976a = aVar;
    }

    public static f a(a aVar) {
        return new f(aVar);
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) hi.b.c(aVar.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return c(this.f23976a);
    }
}
