package uk;

import dk.AbstractC7006e0;
import java.util.NoSuchElementException;

/* renamed from: uk.e */
/* loaded from: classes3.dex */
public final class C11578e extends AbstractC7006e0 {

    /* renamed from: a */
    private final int f30114a;

    /* renamed from: b */
    private final int f30115b;

    /* renamed from: c */
    private boolean f30116c;

    /* renamed from: d */
    private int f30117d;

    public C11578e(int i10, int i11, int i12) {
        this.f30114a = i12;
        this.f30115b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f30116c = z10;
        this.f30117d = z10 ? i10 : i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30116c;
    }

    @Override // dk.AbstractC7006e0
    public int nextInt() {
        int i10 = this.f30117d;
        if (i10 != this.f30115b) {
            this.f30117d = this.f30114a + i10;
        } else {
            if (!this.f30116c) {
                throw new NoSuchElementException();
            }
            this.f30116c = false;
        }
        return i10;
    }
}
