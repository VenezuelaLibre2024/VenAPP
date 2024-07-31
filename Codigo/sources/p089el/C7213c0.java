package p089el;

import java.util.concurrent.atomic.AtomicReferenceArray;
import uk.C11585l;

/* renamed from: el.c0 */
/* loaded from: classes3.dex */
public final class C7213c0<T> {
    private volatile AtomicReferenceArray<T> array;

    public C7213c0(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    /* renamed from: a */
    public final int m21544a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final T m21545b(int i10) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    /* renamed from: c */
    public final void m21546c(int i10, T t10) {
        int m36293b;
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, t10);
            return;
        }
        m36293b = C11585l.m36293b(i10 + 1, length * 2);
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(m36293b);
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(i10, t10);
        this.array = atomicReferenceArray2;
    }
}
