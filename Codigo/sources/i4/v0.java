package i4;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class v0 extends OutputStream implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f17127a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<i0, a1> f17128b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private i0 f17129c;

    /* renamed from: d, reason: collision with root package name */
    private a1 f17130d;

    /* renamed from: e, reason: collision with root package name */
    private int f17131e;

    public v0(Handler handler) {
        this.f17127a = handler;
    }

    @Override // i4.y0
    public void a(i0 i0Var) {
        this.f17129c = i0Var;
        this.f17130d = i0Var != null ? this.f17128b.get(i0Var) : null;
    }

    public final void b(long j10) {
        i0 i0Var = this.f17129c;
        if (i0Var == null) {
            return;
        }
        if (this.f17130d == null) {
            a1 a1Var = new a1(this.f17127a, i0Var);
            this.f17130d = a1Var;
            this.f17128b.put(i0Var, a1Var);
        }
        a1 a1Var2 = this.f17130d;
        if (a1Var2 != null) {
            a1Var2.c(j10);
        }
        this.f17131e += (int) j10;
    }

    public final int e() {
        return this.f17131e;
    }

    public final Map<i0, a1> f() {
        return this.f17128b;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        b(1L);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer) {
        kotlin.jvm.internal.n.e(buffer, "buffer");
        b(buffer.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] buffer, int i10, int i11) {
        kotlin.jvm.internal.n.e(buffer, "buffer");
        b(i11);
    }
}
