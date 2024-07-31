package xd;

import android.app.Application;

/* loaded from: classes.dex */
public final class d implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final c f31184a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<Application> f31185b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<ud.j> f31186c;

    public d(c cVar, bk.a<Application> aVar, bk.a<ud.j> aVar2) {
        this.f31184a = cVar;
        this.f31185b = aVar;
        this.f31186c = aVar2;
    }

    public static d a(c cVar, bk.a<Application> aVar, bk.a<ud.j> aVar2) {
        return new d(cVar, aVar, aVar2);
    }

    public static com.bumptech.glide.k c(c cVar, Application application, ud.j jVar) {
        return (com.bumptech.glide.k) td.d.d(cVar.a(application, jVar));
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.k get() {
        return c(this.f31184a, this.f31185b.get(), this.f31186c.get());
    }
}
