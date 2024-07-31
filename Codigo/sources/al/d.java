package al;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import uk.l;
import zk.a1;
import zk.a2;
import zk.c1;
import zk.j2;

/* loaded from: classes3.dex */
public final class d extends e {
    private volatile d _immediate;

    /* renamed from: c */
    private final Handler f489c;

    /* renamed from: d */
    private final String f490d;

    /* renamed from: e */
    private final boolean f491e;

    /* renamed from: f */
    private final d f492f;

    public d(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ d(Handler handler, String str, int i10, g gVar) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    private d(Handler handler, String str, boolean z10) {
        super(null);
        this.f489c = handler;
        this.f490d = str;
        this.f491e = z10;
        this._immediate = z10 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f492f = dVar;
    }

    private final void R0(gk.f fVar, Runnable runnable) {
        a2.c(fVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        a1.b().D0(fVar, runnable);
    }

    public static final void W0(d dVar, Runnable runnable) {
        dVar.f489c.removeCallbacks(runnable);
    }

    @Override // zk.h0
    public void D0(gk.f fVar, Runnable runnable) {
        if (this.f489c.post(runnable)) {
            return;
        }
        R0(fVar, runnable);
    }

    @Override // zk.h0
    public boolean F0(gk.f fVar) {
        return (this.f491e && n.a(Looper.myLooper(), this.f489c.getLooper())) ? false : true;
    }

    @Override // zk.h2
    /* renamed from: T0 */
    public d I0() {
        return this.f492f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f489c == this.f489c;
    }

    public int hashCode() {
        return System.identityHashCode(this.f489c);
    }

    @Override // al.e, zk.t0
    public c1 o(long j10, Runnable runnable, gk.f fVar) {
        long e10;
        Handler handler = this.f489c;
        e10 = l.e(j10, 4611686018427387903L);
        if (handler.postDelayed(runnable, e10)) {
            return new c1() { // from class: al.c

                /* renamed from: b */
                public final /* synthetic */ Runnable f488b;

                public /* synthetic */ c(Runnable runnable2) {
                    r2 = runnable2;
                }

                @Override // zk.c1
                public final void dispose() {
                    d.W0(d.this, r2);
                }
            };
        }
        R0(fVar, runnable2);
        return j2.f32904a;
    }

    @Override // zk.h2, zk.h0
    public String toString() {
        String J0 = J0();
        if (J0 != null) {
            return J0;
        }
        String str = this.f490d;
        if (str == null) {
            str = this.f489c.toString();
        }
        if (!this.f491e) {
            return str;
        }
        return str + ".immediate";
    }
}
