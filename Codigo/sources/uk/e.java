package uk;

import dk.e0;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class e extends e0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f27791a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27792b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27793c;

    /* renamed from: d, reason: collision with root package name */
    private int f27794d;

    public e(int i10, int i11, int i12) {
        this.f27791a = i12;
        this.f27792b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f27793c = z10;
        this.f27794d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f27793c;
    }

    @Override // dk.e0
    public int nextInt() {
        int i10 = this.f27794d;
        if (i10 != this.f27792b) {
            this.f27794d = this.f27791a + i10;
        } else {
            if (!this.f27793c) {
                throw new NoSuchElementException();
            }
            this.f27793c = false;
        }
        return i10;
    }
}
