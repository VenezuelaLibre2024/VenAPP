package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AbstractC0218a;
import androidx.appcompat.app.LayoutInflaterFactory2C0225h;
import androidx.appcompat.view.menu.C0260g;
import androidx.appcompat.view.menu.InterfaceC0266m;
import androidx.appcompat.widget.C0361p1;
import androidx.appcompat.widget.InterfaceC0357o0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.C0984h;
import androidx.core.view.C1116x0;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.u */
/* loaded from: classes.dex */
public class C0238u extends AbstractC0218a {

    /* renamed from: a */
    final InterfaceC0357o0 f1005a;

    /* renamed from: b */
    final Window.Callback f1006b;

    /* renamed from: c */
    final LayoutInflaterFactory2C0225h.g f1007c;

    /* renamed from: d */
    boolean f1008d;

    /* renamed from: e */
    private boolean f1009e;

    /* renamed from: f */
    private boolean f1010f;

    /* renamed from: g */
    private ArrayList<AbstractC0218a.b> f1011g = new ArrayList<>();

    /* renamed from: h */
    private final Runnable f1012h = new a();

    /* renamed from: i */
    private final Toolbar.InterfaceC0311h f1013i;

    /* renamed from: androidx.appcompat.app.u$a */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0238u.this.m1119B();
        }
    }

    /* renamed from: androidx.appcompat.app.u$b */
    /* loaded from: classes.dex */
    class b implements Toolbar.InterfaceC0311h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0311h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0238u.this.f1006b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.u$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC0266m.a {

        /* renamed from: a */
        private boolean f1016a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0266m.a
        /* renamed from: b */
        public void mo1035b(C0260g c0260g, boolean z10) {
            if (this.f1016a) {
                return;
            }
            this.f1016a = true;
            C0238u.this.f1005a.mo1887r();
            C0238u.this.f1006b.onPanelClosed(108, c0260g);
            this.f1016a = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0266m.a
        /* renamed from: c */
        public boolean mo1036c(C0260g c0260g) {
            C0238u.this.f1006b.onMenuOpened(108, c0260g);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.u$d */
    /* loaded from: classes.dex */
    public final class d implements C0260g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.C0260g.a
        /* renamed from: a */
        public boolean mo1012a(C0260g c0260g, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0260g.a
        /* renamed from: b */
        public void mo1014b(C0260g c0260g) {
            if (C0238u.this.f1005a.mo1874e()) {
                C0238u.this.f1006b.onPanelClosed(108, c0260g);
            } else if (C0238u.this.f1006b.onPreparePanel(0, null, c0260g)) {
                C0238u.this.f1006b.onMenuOpened(108, c0260g);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.u$e */
    /* loaded from: classes.dex */
    private class e implements LayoutInflaterFactory2C0225h.g {
        e() {
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0225h.g
        /* renamed from: a */
        public boolean mo1034a(int i10) {
            if (i10 != 0) {
                return false;
            }
            C0238u c0238u = C0238u.this;
            if (c0238u.f1008d) {
                return false;
            }
            c0238u.f1005a.mo1875f();
            C0238u.this.f1008d = true;
            return false;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0225h.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(C0238u.this.f1005a.getContext());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0238u(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f1013i = bVar;
        C0984h.m4833k(toolbar);
        C0361p1 c0361p1 = new C0361p1(toolbar, false);
        this.f1005a = c0361p1;
        this.f1006b = (Window.Callback) C0984h.m4833k(callback);
        c0361p1.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        c0361p1.setWindowTitle(charSequence);
        this.f1007c = new e();
    }

    /* renamed from: A */
    private Menu m1118A() {
        if (!this.f1009e) {
            this.f1005a.mo1890u(new c(), new d());
            this.f1009e = true;
        }
        return this.f1005a.mo1880k();
    }

    /* renamed from: B */
    void m1119B() {
        Menu m1118A = m1118A();
        C0260g c0260g = m1118A instanceof C0260g ? (C0260g) m1118A : null;
        if (c0260g != null) {
            c0260g.m1331e0();
        }
        try {
            m1118A.clear();
            if (!this.f1006b.onCreatePanelMenu(0, m1118A) || !this.f1006b.onPreparePanel(0, null, m1118A)) {
                m1118A.clear();
            }
        } finally {
            if (c0260g != null) {
                c0260g.m1329d0();
            }
        }
    }

    /* renamed from: C */
    public void m1120C(int i10, int i11) {
        this.f1005a.mo1879j((i10 & i11) | ((~i11) & this.f1005a.mo1892w()));
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: f */
    public boolean mo878f() {
        return this.f1005a.mo1871b();
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: g */
    public boolean mo879g() {
        if (!this.f1005a.mo1878i()) {
            return false;
        }
        this.f1005a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: h */
    public void mo880h(boolean z10) {
        if (z10 == this.f1010f) {
            return;
        }
        this.f1010f = z10;
        int size = this.f1011g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f1011g.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: i */
    public int mo881i() {
        return this.f1005a.mo1892w();
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: j */
    public Context mo882j() {
        return this.f1005a.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: k */
    public void mo883k() {
        this.f1005a.mo1891v(8);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: l */
    public boolean mo884l() {
        this.f1005a.mo1883n().removeCallbacks(this.f1012h);
        C1116x0.m5253R(this.f1005a.mo1883n(), this.f1012h);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: m */
    public boolean mo885m() {
        return this.f1005a.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: n */
    public void mo886n(Configuration configuration) {
        super.mo886n(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: o */
    public void mo887o() {
        this.f1005a.mo1883n().removeCallbacks(this.f1012h);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: p */
    public boolean mo888p(int i10, KeyEvent keyEvent) {
        Menu m1118A = m1118A();
        if (m1118A == null) {
            return false;
        }
        m1118A.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return m1118A.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: q */
    public boolean mo889q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo890r();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: r */
    public boolean mo890r() {
        return this.f1005a.mo1872c();
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: s */
    public void mo891s(Drawable drawable) {
        this.f1005a.mo1876g(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: t */
    public void mo892t(boolean z10) {
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: u */
    public void mo893u(boolean z10) {
        m1120C(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: v */
    public void mo894v(boolean z10) {
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: w */
    public void mo895w(CharSequence charSequence) {
        this.f1005a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: x */
    public void mo896x(CharSequence charSequence) {
        this.f1005a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0218a
    /* renamed from: y */
    public void mo897y() {
        this.f1005a.mo1891v(0);
    }
}
