package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    final Context f1063a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.collection.h<r0.b, MenuItem> f1064b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.collection.h<r0.c, SubMenu> f1065c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f1063a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof r0.b)) {
            return menuItem;
        }
        r0.b bVar = (r0.b) menuItem;
        if (this.f1064b == null) {
            this.f1064b = new androidx.collection.h<>();
        }
        MenuItem menuItem2 = this.f1064b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f1063a, bVar);
        this.f1064b.put(bVar, jVar);
        return jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof r0.c)) {
            return subMenu;
        }
        r0.c cVar = (r0.c) subMenu;
        if (this.f1065c == null) {
            this.f1065c = new androidx.collection.h<>();
        }
        SubMenu subMenu2 = this.f1065c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f1063a, cVar);
        this.f1065c.put(cVar, sVar);
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        androidx.collection.h<r0.b, MenuItem> hVar = this.f1064b;
        if (hVar != null) {
            hVar.clear();
        }
        androidx.collection.h<r0.c, SubMenu> hVar2 = this.f1065c;
        if (hVar2 != null) {
            hVar2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f1064b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f1064b.size()) {
            if (this.f1064b.j(i11).getGroupId() == i10) {
                this.f1064b.l(i11);
                i11--;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f1064b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f1064b.size(); i11++) {
            if (this.f1064b.j(i11).getItemId() == i10) {
                this.f1064b.l(i11);
                return;
            }
        }
    }
}
