package z2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import io.flutter.plugin.common.PluginRegistry;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class l implements PluginRegistry.ActivityResultListener {

    /* renamed from: a, reason: collision with root package name */
    private final List<p> f32299a = new CopyOnWriteArrayList();

    private boolean c(Context context) {
        try {
            return ca.f.n().g(context) == 0;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public p a(Context context, boolean z10, z zVar) {
        if (!z10 && c(context)) {
            return new k(context, zVar);
        }
        return new q(context, zVar);
    }

    public void b(Context context, boolean z10, e0 e0Var, y2.a aVar) {
        a(context, z10, null).d(e0Var, aVar);
    }

    public void d(Context context, a0 a0Var) {
        if (context == null) {
            a0Var.a(y2.b.locationServicesDisabled);
        }
        a(context, false, null).b(a0Var);
    }

    public void e(p pVar, Activity activity, e0 e0Var, y2.a aVar) {
        this.f32299a.add(pVar);
        pVar.c(activity, e0Var, aVar);
    }

    public void f(p pVar) {
        this.f32299a.remove(pVar);
        pVar.f();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        Iterator<p> it = this.f32299a.iterator();
        while (it.hasNext()) {
            if (it.next().e(i10, i11)) {
                return true;
            }
        }
        return false;
    }
}
