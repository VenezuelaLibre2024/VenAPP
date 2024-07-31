package p152i4;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C9322n;

/* renamed from: i4.v0 */
/* loaded from: classes.dex */
public final class C7833v0 extends OutputStream implements InterfaceC7839y0 {

    /* renamed from: a */
    private final Handler f18787a;

    /* renamed from: b */
    private final Map<C7807i0, C7789a1> f18788b = new HashMap();

    /* renamed from: c */
    private C7807i0 f18789c;

    /* renamed from: d */
    private C7789a1 f18790d;

    /* renamed from: e */
    private int f18791e;

    public C7833v0(Handler handler) {
        this.f18787a = handler;
    }

    @Override // p152i4.InterfaceC7839y0
    /* renamed from: a */
    public void mo24120a(C7807i0 c7807i0) {
        this.f18789c = c7807i0;
        this.f18790d = c7807i0 != null ? this.f18788b.get(c7807i0) : null;
    }

    /* renamed from: b */
    public final void m24121b(long j10) {
        C7807i0 c7807i0 = this.f18789c;
        if (c7807i0 == null) {
            return;
        }
        if (this.f18790d == null) {
            C7789a1 c7789a1 = new C7789a1(this.f18787a, c7807i0);
            this.f18790d = c7789a1;
            this.f18788b.put(c7807i0, c7789a1);
        }
        C7789a1 c7789a12 = this.f18790d;
        if (c7789a12 != null) {
            c7789a12.m23789c(j10);
        }
        this.f18791e += (int) j10;
    }

    /* renamed from: e */
    public final int m24122e() {
        return this.f18791e;
    }

    /* renamed from: f */
    public final Map<C7807i0, C7789a1> m24123f() {
        return this.f18788b;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        m24121b(1L);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer) {
        C9322n.m27781e(buffer, "buffer");
        m24121b(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        C9322n.m27781e(buffer, "buffer");
        m24121b(i11);
    }
}
