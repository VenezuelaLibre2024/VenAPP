package p397v7;

import com.google.common.collect.AbstractC5886l0;
import com.google.common.collect.InterfaceC5884k0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p351s8.InterfaceC10811b;
import p351s8.InterfaceC10834m0;
import p361t6.AbstractC11018d4;
import p361t6.C11010c2;
import p363t8.C11137a;
import p397v7.InterfaceC11684a0;

/* renamed from: v7.j0 */
/* loaded from: classes.dex */
public final class C11710j0 extends AbstractC11701g<Integer> {

    /* renamed from: G */
    private static final C11010c2 f30735G = new C11010c2.c().m33731d("MergingMediaSource").m33728a();

    /* renamed from: A */
    private final InterfaceC11707i f30736A;

    /* renamed from: B */
    private final Map<Object, Long> f30737B;

    /* renamed from: C */
    private final InterfaceC5884k0<Object, C11692d> f30738C;

    /* renamed from: D */
    private int f30739D;

    /* renamed from: E */
    private long[][] f30740E;

    /* renamed from: F */
    private b f30741F;

    /* renamed from: v */
    private final boolean f30742v;

    /* renamed from: w */
    private final boolean f30743w;

    /* renamed from: x */
    private final InterfaceC11684a0[] f30744x;

    /* renamed from: y */
    private final AbstractC11018d4[] f30745y;

    /* renamed from: z */
    private final ArrayList<InterfaceC11684a0> f30746z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v7.j0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC11727s {

        /* renamed from: r */
        private final long[] f30747r;

        /* renamed from: s */
        private final long[] f30748s;

        public a(AbstractC11018d4 abstractC11018d4, Map<Object, Long> map) {
            super(abstractC11018d4);
            int mo11861u = abstractC11018d4.mo11861u();
            this.f30748s = new long[abstractC11018d4.mo11861u()];
            AbstractC11018d4.d dVar = new AbstractC11018d4.d();
            for (int i10 = 0; i10 < mo11861u; i10++) {
                this.f30748s[i10] = abstractC11018d4.m34004s(i10, dVar).f28268y;
            }
            int mo11858n = abstractC11018d4.mo11858n();
            this.f30747r = new long[mo11858n];
            AbstractC11018d4.b bVar = new AbstractC11018d4.b();
            for (int i11 = 0; i11 < mo11858n; i11++) {
                abstractC11018d4.mo11857l(i11, bVar, true);
                long longValue = ((Long) C11137a.m34603e(map.get(bVar.f28226b))).longValue();
                long[] jArr = this.f30747r;
                longValue = longValue == Long.MIN_VALUE ? bVar.f28228d : longValue;
                jArr[i11] = longValue;
                long j10 = bVar.f28228d;
                if (j10 != -9223372036854775807L) {
                    long[] jArr2 = this.f30748s;
                    int i12 = bVar.f28227c;
                    jArr2[i12] = jArr2[i12] - (j10 - longValue);
                }
            }
        }

        @Override // p397v7.AbstractC11727s, p361t6.AbstractC11018d4
        /* renamed from: l */
        public AbstractC11018d4.b mo11857l(int i10, AbstractC11018d4.b bVar, boolean z10) {
            super.mo11857l(i10, bVar, z10);
            bVar.f28228d = this.f30747r[i10];
            return bVar;
        }

        @Override // p397v7.AbstractC11727s, p361t6.AbstractC11018d4
        /* renamed from: t */
        public AbstractC11018d4.d mo11860t(int i10, AbstractC11018d4.d dVar, long j10) {
            long j11;
            super.mo11860t(i10, dVar, j10);
            long j12 = this.f30748s[i10];
            dVar.f28268y = j12;
            if (j12 != -9223372036854775807L) {
                long j13 = dVar.f28267x;
                if (j13 != -9223372036854775807L) {
                    j11 = Math.min(j13, j12);
                    dVar.f28267x = j11;
                    return dVar;
                }
            }
            j11 = dVar.f28267x;
            dVar.f28267x = j11;
            return dVar;
        }
    }

    /* renamed from: v7.j0$b */
    /* loaded from: classes.dex */
    public static final class b extends IOException {

        /* renamed from: a */
        public final int f30749a;

        public b(int i10) {
            this.f30749a = i10;
        }
    }

    public C11710j0(boolean z10, boolean z11, InterfaceC11707i interfaceC11707i, InterfaceC11684a0... interfaceC11684a0Arr) {
        this.f30742v = z10;
        this.f30743w = z11;
        this.f30744x = interfaceC11684a0Arr;
        this.f30736A = interfaceC11707i;
        this.f30746z = new ArrayList<>(Arrays.asList(interfaceC11684a0Arr));
        this.f30739D = -1;
        this.f30745y = new AbstractC11018d4[interfaceC11684a0Arr.length];
        this.f30740E = new long[0];
        this.f30737B = new HashMap();
        this.f30738C = AbstractC5886l0.m14992a().m14999a().mo14998e();
    }

    public C11710j0(boolean z10, boolean z11, InterfaceC11684a0... interfaceC11684a0Arr) {
        this(z10, z11, new C11709j(), interfaceC11684a0Arr);
    }

    public C11710j0(boolean z10, InterfaceC11684a0... interfaceC11684a0Arr) {
        this(z10, false, interfaceC11684a0Arr);
    }

    public C11710j0(InterfaceC11684a0... interfaceC11684a0Arr) {
        this(false, interfaceC11684a0Arr);
    }

