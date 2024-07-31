package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f955a;

    /* renamed from: b, reason: collision with root package name */
    final b f956b;

    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f957a;

        /* renamed from: b, reason: collision with root package name */
        final Context f958b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f959c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final androidx.collection.h<Menu, Menu> f960d = new androidx.collection.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f958b = context;
            this.f957a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f960d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f958b, (r0.a) menu);
            this.f960d.put(menu, oVar);
            return oVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f957a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f957a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f957a.onActionItemClicked(e(bVar), new androidx.appcompat.view.menu.j(this.f958b, (r0.b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f957a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f959c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f959c.get(i10);
                if (fVar != null && fVar.f956b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f958b, bVar);
            this.f959c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f955a = context;
        this.f956b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f956b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f956b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f955a, (r0.a) this.f956b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f956b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f956b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f956b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f956b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f956b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f956b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f956b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f956b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f956b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f956b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f956b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f956b.q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f956b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f956b.s(z10);
    }
}
