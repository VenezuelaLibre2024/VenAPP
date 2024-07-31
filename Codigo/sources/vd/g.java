package vd;

import android.view.LayoutInflater;
import ud.l;

/* loaded from: classes.dex */
public final class g implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<l> f28978a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<LayoutInflater> f28979b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<de.i> f28980c;

    public g(bk.a<l> aVar, bk.a<LayoutInflater> aVar2, bk.a<de.i> aVar3) {
        this.f28978a = aVar;
        this.f28979b = aVar2;
        this.f28980c = aVar3;
    }

    public static g a(bk.a<l> aVar, bk.a<LayoutInflater> aVar2, bk.a<de.i> aVar3) {
        return new g(aVar, aVar2, aVar3);
    }

    public static f c(l lVar, LayoutInflater layoutInflater, de.i iVar) {
        return new f(lVar, layoutInflater, iVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c(this.f28978a.get(), this.f28979b.get(), this.f28980c.get());
    }
}
