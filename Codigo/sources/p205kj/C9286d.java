package p205kj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p123gj.InterfaceC7578b;
import p145hj.C7743a;
import p145hj.C7744b;
import p224lj.C9513b;
import p449xj.C12504g;

/* renamed from: kj.d */
/* loaded from: classes3.dex */
public final class C9286d implements InterfaceC7578b, InterfaceC9283a {

    /* renamed from: a */
    List<InterfaceC7578b> f22540a;

    /* renamed from: b */
    volatile boolean f22541b;

    @Override // p205kj.InterfaceC9283a
    /* renamed from: a */
    public boolean mo23020a(InterfaceC7578b interfaceC7578b) {
        if (!mo23022c(interfaceC7578b)) {
            return false;
        }
        interfaceC7578b.dispose();
        return true;
    }

    @Override // p205kj.InterfaceC9283a
    /* renamed from: b */
    public boolean mo23021b(InterfaceC7578b interfaceC7578b) {
        C9513b.m28324d(interfaceC7578b, "d is null");
        if (!this.f22541b) {
            synchronized (this) {
                if (!this.f22541b) {
                    List list = this.f22540a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f22540a = list;
                    }
                    list.add(interfaceC7578b);
                    return true;
                }
            }
        }
        interfaceC7578b.dispose();
        return false;
    }

    @Override // p205kj.InterfaceC9283a
    /* renamed from: c */
    public boolean mo23022c(InterfaceC7578b interfaceC7578b) {
        C9513b.m28324d(interfaceC7578b, "Disposable item is null");
        if (this.f22541b) {
            return false;
        }
        synchronized (this) {
            if (this.f22541b) {
                return false;
            }
            List<InterfaceC7578b> list = this.f22540a;
            if (list != null && list.remove(interfaceC7578b)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    void m27707d(List<InterfaceC7578b> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC7578b> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th2) {
                C7744b.m23648b(th2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th2);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new C7743a(arrayList);
            }
            throw C12504g.m40936d((Throwable) arrayList.get(0));
        }
    }

    @Override // p123gj.InterfaceC7578b
    public void dispose() {
        if (this.f22541b) {
            return;
        }
        synchronized (this) {
            if (this.f22541b) {
                return;
            }
            this.f22541b = true;
            List<InterfaceC7578b> list = this.f22540a;
            this.f22540a = null;
            m27707d(list);
        }
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        return this.f22541b;
    }
}
