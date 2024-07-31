package ud;

import android.app.Application;

/* loaded from: classes.dex */
public final class b implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<Application> f27589a;

    public b(bk.a<Application> aVar) {
        this.f27589a = aVar;
    }

    public static b a(bk.a<Application> aVar) {
        return new b(aVar);
    }

    public static a c(Application application) {
        return new a(application);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f27589a.get());
    }
}
