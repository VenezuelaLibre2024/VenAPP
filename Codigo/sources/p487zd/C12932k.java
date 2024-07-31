package p487zd;

import android.app.Application;
import dj.AbstractC6977b;
import dj.AbstractC6985j;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p043ce.InterfaceC1956a;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9079g;
import pf.C10167e;

/* renamed from: zd.k */
/* loaded from: classes.dex */
public class C12932k {

    /* renamed from: a */
    private final C12983u2 f35205a;

    /* renamed from: b */
    private final Application f35206b;

    /* renamed from: c */
    private final InterfaceC1956a f35207c;

    /* renamed from: d */
    private C10167e f35208d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12932k(C12983u2 c12983u2, Application application, InterfaceC1956a interfaceC1956a) {
        this.f35205a = c12983u2;
        this.f35206b = application;
        this.f35207c = interfaceC1956a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public boolean m42825g(C10167e c10167e) {
        long m30428e0 = c10167e.m30428e0();
        long mo10198a = this.f35207c.mo10198a();
        File file = new File(this.f35206b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        return m30428e0 != 0 ? mo10198a < m30428e0 : !file.exists() || mo10198a < file.lastModified() + TimeUnit.DAYS.toMillis(1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ C10167e m42826h() {
        return this.f35208d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m42827i(C10167e c10167e) {
        this.f35208d = c10167e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m42828j(Throwable th2) {
        this.f35208d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m42829k(C10167e c10167e) {
        this.f35208d = c10167e;
    }

    /* renamed from: f */
    public AbstractC6985j<C10167e> m42830f() {
        return AbstractC6985j.m20254l(new Callable() { // from class: zd.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C10167e m42826h;
                m42826h = C12932k.this.m42826h();
                return m42826h;
            }
        }).m20274x(this.f35205a.m42950e(C10167e.m30426h0()).m20259f(new InterfaceC9076d() { // from class: zd.g
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12932k.this.m42827i((C10167e) obj);
            }
        })).m20260h(new InterfaceC9079g() { // from class: zd.h
            @Override // p186jj.InterfaceC9079g
            public final boolean test(Object obj) {
                boolean m42825g;
                m42825g = C12932k.this.m42825g((C10167e) obj);
                return m42825g;
            }
        }).m20258e(new InterfaceC9076d() { // from class: zd.i
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12932k.this.m42828j((Throwable) obj);
            }
        });
    }

    /* renamed from: l */
    public AbstractC6977b m42831l(final C10167e c10167e) {
        return this.f35205a.m42951f(c10167e).m20202g(new InterfaceC9073a() { // from class: zd.j
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12932k.this.m42829k(c10167e);
            }
        });
    }
}
