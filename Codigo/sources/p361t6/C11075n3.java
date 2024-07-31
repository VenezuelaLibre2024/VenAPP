package p361t6;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p363t8.C11172r0;
import p397v7.InterfaceC11738x0;

/* renamed from: t6.n3 */
/* loaded from: classes.dex */
final class C11075n3 extends AbstractC10995a {

    /* renamed from: t */
    private final int f28558t;

    /* renamed from: u */
    private final int f28559u;

    /* renamed from: v */
    private final int[] f28560v;

    /* renamed from: w */
    private final int[] f28561w;

    /* renamed from: x */
    private final AbstractC11018d4[] f28562x;

    /* renamed from: y */
    private final Object[] f28563y;

    /* renamed from: z */
    private final HashMap<Object, Integer> f28564z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11075n3(Collection<? extends InterfaceC11069m2> collection, InterfaceC11738x0 interfaceC11738x0) {
        super(false, interfaceC11738x0);
        int i10 = 0;
        int size = collection.size();
        this.f28560v = new int[size];
        this.f28561w = new int[size];
        this.f28562x = new AbstractC11018d4[size];
        this.f28563y = new Object[size];
        this.f28564z = new HashMap<>();
        int i11 = 0;
        int i12 = 0;
        for (InterfaceC11069m2 interfaceC11069m2 : collection) {
            this.f28562x[i12] = interfaceC11069m2.mo33708a();
            this.f28561w[i12] = i10;
            this.f28560v[i12] = i11;
            i10 += this.f28562x[i12].mo11861u();
            i11 += this.f28562x[i12].mo11858n();
            this.f28563y[i12] = interfaceC11069m2.mo33710l();
            this.f28564z.put(this.f28563y[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f28558t = i10;
        this.f28559u = i11;
    }

    @Override // p361t6.AbstractC10995a
    /* renamed from: C */
    protected Object mo33621C(int i10) {
        return this.f28563y[i10];
    }

    @Override // p361t6.AbstractC10995a
    /* renamed from: E */
    protected int mo33622E(int i10) {
        return this.f28560v[i10];
    }

    @Override // p361t6.AbstractC10995a
    /* renamed from: F */
    protected int mo33623F(int i10) {
        return this.f28561w[i10];
    }

    @Override // p361t6.AbstractC10995a
    /* renamed from: I */
    protected AbstractC11018d4 mo33624I(int i10) {
        return this.f28562x[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public List<AbstractC11018d4> m34305J() {
        return Arrays.asList(this.f28562x);
    }

    @Override // p361t6.AbstractC11018d4
    /* renamed from: n */
    public int mo11858n() {
        return this.f28559u;
    }

    @Override // p361t6.AbstractC11018d4
    /* renamed from: u */
    public int mo11861u() {
        return this.f28558t;
    }

    @Override // p361t6.AbstractC10995a
    /* renamed from: x */
    protected int mo33630x(Object obj) {
        Integer num = this.f28564z.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p361t6.AbstractC10995a
    /* renamed from: y */
    protected int mo33631y(int i10) {
        return C11172r0.m34924h(this.f28560v, i10 + 1, false, false);
    }

    @Override // p361t6.AbstractC10995a
    /* renamed from: z */
    protected int mo33632z(int i10) {
        return C11172r0.m34924h(this.f28561w, i10 + 1, false, false);
    }
}
