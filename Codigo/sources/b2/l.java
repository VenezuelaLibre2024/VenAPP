package b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class l implements Cloneable {
    private static final int[] Q = {2, 1, 3, 4};
    private static final g R = new a();
    private static ThreadLocal<androidx.collection.a<Animator, d>> S = new ThreadLocal<>();
    private ArrayList<s> E;
    private ArrayList<s> F;
    private e N;
    private androidx.collection.a<String, String> O;

    /* renamed from: a */
    private String f6076a = getClass().getName();

    /* renamed from: b */
    private long f6077b = -1;

    /* renamed from: c */
    long f6078c = -1;

    /* renamed from: d */
    private TimeInterpolator f6079d = null;

    /* renamed from: e */
    ArrayList<Integer> f6080e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<View> f6081f = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<String> f6082r = null;

    /* renamed from: s */
    private ArrayList<Class<?>> f6083s = null;

    /* renamed from: t */
    private ArrayList<Integer> f6084t = null;

    /* renamed from: u */
    private ArrayList<View> f6085u = null;

    /* renamed from: v */
    private ArrayList<Class<?>> f6086v = null;

    /* renamed from: w */
    private ArrayList<String> f6087w = null;

    /* renamed from: x */
    private ArrayList<Integer> f6088x = null;

    /* renamed from: y */
    private ArrayList<View> f6089y = null;

    /* renamed from: z */
    private ArrayList<Class<?>> f6090z = null;
    private t A = new t();
    private t B = new t();
    p C = null;
    private int[] D = Q;
    boolean G = false;
    ArrayList<Animator> H = new ArrayList<>();
    private int I = 0;
    private boolean J = false;
    private boolean K = false;
    private ArrayList<f> L = null;
    private ArrayList<Animator> M = new ArrayList<>();
    private g P = R;

    /* loaded from: classes.dex */
    class a extends g {
        a() {
        }

        @Override // b2.g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ androidx.collection.a f6091a;

        b(androidx.collection.a aVar) {
            this.f6091a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6091a.remove(animator);
            l.this.H.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.H.add(animator);
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.r();
            animator.removeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        View f6094a;

        /* renamed from: b */
        String f6095b;

        /* renamed from: c */
        s f6096c;

        /* renamed from: d */
        p0 f6097d;

        /* renamed from: e */
        l f6098e;

        d(View view, String str, l lVar, p0 p0Var, s sVar) {
            this.f6094a = view;
            this.f6095b = str;
            this.f6096c = sVar;
            this.f6097d = p0Var;
            this.f6098e = lVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(l lVar);

        void b(l lVar);

        void c(l lVar);

        void d(l lVar);

        void e(l lVar);
    }

    private static androidx.collection.a<Animator, d> A() {
        androidx.collection.a<Animator, d> aVar = S.get();
        if (aVar != null) {
            return aVar;
        }
        androidx.collection.a<Animator, d> aVar2 = new androidx.collection.a<>();
        S.set(aVar2);
        return aVar2;
    }

    private static boolean K(s sVar, s sVar2, String str) {
        Object obj = sVar.f6131a.get(str);
        Object obj2 = sVar2.f6131a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void L(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && J(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && J(view)) {
                s sVar = aVar.get(valueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.E.add(sVar);
                    this.F.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void M(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View j10 = aVar.j(size);
            if (j10 != null && J(j10) && (remove = aVar2.remove(j10)) != null && J(remove.f6132b)) {
                this.E.add(aVar.l(size));
                this.F.add(remove);
            }
        }
    }

    private void N(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.e<View> eVar, androidx.collection.e<View> eVar2) {
        View d10;
        int l10 = eVar.l();
        for (int i10 = 0; i10 < l10; i10++) {
            View m10 = eVar.m(i10);
            if (m10 != null && J(m10) && (d10 = eVar2.d(eVar.h(i10))) != null && J(d10)) {
                s sVar = aVar.get(m10);
                s sVar2 = aVar2.get(d10);
                if (sVar != null && sVar2 != null) {
                    this.E.add(sVar);
                    this.F.add(sVar2);
                    aVar.remove(m10);
                    aVar2.remove(d10);
                }
            }
        }
    }

    private void O(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2, androidx.collection.a<String, View> aVar3, androidx.collection.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View n10 = aVar3.n(i10);
            if (n10 != null && J(n10) && (view = aVar4.get(aVar3.j(i10))) != null && J(view)) {
                s sVar = aVar.get(n10);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.E.add(sVar);
                    this.F.add(sVar2);
                    aVar.remove(n10);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void P(t tVar, t tVar2) {
        androidx.collection.a<View, s> aVar = new androidx.collection.a<>(tVar.f6134a);
        androidx.collection.a<View, s> aVar2 = new androidx.collection.a<>(tVar2.f6134a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.D;
            if (i10 >= iArr.length) {
                c(aVar, aVar2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                M(aVar, aVar2);
            } else if (i11 == 2) {
                O(aVar, aVar2, tVar.f6137d, tVar2.f6137d);
            } else if (i11 == 3) {
                L(aVar, aVar2, tVar.f6135b, tVar2.f6135b);
            } else if (i11 == 4) {
                N(aVar, aVar2, tVar.f6136c, tVar2.f6136c);
            }
            i10++;
        }
    }

    private void W(Animator animator, androidx.collection.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            e(animator);
        }
    }

    private void c(androidx.collection.a<View, s> aVar, androidx.collection.a<View, s> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            s n10 = aVar.n(i10);
            if (J(n10.f6132b)) {
                this.E.add(n10);
                this.F.add(null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            s n11 = aVar2.n(i11);
            if (J(n11.f6132b)) {
                this.F.add(n11);
                this.E.add(null);
            }
        }
    }

    private static void d(t tVar, View view, s sVar) {
        tVar.f6134a.put(view, sVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (tVar.f6135b.indexOfKey(id2) >= 0) {
                tVar.f6135b.put(id2, null);
            } else {
                tVar.f6135b.put(id2, view);
            }
        }
        String A = x0.A(view);
        if (A != null) {
            if (tVar.f6137d.containsKey(A)) {
                tVar.f6137d.put(A, null);
            } else {
                tVar.f6137d.put(A, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f6136c.g(itemIdAtPosition) < 0) {
                    x0.e0(view, true);
                    tVar.f6136c.i(itemIdAtPosition, view);
                    return;
                }
                View d10 = tVar.f6136c.d(itemIdAtPosition);
                if (d10 != null) {
                    x0.e0(d10, false);
                    tVar.f6136c.i(itemIdAtPosition, null);
                }
            }
        }
    }

    private void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f6084t;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f6085u;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f6086v;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f6086v.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z10) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f6133c.add(this);
                    i(sVar);
                    d(z10 ? this.A : this.B, view, sVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f6088x;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f6089y;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f6090z;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f6090z.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                h(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public long B() {
        return this.f6077b;
    }

    public List<Integer> C() {
        return this.f6080e;
    }

    public List<String> D() {
        return this.f6082r;
    }

    public List<Class<?>> E() {
        return this.f6083s;
    }

    public List<View> F() {
        return this.f6081f;
    }

    public String[] G() {
        return null;
    }

    public s H(View view, boolean z10) {
        p pVar = this.C;
        if (pVar != null) {
            return pVar.H(view, z10);
        }
        return (z10 ? this.A : this.B).f6134a.get(view);
    }

    public boolean I(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] G = G();
        if (G == null) {
            Iterator<String> it = sVar.f6131a.keySet().iterator();
            while (it.hasNext()) {
                if (K(sVar, sVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : G) {
            if (!K(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public boolean J(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f6084t;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f6085u;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f6086v;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6086v.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f6087w != null && x0.A(view) != null && this.f6087w.contains(x0.A(view))) {
            return false;
        }
        if ((this.f6080e.size() == 0 && this.f6081f.size() == 0 && (((arrayList = this.f6083s) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6082r) == null || arrayList2.isEmpty()))) || this.f6080e.contains(Integer.valueOf(id2)) || this.f6081f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f6082r;
        if (arrayList6 != null && arrayList6.contains(x0.A(view))) {
            return true;
        }
        if (this.f6083s != null) {
            for (int i11 = 0; i11 < this.f6083s.size(); i11++) {
                if (this.f6083s.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void R(View view) {
        if (this.K) {
            return;
        }
        for (int size = this.H.size() - 1; size >= 0; size--) {
            b2.a.b(this.H.get(size));
        }
        ArrayList<f> arrayList = this.L;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.L.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).b(this);
            }
        }
        this.J = true;
    }

    public void S(ViewGroup viewGroup) {
        d dVar;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        P(this.A, this.B);
        androidx.collection.a<Animator, d> A = A();
        int size = A.size();
        p0 d10 = a0.d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator j10 = A.j(i10);
            if (j10 != null && (dVar = A.get(j10)) != null && dVar.f6094a != null && d10.equals(dVar.f6097d)) {
                s sVar = dVar.f6096c;
                View view = dVar.f6094a;
                s H = H(view, true);
                s v10 = v(view, true);
                if (H == null && v10 == null) {
                    v10 = this.B.f6134a.get(view);
                }
                if (!(H == null && v10 == null) && dVar.f6098e.I(sVar, v10)) {
                    if (j10.isRunning() || j10.isStarted()) {
                        j10.cancel();
                    } else {
                        A.remove(j10);
                    }
                }
            }
        }
        q(viewGroup, this.A, this.B, this.E, this.F);
        X();
    }

    public l T(f fVar) {
        ArrayList<f> arrayList = this.L;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.L.size() == 0) {
            this.L = null;
        }
        return this;
    }

    public l U(View view) {
        this.f6081f.remove(view);
        return this;
    }

    public void V(View view) {
        if (this.J) {
            if (!this.K) {
                for (int size = this.H.size() - 1; size >= 0; size--) {
                    b2.a.c(this.H.get(size));
                }
                ArrayList<f> arrayList = this.L;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.L.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((f) arrayList2.get(i10)).a(this);
                    }
                }
            }
            this.J = false;
        }
    }

    public void X() {
        g0();
        androidx.collection.a<Animator, d> A = A();
        Iterator<Animator> it = this.M.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (A.containsKey(next)) {
                g0();
                W(next, A);
            }
        }
        this.M.clear();
        r();
    }

    public l Y(long j10) {
        this.f6078c = j10;
        return this;
    }

    public void Z(e eVar) {
        this.N = eVar;
    }

    public l a(f fVar) {
        if (this.L == null) {
            this.L = new ArrayList<>();
        }
        this.L.add(fVar);
        return this;
    }

    public l b(View view) {
        this.f6081f.add(view);
        return this;
    }

    public l b0(TimeInterpolator timeInterpolator) {
        this.f6079d = timeInterpolator;
        return this;
    }

    public void cancel() {
        for (int size = this.H.size() - 1; size >= 0; size--) {
            this.H.get(size).cancel();
        }
        ArrayList<f> arrayList = this.L;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.L.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).d(this);
        }
    }

    public void d0(g gVar) {
        if (gVar == null) {
            gVar = R;
        }
        this.P = gVar;
    }

    protected void e(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (B() >= 0) {
            animator.setStartDelay(B() + animator.getStartDelay());
        }
        if (u() != null) {
            animator.setInterpolator(u());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void e0(o oVar) {
    }

    public l f0(long j10) {
        this.f6077b = j10;
        return this;
    }

    public abstract void g(s sVar);

    public void g0() {
        if (this.I == 0) {
            ArrayList<f> arrayList = this.L;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.L.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).c(this);
                }
            }
            this.K = false;
        }
        this.I++;
    }

    public String h0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f6078c != -1) {
            str2 = str2 + "dur(" + this.f6078c + ") ";
        }
        if (this.f6077b != -1) {
            str2 = str2 + "dly(" + this.f6077b + ") ";
        }
        if (this.f6079d != null) {
            str2 = str2 + "interp(" + this.f6079d + ") ";
        }
        if (this.f6080e.size() <= 0 && this.f6081f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f6080e.size() > 0) {
            for (int i10 = 0; i10 < this.f6080e.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6080e.get(i10);
            }
        }
        if (this.f6081f.size() > 0) {
            for (int i11 = 0; i11 < this.f6081f.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6081f.get(i11);
            }
        }
        return str3 + ")";
    }

    public void i(s sVar) {
    }

    public abstract void j(s sVar);

    public void k(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        androidx.collection.a<String, String> aVar;
        l(z10);
        if ((this.f6080e.size() > 0 || this.f6081f.size() > 0) && (((arrayList = this.f6082r) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6083s) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f6080e.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f6080e.get(i10).intValue());
                if (findViewById != null) {
                    s sVar = new s(findViewById);
                    if (z10) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f6133c.add(this);
                    i(sVar);
                    d(z10 ? this.A : this.B, findViewById, sVar);
                }
            }
            for (int i11 = 0; i11 < this.f6081f.size(); i11++) {
                View view = this.f6081f.get(i11);
                s sVar2 = new s(view);
                if (z10) {
                    j(sVar2);
                } else {
                    g(sVar2);
                }
                sVar2.f6133c.add(this);
                i(sVar2);
                d(z10 ? this.A : this.B, view, sVar2);
            }
        } else {
            h(viewGroup, z10);
        }
        if (z10 || (aVar = this.O) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.A.f6137d.remove(this.O.j(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.A.f6137d.put(this.O.n(i13), view2);
            }
        }
    }

    public void l(boolean z10) {
        t tVar;
        if (z10) {
            this.A.f6134a.clear();
            this.A.f6135b.clear();
            tVar = this.A;
        } else {
            this.B.f6134a.clear();
            this.B.f6135b.clear();
            tVar = this.B;
        }
        tVar.f6136c.a();
    }

    @Override // 
    /* renamed from: m */
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.M = new ArrayList<>();
            lVar.A = new t();
            lVar.B = new t();
            lVar.E = null;
            lVar.F = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        View view;
        Animator animator;
        s sVar;
        int i10;
        Animator animator2;
        s sVar2;
        androidx.collection.a<Animator, d> A = A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            s sVar3 = arrayList.get(i11);
            s sVar4 = arrayList2.get(i11);
            if (sVar3 != null && !sVar3.f6133c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f6133c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 != null || sVar4 != null) {
                if (sVar3 == null || sVar4 == null || I(sVar3, sVar4)) {
                    Animator p10 = p(viewGroup, sVar3, sVar4);
                    if (p10 != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f6132b;
                            String[] G = G();
                            if (G != null && G.length > 0) {
                                sVar2 = new s(view2);
                                s sVar5 = tVar2.f6134a.get(view2);
                                if (sVar5 != null) {
                                    int i12 = 0;
                                    while (i12 < G.length) {
                                        Map<String, Object> map = sVar2.f6131a;
                                        Animator animator3 = p10;
                                        String str = G[i12];
                                        map.put(str, sVar5.f6131a.get(str));
                                        i12++;
                                        p10 = animator3;
                                        G = G;
                                    }
                                }
                                Animator animator4 = p10;
                                int size2 = A.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        animator2 = animator4;
                                        break;
                                    }
                                    d dVar = A.get(A.j(i13));
                                    if (dVar.f6096c != null && dVar.f6094a == view2 && dVar.f6095b.equals(w()) && dVar.f6096c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                animator2 = p10;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            view = sVar3.f6132b;
                            animator = p10;
                            sVar = null;
                        }
                        if (animator != null) {
                            i10 = size;
                            A.put(animator, new d(view, w(), this, a0.d(viewGroup), sVar));
                            this.M.add(animator);
                            i11++;
                            size = i10;
                        }
                        i10 = size;
                        i11++;
                        size = i10;
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = this.M.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    public void r() {
        int i10 = this.I - 1;
        this.I = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.L;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.L.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).e(this);
                }
            }
            for (int i12 = 0; i12 < this.A.f6136c.l(); i12++) {
                View m10 = this.A.f6136c.m(i12);
                if (m10 != null) {
                    x0.e0(m10, false);
                }
            }
            for (int i13 = 0; i13 < this.B.f6136c.l(); i13++) {
                View m11 = this.B.f6136c.m(i13);
                if (m11 != null) {
                    x0.e0(m11, false);
                }
            }
            this.K = true;
        }
    }

    public long s() {
        return this.f6078c;
    }

    public e t() {
        return this.N;
    }

    public String toString() {
        return h0("");
    }

    public TimeInterpolator u() {
        return this.f6079d;
    }

    public s v(View view, boolean z10) {
        p pVar = this.C;
        if (pVar != null) {
            return pVar.v(view, z10);
        }
        ArrayList<s> arrayList = z10 ? this.E : this.F;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            s sVar = arrayList.get(i10);
            if (sVar == null) {
                return null;
            }
            if (sVar.f6132b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.F : this.E).get(i10);
        }
        return null;
    }

    public String w() {
        return this.f6076a;
    }

    public g x() {
        return this.P;
    }

    public o z() {
        return null;
    }
}
