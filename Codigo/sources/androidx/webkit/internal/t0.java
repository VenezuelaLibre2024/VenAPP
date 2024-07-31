package androidx.webkit.internal;

import androidx.webkit.internal.a;
import e2.d;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;

/* loaded from: classes.dex */
public class t0 extends e2.e {

    /* renamed from: a, reason: collision with root package name */
    private ProxyControllerBoundaryInterface f5629a;

    private ProxyControllerBoundaryInterface d() {
        if (this.f5629a == null) {
            this.f5629a = k1.d().getProxyController();
        }
        return this.f5629a;
    }

    public static String[][] e(List<d.b> list) {
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 2);
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10][0] = list.get(i10).a();
            strArr[i10][1] = list.get(i10).b();
        }
        return strArr;
    }

    @Override // e2.e
    public void a(Executor executor, Runnable runnable) {
        if (!j1.Q.d()) {
            throw j1.a();
        }
        d().clearProxyOverride(runnable, executor);
    }

    @Override // e2.e
    public void c(e2.d dVar, Executor executor, Runnable runnable) {
        a.d dVar2 = j1.Q;
        a.d dVar3 = j1.X;
        String[][] e10 = e(dVar.b());
        String[] strArr = (String[]) dVar.a().toArray(new String[0]);
        if (dVar2.d() && !dVar.c()) {
            d().setProxyOverride(e10, strArr, runnable, executor);
        } else {
            if (!dVar2.d() || !dVar3.d()) {
                throw j1.a();
            }
            d().setProxyOverride(e10, strArr, runnable, executor, dVar.c());
        }
    }
}
