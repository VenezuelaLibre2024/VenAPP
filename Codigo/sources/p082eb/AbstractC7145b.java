package p082eb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: eb.b */
/* loaded from: classes2.dex */
abstract class AbstractC7145b<T> implements Iterator<T> {

    /* renamed from: a */
    private b f16009a = b.NOT_READY;

    /* renamed from: b */
    private T f16010b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eb.b$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16011a;

        static {
            int[] iArr = new int[b.values().length];
            f16011a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16011a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eb.b$b */
    /* loaded from: classes2.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: d */
    private boolean m21245d() {
        this.f16009a = b.FAILED;
        this.f16010b = mo21246a();
        if (this.f16009a == b.DONE) {
            return false;
        }
        this.f16009a = b.READY;
        return true;
    }

    /* renamed from: a */
    protected abstract T mo21246a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final T m21247c() {
        this.f16009a = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C7159o.m21318u(this.f16009a != b.FAILED);
        int i10 = a.f16011a[this.f16009a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return m21245d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f16009a = b.NOT_READY;
        T t10 = (T) C7154j.m21288a(this.f16010b);
        this.f16010b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
