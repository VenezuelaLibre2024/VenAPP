package i4;

import android.os.Handler;
import i4.m0;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class x0 extends FilterOutputStream implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final m0 f17134a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<i0, a1> f17135b;

    /* renamed from: c, reason: collision with root package name */
    private final long f17136c;

    /* renamed from: d, reason: collision with root package name */
    private final long f17137d;

    /* renamed from: e, reason: collision with root package name */
    private long f17138e;

    /* renamed from: f, reason: collision with root package name */
    private long f17139f;

    /* renamed from: r, reason: collision with root package name */
    private a1 f17140r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(OutputStream out, m0 requests, Map<i0, a1> progressMap, long j10) {
        super(out);
        kotlin.jvm.internal.n.e(out, "out");
        kotlin.jvm.internal.n.e(requests, "requests");
        kotlin.jvm.internal.n.e(progressMap, "progressMap");
        this.f17134a = requests;
        this.f17135b = progressMap;
        this.f17136c = j10;
        this.f17137d = e0.A();
    }

    private final void e(long j10) {
        a1 a1Var = this.f17140r;
        if (a1Var != null) {
            a1Var.b(j10);
        }
        long j11 = this.f17138e + j10;
        this.f17138e = j11;
        if (j11 >= this.f17139f + this.f17137d || j11 >= this.f17136c) {
            i();
        }
    }

    private final void i() {
        if (this.f17138e > this.f17139f) {
            for (final m0.a aVar : this.f17134a.r()) {
                if (aVar instanceof m0.c) {
                    Handler q10 = this.f17134a.q();
                    if ((q10 == null ? null : Boolean.valueOf(q10.post(new Runnable() { // from class: i4.w0
                        @Override // java.lang.Runnable
                        public final void run() {
                            x0.j(m0.a.this, this);
                        }
                    }))) == null) {
                        ((m0.c) aVar).a(this.f17134a, this.f17138e, this.f17136c);
                    }
                }
            }
            this.f17139f = this.f17138e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(m0.a callback, x0 this$0) {
        kotlin.jvm.internal.n.e(callback, "$callback");
        kotlin.jvm.internal.n.e(this$0, "this$0");
        ((m0.c) callback).a(this$0.f17134a, this$0.f(), this$0.g());
    }

    @Override // i4.y0
    public void a(i0 i0Var) {
        this.f17140r = i0Var != null ? this.f17135b.get(i0Var) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        Iterator<a1> it = this.f17135b.values().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        i();
    }

    public final long f() {
        return this.f17138e;
    }

    public final long g() {
        return this.f17136c;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        ((FilterOutputStream) this).out.write(i10);
        e(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) {
        kotlin.jvm.internal.n.e(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        e(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        kotlin.jvm.internal.n.e(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i10, i11);
        e(i11);
    }
}
