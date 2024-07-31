package p452y;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.C0709n;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.utils.C0688q;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p071e0.C7086a;
import p407w.C12008g0;

/* renamed from: y.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC12573v0 {

    /* renamed from: a */
    private int f34092a = new C7086a().m20855a();

    /* renamed from: y.v0$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: b */
        void mo41268b(AbstractC12573v0 abstractC12573v0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m41299o(C12008g0 c12008g0) {
        boolean z10 = m41306h() != null;
        boolean z11 = m41308j() != null;
        if (z10 && !z11) {
            C0709n.e m41306h = m41306h();
            Objects.requireNonNull(m41306h);
            m41306h.m3476b(c12008g0);
        } else {
            if (!z11 || z10) {
                throw new IllegalStateException("One and only one callback is allowed.");
            }
            C0709n.f m41308j = m41308j();
            Objects.requireNonNull(m41308j);
            m41308j.m3477a(c12008g0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m41300p(C0709n.h hVar) {
        C0709n.f m41308j = m41308j();
        Objects.requireNonNull(m41308j);
        Objects.requireNonNull(hVar);
        m41308j.m3478b(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m41301q(InterfaceC0710o interfaceC0710o) {
        C0709n.e m41306h = m41306h();
        Objects.requireNonNull(m41306h);
        Objects.requireNonNull(interfaceC0710o);
        m41306h.m3475a(interfaceC0710o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m41302d() {
        C0688q.m3339a();
        int i10 = this.f34092a;
        if (i10 <= 0) {
            return false;
        }
        this.f34092a = i10 - 1;
        return true;
    }

    /* renamed from: e */
    abstract Executor m41303e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract int m41304f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract Rect m41305g();

    /* renamed from: h */
    abstract C0709n.e m41306h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int m41307i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract C0709n.f m41308j();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract C0709n.g m41309k();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract int m41310l();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract Matrix m41311m();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract List<AbstractC0637k> m41312n();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m41313r(final C12008g0 c12008g0) {
        m41303e().execute(new Runnable() { // from class: y.s0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC12573v0.this.m41299o(c12008g0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m41314s(final C0709n.h hVar) {
        m41303e().execute(new Runnable() { // from class: y.t0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC12573v0.this.m41300p(hVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m41315t(final InterfaceC0710o interfaceC0710o) {
        m41303e().execute(new Runnable() { // from class: y.u0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC12573v0.this.m41301q(interfaceC0710o);
            }
        });
    }
}
