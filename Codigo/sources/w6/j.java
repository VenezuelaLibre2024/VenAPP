package w6;

import java.util.ArrayDeque;
import w6.f;
import w6.g;
import w6.h;

/* loaded from: classes.dex */
public abstract class j<I extends g, O extends h, E extends f> implements d<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    private final Thread f29694a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f29695b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f29696c = new ArrayDeque<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f29697d = new ArrayDeque<>();

    /* renamed from: e, reason: collision with root package name */
    private final I[] f29698e;

    /* renamed from: f, reason: collision with root package name */
    private final O[] f29699f;

    /* renamed from: g, reason: collision with root package name */
    private int f29700g;

    /* renamed from: h, reason: collision with root package name */
    private int f29701h;

    /* renamed from: i, reason: collision with root package name */
    private I f29702i;

    /* renamed from: j, reason: collision with root package name */
    private E f29703j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29704k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29705l;

    /* renamed from: m, reason: collision with root package name */
    private int f29706m;

    /* loaded from: classes.dex */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            j.this.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(I[] iArr, O[] oArr) {
        this.f29698e = iArr;
        this.f29700g = iArr.length;
        for (int i10 = 0; i10 < this.f29700g; i10++) {
            this.f29698e[i10] = g();
        }
        this.f29699f = oArr;
        this.f29701h = oArr.length;
        for (int i11 = 0; i11 < this.f29701h; i11++) {
            this.f29699f[i11] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f29694a = aVar;
        aVar.start();
    }

    private boolean f() {
        return !this.f29696c.isEmpty() && this.f29701h > 0;
    }

    private boolean k() {
        E i10;
        synchronized (this.f29695b) {
            while (!this.f29705l && !f()) {
                this.f29695b.wait();
            }
            if (this.f29705l) {
                return false;
            }
            I removeFirst = this.f29696c.removeFirst();
            O[] oArr = this.f29699f;
            int i11 = this.f29701h - 1;
            this.f29701h = i11;
            O o10 = oArr[i11];
            boolean z10 = this.f29704k;
            this.f29704k = false;
            if (removeFirst.s()) {
                o10.m(4);
            } else {
                if (removeFirst.r()) {
                    o10.m(Integer.MIN_VALUE);
                }
                if (removeFirst.t()) {
                    o10.m(134217728);
                }
                try {
                    i10 = j(removeFirst, o10, z10);
                } catch (OutOfMemoryError | RuntimeException e10) {
                    i10 = i(e10);
                }
                if (i10 != null) {
                    synchronized (this.f29695b) {
                        this.f29703j = i10;
                    }
                    return false;
                }
            }
            synchronized (this.f29695b) {
                if (!this.f29704k) {
                    if (o10.r()) {
                        this.f29706m++;
                    } else {
                        o10.f29688c = this.f29706m;
                        this.f29706m = 0;
                        this.f29697d.addLast(o10);
                        q(removeFirst);
                    }
                }
                o10.x();
                q(removeFirst);
            }
            return true;
        }
    }

    private void n() {
        if (f()) {
            this.f29695b.notify();
        }
    }

    private void o() {
        E e10 = this.f29703j;
        if (e10 != null) {
            throw e10;
        }
    }

    private void q(I i10) {
        i10.n();
        I[] iArr = this.f29698e;
        int i11 = this.f29700g;
        this.f29700g = i11 + 1;
        iArr[i11] = i10;
    }

    private void s(O o10) {
        o10.n();
        O[] oArr = this.f29699f;
        int i10 = this.f29701h;
        this.f29701h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (k());
    }

    @Override // w6.d
    public final void flush() {
        synchronized (this.f29695b) {
            this.f29704k = true;
            this.f29706m = 0;
            I i10 = this.f29702i;
            if (i10 != null) {
                q(i10);
                this.f29702i = null;
            }
            while (!this.f29696c.isEmpty()) {
                q(this.f29696c.removeFirst());
            }
            while (!this.f29697d.isEmpty()) {
                this.f29697d.removeFirst().x();
            }
        }
    }

    protected abstract I g();

    protected abstract O h();

    protected abstract E i(Throwable th2);

    protected abstract E j(I i10, O o10, boolean z10);

    @Override // w6.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final I d() {
        I i10;
        synchronized (this.f29695b) {
            o();
            t8.a.g(this.f29702i == null);
            int i11 = this.f29700g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f29698e;
                int i12 = i11 - 1;
                this.f29700g = i12;
                i10 = iArr[i12];
            }
            this.f29702i = i10;
        }
        return i10;
    }

    @Override // w6.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O b() {
        synchronized (this.f29695b) {
            o();
            if (this.f29697d.isEmpty()) {
                return null;
            }
            return this.f29697d.removeFirst();
        }
    }

    @Override // w6.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void c(I i10) {
        synchronized (this.f29695b) {
            o();
            t8.a.a(i10 == this.f29702i);
            this.f29696c.addLast(i10);
            n();
            this.f29702i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r(O o10) {
        synchronized (this.f29695b) {
            s(o10);
            n();
        }
    }

    @Override // w6.d
    public void release() {
        synchronized (this.f29695b) {
            this.f29705l = true;
            this.f29695b.notify();
        }
        try {
            this.f29694a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(int i10) {
        t8.a.g(this.f29700g == this.f29698e.length);
        for (I i11 : this.f29698e) {
            i11.y(i10);
        }
    }
}
