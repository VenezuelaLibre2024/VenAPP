package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.x0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends k {

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<RecyclerView.b0> f5316h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<RecyclerView.b0> f5317i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<j> f5318j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<i> f5319k = new ArrayList<>();

    /* renamed from: l, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.b0>> f5320l = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    ArrayList<ArrayList<j>> f5321m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    ArrayList<ArrayList<i>> f5322n = new ArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    ArrayList<RecyclerView.b0> f5323o = new ArrayList<>();

    /* renamed from: p, reason: collision with root package name */
    ArrayList<RecyclerView.b0> f5324p = new ArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    ArrayList<RecyclerView.b0> f5325q = new ArrayList<>();

    /* renamed from: r, reason: collision with root package name */
    ArrayList<RecyclerView.b0> f5326r = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f5327a;

        a(ArrayList arrayList) {
            this.f5327a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5327a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.J(jVar.f5361a, jVar.f5362b, jVar.f5363c, jVar.f5364d, jVar.f5365e);
            }
            this.f5327a.clear();
            c.this.f5321m.remove(this.f5327a);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f5329a;

        b(ArrayList arrayList) {
            this.f5329a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5329a.iterator();
            while (it.hasNext()) {
                c.this.I((i) it.next());
            }
            this.f5329a.clear();
            c.this.f5322n.remove(this.f5329a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class RunnableC0081c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f5331a;

        RunnableC0081c(ArrayList arrayList) {
            this.f5331a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f5331a.iterator();
            while (it.hasNext()) {
                c.this.H((RecyclerView.b0) it.next());
            }
            this.f5331a.clear();
            c.this.f5320l.remove(this.f5331a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f5333a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f5334b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f5335c;

        d(RecyclerView.b0 b0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5333a = b0Var;
            this.f5334b = viewPropertyAnimator;
            this.f5335c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5334b.setListener(null);
            this.f5335c.setAlpha(1.0f);
            c.this.x(this.f5333a);
            c.this.f5325q.remove(this.f5333a);
            c.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.y(this.f5333a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f5337a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f5338b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f5339c;

        e(RecyclerView.b0 b0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5337a = b0Var;
            this.f5338b = view;
            this.f5339c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5338b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5339c.setListener(null);
            c.this.r(this.f5337a);
            c.this.f5323o.remove(this.f5337a);
            c.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.s(this.f5337a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.b0 f5341a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f5342b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f5343c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f5344d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f5345e;

        f(RecyclerView.b0 b0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5341a = b0Var;
            this.f5342b = i10;
            this.f5343c = view;
            this.f5344d = i11;
            this.f5345e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f5342b != 0) {
                this.f5343c.setTranslationX(0.0f);
            }
            if (this.f5344d != 0) {
                this.f5343c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5345e.setListener(null);
            c.this.v(this.f5341a);
            c.this.f5324p.remove(this.f5341a);
            c.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.w(this.f5341a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f5347a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f5348b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f5349c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5347a = iVar;
            this.f5348b = viewPropertyAnimator;
            this.f5349c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5348b.setListener(null);
            this.f5349c.setAlpha(1.0f);
            this.f5349c.setTranslationX(0.0f);
            this.f5349c.setTranslationY(0.0f);
            c.this.t(this.f5347a.f5355a, true);
            c.this.f5326r.remove(this.f5347a.f5355a);
            c.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.u(this.f5347a.f5355a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f5351a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f5352b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f5353c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5351a = iVar;
            this.f5352b = viewPropertyAnimator;
            this.f5353c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5352b.setListener(null);
            this.f5353c.setAlpha(1.0f);
            this.f5353c.setTranslationX(0.0f);
            this.f5353c.setTranslationY(0.0f);
            c.this.t(this.f5351a.f5356b, false);
            c.this.f5326r.remove(this.f5351a.f5356b);
            c.this.M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.u(this.f5351a.f5356b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.b0 f5355a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.b0 f5356b;

        /* renamed from: c, reason: collision with root package name */
        public int f5357c;

        /* renamed from: d, reason: collision with root package name */
        public int f5358d;

        /* renamed from: e, reason: collision with root package name */
        public int f5359e;

        /* renamed from: f, reason: collision with root package name */
        public int f5360f;

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f5355a + ", newHolder=" + this.f5356b + ", fromX=" + this.f5357c + ", fromY=" + this.f5358d + ", toX=" + this.f5359e + ", toY=" + this.f5360f + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.b0 f5361a;

        /* renamed from: b, reason: collision with root package name */
        public int f5362b;

        /* renamed from: c, reason: collision with root package name */
        public int f5363c;

        /* renamed from: d, reason: collision with root package name */
        public int f5364d;

        /* renamed from: e, reason: collision with root package name */
        public int f5365e;
    }

    private void K(RecyclerView.b0 b0Var) {
        View view = b0Var.f5171a;
        ViewPropertyAnimator animate = view.animate();
        this.f5325q.add(b0Var);
        animate.setDuration(k()).alpha(0.0f).setListener(new d(b0Var, animate, view)).start();
    }

    private void N(List<i> list, RecyclerView.b0 b0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (P(iVar, b0Var) && iVar.f5355a == null && iVar.f5356b == null) {
                list.remove(iVar);
            }
        }
    }

    private void O(i iVar) {
        RecyclerView.b0 b0Var = iVar.f5355a;
        if (b0Var != null) {
            P(iVar, b0Var);
        }
        RecyclerView.b0 b0Var2 = iVar.f5356b;
        if (b0Var2 != null) {
            P(iVar, b0Var2);
        }
    }

    private boolean P(i iVar, RecyclerView.b0 b0Var) {
        boolean z10 = false;
        if (iVar.f5356b == b0Var) {
            iVar.f5356b = null;
        } else {
            if (iVar.f5355a != b0Var) {
                return false;
            }
            iVar.f5355a = null;
            z10 = true;
        }
        b0Var.f5171a.setAlpha(1.0f);
        b0Var.f5171a.setTranslationX(0.0f);
        b0Var.f5171a.setTranslationY(0.0f);
        t(b0Var, z10);
        return true;
    }

    void H(RecyclerView.b0 b0Var) {
        View view = b0Var.f5171a;
        ViewPropertyAnimator animate = view.animate();
        this.f5323o.add(b0Var);
        animate.alpha(1.0f).setDuration(h()).setListener(new e(b0Var, view, animate)).start();
    }

    void I(i iVar) {
        RecyclerView.b0 b0Var = iVar.f5355a;
        View view = b0Var == null ? null : b0Var.f5171a;
        RecyclerView.b0 b0Var2 = iVar.f5356b;
        View view2 = b0Var2 != null ? b0Var2.f5171a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(i());
            this.f5326r.add(iVar.f5355a);
            duration.translationX(iVar.f5359e - iVar.f5357c);
            duration.translationY(iVar.f5360f - iVar.f5358d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f5326r.add(iVar.f5356b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(i()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    void J(RecyclerView.b0 b0Var, int i10, int i11, int i12, int i13) {
        View view = b0Var.f5171a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f5324p.add(b0Var);
        animate.setDuration(j()).setListener(new f(b0Var, i14, view, i15, animate)).start();
    }

    void L(List<RecyclerView.b0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f5171a.animate().cancel();
        }
    }

    void M() {
        if (l()) {
            return;
        }
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public boolean c(RecyclerView.b0 b0Var, List<Object> list) {
        return !list.isEmpty() || super.c(b0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void f(RecyclerView.b0 b0Var) {
        View view = b0Var.f5171a;
        view.animate().cancel();
        int size = this.f5318j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f5318j.get(size).f5361a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(b0Var);
                this.f5318j.remove(size);
            }
        }
        N(this.f5319k, b0Var);
        if (this.f5316h.remove(b0Var)) {
            view.setAlpha(1.0f);
            x(b0Var);
        }
        if (this.f5317i.remove(b0Var)) {
            view.setAlpha(1.0f);
            r(b0Var);
        }
        for (int size2 = this.f5322n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f5322n.get(size2);
            N(arrayList, b0Var);
            if (arrayList.isEmpty()) {
                this.f5322n.remove(size2);
            }
        }
        for (int size3 = this.f5321m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f5321m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f5361a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(b0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f5321m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f5320l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.b0> arrayList3 = this.f5320l.get(size5);
            if (arrayList3.remove(b0Var)) {
                view.setAlpha(1.0f);
                r(b0Var);
                if (arrayList3.isEmpty()) {
                    this.f5320l.remove(size5);
                }
            }
        }
        this.f5325q.remove(b0Var);
        this.f5323o.remove(b0Var);
        this.f5326r.remove(b0Var);
        this.f5324p.remove(b0Var);
        M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void g() {
        int size = this.f5318j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f5318j.get(size);
            View view = jVar.f5361a.f5171a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(jVar.f5361a);
            this.f5318j.remove(size);
        }
        for (int size2 = this.f5316h.size() - 1; size2 >= 0; size2--) {
            x(this.f5316h.get(size2));
            this.f5316h.remove(size2);
        }
        int size3 = this.f5317i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = this.f5317i.get(size3);
            b0Var.f5171a.setAlpha(1.0f);
            r(b0Var);
            this.f5317i.remove(size3);
        }
        for (int size4 = this.f5319k.size() - 1; size4 >= 0; size4--) {
            O(this.f5319k.get(size4));
        }
        this.f5319k.clear();
        if (l()) {
            for (int size5 = this.f5321m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f5321m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f5361a.f5171a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    v(jVar2.f5361a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f5321m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f5320l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.b0> arrayList2 = this.f5320l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.b0 b0Var2 = arrayList2.get(size8);
                    b0Var2.f5171a.setAlpha(1.0f);
                    r(b0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f5320l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f5322n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f5322n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    O(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f5322n.remove(arrayList3);
                    }
                }
            }
            L(this.f5325q);
            L(this.f5324p);
            L(this.f5323o);
            L(this.f5326r);
            e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public boolean l() {
        return (this.f5317i.isEmpty() && this.f5319k.isEmpty() && this.f5318j.isEmpty() && this.f5316h.isEmpty() && this.f5324p.isEmpty() && this.f5325q.isEmpty() && this.f5323o.isEmpty() && this.f5326r.isEmpty() && this.f5321m.isEmpty() && this.f5320l.isEmpty() && this.f5322n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.k
    public void p() {
        boolean z10 = !this.f5316h.isEmpty();
        boolean z11 = !this.f5318j.isEmpty();
        boolean z12 = !this.f5319k.isEmpty();
        boolean z13 = !this.f5317i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.b0> it = this.f5316h.iterator();
            while (it.hasNext()) {
                K(it.next());
            }
            this.f5316h.clear();
            if (z11) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f5318j);
                this.f5321m.add(arrayList);
                this.f5318j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    x0.S(arrayList.get(0).f5361a.f5171a, aVar, k());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f5319k);
                this.f5322n.add(arrayList2);
                this.f5319k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    x0.S(arrayList2.get(0).f5355a.f5171a, bVar, k());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.b0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f5317i);
                this.f5320l.add(arrayList3);
                this.f5317i.clear();
                RunnableC0081c runnableC0081c = new RunnableC0081c(arrayList3);
                if (z10 || z11 || z12) {
                    x0.S(arrayList3.get(0).f5171a, runnableC0081c, (z10 ? k() : 0L) + Math.max(z11 ? j() : 0L, z12 ? i() : 0L));
                } else {
                    runnableC0081c.run();
                }
            }
        }
    }
}
