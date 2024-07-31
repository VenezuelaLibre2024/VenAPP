package ec;

import com.google.android.gms.tasks.Task;
import zb.g;

/* loaded from: classes.dex */
public abstract class e implements jc.b {

    /* loaded from: classes.dex */
    public interface a {
        void a(c cVar);
    }

    public static e e(g gVar) {
        return (e) gVar.k(e.class);
    }

    public abstract void c(a aVar);

    public abstract Task<c> d(boolean z10);

    public abstract Task<c> f();

    public abstract void g(b bVar);

    public abstract void h(a aVar);

    public abstract void i(boolean z10);
}
