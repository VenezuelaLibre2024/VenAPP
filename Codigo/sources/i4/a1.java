package i4;

import android.os.Handler;
import i4.i0;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f16915a;

    /* renamed from: b, reason: collision with root package name */
    private final i0 f16916b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16917c;

    /* renamed from: d, reason: collision with root package name */
    private long f16918d;

    /* renamed from: e, reason: collision with root package name */
    private long f16919e;

    /* renamed from: f, reason: collision with root package name */
    private long f16920f;

    public a1(Handler handler, i0 request) {
        kotlin.jvm.internal.n.e(request, "request");
        this.f16915a = handler;
        this.f16916b = request;
        this.f16917c = e0.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(i0.b bVar, long j10, long j11) {
        ((i0.f) bVar).a(j10, j11);
    }

    public final void b(long j10) {
        long j11 = this.f16918d + j10;
        this.f16918d = j11;
        if (j11 >= this.f16919e + this.f16917c || j11 >= this.f16920f) {
            d();
        }
    }

    public final void c(long j10) {
        this.f16920f += j10;
    }

    public final void d() {
        if (this.f16918d > this.f16919e) {
            final i0.b o10 = this.f16916b.o();
            final long j10 = this.f16920f;
            if (j10 <= 0 || !(o10 instanceof i0.f)) {
                return;
            }
            final long j11 = this.f16918d;
            Handler handler = this.f16915a;
            if ((handler == null ? null : Boolean.valueOf(handler.post(new Runnable() { // from class: i4.z0
                @Override // java.lang.Runnable
                public final void run() {
                    a1.e(i0.b.this, j11, j10);
                }
            }))) == null) {
                ((i0.f) o10).a(j11, j10);
            }
            this.f16919e = this.f16918d;
        }
    }
}
