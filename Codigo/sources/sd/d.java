package sd;

import android.app.Application;
import java.util.Map;
import qd.q;
import ud.l;
import ud.n;

/* loaded from: classes.dex */
public final class d implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<q> f25511a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<Map<String, bk.a<l>>> f25512b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<ud.e> f25513c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<n> f25514d;

    /* renamed from: e, reason: collision with root package name */
    private final bk.a<n> f25515e;

    /* renamed from: f, reason: collision with root package name */
    private final bk.a<ud.g> f25516f;

    /* renamed from: g, reason: collision with root package name */
    private final bk.a<Application> f25517g;

    /* renamed from: h, reason: collision with root package name */
    private final bk.a<ud.a> f25518h;

    /* renamed from: i, reason: collision with root package name */
    private final bk.a<ud.c> f25519i;

    public d(bk.a<q> aVar, bk.a<Map<String, bk.a<l>>> aVar2, bk.a<ud.e> aVar3, bk.a<n> aVar4, bk.a<n> aVar5, bk.a<ud.g> aVar6, bk.a<Application> aVar7, bk.a<ud.a> aVar8, bk.a<ud.c> aVar9) {
        this.f25511a = aVar;
        this.f25512b = aVar2;
        this.f25513c = aVar3;
        this.f25514d = aVar4;
        this.f25515e = aVar5;
        this.f25516f = aVar6;
        this.f25517g = aVar7;
        this.f25518h = aVar8;
        this.f25519i = aVar9;
    }

    public static d a(bk.a<q> aVar, bk.a<Map<String, bk.a<l>>> aVar2, bk.a<ud.e> aVar3, bk.a<n> aVar4, bk.a<n> aVar5, bk.a<ud.g> aVar6, bk.a<Application> aVar7, bk.a<ud.a> aVar8, bk.a<ud.c> aVar9) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static b c(q qVar, Map<String, bk.a<l>> map, ud.e eVar, n nVar, n nVar2, ud.g gVar, Application application, ud.a aVar, ud.c cVar) {
        return new b(qVar, map, eVar, nVar, nVar2, gVar, application, aVar, cVar);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f25511a.get(), this.f25512b.get(), this.f25513c.get(), this.f25514d.get(), this.f25515e.get(), this.f25516f.get(), this.f25517g.get(), this.f25518h.get(), this.f25519i.get());
    }
}
