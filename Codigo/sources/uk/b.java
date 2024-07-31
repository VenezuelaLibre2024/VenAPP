package uk;

import dk.o;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b extends o {

    /* renamed from: a, reason: collision with root package name */
    private final int f27781a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27782b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27783c;

    /* renamed from: d, reason: collision with root package name */
    private int f27784d;

    public b(char c10, char c11, int i10) {
        this.f27781a = i10;
        this.f27782b = c11;
        boolean z10 = true;
        if (i10 <= 0 ? n.f(c10, c11) < 0 : n.f(c10, c11) > 0) {
            z10 = false;
        }
        this.f27783c = z10;
        this.f27784d = z10 ? c10 : c11;
    }

    @Override // dk.o
    public char a() {
        int i10 = this.f27784d;
        if (i10 != this.f27782b) {
            this.f27784d = this.f27781a + i10;
        } else {
            if (!this.f27783c) {
                throw new NoSuchElementException();
            }
            this.f27783c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f27783c;
    }
}
