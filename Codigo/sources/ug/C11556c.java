package ug;

import p066dg.C6958s;

/* renamed from: ug.c */
/* loaded from: classes2.dex */
public final class C11556c {

    /* renamed from: a */
    private final int f30004a;

    /* renamed from: b */
    private final int[] f30005b;

    /* renamed from: c */
    private final C6958s[] f30006c;

    public C11556c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f30004a = i10;
        this.f30005b = iArr;
        float f10 = i13;
        this.f30006c = new C6958s[]{new C6958s(i11, f10), new C6958s(i12, f10)};
    }

    /* renamed from: a */
    public C6958s[] m36219a() {
        return this.f30006c;
    }

    /* renamed from: b */
    public int[] m36220b() {
        return this.f30005b;
    }

    /* renamed from: c */
    public int m36221c() {
        return this.f30004a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11556c) && this.f30004a == ((C11556c) obj).f30004a;
    }

    public int hashCode() {
        return this.f30004a;
    }
}
