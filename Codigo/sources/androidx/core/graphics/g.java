package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f3717e = new g(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3718a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3719b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3720c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3721d;

    /* loaded from: classes.dex */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            Insets of2;
            of2 = Insets.of(i10, i11, i12, i13);
            return of2;
        }
    }

    private g(int i10, int i11, int i12, int i13) {
        this.f3718a = i10;
        this.f3719b = i11;
        this.f3720c = i12;
        this.f3721d = i13;
    }

    public static g a(g gVar, g gVar2) {
        return b(Math.max(gVar.f3718a, gVar2.f3718a), Math.max(gVar.f3719b, gVar2.f3719b), Math.max(gVar.f3720c, gVar2.f3720c), Math.max(gVar.f3721d, gVar2.f3721d));
    }

    public static g b(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f3717e : new g(i10, i11, i12, i13);
    }

    public static g c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static g d(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public Insets e() {
        return a.a(this.f3718a, this.f3719b, this.f3720c, this.f3721d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3721d == gVar.f3721d && this.f3718a == gVar.f3718a && this.f3720c == gVar.f3720c && this.f3719b == gVar.f3719b;
    }

    public int hashCode() {
        return (((((this.f3718a * 31) + this.f3719b) * 31) + this.f3720c) * 31) + this.f3721d;
    }

    public String toString() {
        return "Insets{left=" + this.f3718a + ", top=" + this.f3719b + ", right=" + this.f3720c + ", bottom=" + this.f3721d + '}';
    }
}
