package be;

import android.app.Application;
import zd.q3;
import zd.r3;
import zd.v2;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final zb.g f6431a;

    /* renamed from: b, reason: collision with root package name */
    private final fe.f f6432b;

    /* renamed from: c, reason: collision with root package name */
    private final ce.a f6433c;

    public d(zb.g gVar, fe.f fVar, ce.a aVar) {
        this.f6431a = gVar;
        this.f6432b = fVar;
        this.f6433c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zd.d a(bk.a<zd.l0> aVar, Application application, v2 v2Var) {
        return new zd.d(aVar, this.f6431a, application, this.f6433c, v2Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zd.n b(q3 q3Var, nd.d dVar) {
        return new zd.n(this.f6431a, q3Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zb.g c() {
        return this.f6431a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public fe.f d() {
        return this.f6432b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q3 e() {
        return new q3(this.f6431a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r3 f(q3 q3Var) {
        return new r3(q3Var);
    }
}
