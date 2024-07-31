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
import androidx.appcompat.app.a;
import androidx.appcompat.app.h;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.p1;
import androidx.core.view.x0;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u extends androidx.appcompat.app.a {

    /* renamed from: a, reason: collision with root package name */
    final o0 f880a;

    /* renamed from: b, reason: collision with root package name */
    final Window.Callback f881b;

    /* renamed from: c, reason: collision with root package name */
    final h.g f882c;

    /* renamed from: d, reason: collision with root package name */
    boolean f883d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f884e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f885f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<a.b> f886g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f887h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final Toolbar.h f888i;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u.this.B();
        }
    }

    /* loaded from: classes.dex */
    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return u.this.f881b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c implements m.a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f891a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (this.f891a) {
                return;
            }
            this.f891a = true;
            u.this.f880a.r();
            u.this.f881b.onPanelClosed(108, gVar);
            this.f891a = false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean c(androidx.appcompat.view.menu.g gVar) {
            u.this.f881b.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (u.this.f880a.e()) {
                u.this.f881b.onPanelClosed(108, gVar);
            } else if (u.this.f881b.onPreparePanel(0, null, gVar)) {
                u.this.f881b.onMenuOpened(108, gVar);
            }
        }
    }

    /* loaded from: classes.dex */
    private class e implements h.g {
        e() {
        }

        @Override // androidx.appcompat.app.h.g
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            u uVar = u.this;
            if (uVar.f883d) {
                return false;
            }
            uVar.f880a.f();
            u.this.f883d = true;
            return false;
        }

        @Override // androidx.appcompat.app.h.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(u.this.f880a.getContext());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f888i = bVar;
        androidx.core.util.h.k(toolbar);
        p1 p1Var = new p1(toolbar, false);
        this.f880a = p1Var;
        this.f881b = (Window.Callback) androidx.core.util.h.k(callback);
        p1Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        p1Var.setWindowTitle(charSequence);
        this.f882c = new e();
    }

    private Menu A() {
        if (!this.f884e) {
            this.f880a.u(new c(), new d());
            this.f884e = true;
        }
        return this.f880a.k();
    }

    void B() {
        Menu A = A();
        androidx.appcompat.view.menu.g gVar = A instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) A : null;
        if (gVar != null) {
            gVar.e0();
        }
        try {
            A.clear();
            if (!this.f881b.onCreatePanelMenu(0, A) || !this.f881b.onPreparePanel(0, null, A)) {
                A.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.d0();
            }
        }
    }

    public void C(int i10, int i11) {
        this.f880a.j((i10 & i11) | ((~i11) & this.f880a.w()));
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.f880a.b();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (!this.f880a.i()) {
            return false;
        }
        this.f880a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f885f) {
            return;
        }
        this.f885f = z10;
        int size = this.f886g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f886g.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f880a.w();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.f880a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        this.f880a.v(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f880a.n().removeCallbacks(this.f887h);
        x0.R(this.f880a.n(), this.f887h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean m() {
        return this.f880a.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.a
    public void n(Configuration configuration) {
        super.n(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.a
    public void o() {
        this.f880a.n().removeCallbacks(this.f887h);
    }

    @Override // androidx.appcompat.app.a
    public boolean p(int i10, KeyEvent keyEvent) {
        Menu A = A();
        if (A == null) {
            return false;
        }
        A.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return A.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            r();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean r() {
        return this.f880a.c();
    }

    @Override // androidx.appcompat.app.a
    public void s(Drawable drawable) {
        this.f880a.g(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        C(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f880a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(CharSequence charSequence) {
        this.f880a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void y() {
        this.f880a.v(0);
    }
}
