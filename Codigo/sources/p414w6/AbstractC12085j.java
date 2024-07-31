package p414w6;

import java.util.ArrayDeque;
import p363t8.C11137a;
import p414w6.AbstractC12083h;
import p414w6.C12081f;
import p414w6.C12082g;

/* renamed from: w6.j */
/* loaded from: classes.dex */
public abstract class AbstractC12085j<I extends C12082g, O extends AbstractC12083h, E extends C12081f> implements InterfaceC12079d<I, O, E> {

    /* renamed from: a */
    private final Thread f32157a;

    /* renamed from: b */
    private final Object f32158b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f32159c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f32160d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f32161e;

    /* renamed from: f */
    private final O[] f32162f;

    /* renamed from: g */
    private int f32163g;

    /* renamed from: h */
    private int f32164h;

    /* renamed from: i */
    private I f32165i;

    /* renamed from: j */
    private E f32166j;

    /* renamed from: k */
    private boolean f32167k;

    /* renamed from: l */
    private boolean f32168l;

    /* renamed from: m */
    private int f32169m;

    /* renamed from: w6.j$a */
    /* loaded from: classes.dex */
    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            AbstractC12085j.this.m38820t();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12085j(I[] iArr, O[] oArr) {
        this.f32161e = iArr;
        this.f32163g = iArr.length;
        for (int i10 = 0; i10 < this.f32163g; i10++) {
            this.f32161e[i10] = mo22804g();
        }
        this.f32162f = oArr;
        this.f32164h = oArr.length;
        for (int i11 = 0; i11 < this.f32164h; i11++) {
            this.f32162f[i11] = mo22805h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f32157a = aVar;
        aVar.start();
    }

    /* renamed from: f */
    private boolean m38814f() {
        return !this.f32159c.isEmpty() && this.f32164h > 0;
    }

    /* renamed from: k */
    private boolean m38815k() {
        E mo22806i;
        synchronized (this.f32158b) {
            while (!this.f32168l && !m38814f()) {
                this.f32158b.wait();
            }
            if (this.f32168l) {
                return false;
            }
            I removeFirst = this.f32159c.removeFirst();
            O[] oArr = this.f32162f;
            int i10 = this.f32164h - 1;
            this.f32164h = i10;
            O o10 = oArr[i10];
            boolean z10 = this.f32167k;
            this.f32167k = false;
            if (removeFirst.m38794s()) {
                o10.m38789m(4);
            } else {
                if (removeFirst.m38793r()) {
                    o10.m38789m(Integer.MIN_VALUE);
                }
                if (removeFirst.m38795t()) {
                    o10.m38789m(134217728);
                }
                try {
                    mo22806i = mo22807j(removeFirst, o10, z10);
                } catch (OutOfMemoryError | RuntimeException e10) {
                    mo22806i = mo22806i(e10);
                }
                if (mo22806i != null) {
                    synchronized (this.f32158b) {
                        this.f32166j = mo22806i;
                    }
                    return false;
                }
            }
            synchronized (this.f32158b) {
                if (!this.f32167k) {
                    if (o10.m38793r()) {
                        this.f32169m++;
                    } else {
                        o10.f32151c = this.f32169m;
                        this.f32169m = 0;
                        this.f32160d.addLast(o10);
                        m38818q(removeFirst);
                    }
                }
                o10.mo22797x();
                m38818q(removeFirst);
            }
            return true;
        }
    }

    /* renamed from: n */
    private void m38816n() {
        if (m38814f()) {
            this.f32158b.notify();
        }
    }

    /* renamed from: o */
    private void m38817o() {
        E e10 = this.f32166j;
        if (e10 != null) {
            throw e10;
        }
    }

    /* renamed from: q */
    private void m38818q(I i10) {
        i10.mo22818n();
        I[] iArr = this.f32161e;
        int i11 = this.f32163g;
        this.f32163g = i11 + 1;
        iArr[i11] = i10;
    }

    /* renamed from: s */
    private void m38819s(O o10) {
        o10.mo22818n();
        O[] oArr = this.f32162f;
        int i10 = this.f32164h;
        this.f32164h = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m38820t() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (m38815k());
    }

    @Override // p414w6.InterfaceC12079d
    public final void flush() {
        synchronized (this.f32158b) {
            this.f32167k = true;
            this.f32169m = 0;
            I i10 = this.f32165i;
            if (i10 != null) {
                m38818q(i10);
                this.f32165i = null;
            }
            while (!this.f32159c.isEmpty()) {
                m38818q(this.f32159c.removeFirst());
            }
            while (!this.f32160d.isEmpty()) {
                this.f32160d.removeFirst().mo22797x();
            }
        }
    }

    /* renamed from: g */
    protected abstract I mo22804g();

    /* renamed from: h */
    protected abstract O mo22805h();

    /* renamed from: i */
    protected abstract E mo22806i(Throwable th2);

    /* renamed from: j */
    protected abstract E mo22807j(I i10, O o10, boolean z10);

    @Override // p414w6.InterfaceC12079d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final I mo22793d() {
        I i10;
        synchronized (this.f32158b) {
            m38817o();
            C11137a.m34605g(this.f32165i == null);
            int i11 = this.f32163g;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.f32161e;
                int i12 = i11 - 1;
                this.f32163g = i12;
                i10 = iArr[i12];
            }
            this.f32165i = i10;
        }
        return i10;
    }

    @Override // p414w6.InterfaceC12079d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O mo22791b() {
        synchronized (this.f32158b) {
            m38817o();
            if (this.f32160d.isEmpty()) {
                return null;
            }
            return this.f32160d.removeFirst();
        }
    }

    @Override // p414w6.InterfaceC12079d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void mo22792c(I i10) {
        synchronized (this.f32158b) {
            m38817o();
            C11137a.m34599a(i10 == this.f32165i);
            this.f32159c.addLast(i10);
            m38816n();
            this.f32165i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void m38824r(O o10) {
        synchronized (this.f32158b) {
            m38819s(o10);
            m38816n();
        }
    }

    @Override // p414w6.InterfaceC12079d
    public void release() {
        synchronized (this.f32158b) {
            this.f32168l = true;
            this.f32158b.notify();
        }
        try {
            this.f32157a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final void m38825u(int i10) {
        C11137a.m34605g(this.f32163g == this.f32161e.length);
        for (I i11 : this.f32161e) {
            i11.m38811y(i10);
        }
    }
}
