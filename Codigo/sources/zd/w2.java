package zd;

import android.app.Application;

/* loaded from: classes.dex */
public final class w2 implements rd.b<v2> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<Application> f32772a;

    public w2(bk.a<Application> aVar) {
        this.f32772a = aVar;
    }

    public static w2 a(bk.a<Application> aVar) {
        return new w2(aVar);
    }

    public static v2 c(Application application) {
        return new v2(application);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public v2 get() {
        return c(this.f32772a.get());
    }
}
