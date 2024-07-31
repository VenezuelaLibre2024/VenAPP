package al;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p124gk.InterfaceC7587f;
import p494zk.C13034a1;
import p494zk.C13035a2;
import p494zk.C13074j2;
import p494zk.InterfaceC13044c1;
import uk.C11585l;

/* renamed from: al.d */
/* loaded from: classes3.dex */
public final class C0134d extends AbstractC0135e {
    private volatile C0134d _immediate;

    /* renamed from: c */
    private final Handler f554c;

    /* renamed from: d */
    private final String f555d;

    /* renamed from: e */
    private final boolean f556e;

    /* renamed from: f */
    private final C0134d f557f;

    public C0134d(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ C0134d(Handler handler, String str, int i10, C9315g c9315g) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    private C0134d(Handler handler, String str, boolean z10) {
        super(null);
        this.f554c = handler;
        this.f555d = str;
        this.f556e = z10;
        this._immediate = z10 ? this : null;
        C0134d c0134d = this._immediate;
        if (c0134d == null) {
            c0134d = new C0134d(handler, str, true);
            this._immediate = c0134d;
        }
        this.f557f = c0134d;
    }

    /* renamed from: R0 */
    private final void m623R0(InterfaceC7587f interfaceC7587f, Runnable runnable) {
        C13035a2.m43044c(interfaceC7587f, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C13034a1.m43040b().mo625D0(interfaceC7587f, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public static final void m624W0(C0134d c0134d, Runnable runnable) {
        c0134d.f554c.removeCallbacks(runnable);
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: D0 */
    public void mo625D0(InterfaceC7587f interfaceC7587f, Runnable runnable) {
        if (this.f554c.post(runnable)) {
            return;
        }
        m623R0(interfaceC7587f, runnable);
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: F0 */
    public boolean mo626F0(InterfaceC7587f interfaceC7587f) {
        return (this.f556e && C9322n.m27777a(Looper.myLooper(), this.f554c.getLooper())) ? false : true;
    }

    @Override // p494zk.AbstractC13066h2
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public C0134d mo627I0() {
        return this.f557f;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0134d) && ((C0134d) obj).f554c == this.f554c;
    }

    public int hashCode() {
        return System.identityHashCode(this.f554c);
    }

    @Override // al.AbstractC0135e, p494zk.InterfaceC13112t0
    /* renamed from: o */
    public InterfaceC13044c1 mo629o(long j10, final Runnable runnable, InterfaceC7587f interfaceC7587f) {
        long m36296e;
        Handler handler = this.f554c;
        m36296e = C11585l.m36296e(j10, 4611686018427387903L);
        if (handler.postDelayed(runnable, m36296e)) {
            return new InterfaceC13044c1() { // from class: al.c
                @Override // p494zk.InterfaceC13044c1
                public final void dispose() {
                    C0134d.m624W0(C0134d.this, runnable);
                }
            };
        }
        m623R0(interfaceC7587f, runnable);
        return C13074j2.f35455a;
    }

    @Override // p494zk.AbstractC13066h2, p494zk.AbstractC13064h0
    public String toString() {
        String m43210J0 = m43210J0();
        if (m43210J0 != null) {
            return m43210J0;
        }
        String str = this.f555d;
        if (str == null) {
            str = this.f554c.toString();
        }
        if (!this.f556e) {
            return str;
        }
        return str + ".immediate";
    }
}
