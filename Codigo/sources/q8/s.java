package q8;

import java.util.List;
import v7.d1;

/* loaded from: classes.dex */
public final class s extends c {

    /* renamed from: h, reason: collision with root package name */
    private final int f23720h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f23721i;

    public s(d1 d1Var, int i10, int i11) {
        this(d1Var, i10, i11, 0, null);
    }

    public s(d1 d1Var, int i10, int i11, int i12, Object obj) {
        super(d1Var, new int[]{i10}, i11);
        this.f23720h = i12;
        this.f23721i = obj;
    }

    @Override // q8.r
    public void g(long j10, long j11, long j12, List<? extends x7.n> list, x7.o[] oVarArr) {
    }

    @Override // q8.r
    public int h() {
        return 0;
    }

    @Override // q8.r
    public Object m() {
        return this.f23721i;
    }

    @Override // q8.r
    public int t() {
        return this.f23720h;
    }
}
