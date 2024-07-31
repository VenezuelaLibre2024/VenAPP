package kj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import xj.g;

/* loaded from: classes3.dex */
public final class d implements gj.b, a {

    /* renamed from: a, reason: collision with root package name */
    List<gj.b> f20718a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f20719b;

    @Override // kj.a
    public boolean a(gj.b bVar) {
        if (!c(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // kj.a
    public boolean b(gj.b bVar) {
        lj.b.d(bVar, "d is null");
        if (!this.f20719b) {
            synchronized (this) {
                if (!this.f20719b) {
                    List list = this.f20718a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f20718a = list;
                    }
                    list.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // kj.a
    public boolean c(gj.b bVar) {
        lj.b.d(bVar, "Disposable item is null");
        if (this.f20719b) {
            return false;
        }
        synchronized (this) {
            if (this.f20719b) {
                return false;
            }
            List<gj.b> list = this.f20718a;
            if (list != null && list.remove(bVar)) {
                return true;
            }
            return false;
        }
    }

    void d(List<gj.b> list) {
        if (list == null) {
            return;
        }
        Iterator<gj.b> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th2) {
                hj.b.b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new hj.a(arrayList);
            }
            throw g.d((Throwable) arrayList.get(0));
        }
    }

    @Override // gj.b
    public void dispose() {
        if (this.f20719b) {
            return;
        }
        synchronized (this) {
            if (this.f20719b) {
                return;
            }
            this.f20719b = true;
            List<gj.b> list = this.f20718a;
            this.f20718a = null;
            d(list);
        }
    }

    @Override // gj.b
    public boolean h() {
        return this.f20719b;
    }
}
