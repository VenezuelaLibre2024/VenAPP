package androidx.webkit.internal;

import androidx.webkit.internal.AbstractC1431a;
import java.lang.reflect.Array;
import java.util.List;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import p073e2.AbstractC7101e;
import p073e2.C7100d;

/* renamed from: androidx.webkit.internal.t0 */
/* loaded from: classes.dex */
public class C1488t0 extends AbstractC7101e {

    /* renamed from: a */
    private ProxyControllerBoundaryInterface f6480a;

    /* renamed from: d */
    private ProxyControllerBoundaryInterface m8433d() {
        if (this.f6480a == null) {
            this.f6480a = C1463k1.m8377d().getProxyController();
        }
        return this.f6480a;
    }

    /* renamed from: e */
    public static String[][] m8434e(List<C7100d.b> list) {
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 2);
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10][0] = list.get(i10).m20941a();
            strArr[i10][1] = list.get(i10).m20942b();
        }
        return strArr;
    }

    @Override // p073e2.AbstractC7101e
    /* renamed from: a */
    public void mo8435a(Executor executor, Runnable runnable) {
        if (!C1460j1.f6414Q.mo8260d()) {
            throw C1460j1.m8361a();
        }
        m8433d().clearProxyOverride(runnable, executor);
    }

    @Override // p073e2.AbstractC7101e
    /* renamed from: c */
    public void mo8436c(C7100d c7100d, Executor executor, Runnable runnable) {
        AbstractC1431a.d dVar = C1460j1.f6414Q;
        AbstractC1431a.d dVar2 = C1460j1.f6421X;
        String[][] m8434e = m8434e(c7100d.m20928b());
        String[] strArr = (String[]) c7100d.m20927a().toArray(new String[0]);
        if (dVar.mo8260d() && !c7100d.m20929c()) {
            m8433d().setProxyOverride(m8434e, strArr, runnable, executor);
        } else {
            if (!dVar.mo8260d() || !dVar2.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m8433d().setProxyOverride(m8434e, strArr, runnable, executor, c7100d.m20929c());
        }
    }
}
