package rc;

import android.os.Bundle;
import cc.a;
import ee.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import sc.g;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final ee.a<cc.a> f24928a;

    /* renamed from: b, reason: collision with root package name */
    private volatile tc.a f24929b;

    /* renamed from: c, reason: collision with root package name */
    private volatile uc.b f24930c;

    /* renamed from: d, reason: collision with root package name */
    private final List<uc.a> f24931d;

    public d(ee.a<cc.a> aVar) {
        this(aVar, new uc.c(), new tc.f());
    }

    public d(ee.a<cc.a> aVar, uc.b bVar, tc.a aVar2) {
        this.f24928a = aVar;
        this.f24930c = bVar;
        this.f24931d = new ArrayList();
        this.f24929b = aVar2;
        f();
    }

    private void f() {
        this.f24928a.a(new a.InterfaceC0227a() { // from class: rc.c
            @Override // ee.a.InterfaceC0227a
            public final void a(ee.b bVar) {
                d.this.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f24929b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(uc.a aVar) {
        synchronized (this) {
            if (this.f24930c instanceof uc.c) {
                this.f24931d.add(aVar);
            }
            this.f24930c.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(ee.b bVar) {
        g.f().b("AnalyticsConnector now available.");
        cc.a aVar = (cc.a) bVar.get();
        tc.e eVar = new tc.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) == null) {
            g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        g.f().b("Registered Firebase Analytics listener.");
        tc.d dVar = new tc.d();
        tc.c cVar = new tc.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            Iterator<uc.a> it = this.f24931d.iterator();
            while (it.hasNext()) {
                dVar.a(it.next());
            }
            eVar2.d(dVar);
            eVar2.e(cVar);
            this.f24930c = dVar;
            this.f24929b = cVar;
        }
    }

    private static a.InterfaceC0120a j(cc.a aVar, e eVar) {
        a.InterfaceC0120a b10 = aVar.b("clx", eVar);
        if (b10 == null) {
            g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            b10 = aVar.b("crash", eVar);
            if (b10 != null) {
                g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return b10;
    }

    public tc.a d() {
        return new tc.a() { // from class: rc.b
            @Override // tc.a
            public final void a(String str, Bundle bundle) {
                d.this.g(str, bundle);
            }
        };
    }

    public uc.b e() {
        return new uc.b() { // from class: rc.a
            @Override // uc.b
            public final void a(uc.a aVar) {
                d.this.h(aVar);
            }
        };
    }
}
