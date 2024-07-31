package p070e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C9322n;

/* renamed from: e.a */
/* loaded from: classes.dex */
public final class C7084a {

    /* renamed from: a */
    private final Set<InterfaceC7085b> f15702a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f15703b;

    /* renamed from: a */
    public final void m20850a(InterfaceC7085b listener) {
        C9322n.m27781e(listener, "listener");
        Context context = this.f15703b;
        if (context != null) {
            listener.mo805a(context);
        }
        this.f15702a.add(listener);
    }

    /* renamed from: b */
    public final void m20851b() {
        this.f15703b = null;
    }

    /* renamed from: c */
    public final void m20852c(Context context) {
        C9322n.m27781e(context, "context");
        this.f15703b = context;
        Iterator<InterfaceC7085b> it = this.f15702a.iterator();
        while (it.hasNext()) {
            it.next().mo805a(context);
        }
    }

    /* renamed from: d */
    public final Context m20853d() {
        return this.f15703b;
    }

    /* renamed from: e */
    public final void m20854e(InterfaceC7085b listener) {
        C9322n.m27781e(listener, "listener");
        this.f15702a.remove(listener);
    }
}
