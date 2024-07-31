package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: androidx.core.graphics.g */
/* loaded from: classes.dex */
public final class C0900g {

    /* renamed from: e */
    public static final C0900g f4389e = new C0900g(0, 0, 0, 0);

    /* renamed from: a */
    public final int f4390a;

    /* renamed from: b */
    public final int f4391b;

    /* renamed from: c */
    public final int f4392c;

    /* renamed from: d */
    public final int f4393d;

    /* renamed from: androidx.core.graphics.g$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static Insets m4584a(int i10, int i11, int i12, int i13) {
            Insets of2;
            of2 = Insets.of(i10, i11, i12, i13);
            return of2;
        }
    }

    private C0900g(int i10, int i11, int i12, int i13) {
        this.f4390a = i10;
        this.f4391b = i11;
        this.f4392c = i12;
        this.f4393d = i13;
    }

    /* renamed from: a */
    public static C0900g m4579a(C0900g c0900g, C0900g c0900g2) {
        return m4580b(Math.max(c0900g.f4390a, c0900g2.f4390a), Math.max(c0900g.f4391b, c0900g2.f4391b), Math.max(c0900g.f4392c, c0900g2.f4392c), Math.max(c0900g.f4393d, c0900g2.f4393d));
    }

    /* renamed from: b */
    public static C0900g m4580b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f4389e : new C0900g(i10, i11, i12, i13);
    }

    /* renamed from: c */
    public static C0900g m4581c(Rect rect) {
        return m4580b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C0900g m4582d(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return m4580b(i10, i11, i12, i13);
    }

    /* renamed from: e */
    public Insets m4583e() {
        return a.m4584a(this.f4390a, this.f4391b, this.f4392c, this.f4393d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0900g.class != obj.getClass()) {
            return false;
        }
        C0900g c0900g = (C0900g) obj;
        return this.f4393d == c0900g.f4393d && this.f4390a == c0900g.f4390a && this.f4392c == c0900g.f4392c && this.f4391b == c0900g.f4391b;
    }

    public int hashCode() {
        return (((((this.f4390a * 31) + this.f4391b) * 31) + this.f4392c) * 31) + this.f4393d;
    }

    public String toString() {
        return "Insets{left=" + this.f4390a + ", top=" + this.f4391b + ", right=" + this.f4392c + ", bottom=" + this.f4393d + '}';
    }
}
