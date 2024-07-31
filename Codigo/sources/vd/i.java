package vd;

import android.view.LayoutInflater;
import ud.l;

/* loaded from: classes.dex */
public final class i implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<l> f28992a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<LayoutInflater> f28993b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<de.i> f28994c;

    public i(bk.a<l> aVar, bk.a<LayoutInflater> aVar2, bk.a<de.i> aVar3) {
        this.f28992a = aVar;
        this.f28993b = aVar2;
        this.f28994c = aVar3;
    }

    public static i a(bk.a<l> aVar, bk.a<LayoutInflater> aVar2, bk.a<de.i> aVar3) {
        return new i(aVar, aVar2, aVar3);
    }

    public static h c(l lVar, LayoutInflater layoutInflater, de.i iVar) {
        return new h(lVar, layoutInflater, iVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f28992a.get(), this.f28993b.get(), this.f28994c.get());
    }
}
