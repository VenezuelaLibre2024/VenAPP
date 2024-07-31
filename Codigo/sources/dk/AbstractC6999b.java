package dk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import pk.InterfaceC10201a;

/* renamed from: dk.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6999b<T> implements Iterator<T>, InterfaceC10201a {

    /* renamed from: a */
    private EnumC7036t0 f15565a = EnumC7036t0.NotReady;

    /* renamed from: b */
    private T f15566b;

    /* renamed from: dk.b$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15567a;

        static {
            int[] iArr = new int[EnumC7036t0.values().length];
            try {
                iArr[EnumC7036t0.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7036t0.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15567a = iArr;
        }
    }

    /* renamed from: e */
    private final boolean m20318e() {
        this.f15565a = EnumC7036t0.Failed;
        mo20319a();
        return this.f15565a == EnumC7036t0.Ready;
    }

    /* renamed from: a */
    protected abstract void mo20319a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m20320c() {
        this.f15565a = EnumC7036t0.Done;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m20321d(T t10) {
        this.f15566b = t10;
        this.f15565a = EnumC7036t0.Ready;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        EnumC7036t0 enumC7036t0 = this.f15565a;
        if (!(enumC7036t0 != EnumC7036t0.Failed)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = a.f15567a[enumC7036t0.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return m20318e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15565a = EnumC7036t0.NotReady;
        return this.f15566b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
