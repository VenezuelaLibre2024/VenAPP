package p484z9;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.internal.InterfaceC5176s;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p169j1.AbstractC8937a;

/* renamed from: z9.g */
/* loaded from: classes.dex */
public final class C12834g extends AbstractC8937a implements InterfaceC5176s {

    /* renamed from: o */
    private final Semaphore f35028o;

    /* renamed from: p */
    private final Set f35029p;

    public C12834g(Context context, Set set) {
        super(context);
        this.f35028o = new Semaphore(0);
        this.f35029p = set;
    }

    @Override // p169j1.AbstractC8937a
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ Object mo26107A() {
        Iterator it = this.f35029p.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((AbstractC5106f) it.next()).m12989g(this)) {
                i10++;
            }
        }
        try {
            this.f35028o.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // p169j1.C8938b
    /* renamed from: o */
    protected final void mo26132o() {
        this.f35028o.drainPermits();
        m26127h();
    }
}
