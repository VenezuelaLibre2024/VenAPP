package p020b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.collection.C0731a;
import androidx.collection.C0735e;
import androidx.core.view.C1116x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: b2.l */
/* loaded from: classes.dex */
public abstract class AbstractC1632l implements Cloneable {

    /* renamed from: Q */
    private static final int[] f6945Q = {2, 1, 3, 4};

    /* renamed from: R */
    private static final AbstractC1622g f6946R = new a();

    /* renamed from: S */
    private static ThreadLocal<C0731a<Animator, d>> f6947S = new ThreadLocal<>();

    /* renamed from: E */
    private ArrayList<C1644s> f6952E;

    /* renamed from: F */
    private ArrayList<C1644s> f6953F;

    /* renamed from: N */
    private e f6961N;

    /* renamed from: O */
    private C0731a<String, String> f6962O;

    /* renamed from: a */
    private String f6964a = getClass().getName();

    /* renamed from: b */
    private long f6965b = -1;

    /* renamed from: c */
    long f6966c = -1;

    /* renamed from: d */
    private TimeInterpolator f6967d = null;

    /* renamed from: e */
    ArrayList<Integer> f6968e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<View> f6969f = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<String> f6970r = null;

    /* renamed from: s */
    private ArrayList<Class<?>> f6971s = null;

    /* renamed from: t */
    private ArrayList<Integer> f6972t = null;

    /* renamed from: u */
    private ArrayList<View> f6973u = null;

    /* renamed from: v */
    private ArrayList<Class<?>> f6974v = null;

    /* renamed from: w */
    private ArrayList<String> f6975w = null;

    /* renamed from: x */
    private ArrayList<Integer> f6976x = null;

    /* renamed from: y */
    private ArrayList<View> f6977y = null;

    /* renamed from: z */
    private ArrayList<Class<?>> f6978z = null;

    /* renamed from: A */
    private C1645t f6948A = new C1645t();

    /* renamed from: B */
    private C1645t f6949B = new C1645t();

    /* renamed from: C */
    C1640p f6950C = null;

    /* renamed from: D */
    private int[] f6951D = f6945Q;

    /* renamed from: G */
    boolean f6954G = false;

    /* renamed from: H */
    ArrayList<Animator> f6955H = new ArrayList<>();

    /* renamed from: I */
    private int f6956I = 0;

    /* renamed from: J */
    private boolean f6957J = false;

    /* renamed from: K */
    private boolean f6958K = false;

    /* renamed from: L */
    private ArrayList<f> f6959L = null;

    /* renamed from: M */
    private ArrayList<Animator> f6960M = new ArrayList<>();

    /* renamed from: P */
    private AbstractC1622g f6963P = f6946R;

    /* renamed from: b2.l$a */
    /* loaded from: classes.dex */
    class a extends AbstractC1622g {
        a() {
        }

        @Override // p020b2.AbstractC1622g
        /* renamed from: a */
        public Path mo9009a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b2.l$b */
    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0731a f6979a;

        b(C0731a c0731a) {
            this.f6979a = c0731a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6979a.remove(animator);
            AbstractC1632l.this.f6955H.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC1632l.this.f6955H.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b2.l$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC1632l.this.m9062r();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b2.l$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        View f6982a;

        /* renamed from: b */
        String f6983b;

        /* renamed from: c */
        C1644s f6984c;

        /* renamed from: d */
        InterfaceC1641p0 f6985d;

        /* renamed from: e */
        AbstractC1632l f6986e;

        d(View view, String str, AbstractC1632l abstractC1632l, InterfaceC1641p0 interfaceC1641p0, C1644s c1644s) {
            this.f6982a = view;
            this.f6983b = str;
            this.f6984c = c1644s;
            this.f6985d = interfaceC1641p0;
            this.f6986e = abstractC1632l;
        }
    }

    /* renamed from: b2.l$e */
    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* renamed from: b2.l$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo8988a(AbstractC1632l abstractC1632l);

        /* renamed from: b */
        void mo8989b(AbstractC1632l abstractC1632l);

        /* renamed from: c */
        void mo9005c(AbstractC1632l abstractC1632l);

        /* renamed from: d */
        void mo8990d(AbstractC1632l abstractC1632l);

        /* renamed from: e */
        void mo8991e(AbstractC1632l abstractC1632l);
    }

