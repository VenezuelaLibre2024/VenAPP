package tj;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p241mj.InterfaceC9599i;
import p449xj.C12508k;

/* renamed from: tj.a */
/* loaded from: classes3.dex */
public final class C11288a<E> extends AtomicReferenceArray<E> implements InterfaceC9599i<E> {

    /* renamed from: f */
    private static final Integer f29263f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecognitionOptions.AZTEC);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: a */
    final int f29264a;

    /* renamed from: b */
    final AtomicLong f29265b;

    /* renamed from: c */
    long f29266c;

    /* renamed from: d */
    final AtomicLong f29267d;

    /* renamed from: e */
    final int f29268e;

    public C11288a(int i10) {
        super(C12508k.m40953a(i10));
        this.f29264a = length() - 1;
        this.f29265b = new AtomicLong();
        this.f29267d = new AtomicLong();
        this.f29268e = Math.min(i10 / 4, f29263f.intValue());
    }

    /* renamed from: a */
    int m35250a(long j10) {
        return ((int) j10) & this.f29264a;
    }

    /* renamed from: b */
    int m35251b(long j10, int i10) {
        return ((int) j10) & i10;
    }

    /* renamed from: c */
    E m35252c(int i10) {
        return get(i10);
    }

    @Override // p241mj.InterfaceC9600j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    void m35253d(long j10) {
        this.f29267d.lazySet(j10);
    }

    /* renamed from: e */
    void m35254e(int i10, E e10) {
        lazySet(i10, e10);
    }

    /* renamed from: f */
    void m35255f(long j10) {
        this.f29265b.lazySet(j10);
    }

    @Override // p241mj.InterfaceC9600j
    public boolean isEmpty() {
        return this.f29265b.get() == this.f29267d.get();
    }

    @Override // p241mj.InterfaceC9600j
    public boolean offer(E e10) {
        if (e10 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i10 = this.f29264a;
        long j10 = this.f29265b.get();
        int m35251b = m35251b(j10, i10);
        if (j10 >= this.f29266c) {
            long j11 = this.f29268e + j10;
            if (m35252c(m35251b(j11, i10)) == null) {
                this.f29266c = j11;
            } else if (m35252c(m35251b) != null) {
                return false;
            }
        }
        m35254e(m35251b, e10);
        m35255f(j10 + 1);
        return true;
    }

    @Override // p241mj.InterfaceC9599i, p241mj.InterfaceC9600j
    public E poll() {
        long j10 = this.f29267d.get();
        int m35250a = m35250a(j10);
        E m35252c = m35252c(m35250a);
        if (m35252c == null) {
            return null;
        }
        m35253d(j10 + 1);
        m35254e(m35250a, null);
        return m35252c;
    }
}
