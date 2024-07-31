package uk;

import dk.AbstractC7025o;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9322n;

/* renamed from: uk.b */
/* loaded from: classes3.dex */
public final class C11575b extends AbstractC7025o {

    /* renamed from: a */
    private final int f30104a;

    /* renamed from: b */
    private final int f30105b;

    /* renamed from: c */
    private boolean f30106c;

    /* renamed from: d */
    private int f30107d;

    public C11575b(char c10, char c11, int i10) {
        this.f30104a = i10;
        this.f30105b = c11;
        boolean z10 = true;
        if (i10 <= 0 ? C9322n.m27782f(c10, c11) < 0 : C9322n.m27782f(c10, c11) > 0) {
            z10 = false;
        }
        this.f30106c = z10;
        this.f30107d = z10 ? c10 : c11;
    }

    @Override // dk.AbstractC7025o
    /* renamed from: a */
    public char mo20507a() {
        int i10 = this.f30107d;
        if (i10 != this.f30105b) {
            this.f30107d = this.f30104a + i10;
        } else {
            if (!this.f30106c) {
                throw new NoSuchElementException();
            }
            this.f30106c = false;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f30106c;
    }
}
