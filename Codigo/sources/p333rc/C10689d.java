package p333rc;

import android.os.Bundle;
import cc.InterfaceC1940a;
import ee.InterfaceC7182a;
import ee.InterfaceC7183b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p381uc.C11531c;
import p381uc.InterfaceC11529a;
import p381uc.InterfaceC11530b;
import sc.C10889g;
import tc.C11239c;
import tc.C11240d;
import tc.C11241e;
import tc.C11242f;
import tc.InterfaceC11237a;

/* renamed from: rc.d */
/* loaded from: classes.dex */
public class C10689d {

    /* renamed from: a */
    private final InterfaceC7182a<InterfaceC1940a> f27044a;

    /* renamed from: b */
    private volatile InterfaceC11237a f27045b;

    /* renamed from: c */
    private volatile InterfaceC11530b f27046c;

    /* renamed from: d */
    private final List<InterfaceC11529a> f27047d;

    public C10689d(InterfaceC7182a<InterfaceC1940a> interfaceC7182a) {
        this(interfaceC7182a, new C11531c(), new C11242f());
    }

    public C10689d(InterfaceC7182a<InterfaceC1940a> interfaceC7182a, InterfaceC11530b interfaceC11530b, InterfaceC11237a interfaceC11237a) {
        this.f27044a = interfaceC7182a;
        this.f27046c = interfaceC11530b;
        this.f27047d = new ArrayList();
        this.f27045b = interfaceC11237a;
        m32546f();
    }

    /* renamed from: f */
    private void m32546f() {
        this.f27044a.mo21379a(new InterfaceC7182a.a() { // from class: rc.c
            @Override // ee.InterfaceC7182a.a
            /* renamed from: a */
            public final void mo21380a(InterfaceC7183b interfaceC7183b) {
                C10689d.this.m32549i(interfaceC7183b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m32547g(String str, Bundle bundle) {
        this.f27045b.mo32542a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m32548h(InterfaceC11529a interfaceC11529a) {
        synchronized (this) {
            if (this.f27046c instanceof C11531c) {
                this.f27047d.add(interfaceC11529a);
            }
            this.f27046c.mo32541a(interfaceC11529a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m32549i(InterfaceC7183b interfaceC7183b) {
        C10889g.m33216f().m33217b("AnalyticsConnector now available.");
        InterfaceC1940a interfaceC1940a = (InterfaceC1940a) interfaceC7183b.get();
        C11241e c11241e = new C11241e(interfaceC1940a);
        C10690e c10690e = new C10690e();
        if (m32550j(interfaceC1940a, c10690e) == null) {
            C10889g.m33216f().m33225k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        C10889g.m33216f().m33217b("Registered Firebase Analytics listener.");
        C11240d c11240d = new C11240d();
        C11239c c11239c = new C11239c(c11241e, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            Iterator<InterfaceC11529a> it = this.f27047d.iterator();
            while (it.hasNext()) {
                c11240d.mo32541a(it.next());
            }
            c10690e.m32555d(c11240d);
            c10690e.m32556e(c11239c);
            this.f27046c = c11240d;
            this.f27045b = c11239c;
        }
    }

    /* renamed from: j */
    private static InterfaceC1940a.a m32550j(InterfaceC1940a interfaceC1940a, C10690e c10690e) {
        InterfaceC1940a.a mo10147b = interfaceC1940a.mo10147b("clx", c10690e);
        if (mo10147b == null) {
            C10889g.m33216f().m33217b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            mo10147b = interfaceC1940a.mo10147b("crash", c10690e);
            if (mo10147b != null) {
                C10889g.m33216f().m33225k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return mo10147b;
    }

    /* renamed from: d */
    public InterfaceC11237a m32551d() {
        return new InterfaceC11237a() { // from class: rc.b
            @Override // tc.InterfaceC11237a
            /* renamed from: a */
            public final void mo32542a(String str, Bundle bundle) {
                C10689d.this.m32547g(str, bundle);
            }
        };
    }

    /* renamed from: e */
    public InterfaceC11530b m32552e() {
        return new InterfaceC11530b() { // from class: rc.a
            @Override // p381uc.InterfaceC11530b
            /* renamed from: a */
            public final void mo32541a(InterfaceC11529a interfaceC11529a) {
                C10689d.this.m32548h(interfaceC11529a);
            }
        };
    }
}
