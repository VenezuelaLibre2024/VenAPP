package p152i4;

import android.os.Handler;
import kotlin.jvm.internal.C9322n;
import p152i4.C7807i0;

/* renamed from: i4.a1 */
/* loaded from: classes.dex */
public final class C7789a1 {

    /* renamed from: a */
    private final Handler f18568a;

    /* renamed from: b */
    private final C7807i0 f18569b;

    /* renamed from: c */
    private final long f18570c;

    /* renamed from: d */
    private long f18571d;

    /* renamed from: e */
    private long f18572e;

    /* renamed from: f */
    private long f18573f;

    public C7789a1(Handler handler, C7807i0 request) {
        C9322n.m27781e(request, "request");
        this.f18568a = handler;
        this.f18569b = request;
        this.f18570c = C7799e0.m23828A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m23787e(C7807i0.b bVar, long j10, long j11) {
        ((C7807i0.f) bVar).m24005a(j10, j11);
    }

    /* renamed from: b */
    public final void m23788b(long j10) {
        long j11 = this.f18571d + j10;
        this.f18571d = j11;
        if (j11 >= this.f18572e + this.f18570c || j11 >= this.f18573f) {
            m23790d();
        }
    }

    /* renamed from: c */
    public final void m23789c(long j10) {
        this.f18573f += j10;
    }

    /* renamed from: d */
    public final void m23790d() {
        if (this.f18571d > this.f18572e) {
            final C7807i0.b m23952o = this.f18569b.m23952o();
            final long j10 = this.f18573f;
            if (j10 <= 0 || !(m23952o instanceof C7807i0.f)) {
                return;
            }
            final long j11 = this.f18571d;
            Handler handler = this.f18568a;
            if ((handler == null ? null : Boolean.valueOf(handler.post(new Runnable() { // from class: i4.z0
                @Override // java.lang.Runnable
                public final void run() {
                    C7789a1.m23787e(C7807i0.b.this, j11, j10);
                }
            }))) == null) {
                ((C7807i0.f) m23952o).m24005a(j11, j10);
            }
            this.f18572e = this.f18571d;
        }
    }
}
