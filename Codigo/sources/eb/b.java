package eb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    private EnumC0223b f14586a = EnumC0223b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private T f14587b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14588a;

        static {
            int[] iArr = new int[EnumC0223b.values().length];
            f14588a = iArr;
            try {
                iArr[EnumC0223b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14588a[EnumC0223b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eb.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0223b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean d() {
        this.f14586a = EnumC0223b.FAILED;
        this.f14587b = a();
        if (this.f14586a == EnumC0223b.DONE) {
            return false;
        }
        this.f14586a = EnumC0223b.READY;
        return true;
    }

    protected abstract T a();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T c() {
        this.f14586a = EnumC0223b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        o.u(this.f14586a != EnumC0223b.FAILED);
        int i10 = a.f14588a[this.f14586a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f14586a = EnumC0223b.NOT_READY;
        T t10 = (T) j.a(this.f14587b);
        this.f14587b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
