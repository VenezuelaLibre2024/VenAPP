package t6;

/* loaded from: classes.dex */
public class r implements a2 {

    /* renamed from: a, reason: collision with root package name */
    private final s8.o f26431a;

    /* renamed from: b, reason: collision with root package name */
    private final long f26432b;

    /* renamed from: c, reason: collision with root package name */
    private final long f26433c;

    /* renamed from: d, reason: collision with root package name */
    private final long f26434d;

    /* renamed from: e, reason: collision with root package name */
    private final long f26435e;

    /* renamed from: f, reason: collision with root package name */
    private final int f26436f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26437g;

    /* renamed from: h, reason: collision with root package name */
    private final long f26438h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f26439i;

    /* renamed from: j, reason: collision with root package name */
    private int f26440j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f26441k;

    public r() {
        this(new s8.o(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    protected r(s8.o oVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        i(i12, 0, "bufferForPlaybackMs", "0");
        i(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        i(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(i11, i10, "maxBufferMs", "minBufferMs");
        i(i15, 0, "backBufferDurationMs", "0");
        this.f26431a = oVar;
        this.f26432b = t8.r0.C0(i10);
        this.f26433c = t8.r0.C0(i11);
        this.f26434d = t8.r0.C0(i12);
        this.f26435e = t8.r0.C0(i13);
        this.f26436f = i14;
        this.f26440j = i14 == -1 ? 13107200 : i14;
        this.f26437g = z10;
        this.f26438h = t8.r0.C0(i15);
        this.f26439i = z11;
    }

    private static void i(int i10, int i11, String str, String str2) {
        t8.a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    private static int k(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void l(boolean z10) {
        int i10 = this.f26436f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f26440j = i10;
        this.f26441k = false;
        if (z10) {
            this.f26431a.g();
        }
    }

    @Override // t6.a2
    public boolean a() {
        return this.f26439i;
    }

    @Override // t6.a2
    public long b() {
        return this.f26438h;
    }

    @Override // t6.a2
    public boolean c(long j10, float f10, boolean z10, long j11) {
        long f02 = t8.r0.f0(j10, f10);
        long j12 = z10 ? this.f26435e : this.f26434d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || f02 >= j12 || (!this.f26437g && this.f26431a.f() >= this.f26440j);
    }

    @Override // t6.a2
    public s8.b d() {
        return this.f26431a;
    }

    @Override // t6.a2
    public void e() {
        l(true);
    }

    @Override // t6.a2
    public void f(q3[] q3VarArr, v7.f1 f1Var, q8.r[] rVarArr) {
        int i10 = this.f26436f;
        if (i10 == -1) {
            i10 = j(q3VarArr, rVarArr);
        }
        this.f26440j = i10;
        this.f26431a.h(i10);
    }

    @Override // t6.a2
    public void g() {
        l(true);
    }

    @Override // t6.a2
    public boolean h(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f26431a.f() >= this.f26440j;
        long j12 = this.f26432b;
        if (f10 > 1.0f) {
            j12 = Math.min(t8.r0.a0(j12, f10), this.f26433c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.f26437g && z11) {
                z10 = false;
            }
            this.f26441k = z10;
            if (!z10 && j11 < 500000) {
                t8.s.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f26433c || z11) {
            this.f26441k = false;
        }
        return this.f26441k;
    }

    protected int j(q3[] q3VarArr, q8.r[] rVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < q3VarArr.length; i11++) {
            if (rVarArr[i11] != null) {
                i10 += k(q3VarArr[i11].g());
            }
        }
        return Math.max(13107200, i10);
    }

    @Override // t6.a2
    public void onPrepared() {
        l(false);
    }
}
