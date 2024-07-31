package i6;

import android.content.Context;

/* loaded from: classes.dex */
public final class l implements j6.b<k> {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<Context> f17180a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<i> f17181b;

    public l(bk.a<Context> aVar, bk.a<i> aVar2) {
        this.f17180a = aVar;
        this.f17181b = aVar2;
    }

    public static l a(bk.a<Context> aVar, bk.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f17180a.get(), this.f17181b.get());
    }
}
