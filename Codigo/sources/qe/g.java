package qe;

import com.google.firebase.perf.session.SessionManager;

/* loaded from: classes.dex */
public final class g implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f23977a;

    public g(a aVar) {
        this.f23977a = aVar;
    }

    public static g a(a aVar) {
        return new g(aVar);
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) hi.b.c(aVar.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return c(this.f23977a);
    }
}
