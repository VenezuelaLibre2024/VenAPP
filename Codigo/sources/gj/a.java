package gj;

import java.util.ArrayList;
import xj.g;
import xj.j;

/* loaded from: classes3.dex */
public final class a implements b, kj.a {

    /* renamed from: a, reason: collision with root package name */
    j<b> f16279a;

    /* renamed from: b, reason: collision with root package name */
    volatile boolean f16280b;

    @Override // kj.a
    public boolean a(b bVar) {
        if (!c(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // kj.a
    public boolean b(b bVar) {
        lj.b.d(bVar, "d is null");
        if (!this.f16280b) {
            synchronized (this) {
                if (!this.f16280b) {
                    j<b> jVar = this.f16279a;
                    if (jVar == null) {
                        jVar = new j<>();
                        this.f16279a = jVar;
                    }
                    jVar.a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // kj.a
    public boolean c(b bVar) {
        lj.b.d(bVar, "Disposable item is null");
        if (this.f16280b) {
            return false;
        }
        synchronized (this) {
            if (this.f16280b) {
                return false;
            }
            j<b> jVar = this.f16279a;
            if (jVar != null && jVar.e(bVar)) {
                return true;
            }
            return false;
        }
    }

    void d(j<b> jVar) {
        if (jVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : jVar.b()) {
            if (obj instanceof b) {
                try {
                    ((b) obj).dispose();
                } catch (Throwable th2) {
                    hj.b.b(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
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
        if (this.f16280b) {
            return;
        }
        synchronized (this) {
            if (this.f16280b) {
                return;
            }
            this.f16280b = true;
            j<b> jVar = this.f16279a;
            this.f16279a = null;
            d(jVar);
        }
    }

    @Override // gj.b
    public boolean h() {
        return this.f16280b;
    }
}