    /* renamed from: A */
    private static C0731a<Animator, d> m9021A() {
        C0731a<Animator, d> c0731a = f6947S.get();
        if (c0731a != null) {
            return c0731a;
        }
        C0731a<Animator, d> c0731a2 = new C0731a<>();
        f6947S.set(c0731a2);
        return c0731a2;
    }

    /* renamed from: K */
    private static boolean m9022K(C1644s c1644s, C1644s c1644s2, String str) {
        Object obj = c1644s.f7026a.get(str);
        Object obj2 = c1644s2.f7026a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: L */
    private void m9023L(C0731a<View, C1644s> c0731a, C0731a<View, C1644s> c0731a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && m9039J(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && m9039J(view)) {
                C1644s c1644s = c0731a.get(valueAt);
                C1644s c1644s2 = c0731a2.get(view);
                if (c1644s != null && c1644s2 != null) {
                    this.f6952E.add(c1644s);
                    this.f6953F.add(c1644s2);
                    c0731a.remove(valueAt);
                    c0731a2.remove(view);
                }
            }
        }
    }

    /* renamed from: M */
    private void m9024M(C0731a<View, C1644s> c0731a, C0731a<View, C1644s> c0731a2) {
        C1644s remove;
        for (int size = c0731a.size() - 1; size >= 0; size--) {
            View m3711j = c0731a.m3711j(size);
            if (m3711j != null && m9039J(m3711j) && (remove = c0731a2.remove(m3711j)) != null && m9039J(remove.f7027b)) {
                this.f6952E.add(c0731a.mo3713l(size));
                this.f6953F.add(remove);
            }
        }
    }

    /* renamed from: N */
    private void m9025N(C0731a<View, C1644s> c0731a, C0731a<View, C1644s> c0731a2, C0735e<View> c0735e, C0735e<View> c0735e2) {
        View m3683d;
        int m3690l = c0735e.m3690l();
        for (int i10 = 0; i10 < m3690l; i10++) {
            View m3691m = c0735e.m3691m(i10);
            if (m3691m != null && m9039J(m3691m) && (m3683d = c0735e2.m3683d(c0735e.m3686h(i10))) != null && m9039J(m3683d)) {
                C1644s c1644s = c0731a.get(m3691m);
                C1644s c1644s2 = c0731a2.get(m3683d);
                if (c1644s != null && c1644s2 != null) {
                    this.f6952E.add(c1644s);
                    this.f6953F.add(c1644s2);
                    c0731a.remove(m3691m);
                    c0731a2.remove(m3683d);
                }
            }
        }
    }

