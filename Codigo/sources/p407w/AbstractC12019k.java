package p407w;

import androidx.core.util.InterfaceC0977a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p112g0.C7436y0;
import p112g0.InterfaceC7422r0;

/* renamed from: w.k */
/* loaded from: classes.dex */
public abstract class AbstractC12019k {

    /* renamed from: f */
    private static final List<Integer> f31969f = Arrays.asList(1, 2, 3, 7);

    /* renamed from: a */
    private final int f31970a;

    /* renamed from: b */
    private final Executor f31971b;

    /* renamed from: c */
    private final InterfaceC12049y0 f31972c;

    /* renamed from: d */
    private final InterfaceC12020k0 f31973d;

    /* renamed from: e */
    private final InterfaceC0977a<Throwable> f31974e;

    /* renamed from: a */
    public InterfaceC7422r0 m38623a() {
        return new C7436y0(this);
    }

    /* renamed from: b */
    public InterfaceC0977a<Throwable> m38624b() {
        return this.f31974e;
    }

    /* renamed from: c */
    public Executor m38625c() {
        return this.f31971b;
    }

    /* renamed from: d */
    public InterfaceC12020k0 m38626d() {
        return this.f31973d;
    }

    /* renamed from: e */
    public InterfaceC12049y0 m38627e() {
        return this.f31972c;
    }

    /* renamed from: f */
    public int m38628f() {
        return this.f31970a;
    }
}
