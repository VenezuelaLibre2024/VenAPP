package qe;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final zb.g f23968a;

    /* renamed from: b, reason: collision with root package name */
    private final fe.f f23969b;

    /* renamed from: c, reason: collision with root package name */
    private final ee.b<com.google.firebase.remoteconfig.c> f23970c;

    /* renamed from: d, reason: collision with root package name */
    private final ee.b<f6.g> f23971d;

    public a(zb.g gVar, fe.f fVar, ee.b<com.google.firebase.remoteconfig.c> bVar, ee.b<f6.g> bVar2) {
        this.f23968a = gVar;
        this.f23969b = fVar;
        this.f23970c = bVar;
        this.f23971d = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.firebase.perf.config.a a() {
        return com.google.firebase.perf.config.a.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zb.g b() {
        return this.f23968a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fe.f c() {
        return this.f23969b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ee.b<com.google.firebase.remoteconfig.c> d() {
        return this.f23970c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionManager f() {
        return SessionManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ee.b<f6.g> g() {
        return this.f23971d;
    }
}
