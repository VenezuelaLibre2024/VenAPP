package p477z2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import ca.C1902f;
import io.flutter.plugin.common.PluginRegistry;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p455y2.EnumC12584b;
import p455y2.InterfaceC12583a;

/* renamed from: z2.l */
/* loaded from: classes.dex */
public class C12780l implements PluginRegistry.ActivityResultListener {

    /* renamed from: a */
    private final List<InterfaceC12784p> f34850a = new CopyOnWriteArrayList();

    /* renamed from: c */
    private boolean m42404c(Context context) {
        try {
            return C1902f.m10067n().mo10071g(context) == 0;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: a */
    public InterfaceC12784p m42405a(Context context, boolean z10, C12794z c12794z) {
        if (!z10 && m42404c(context)) {
            return new C12779k(context, c12794z);
        }
        return new C12785q(context, c12794z);
    }

    /* renamed from: b */
    public void m42406b(Context context, boolean z10, InterfaceC12772e0 interfaceC12772e0, InterfaceC12583a interfaceC12583a) {
        m42405a(context, z10, null).mo42401d(interfaceC12772e0, interfaceC12583a);
    }

    /* renamed from: d */
    public void m42407d(Context context, InterfaceC12764a0 interfaceC12764a0) {
        if (context == null) {
            interfaceC12764a0.mo42357a(EnumC12584b.locationServicesDisabled);
        }
        m42405a(context, false, null).mo42399b(interfaceC12764a0);
    }

    /* renamed from: e */
    public void m42408e(InterfaceC12784p interfaceC12784p, Activity activity, InterfaceC12772e0 interfaceC12772e0, InterfaceC12583a interfaceC12583a) {
        this.f34850a.add(interfaceC12784p);
        interfaceC12784p.mo42400c(activity, interfaceC12772e0, interfaceC12583a);
    }

    /* renamed from: f */
    public void m42409f(InterfaceC12784p interfaceC12784p) {
        this.f34850a.remove(interfaceC12784p);
        interfaceC12784p.mo42403f();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        Iterator<InterfaceC12784p> it = this.f34850a.iterator();
        while (it.hasNext()) {
            if (it.next().mo42402e(i10, i11)) {
                return true;
            }
        }
        return false;
    }
}
