package b2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import b2.l;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class p extends l {
    int V;
    private ArrayList<l> T = new ArrayList<>();
    private boolean U = true;
    boolean W = false;
    private int X = 0;

    /* loaded from: classes.dex */
    class a extends m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f6125a;

        a(l lVar) {
            this.f6125a = lVar;
        }

        @Override // b2.l.f
        public void e(l lVar) {
            this.f6125a.X();
            lVar.T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends m {

        /* renamed from: a, reason: collision with root package name */
        p f6127a;

        b(p pVar) {
            this.f6127a = pVar;
        }

        @Override // b2.m, b2.l.f
        public void c(l lVar) {
            p pVar = this.f6127a;
            if (pVar.W) {
                return;
            }
            pVar.g0();
            this.f6127a.W = true;
        }

        @Override // b2.l.f
        public void e(l lVar) {
            p pVar = this.f6127a;
            int i10 = pVar.V - 1;
            pVar.V = i10;
            if (i10 == 0) {
                pVar.W = false;
                pVar.r();
            }
            lVar.T(this);
        }
    }

    private void l0(l lVar) {
        this.T.add(lVar);
        lVar.C = this;
    }

    private void u0() {
        b bVar = new b(this);
        Iterator<l> it = this.T.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.V = this.T.size();
    }

    @Override // b2.l
    public void R(View view) {
        super.R(view);
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.T.get(i10).R(view);
        }
    }

    @Override // b2.l
    public void V(View view) {
        super.V(view);
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.T.get(i10).V(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b2.l
    public void X() {
        if (this.T.isEmpty()) {
            g0();
            r();
            return;
        }
        u0();
        if (this.U) {
            Iterator<l> it = this.T.iterator();
            while (it.hasNext()) {
                it.next().X();
            }
            return;
        }
        for (int i10 = 1; i10 < this.T.size(); i10++) {
            this.T.get(i10 - 1).a(new a(this.T.get(i10)));
        }
        l lVar = this.T.get(0);
        if (lVar != null) {
            lVar.X();
        }
    }

    @Override // b2.l
    public void Z(l.e eVar) {
        super.Z(eVar);
        this.X |= 8;
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.T.get(i10).Z(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b2.l
    public void cancel() {
        super.cancel();
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.T.get(i10).cancel();
        }
    }

    @Override // b2.l
    public void d0(g gVar) {
        super.d0(gVar);
        this.X |= 4;
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                this.T.get(i10).d0(gVar);
            }
        }
    }

    @Override // b2.l
    public void e0(o oVar) {
        super.e0(oVar);
        this.X |= 2;
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.T.get(i10).e0(oVar);
        }
    }

    @Override // b2.l
    public void g(s sVar) {
        if (J(sVar.f6132b)) {
            Iterator<l> it = this.T.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.J(sVar.f6132b)) {
                    next.g(sVar);
                    sVar.f6133c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b2.l
    public String h0(String str) {
        String h02 = super.h0(str);
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(h02);
            sb2.append("\n");
            sb2.append(this.T.get(i10).h0(str + "  "));
            h02 = sb2.toString();
        }
        return h02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // b2.l
    public void i(s sVar) {
        super.i(sVar);
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.T.get(i10).i(sVar);
        }
    }

    @Override // b2.l
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public p a(l.f fVar) {
        return (p) super.a(fVar);
    }

    @Override // b2.l
    public void j(s sVar) {
        if (J(sVar.f6132b)) {
            Iterator<l> it = this.T.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (next.J(sVar.f6132b)) {
                    next.j(sVar);
                    sVar.f6133c.add(next);
                }
            }
        }
    }

    @Override // b2.l
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public p b(View view) {
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            this.T.get(i10).b(view);
        }
        return (p) super.b(view);
    }

    public p k0(l lVar) {
        l0(lVar);
        long j10 = this.f6078c;
        if (j10 >= 0) {
            lVar.Y(j10);
        }
        if ((this.X & 1) != 0) {
            lVar.b0(u());
        }
        if ((this.X & 2) != 0) {
            z();
            lVar.e0(null);
        }
        if ((this.X & 4) != 0) {
            lVar.d0(x());
        }
        if ((this.X & 8) != 0) {
            lVar.Z(t());
        }
        return this;
    }

    @Override // b2.l
    /* renamed from: m */
    public l clone() {
        p pVar = (p) super.clone();
        pVar.T = new ArrayList<>();
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.l0(this.T.get(i10).clone());
        }
        return pVar;
    }

    public l m0(int i10) {
        if (i10 < 0 || i10 >= this.T.size()) {
            return null;
        }
        return this.T.get(i10);
    }

    public int n0() {
        return this.T.size();
    }

    @Override // b2.l
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public p T(l.f fVar) {
        return (p) super.T(fVar);
    }

    @Override // b2.l
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public p U(View view) {
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            this.T.get(i10).U(view);
        }
        return (p) super.U(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b2.l
    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long B = B();
        int size = this.T.size();
        for (int i10 = 0; i10 < size; i10++) {
            l lVar = this.T.get(i10);
            if (B > 0 && (this.U || i10 == 0)) {
                long B2 = lVar.B();
                if (B2 > 0) {
                    lVar.f0(B2 + B);
                } else {
                    lVar.f0(B);
                }
            }
            lVar.q(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    @Override // b2.l
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public p Y(long j10) {
        ArrayList<l> arrayList;
        super.Y(j10);
        if (this.f6078c >= 0 && (arrayList = this.T) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.T.get(i10).Y(j10);
            }
        }
        return this;
    }

    @Override // b2.l
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public p b0(TimeInterpolator timeInterpolator) {
        this.X |= 1;
        ArrayList<l> arrayList = this.T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.T.get(i10).b0(timeInterpolator);
            }
        }
        return (p) super.b0(timeInterpolator);
    }

    public p s0(int i10) {
        if (i10 == 0) {
            this.U = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
            }
            this.U = false;
        }
        return this;
    }

    @Override // b2.l
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public p f0(long j10) {
        return (p) super.f0(j10);
    }
}
