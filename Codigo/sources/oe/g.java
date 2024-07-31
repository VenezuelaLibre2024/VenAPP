package oe;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* loaded from: classes.dex */
public final class g implements bk.a {

    /* renamed from: a, reason: collision with root package name */
    private final bk.a<zb.g> f22532a;

    /* renamed from: b, reason: collision with root package name */
    private final bk.a<ee.b<com.google.firebase.remoteconfig.c>> f22533b;

    /* renamed from: c, reason: collision with root package name */
    private final bk.a<fe.f> f22534c;

    /* renamed from: d, reason: collision with root package name */
    private final bk.a<ee.b<f6.g>> f22535d;

    /* renamed from: e, reason: collision with root package name */
    private final bk.a<RemoteConfigManager> f22536e;

    /* renamed from: f, reason: collision with root package name */
    private final bk.a<com.google.firebase.perf.config.a> f22537f;

    /* renamed from: g, reason: collision with root package name */
    private final bk.a<SessionManager> f22538g;

    public g(bk.a<zb.g> aVar, bk.a<ee.b<com.google.firebase.remoteconfig.c>> aVar2, bk.a<fe.f> aVar3, bk.a<ee.b<f6.g>> aVar4, bk.a<RemoteConfigManager> aVar5, bk.a<com.google.firebase.perf.config.a> aVar6, bk.a<SessionManager> aVar7) {
        this.f22532a = aVar;
        this.f22533b = aVar2;
        this.f22534c = aVar3;
        this.f22535d = aVar4;
        this.f22536e = aVar5;
        this.f22537f = aVar6;
        this.f22538g = aVar7;
    }

    public static g a(bk.a<zb.g> aVar, bk.a<ee.b<com.google.firebase.remoteconfig.c>> aVar2, bk.a<fe.f> aVar3, bk.a<ee.b<f6.g>> aVar4, bk.a<RemoteConfigManager> aVar5, bk.a<com.google.firebase.perf.config.a> aVar6, bk.a<SessionManager> aVar7) {
        return new g(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static e c(zb.g gVar, ee.b<com.google.firebase.remoteconfig.c> bVar, fe.f fVar, ee.b<f6.g> bVar2, RemoteConfigManager remoteConfigManager, com.google.firebase.perf.config.a aVar, SessionManager sessionManager) {
        return new e(gVar, bVar, fVar, bVar2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // bk.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f22532a.get(), this.f22533b.get(), this.f22534c.get(), this.f22535d.get(), this.f22536e.get(), this.f22537f.get(), this.f22538g.get());
    }
}
