package vd;

import android.view.LayoutInflater;
import ud.l;

/* loaded from: classes.dex */
public final class b implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<l> f28953a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<LayoutInflater> f28954b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<de.i> f28955c;

    public b(bk.a<l> aVar, bk.a<LayoutInflater> aVar2, bk.a<de.i> aVar3) {
        this.f28953a = aVar;
        this.f28954b = aVar2;
        this.f28955c = aVar3;
    }

    public static b a(bk.a<l> aVar, bk.a<LayoutInflater> aVar2, bk.a<de.i> aVar3) {
        return new b(aVar, aVar2, aVar3);
    }

    public static a c(l lVar, LayoutInflater layoutInflater, de.i iVar) {
        return new a(lVar, layoutInflater, iVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c(this.f28953a.get(), this.f28954b.get(), this.f28955c.get());
    }
}
