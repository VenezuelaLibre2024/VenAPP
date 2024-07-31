package be;

import android.app.Application;

/* loaded from: classes.dex */
public final class v implements rd.b<ij.a<String>> {

    /* renamed from: a, reason: collision with root package name */
    private final u f6475a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<Application> f6476b;

    public v(u uVar, bk.a<Application> aVar) {
        this.f6475a = uVar;
        this.f6476b = aVar;
    }

    public static v a(u uVar, bk.a<Application> aVar) {
        return new v(uVar, aVar);
    }

    public static ij.a<String> c(u uVar, Application application) {
        return (ij.a) rd.d.e(uVar.a(application));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ij.a<String> get() {
        return c(this.f6475a, this.f6476b.get());
    }
}
