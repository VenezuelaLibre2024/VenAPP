package q8;

import t6.i4;
import t6.s3;
import t8.r0;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23626a;

    /* renamed from: b, reason: collision with root package name */
    public final s3[] f23627b;

    /* renamed from: c, reason: collision with root package name */
    public final r[] f23628c;

    /* renamed from: d, reason: collision with root package name */
    public final i4 f23629d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f23630e;

    public b0(s3[] s3VarArr, r[] rVarArr, i4 i4Var, Object obj) {
        this.f23627b = s3VarArr;
        this.f23628c = (r[]) rVarArr.clone();
        this.f23629d = i4Var;
        this.f23630e = obj;
        this.f23626a = s3VarArr.length;
    }

    public boolean a(b0 b0Var) {
        if (b0Var == null || b0Var.f23628c.length != this.f23628c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f23628c.length; i10++) {
            if (!b(b0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(b0 b0Var, int i10) {
        return b0Var != null && r0.c(this.f23627b[i10], b0Var.f23627b[i10]) && r0.c(this.f23628c[i10], b0Var.f23628c[i10]);
    }

    public boolean c(int i10) {
        return this.f23627b[i10] != null;
    }
}
