package ug;

import dg.s;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f27681a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f27682b;

    /* renamed from: c, reason: collision with root package name */
    private final s[] f27683c;

    public c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f27681a = i10;
        this.f27682b = iArr;
        float f10 = i13;
        this.f27683c = new s[]{new s(i11, f10), new s(i12, f10)};
    }

    public s[] a() {
        return this.f27683c;
    }

    public int[] b() {
        return this.f27682b;
    }

    public int c() {
        return this.f27681a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f27681a == ((c) obj).f27681a;
    }

    public int hashCode() {
        return this.f27681a;
    }
}
