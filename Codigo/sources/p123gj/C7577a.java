package p123gj;

import java.util.ArrayList;
import p145hj.C7743a;
import p145hj.C7744b;
import p205kj.InterfaceC9283a;
import p224lj.C9513b;
import p449xj.C12504g;
import p449xj.C12507j;

/* renamed from: gj.a */
/* loaded from: classes3.dex */
public final class C7577a implements InterfaceC7578b, InterfaceC9283a {

    /* renamed from: a */
    C12507j<InterfaceC7578b> f17916a;

    /* renamed from: b */
    volatile boolean f17917b;

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
        if (!this.f17917b) {
            synchronized (this) {
                if (!this.f17917b) {
                    C12507j<InterfaceC7578b> c12507j = this.f17916a;
                    if (c12507j == null) {
                        c12507j = new C12507j<>();
                        this.f17916a = c12507j;
                    }
                    c12507j.m40948a(interfaceC7578b);
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
        if (this.f17917b) {
            return false;
        }
        synchronized (this) {
            if (this.f17917b) {
                return false;
            }
            C12507j<InterfaceC7578b> c12507j = this.f17916a;
            if (c12507j != null && c12507j.m40951e(interfaceC7578b)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    void m23023d(C12507j<InterfaceC7578b> c12507j) {
        if (c12507j == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c12507j.m40949b()) {
            if (obj instanceof InterfaceC7578b) {
                try {
                    ((InterfaceC7578b) obj).dispose();
                } catch (Throwable th2) {
                    C7744b.m23648b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
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
        if (this.f17917b) {
            return;
        }
        synchronized (this) {
            if (this.f17917b) {
                return;
            }
            this.f17917b = true;
            C12507j<InterfaceC7578b> c12507j = this.f17916a;
            this.f17916a = null;
            m23023d(c12507j);
        }
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public boolean mo616h() {
        return this.f17917b;
    }
}
