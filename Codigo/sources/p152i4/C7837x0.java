package p152i4;

import android.os.Handler;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p152i4.C7815m0;

/* renamed from: i4.x0 */
/* loaded from: classes.dex */
public final class C7837x0 extends FilterOutputStream implements InterfaceC7839y0 {

    /* renamed from: a */
    private final C7815m0 f18794a;

    /* renamed from: b */
    private final Map<C7807i0, C7789a1> f18795b;

    /* renamed from: c */
    private final long f18796c;

    /* renamed from: d */
    private final long f18797d;

    /* renamed from: e */
    private long f18798e;

    /* renamed from: f */
    private long f18799f;

    /* renamed from: r */
    private C7789a1 f18800r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7837x0(OutputStream out, C7815m0 requests, Map<C7807i0, C7789a1> progressMap, long j10) {
        super(out);
        C9322n.m27781e(out, "out");
        C9322n.m27781e(requests, "requests");
        C9322n.m27781e(progressMap, "progressMap");
        this.f18794a = requests;
        this.f18795b = progressMap;
        this.f18796c = j10;
        this.f18797d = C7799e0.m23828A();
    }

    /* renamed from: e */
    private final void m24125e(long j10) {
        C7789a1 c7789a1 = this.f18800r;
        if (c7789a1 != null) {
            c7789a1.m23788b(j10);
        }
        long j11 = this.f18798e + j10;
        this.f18798e = j11;
        if (j11 >= this.f18799f + this.f18797d || j11 >= this.f18796c) {
            m24126i();
        }
    }

    /* renamed from: i */
    private final void m24126i() {
        if (this.f18798e > this.f18799f) {
            for (final C7815m0.a aVar : this.f18794a.m24050r()) {
                if (aVar instanceof C7815m0.c) {
                    Handler m24049q = this.f18794a.m24049q();
                    if ((m24049q == null ? null : Boolean.valueOf(m24049q.post(new Runnable() { // from class: i4.w0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7837x0.m24127j(C7815m0.a.this, this);
                        }
                    }))) == null) {
                        ((C7815m0.c) aVar).m24059a(this.f18794a, this.f18798e, this.f18796c);
                    }
                }
            }
            this.f18799f = this.f18798e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m24127j(C7815m0.a callback, C7837x0 this$0) {
        C9322n.m27781e(callback, "$callback");
        C9322n.m27781e(this$0, "this$0");
        ((C7815m0.c) callback).m24059a(this$0.f18794a, this$0.m24128f(), this$0.m24129g());
    }

    @Override // p152i4.InterfaceC7839y0
    /* renamed from: a */
    public void mo24120a(C7807i0 c7807i0) {
        this.f18800r = c7807i0 != null ? this.f18795b.get(c7807i0) : null;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        Iterator<C7789a1> it = this.f18795b.values().iterator();
        while (it.hasNext()) {
            it.next().m23790d();
        }
        m24126i();
    }

    /* renamed from: f */
    public final long m24128f() {
        return this.f18798e;
    }

    /* renamed from: g */
    public final long m24129g() {
        return this.f18796c;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        ((FilterOutputStream) this).out.write(i10);
        m24125e(1L);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer) {
        C9322n.m27781e(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer);
        m24125e(buffer.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        C9322n.m27781e(buffer, "buffer");
        ((FilterOutputStream) this).out.write(buffer, i10, i11);
        m24125e(i11);
    }
}