    /* renamed from: O */
    private void m9026O(C0731a<View, C1644s> c0731a, C0731a<View, C1644s> c0731a2, C0731a<String, View> c0731a3, C0731a<String, View> c0731a4) {
        View view;
        int size = c0731a3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View m3715n = c0731a3.m3715n(i10);
            if (m3715n != null && m9039J(m3715n) && (view = c0731a4.get(c0731a3.m3711j(i10))) != null && m9039J(view)) {
                C1644s c1644s = c0731a.get(m3715n);
                C1644s c1644s2 = c0731a2.get(view);
                if (c1644s != null && c1644s2 != null) {
                    this.f6952E.add(c1644s);
                    this.f6953F.add(c1644s2);
                    c0731a.remove(m3715n);
                    c0731a2.remove(view);
                }
            }
        }
    }

    /* renamed from: P */
    private void m9027P(C1645t c1645t, C1645t c1645t2) {
        C0731a<View, C1644s> c0731a = new C0731a<>(c1645t.f7029a);
        C0731a<View, C1644s> c0731a2 = new C0731a<>(c1645t2.f7029a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f6951D;
            if (i10 >= iArr.length) {
                m9029c(c0731a, c0731a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                m9024M(c0731a, c0731a2);
            } else if (i11 == 2) {
                m9026O(c0731a, c0731a2, c1645t.f7032d, c1645t2.f7032d);
            } else if (i11 == 3) {
                m9023L(c0731a, c0731a2, c1645t.f7030b, c1645t2.f7030b);
            } else if (i11 == 4) {
                m9025N(c0731a, c0731a2, c1645t.f7031c, c1645t2.f7031c);
            }
            i10++;
        }
    }

    /* renamed from: W */
    private void m9028W(Animator animator, C0731a<Animator, d> c0731a) {
        if (animator != null) {
            animator.addListener(new b(c0731a));
            m9052e(animator);
        }
    }

    /* renamed from: c */
    private void m9029c(C0731a<View, C1644s> c0731a, C0731a<View, C1644s> c0731a2) {
        for (int i10 = 0; i10 < c0731a.size(); i10++) {
            C1644s m3715n = c0731a.m3715n(i10);
            if (m9039J(m3715n.f7027b)) {
                this.f6952E.add(m3715n);
                this.f6953F.add(null);
            }
        }
        for (int i11 = 0; i11 < c0731a2.size(); i11++) {
            C1644s m3715n2 = c0731a2.m3715n(i11);
            if (m9039J(m3715n2.f7027b)) {
                this.f6953F.add(m3715n2);
                this.f6952E.add(null);
            }
        }
    }

    /* renamed from: d */
    private static void m9030d(C1645t c1645t, View view, C1644s c1644s) {
        c1645t.f7029a.put(view, c1644s);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (c1645t.f7030b.indexOfKey(id2) >= 0) {
                c1645t.f7030b.put(id2, null);
            } else {
                c1645t.f7030b.put(id2, view);
            }
        }
        String m5236A = C1116x0.m5236A(view);
        if (m5236A != null) {
            if (c1645t.f7032d.containsKey(m5236A)) {
                c1645t.f7032d.put(m5236A, null);
            } else {
                c1645t.f7032d.put(m5236A, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1645t.f7031c.m3685g(itemIdAtPosition) < 0) {
                    C1116x0.m5271e0(view, true);
                    c1645t.f7031c.m3687i(itemIdAtPosition, view);
                    return;
                }
                View m3683d = c1645t.f7031c.m3683d(itemIdAtPosition);
                if (m3683d != null) {
                    C1116x0.m5271e0(m3683d, false);
                    c1645t.f7031c.m3687i(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: h */
    private void m9031h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f6972t;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f6973u;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f6974v;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f6974v.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C1644s c1644s = new C1644s(view);
                    if (z10) {
                        mo8974j(c1644s);
                    } else {
                        mo8973g(c1644s);
                    }
                    c1644s.f7028c.add(this);
                    mo9057i(c1644s);
                    m9030d(z10 ? this.f6948A : this.f6949B, view, c1644s);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f6976x;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f6977y;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f6978z;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f6978z.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                m9031h(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: B */
    public long m9032B() {
        return this.f6965b;
    }

    /* renamed from: C */
    public List<Integer> m9033C() {
        return this.f6968e;
    }

    /* renamed from: D */
    public List<String> m9034D() {
        return this.f6970r;
    }

    /* renamed from: E */
    public List<Class<?>> m9035E() {
        return this.f6971s;
    }

    /* renamed from: F */
    public List<View> m9036F() {
        return this.f6969f;
    }

    /* renamed from: G */
    public String[] mo8972G() {
        return null;
    }

    /* renamed from: H */
    public C1644s m9037H(View view, boolean z10) {
        C1640p c1640p = this.f6950C;
        if (c1640p != null) {
            return c1640p.m9037H(view, z10);
        }
        return (z10 ? this.f6948A : this.f6949B).f7029a.get(view);
    }

    /* renamed from: I */
    public boolean mo9038I(C1644s c1644s, C1644s c1644s2) {
        if (c1644s == null || c1644s2 == null) {
            return false;
        }
        String[] mo8972G = mo8972G();
        if (mo8972G == null) {
            Iterator<String> it = c1644s.f7026a.keySet().iterator();
            while (it.hasNext()) {
                if (m9022K(c1644s, c1644s2, it.next())) {
                }
            }
            return false;
        }
        for (String str : mo8972G) {
            if (!m9022K(c1644s, c1644s2, str)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean m9039J(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f6972t;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f6973u;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f6974v;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f6974v.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f6975w != null && C1116x0.m5236A(view) != null && this.f6975w.contains(C1116x0.m5236A(view))) {
            return false;
        }
        if ((this.f6968e.size() == 0 && this.f6969f.size() == 0 && (((arrayList = this.f6971s) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6970r) == null || arrayList2.isEmpty()))) || this.f6968e.contains(Integer.valueOf(id2)) || this.f6969f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f6970r;
        if (arrayList6 != null && arrayList6.contains(C1116x0.m5236A(view))) {
            return true;
        }
        if (this.f6971s != null) {
            for (int i11 = 0; i11 < this.f6971s.size(); i11++) {
                if (this.f6971s.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: R */
    public void mo9040R(View view) {
        if (this.f6958K) {
            return;
        }
        for (int size = this.f6955H.size() - 1; size >= 0; size--) {
            C1610a.m8952b(this.f6955H.get(size));
        }
        ArrayList<f> arrayList = this.f6959L;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f6959L.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((f) arrayList2.get(i10)).mo8989b(this);
            }
        }
        this.f6957J = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m9041S(ViewGroup viewGroup) {
        d dVar;
        this.f6952E = new ArrayList<>();
        this.f6953F = new ArrayList<>();
        m9027P(this.f6948A, this.f6949B);
        C0731a<Animator, d> m9021A = m9021A();
        int size = m9021A.size();
        InterfaceC1641p0 m8957d = C1611a0.m8957d(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator m3711j = m9021A.m3711j(i10);
            if (m3711j != null && (dVar = m9021A.get(m3711j)) != null && dVar.f6982a != null && m8957d.equals(dVar.f6985d)) {
                C1644s c1644s = dVar.f6984c;
                View view = dVar.f6982a;
                C1644s m9037H = m9037H(view, true);
                C1644s m9066v = m9066v(view, true);
                if (m9037H == null && m9066v == null) {
                    m9066v = this.f6949B.f7029a.get(view);
                }
                if (!(m9037H == null && m9066v == null) && dVar.f6986e.mo9038I(c1644s, m9066v)) {
                    if (m3711j.isRunning() || m3711j.isStarted()) {
                        m3711j.cancel();
                    } else {
                        m9021A.remove(m3711j);
                    }
                }
            }
        }
        mo9061q(viewGroup, this.f6948A, this.f6949B, this.f6952E, this.f6953F);
        mo9045X();
    }

    /* renamed from: T */
    public AbstractC1632l mo9042T(f fVar) {
        ArrayList<f> arrayList = this.f6959L;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f6959L.size() == 0) {
            this.f6959L = null;
        }
        return this;
    }

    /* renamed from: U */
    public AbstractC1632l mo9043U(View view) {
        this.f6969f.remove(view);
        return this;
    }

    /* renamed from: V */
    public void mo9044V(View view) {
        if (this.f6957J) {
            if (!this.f6958K) {
                for (int size = this.f6955H.size() - 1; size >= 0; size--) {
                    C1610a.m8953c(this.f6955H.get(size));
                }
                ArrayList<f> arrayList = this.f6959L;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f6959L.clone();
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((f) arrayList2.get(i10)).mo8988a(this);
                    }
                }
            }
            this.f6957J = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public void mo9045X() {
        m9055g0();
        C0731a<Animator, d> m9021A = m9021A();
        Iterator<Animator> it = this.f6960M.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m9021A.containsKey(next)) {
                m9055g0();
                m9028W(next, m9021A);
            }
        }
        this.f6960M.clear();
        m9062r();
    }

    /* renamed from: Y */
    public AbstractC1632l mo9046Y(long j10) {
        this.f6966c = j10;
        return this;
    }

    /* renamed from: Z */
    public void mo9047Z(e eVar) {
        this.f6961N = eVar;
    }

    /* renamed from: a */
    public AbstractC1632l mo9048a(f fVar) {
        if (this.f6959L == null) {
            this.f6959L = new ArrayList<>();
        }
        this.f6959L.add(fVar);
        return this;
    }

    /* renamed from: b */
    public AbstractC1632l mo9049b(View view) {
        this.f6969f.add(view);
        return this;
    }

    /* renamed from: b0 */
    public AbstractC1632l mo9050b0(TimeInterpolator timeInterpolator) {
        this.f6967d = timeInterpolator;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f6955H.size() - 1; size >= 0; size--) {
            this.f6955H.get(size).cancel();
        }
        ArrayList<f> arrayList = this.f6959L;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f6959L.clone();
        int size2 = arrayList2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            ((f) arrayList2.get(i10)).mo8990d(this);
        }
    }

    /* renamed from: d0 */
    public void mo9051d0(AbstractC1622g abstractC1622g) {
        if (abstractC1622g == null) {
            abstractC1622g = f6946R;
        }
        this.f6963P = abstractC1622g;
    }

    /* renamed from: e */
    protected void m9052e(Animator animator) {
        if (animator == null) {
            m9062r();
            return;
        }
        if (m9063s() >= 0) {
            animator.setDuration(m9063s());
        }
        if (m9032B() >= 0) {
            animator.setStartDelay(m9032B() + animator.getStartDelay());
        }
        if (m9065u() != null) {
            animator.setInterpolator(m9065u());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* renamed from: e0 */
    public void mo9053e0(AbstractC1638o abstractC1638o) {
    }

    /* renamed from: f0 */
    public AbstractC1632l mo9054f0(long j10) {
        this.f6965b = j10;
        return this;
    }

    /* renamed from: g */
    public abstract void mo8973g(C1644s c1644s);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g0 */
    public void m9055g0() {
        if (this.f6956I == 0) {
            ArrayList<f> arrayList = this.f6959L;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6959L.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).mo9005c(this);
                }
            }
            this.f6958K = false;
        }
        this.f6956I++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public String mo9056h0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f6966c != -1) {
            str2 = str2 + "dur(" + this.f6966c + ") ";
        }
        if (this.f6965b != -1) {
            str2 = str2 + "dly(" + this.f6965b + ") ";
        }
        if (this.f6967d != null) {
            str2 = str2 + "interp(" + this.f6967d + ") ";
        }
        if (this.f6968e.size() <= 0 && this.f6969f.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f6968e.size() > 0) {
            for (int i10 = 0; i10 < this.f6968e.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6968e.get(i10);
            }
        }
        if (this.f6969f.size() > 0) {
            for (int i11 = 0; i11 < this.f6969f.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6969f.get(i11);
            }
        }
        return str3 + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9057i(C1644s c1644s) {
    }

    /* renamed from: j */
    public abstract void mo8974j(C1644s c1644s);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m9058k(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C0731a<String, String> c0731a;
        m9059l(z10);
        if ((this.f6968e.size() > 0 || this.f6969f.size() > 0) && (((arrayList = this.f6970r) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6971s) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f6968e.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f6968e.get(i10).intValue());
                if (findViewById != null) {
                    C1644s c1644s = new C1644s(findViewById);
                    if (z10) {
                        mo8974j(c1644s);
                    } else {
                        mo8973g(c1644s);
                    }
                    c1644s.f7028c.add(this);
                    mo9057i(c1644s);
                    m9030d(z10 ? this.f6948A : this.f6949B, findViewById, c1644s);
                }
            }
            for (int i11 = 0; i11 < this.f6969f.size(); i11++) {
                View view = this.f6969f.get(i11);
                C1644s c1644s2 = new C1644s(view);
                if (z10) {
                    mo8974j(c1644s2);
                } else {
                    mo8973g(c1644s2);
                }
                c1644s2.f7028c.add(this);
                mo9057i(c1644s2);
                m9030d(z10 ? this.f6948A : this.f6949B, view, c1644s2);
            }
        } else {
            m9031h(viewGroup, z10);
        }
        if (z10 || (c0731a = this.f6962O) == null) {
            return;
        }
        int size = c0731a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f6948A.f7032d.remove(this.f6962O.m3711j(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f6948A.f7032d.put(this.f6962O.m3715n(i13), view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m9059l(boolean z10) {
        C1645t c1645t;
        if (z10) {
            this.f6948A.f7029a.clear();
            this.f6948A.f7030b.clear();
            c1645t = this.f6948A;
        } else {
            this.f6949B.f7029a.clear();
            this.f6949B.f7030b.clear();
            c1645t = this.f6949B;
        }
        c1645t.f7031c.m3681a();
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC1632l clone() {
        try {
            AbstractC1632l abstractC1632l = (AbstractC1632l) super.clone();
            abstractC1632l.f6960M = new ArrayList<>();
            abstractC1632l.f6948A = new C1645t();
            abstractC1632l.f6949B = new C1645t();
            abstractC1632l.f6952E = null;
            abstractC1632l.f6953F = null;
            return abstractC1632l;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public Animator mo8975p(ViewGroup viewGroup, C1644s c1644s, C1644s c1644s2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public void mo9061q(ViewGroup viewGroup, C1645t c1645t, C1645t c1645t2, ArrayList<C1644s> arrayList, ArrayList<C1644s> arrayList2) {
        View view;
        Animator animator;
        C1644s c1644s;
        int i10;
        Animator animator2;
        C1644s c1644s2;
        C0731a<Animator, d> m9021A = m9021A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            C1644s c1644s3 = arrayList.get(i11);
            C1644s c1644s4 = arrayList2.get(i11);
            if (c1644s3 != null && !c1644s3.f7028c.contains(this)) {
                c1644s3 = null;
            }
            if (c1644s4 != null && !c1644s4.f7028c.contains(this)) {
                c1644s4 = null;
            }
            if (c1644s3 != null || c1644s4 != null) {
                if (c1644s3 == null || c1644s4 == null || mo9038I(c1644s3, c1644s4)) {
                    Animator mo8975p = mo8975p(viewGroup, c1644s3, c1644s4);
                    if (mo8975p != null) {
                        if (c1644s4 != null) {
                            View view2 = c1644s4.f7027b;
                            String[] mo8972G = mo8972G();
                            if (mo8972G != null && mo8972G.length > 0) {
                                c1644s2 = new C1644s(view2);
                                C1644s c1644s5 = c1645t2.f7029a.get(view2);
                                if (c1644s5 != null) {
                                    int i12 = 0;
                                    while (i12 < mo8972G.length) {
                                        Map<String, Object> map = c1644s2.f7026a;
                                        Animator animator3 = mo8975p;
                                        String str = mo8972G[i12];
                                        map.put(str, c1644s5.f7026a.get(str));
                                        i12++;
                                        mo8975p = animator3;
                                        mo8972G = mo8972G;
                                    }
                                }
                                Animator animator4 = mo8975p;
                                int size2 = m9021A.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        animator2 = animator4;
                                        break;
                                    }
                                    d dVar = m9021A.get(m9021A.m3711j(i13));
                                    if (dVar.f6984c != null && dVar.f6982a == view2 && dVar.f6983b.equals(m9067w()) && dVar.f6984c.equals(c1644s2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                animator2 = mo8975p;
                                c1644s2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            c1644s = c1644s2;
                        } else {
                            view = c1644s3.f7027b;
                            animator = mo8975p;
                            c1644s = null;
                        }
                        if (animator != null) {
                            i10 = size;
                            m9021A.put(animator, new d(view, m9067w(), this, C1611a0.m8957d(viewGroup), c1644s));
                            this.f6960M.add(animator);
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
                Animator animator5 = this.f6960M.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay((sparseIntArray.valueAt(i14) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void m9062r() {
        int i10 = this.f6956I - 1;
        this.f6956I = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.f6959L;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6959L.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).mo8991e(this);
                }
            }
            for (int i12 = 0; i12 < this.f6948A.f7031c.m3690l(); i12++) {
                View m3691m = this.f6948A.f7031c.m3691m(i12);
                if (m3691m != null) {
                    C1116x0.m5271e0(m3691m, false);
                }
            }
            for (int i13 = 0; i13 < this.f6949B.f7031c.m3690l(); i13++) {
                View m3691m2 = this.f6949B.f7031c.m3691m(i13);
                if (m3691m2 != null) {
                    C1116x0.m5271e0(m3691m2, false);
                }
            }
            this.f6958K = true;
        }
    }

    /* renamed from: s */
    public long m9063s() {
        return this.f6966c;
    }

    /* renamed from: t */
    public e m9064t() {
        return this.f6961N;
    }

    public String toString() {
        return mo9056h0("");
    }

    /* renamed from: u */
    public TimeInterpolator m9065u() {
        return this.f6967d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public C1644s m9066v(View view, boolean z10) {
        C1640p c1640p = this.f6950C;
        if (c1640p != null) {
            return c1640p.m9066v(view, z10);
        }
        ArrayList<C1644s> arrayList = z10 ? this.f6952E : this.f6953F;
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
            C1644s c1644s = arrayList.get(i10);
            if (c1644s == null) {
                return null;
            }
            if (c1644s.f7027b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f6953F : this.f6952E).get(i10);
        }
        return null;
    }

    /* renamed from: w */
    public String m9067w() {
        return this.f6964a;
    }

    /* renamed from: x */
    public AbstractC1622g m9068x() {
        return this.f6963P;
    }

    /* renamed from: z */
    public AbstractC1638o m9069z() {
        return null;
    }
}
