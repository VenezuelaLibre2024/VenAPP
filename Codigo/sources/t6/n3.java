package t6;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
final class n3 extends a {

    /* renamed from: t, reason: collision with root package name */
    private final int f26331t;

    /* renamed from: u, reason: collision with root package name */
    private final int f26332u;

    /* renamed from: v, reason: collision with root package name */
    private final int[] f26333v;

    /* renamed from: w, reason: collision with root package name */
    private final int[] f26334w;

    /* renamed from: x, reason: collision with root package name */
    private final d4[] f26335x;

    /* renamed from: y, reason: collision with root package name */
    private final Object[] f26336y;

    /* renamed from: z, reason: collision with root package name */
    private final HashMap<Object, Integer> f26337z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(Collection<? extends m2> collection, v7.x0 x0Var) {
        super(false, x0Var);
        int i10 = 0;
        int size = collection.size();
        this.f26333v = new int[size];
        this.f26334w = new int[size];
        this.f26335x = new d4[size];
        this.f26336y = new Object[size];
        this.f26337z = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (m2 m2Var : collection) {
            this.f26335x[i12] = m2Var.a();
            this.f26334w[i12] = i10;
            this.f26333v[i12] = i11;
            i10 += this.f26335x[i12].u();
            i11 += this.f26335x[i12].n();
            this.f26336y[i12] = m2Var.l();
            this.f26337z.put(this.f26336y[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f26331t = i10;
        this.f26332u = i11;
    }

    @Override // t6.a
    protected Object C(int i10) {
        return this.f26336y[i10];
    }

    @Override // t6.a
    protected int E(int i10) {
        return this.f26333v[i10];
    }

    @Override // t6.a
    protected int F(int i10) {
        return this.f26334w[i10];
    }

    @Override // t6.a
    protected d4 I(int i10) {
        return this.f26335x[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<d4> J() {
        return Arrays.asList(this.f26335x);
    }

    @Override // t6.d4
    public int n() {
        return this.f26332u;
    }

    @Override // t6.d4
    public int u() {
        return this.f26331t;
    }

    @Override // t6.a
    protected int x(Object obj) {
        Integer num = this.f26337z.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // t6.a
    protected int y(int i10) {
        return t8.r0.h(this.f26333v, i10 + 1, false, false);
    }

    @Override // t6.a
    protected int z(int i10) {
        return t8.r0.h(this.f26334w, i10 + 1, false, false);
    }
}