    /* renamed from: M */
    private void m36915M() {
        AbstractC11018d4.b bVar = new AbstractC11018d4.b();
        for (int i10 = 0; i10 < this.f30739D; i10++) {
            long j10 = -this.f30745y[0].m34001k(i10, bVar).m34023r();
            int i11 = 1;
            while (true) {
                AbstractC11018d4[] abstractC11018d4Arr = this.f30745y;
                if (i11 < abstractC11018d4Arr.length) {
                    this.f30740E[i10][i11] = j10 - (-abstractC11018d4Arr[i11].m34001k(i10, bVar).m34023r());
                    i11++;
                }
            }
        }
    }

    /* renamed from: P */
    private void m36916P() {
        AbstractC11018d4[] abstractC11018d4Arr;
        AbstractC11018d4.b bVar = new AbstractC11018d4.b();
        for (int i10 = 0; i10 < this.f30739D; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                abstractC11018d4Arr = this.f30745y;
                if (i11 >= abstractC11018d4Arr.length) {
                    break;
                }
                long m34019n = abstractC11018d4Arr[i11].m34001k(i10, bVar).m34019n();
                if (m34019n != -9223372036854775807L) {
                    long j11 = m34019n + this.f30740E[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object mo11859r = abstractC11018d4Arr[0].mo11859r(i10);
            this.f30737B.put(mo11859r, Long.valueOf(j10));
            Iterator<C11692d> it = this.f30738C.mo14739p(mo11859r).iterator();
            while (it.hasNext()) {
                it.next().m36840u(0L, j10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11701g, p397v7.AbstractC11683a
    /* renamed from: C */
    public void mo11833C(InterfaceC10834m0 interfaceC10834m0) {
        super.mo11833C(interfaceC10834m0);
        for (int i10 = 0; i10 < this.f30744x.length; i10++) {
            m36865L(Integer.valueOf(i10), this.f30744x[i10]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11701g, p397v7.AbstractC11683a
    /* renamed from: E */
    public void mo11834E() {
        super.mo11834E();
        Arrays.fill(this.f30745y, (Object) null);
        this.f30739D = -1;
        this.f30741F = null;
        this.f30746z.clear();
        Collections.addAll(this.f30746z, this.f30744x);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11701g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public InterfaceC11684a0.b mo36861G(Integer num, InterfaceC11684a0.b bVar) {
        if (num.intValue() == 0) {
            return bVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11701g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m36860J(Integer num, InterfaceC11684a0 interfaceC11684a0, AbstractC11018d4 abstractC11018d4) {
        if (this.f30741F != null) {
            return;
        }
        if (this.f30739D == -1) {
            this.f30739D = abstractC11018d4.mo11858n();
        } else if (abstractC11018d4.mo11858n() != this.f30739D) {
            this.f30741F = new b(0);
            return;
        }
        if (this.f30740E.length == 0) {
            this.f30740E = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f30739D, this.f30745y.length);
        }
        this.f30746z.remove(interfaceC11684a0);
        this.f30745y[num.intValue()] = abstractC11018d4;
        if (this.f30746z.isEmpty()) {
            if (this.f30742v) {
                m36915M();
            }
            AbstractC11018d4 abstractC11018d42 = this.f30745y[0];
            if (this.f30743w) {
                m36916P();
                abstractC11018d42 = new a(abstractC11018d42, this.f30737B);
            }
            m36802D(abstractC11018d42);
        }
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: d */
    public C11010c2 mo11842d() {
        InterfaceC11684a0[] interfaceC11684a0Arr = this.f30744x;
        return interfaceC11684a0Arr.length > 0 ? interfaceC11684a0Arr[0].mo11842d() : f30735G;
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: e */
    public InterfaceC11739y mo11843e(InterfaceC11684a0.b bVar, InterfaceC10811b interfaceC10811b, long j10) {
        int length = this.f30744x.length;
        InterfaceC11739y[] interfaceC11739yArr = new InterfaceC11739y[length];
        int mo11856g = this.f30745y[0].mo11856g(bVar.f30974a);
        for (int i10 = 0; i10 < length; i10++) {
            interfaceC11739yArr[i10] = this.f30744x[i10].mo11843e(bVar.m36820c(this.f30745y[i10].mo11859r(mo11856g)), interfaceC10811b, j10 - this.f30740E[mo11856g][i10]);
        }
        C11708i0 c11708i0 = new C11708i0(this.f30736A, this.f30740E[mo11856g], interfaceC11739yArr);
        if (!this.f30743w) {
            return c11708i0;
        }
        C11692d c11692d = new C11692d(c11708i0, true, 0L, ((Long) C11137a.m34603e(this.f30737B.get(bVar.f30974a))).longValue());
        this.f30738C.put(bVar.f30974a, c11692d);
        return c11692d;
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: l */
    public void mo11844l(InterfaceC11739y interfaceC11739y) {
        if (this.f30743w) {
            C11692d c11692d = (C11692d) interfaceC11739y;
            Iterator<Map.Entry<Object, C11692d>> it = this.f30738C.mo14737a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, C11692d> next = it.next();
                if (next.getValue().equals(c11692d)) {
                    this.f30738C.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            interfaceC11739y = c11692d.f30639a;
        }
        C11708i0 c11708i0 = (C11708i0) interfaceC11739y;
        int i10 = 0;
        while (true) {
            InterfaceC11684a0[] interfaceC11684a0Arr = this.f30744x;
            if (i10 >= interfaceC11684a0Arr.length) {
                return;
            }
            interfaceC11684a0Arr[i10].mo11844l(c11708i0.m36910d(i10));
            i10++;
        }
    }

    @Override // p397v7.AbstractC11701g, p397v7.InterfaceC11684a0
    /* renamed from: n */
    public void mo11845n() {
        b bVar = this.f30741F;
        if (bVar != null) {
            throw bVar;
        }
        super.mo11845n();
    }
}
