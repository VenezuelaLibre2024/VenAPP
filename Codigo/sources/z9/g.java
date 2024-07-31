package z9;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g extends j1.a implements com.google.android.gms.common.api.internal.s {

    /* renamed from: o, reason: collision with root package name */
    private final Semaphore f32477o;

    /* renamed from: p, reason: collision with root package name */
    private final Set f32478p;

    public g(Context context, Set set) {
        super(context);
        this.f32477o = new Semaphore(0);
        this.f32478p = set;
    }

    @Override // j1.a
    public final /* bridge */ /* synthetic */ Object A() {
        Iterator it = this.f32478p.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((com.google.android.gms.common.api.f) it.next()).g(this)) {
                i10++;
            }
        }
        try {
            this.f32477o.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // j1.b
    protected final void o() {
        this.f32477o.drainPermits();
        h();
    }
}
