package tj;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import mj.i;
import xj.k;

/* loaded from: classes3.dex */
public final class a<E> extends AtomicReferenceArray<E> implements i<E> {

    /* renamed from: f, reason: collision with root package name */
    private static final Integer f26961f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecognitionOptions.AZTEC);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: a, reason: collision with root package name */
    final int f26962a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicLong f26963b;

    /* renamed from: c, reason: collision with root package name */
    long f26964c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicLong f26965d;

    /* renamed from: e, reason: collision with root package name */
    final int f26966e;

    public a(int i10) {
        super(k.a(i10));
        this.f26962a = length() - 1;
        this.f26963b = new AtomicLong();
        this.f26965d = new AtomicLong();
        this.f26966e = Math.min(i10 / 4, f26961f.intValue());
    }

    int a(long j10) {
        return ((int) j10) & this.f26962a;
    }

    int b(long j10, int i10) {
        return ((int) j10) & i10;
    }

    E c(int i10) {
        return get(i10);
    }

    @Override // mj.j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    void d(long j10) {
        this.f26965d.lazySet(j10);
    }

    void e(int i10, E e10) {
        lazySet(i10, e10);
    }

    void f(long j10) {
        this.f26963b.lazySet(j10);
    }

    @Override // mj.j
    public boolean isEmpty() {
        return this.f26963b.get() == this.f26965d.get();
    }

    @Override // mj.j
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f26962a;
        long j10 = this.f26963b.get();
        int b10 = b(j10, i10);
        if (j10 >= this.f26964c) {
            long j11 = this.f26966e + j10;
            if (c(b(j11, i10)) == null) {
                this.f26964c = j11;
            } else if (c(b10) != null) {
                return false;
            }
        }
        e(b10, e10);
        f(j10 + 1);
        return true;
    }

    @Override // mj.i, mj.j
    public E poll() {
        long j10 = this.f26965d.get();
        int a10 = a(j10);
        E c10 = c(a10);
        if (c10 == null) {
            return null;
        }
        d(j10 + 1);
        e(a10, null);
        return c10;
    }
}
