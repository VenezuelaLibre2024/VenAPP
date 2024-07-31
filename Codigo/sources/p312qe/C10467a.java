package p312qe;

import com.google.firebase.perf.config.C6277a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.C6344c;
import ee.InterfaceC7183b;
import p098f6.InterfaceC7303g;
import p106fe.InterfaceC7337f;
import p485zb.C12867g;

/* renamed from: qe.a */
/* loaded from: classes.dex */
public class C10467a {

    /* renamed from: a */
    private final C12867g f26010a;

    /* renamed from: b */
    private final InterfaceC7337f f26011b;

    /* renamed from: c */
    private final InterfaceC7183b<C6344c> f26012c;

    /* renamed from: d */
    private final InterfaceC7183b<InterfaceC7303g> f26013d;

    public C10467a(C12867g c12867g, InterfaceC7337f interfaceC7337f, InterfaceC7183b<C6344c> interfaceC7183b, InterfaceC7183b<InterfaceC7303g> interfaceC7183b2) {
        this.f26010a = c12867g;
        this.f26011b = interfaceC7337f;
        this.f26012c = interfaceC7183b;
        this.f26013d = interfaceC7183b2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C6277a m31390a() {
        return C6277a.m17265g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C12867g m31391b() {
        return this.f26010a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public InterfaceC7337f m31392c() {
        return this.f26011b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC7183b<C6344c> m31393d() {
        return this.f26012c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public RemoteConfigManager m31394e() {
        return RemoteConfigManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public SessionManager m31395f() {
        return SessionManager.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public InterfaceC7183b<InterfaceC7303g> m31396g() {
        return this.f26013d;
    }
}
