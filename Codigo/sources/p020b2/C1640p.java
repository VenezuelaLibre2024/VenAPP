package p020b2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p020b2.AbstractC1632l;

/* renamed from: b2.p */
/* loaded from: classes.dex */
public class C1640p extends AbstractC1632l {

    /* renamed from: V */
    int f7017V;

    /* renamed from: T */
    private ArrayList<AbstractC1632l> f7015T = new ArrayList<>();

    /* renamed from: U */
    private boolean f7016U = true;

    /* renamed from: W */
    boolean f7018W = false;

    /* renamed from: X */
    private int f7019X = 0;

    /* renamed from: b2.p$a */
    /* loaded from: classes.dex */
    class a extends C1634m {

        /* renamed from: a */
        final /* synthetic */ AbstractC1632l f7020a;

        a(AbstractC1632l abstractC1632l) {
            this.f7020a = abstractC1632l;
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: e */
        public void mo8991e(AbstractC1632l abstractC1632l) {
            this.f7020a.mo9045X();
            abstractC1632l.mo9042T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b2.p$b */
    /* loaded from: classes.dex */
    public static class b extends C1634m {

        /* renamed from: a */
        C1640p f7022a;

        b(C1640p c1640p) {
            this.f7022a = c1640p;
        }

        @Override // p020b2.C1634m, p020b2.AbstractC1632l.f
        /* renamed from: c */
        public void mo9005c(AbstractC1632l abstractC1632l) {
            C1640p c1640p = this.f7022a;
            if (c1640p.f7018W) {
                return;
            }
            c1640p.m9055g0();
            this.f7022a.f7018W = true;
        }

        @Override // p020b2.AbstractC1632l.f
        /* renamed from: e */
        public void mo8991e(AbstractC1632l abstractC1632l) {
            C1640p c1640p = this.f7022a;
            int i10 = c1640p.f7017V - 1;
            c1640p.f7017V = i10;
            if (i10 == 0) {
                c1640p.f7018W = false;
                c1640p.m9062r();
            }
            abstractC1632l.mo9042T(this);
        }
    }

    /* renamed from: l0 */
    private void m9082l0(AbstractC1632l abstractC1632l) {
        this.f7015T.add(abstractC1632l);
        abstractC1632l.f6950C = this;
    }

    /* renamed from: u0 */
    private void m9083u0() {
        b bVar = new b(this);
        Iterator<AbstractC1632l> it = this.f7015T.iterator();
        while (it.hasNext()) {
            it.next().mo9048a(bVar);
        }
        this.f7017V = this.f7015T.size();
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: R */
    public void mo9040R(View view) {
        super.mo9040R(view);
        int size = this.f7015T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7015T.get(i10).mo9040R(view);
        }
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: V */
    public void mo9044V(View view) {
        super.mo9044V(view);
        int size = this.f7015T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7015T.get(i10).mo9044V(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p020b2.AbstractC1632l
    /* renamed from: X */
    public void mo9045X() {
        if (this.f7015T.isEmpty()) {
            m9055g0();
            m9062r();
            return;
        }
        m9083u0();
        if (this.f7016U) {
            Iterator<AbstractC1632l> it = this.f7015T.iterator();
            while (it.hasNext()) {
                it.next().mo9045X();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f7015T.size(); i10++) {
            this.f7015T.get(i10 - 1).mo9048a(new a(this.f7015T.get(i10)));
        }
        AbstractC1632l abstractC1632l = this.f7015T.get(0);
        if (abstractC1632l != null) {
            abstractC1632l.mo9045X();
        }
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: Z */
    public void mo9047Z(AbstractC1632l.e eVar) {
        super.mo9047Z(eVar);
        this.f7019X |= 8;
        int size = this.f7015T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7015T.get(i10).mo9047Z(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p020b2.AbstractC1632l
    public void cancel() {
        super.cancel();
        int size = this.f7015T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7015T.get(i10).cancel();
        }
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: d0 */
    public void mo9051d0(AbstractC1622g abstractC1622g) {
        super.mo9051d0(abstractC1622g);
        this.f7019X |= 4;
        if (this.f7015T != null) {
            for (int i10 = 0; i10 < this.f7015T.size(); i10++) {
                this.f7015T.get(i10).mo9051d0(abstractC1622g);
            }
        }
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: e0 */
    public void mo9053e0(AbstractC1638o abstractC1638o) {
        super.mo9053e0(abstractC1638o);
        this.f7019X |= 2;
        int size = this.f7015T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7015T.get(i10).mo9053e0(abstractC1638o);
        }
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: g */
    public void mo8973g(C1644s c1644s) {
        if (m9039J(c1644s.f7027b)) {
            Iterator<AbstractC1632l> it = this.f7015T.iterator();
            while (it.hasNext()) {
                AbstractC1632l next = it.next();
                if (next.m9039J(c1644s.f7027b)) {
                    next.mo8973g(c1644s);
                    c1644s.f7028c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p020b2.AbstractC1632l
    /* renamed from: h0 */
    public String mo9056h0(String str) {
        String mo9056h0 = super.mo9056h0(str);
        for (int i10 = 0; i10 < this.f7015T.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo9056h0);
            sb2.append("\n");
            sb2.append(this.f7015T.get(i10).mo9056h0(str + "  "));
            mo9056h0 = sb2.toString();
        }
        return mo9056h0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p020b2.AbstractC1632l
    /* renamed from: i */
    public void mo9057i(C1644s c1644s) {
        super.mo9057i(c1644s);
        int size = this.f7015T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7015T.get(i10).mo9057i(c1644s);
        }
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public C1640p mo9048a(AbstractC1632l.f fVar) {
        return (C1640p) super.mo9048a(fVar);
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: j */
    public void mo8974j(C1644s c1644s) {
        if (m9039J(c1644s.f7027b)) {
            Iterator<AbstractC1632l> it = this.f7015T.iterator();
            while (it.hasNext()) {
                AbstractC1632l next = it.next();
                if (next.m9039J(c1644s.f7027b)) {
                    next.mo8974j(c1644s);
                    c1644s.f7028c.add(next);
                }
            }
        }
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C1640p mo9049b(View view) {
        for (int i10 = 0; i10 < this.f7015T.size(); i10++) {
            this.f7015T.get(i10).mo9049b(view);
        }
        return (C1640p) super.mo9049b(view);
    }

    /* renamed from: k0 */
    public C1640p m9086k0(AbstractC1632l abstractC1632l) {
        m9082l0(abstractC1632l);
        long j10 = this.f6966c;
        if (j10 >= 0) {
            abstractC1632l.mo9046Y(j10);
        }
        if ((this.f7019X & 1) != 0) {
            abstractC1632l.mo9050b0(m9065u());
        }
        if ((this.f7019X & 2) != 0) {
            m9069z();
            abstractC1632l.mo9053e0(null);
        }
        if ((this.f7019X & 4) != 0) {
            abstractC1632l.mo9051d0(m9068x());
        }
        if ((this.f7019X & 8) != 0) {
            abstractC1632l.mo9047Z(m9064t());
        }
        return this;
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: m */
    public AbstractC1632l clone() {
        C1640p c1640p = (C1640p) super.clone();
        c1640p.f7015T = new ArrayList<>();
        int size = this.f7015T.size();
        for (int i10 = 0; i10 < size; i10++) {
            c1640p.m9082l0(this.f7015T.get(i10).clone());
        }
        return c1640p;
    }

    /* renamed from: m0 */
    public AbstractC1632l m9087m0(int i10) {
        if (i10 < 0 || i10 >= this.f7015T.size()) {
            return null;
        }
        return this.f7015T.get(i10);
    }

    /* renamed from: n0 */
    public int m9088n0() {
        return this.f7015T.size();
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C1640p mo9042T(AbstractC1632l.f fVar) {
        return (C1640p) super.mo9042T(fVar);
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C1640p mo9043U(View view) {
        for (int i10 = 0; i10 < this.f7015T.size(); i10++) {
            this.f7015T.get(i10).mo9043U(view);
        }
        return (C1640p) super.mo9043U(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p020b2.AbstractC1632l
    /* renamed from: q */
    public void mo9061q(ViewGroup viewGroup, C1645t c1645t, C1645t c1645t2, ArrayList<C1644s> arrayList, ArrayList<C1644s> arrayList2) {
        long m9032B = m9032B();
        int size = this.f7015T.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1632l abstractC1632l = this.f7015T.get(i10);
            if (m9032B > 0 && (this.f7016U || i10 == 0)) {
                long m9032B2 = abstractC1632l.m9032B();
                if (m9032B2 > 0) {
                    abstractC1632l.mo9054f0(m9032B2 + m9032B);
                } else {
                    abstractC1632l.mo9054f0(m9032B);
                }
            }
            abstractC1632l.mo9061q(viewGroup, c1645t, c1645t2, arrayList, arrayList2);
        }
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C1640p mo9046Y(long j10) {
        ArrayList<AbstractC1632l> arrayList;
        super.mo9046Y(j10);
        if (this.f6966c >= 0 && (arrayList = this.f7015T) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f7015T.get(i10).mo9046Y(j10);
            }
        }
        return this;
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public C1640p mo9050b0(TimeInterpolator timeInterpolator) {
        this.f7019X |= 1;
        ArrayList<AbstractC1632l> arrayList = this.f7015T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f7015T.get(i10).mo9050b0(timeInterpolator);
            }
        }
        return (C1640p) super.mo9050b0(timeInterpolator);
    }

    /* renamed from: s0 */
    public C1640p m9093s0(int i10) {
        if (i10 == 0) {
            this.f7016U = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
            this.f7016U = false;
        }
        return this;
    }

    @Override // p020b2.AbstractC1632l
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C1640p mo9054f0(long j10) {
        return (C1640p) super.mo9054f0(j10);
    }
}
