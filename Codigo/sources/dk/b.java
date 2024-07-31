package dk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class b<T> implements Iterator<T>, pk.a {

    /* renamed from: a, reason: collision with root package name */
    private t0 f14207a = t0.NotReady;

    /* renamed from: b, reason: collision with root package name */
    private T f14208b;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14209a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14209a = iArr;
        }
    }

    private final boolean e() {
        this.f14207a = t0.Failed;
        a();
        return this.f14207a == t0.Ready;
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.f14207a = t0.Done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(T t10) {
        this.f14208b = t10;
        this.f14207a = t0.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        t0 t0Var = this.f14207a;
        if (!(t0Var != t0.Failed)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = a.f14209a[t0Var.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14207a = t0.NotReady;
        return this.f14208b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
