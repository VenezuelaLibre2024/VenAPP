package h7;

import java.util.Arrays;
import t8.e0;
import y6.l;
import y6.n;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f16493a = new f();

    /* renamed from: b, reason: collision with root package name */
    private final e0 f16494b = new e0(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f16495c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f16496d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16497e;

    private int a(int i10) {
        int i11;
        int i12 = 0;
        this.f16496d = 0;
        do {
            int i13 = this.f16496d;
            int i14 = i10 + i13;
            f fVar = this.f16493a;
            if (i14 >= fVar.f16504g) {
                break;
            }
            int[] iArr = fVar.f16507j;
            this.f16496d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public f b() {
        return this.f16493a;
    }

    public e0 c() {
        return this.f16494b;
    }

    public boolean d(l lVar) {
        int i10;
        t8.a.g(lVar != null);
        if (this.f16497e) {
            this.f16497e = false;
            this.f16494b.Q(0);
        }
        while (!this.f16497e) {
            if (this.f16495c < 0) {
                if (!this.f16493a.c(lVar) || !this.f16493a.a(lVar, true)) {
                    return false;
                }
                f fVar = this.f16493a;
                int i11 = fVar.f16505h;
                if ((fVar.f16499b & 1) == 1 && this.f16494b.g() == 0) {
                    i11 += a(0);
                    i10 = this.f16496d + 0;
                } else {
                    i10 = 0;
                }
                if (!n.e(lVar, i11)) {
                    return false;
                }
                this.f16495c = i10;
            }
            int a10 = a(this.f16495c);
            int i12 = this.f16495c + this.f16496d;
            if (a10 > 0) {
                e0 e0Var = this.f16494b;
                e0Var.c(e0Var.g() + a10);
                if (!n.d(lVar, this.f16494b.e(), this.f16494b.g(), a10)) {
                    return false;
                }
                e0 e0Var2 = this.f16494b;
                e0Var2.T(e0Var2.g() + a10);
                this.f16497e = this.f16493a.f16507j[i12 + (-1)] != 255;
            }
            if (i12 == this.f16493a.f16504g) {
                i12 = -1;
            }
            this.f16495c = i12;
        }
        return true;
    }

    public void e() {
        this.f16493a.b();
        this.f16494b.Q(0);
        this.f16495c = -1;
        this.f16497e = false;
    }

    public void f() {
        if (this.f16494b.e().length == 65025) {
            return;
        }
        e0 e0Var = this.f16494b;
        e0Var.S(Arrays.copyOf(e0Var.e(), Math.max(65025, this.f16494b.g())), this.f16494b.g());
    }
}
