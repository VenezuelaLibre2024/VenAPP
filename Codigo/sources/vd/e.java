package vd;

import android.view.LayoutInflater;
import ud.l;

/* loaded from: classes.dex */
public final class e implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<l> f28971a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<LayoutInflater> f28972b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<de.i> f28973c;

    public e(bk.a<l> aVar, bk.a<LayoutInflater> aVar2, bk.a<de.i> aVar3) {
        this.f28971a = aVar;
        this.f28972b = aVar2;
        this.f28973c = aVar3;
    }

    public static e a(bk.a<l> aVar, bk.a<LayoutInflater> aVar2, bk.a<de.i> aVar3) {
        return new e(aVar, aVar2, aVar3);
    }

    public static d c(l lVar, LayoutInflater layoutInflater, de.i iVar) {
        return new d(lVar, layoutInflater, iVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.f28971a.get(), this.f28972b.get(), this.f28973c.get());
    }
}
