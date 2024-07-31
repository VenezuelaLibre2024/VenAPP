package p112g0;

import androidx.core.util.InterfaceC0977a;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.Objects;
import java.util.concurrent.Executor;
import p002a0.C0009f;
import p407w.AbstractC12019k;
import p407w.C12015i1;
import p407w.InterfaceC12047x0;
import p407w.InterfaceC12049y0;

/* renamed from: g0.y0 */
/* loaded from: classes.dex */
public class C7436y0 implements InterfaceC7422r0 {

    /* renamed from: a */
    private final InterfaceC12049y0 f17275a;

    /* renamed from: b */
    private final Executor f17276b;

    /* renamed from: c */
    private final InterfaceC0977a<Throwable> f17277c;

    public C7436y0(AbstractC12019k abstractC12019k) {
        InterfaceC12049y0 m38627e = abstractC12019k.m38627e();
        Objects.requireNonNull(m38627e);
        this.f17275a = m38627e;
        this.f17276b = abstractC12019k.m38625c();
        this.f17277c = abstractC12019k.m38624b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m22430f(C12015i1 c12015i1) {
        this.f17275a.mo22406b(c12015i1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m22431g(InterfaceC12047x0 interfaceC12047x0) {
        this.f17275a.mo22405a(interfaceC12047x0);
    }

    @Override // p407w.InterfaceC12049y0
    /* renamed from: a */
    public void mo22405a(final InterfaceC12047x0 interfaceC12047x0) {
        this.f17276b.execute(new Runnable() { // from class: g0.x0
            @Override // java.lang.Runnable
            public final void run() {
                C7436y0.this.m22431g(interfaceC12047x0);
            }
        });
    }

    @Override // p407w.InterfaceC12049y0
    /* renamed from: b */
    public void mo22406b(final C12015i1 c12015i1) {
        this.f17276b.execute(new Runnable() { // from class: g0.w0
            @Override // java.lang.Runnable
            public final void run() {
                C7436y0.this.m22430f(c12015i1);
            }
        });
    }

    @Override // p112g0.InterfaceC7422r0
    /* renamed from: c */
    public InterfaceFutureC5920f<Void> mo22372c(int i10, int i11) {
        return C0009f.m20f(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // p112g0.InterfaceC7422r0
    public void release() {
    }
}
