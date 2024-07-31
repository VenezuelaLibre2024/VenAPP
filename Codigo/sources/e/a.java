package e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Set<b> f14344a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private volatile Context f14345b;

    public final void a(b listener) {
        n.e(listener, "listener");
        Context context = this.f14345b;
        if (context != null) {
            listener.a(context);
        }
        this.f14344a.add(listener);
    }

    public final void b() {
        this.f14345b = null;
    }

    public final void c(Context context) {
        n.e(context, "context");
        this.f14345b = context;
        Iterator<b> it = this.f14344a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }

    public final Context d() {
        return this.f14345b;
    }

    public final void e(b listener) {
        n.e(listener, "listener");
        this.f14344a.remove(listener);
    }
}
