package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C1116x0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: classes.dex */
public class C1403c extends AbstractC1411k {

    /* renamed from: h */
    private ArrayList<RecyclerView.AbstractC1370b0> f6136h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<RecyclerView.AbstractC1370b0> f6137i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<j> f6138j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<i> f6139k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<RecyclerView.AbstractC1370b0>> f6140l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<j>> f6141m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<i>> f6142n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<RecyclerView.AbstractC1370b0> f6143o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<RecyclerView.AbstractC1370b0> f6144p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<RecyclerView.AbstractC1370b0> f6145q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<RecyclerView.AbstractC1370b0> f6146r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f6147a;

        a(ArrayList arrayList) {
            this.f6147a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f6147a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                C1403c.this.m8017J(jVar.f6181a, jVar.f6182b, jVar.f6183c, jVar.f6184d, jVar.f6185e);
            }
            this.f6147a.clear();
            C1403c.this.f6141m.remove(this.f6147a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f6149a;

        b(ArrayList arrayList) {
            this.f6149a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f6149a.iterator();
            while (it.hasNext()) {
                C1403c.this.m8016I((i) it.next());
            }
            this.f6149a.clear();
            C1403c.this.f6142n.remove(this.f6149a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f6151a;

        c(ArrayList arrayList) {
            this.f6151a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f6151a.iterator();
            while (it.hasNext()) {
                C1403c.this.m8015H((RecyclerView.AbstractC1370b0) it.next());
            }
            this.f6151a.clear();
            C1403c.this.f6140l.remove(this.f6151a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1370b0 f6153a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f6154b;

        /* renamed from: c */
        final /* synthetic */ View f6155c;

        d(RecyclerView.AbstractC1370b0 abstractC1370b0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6153a = abstractC1370b0;
            this.f6154b = viewPropertyAnimator;
            this.f6155c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6154b.setListener(null);
            this.f6155c.setAlpha(1.0f);
            C1403c.this.m8088x(this.f6153a);
            C1403c.this.f6145q.remove(this.f6153a);
            C1403c.this.m8019M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1403c.this.m8089y(this.f6153a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1370b0 f6157a;

        /* renamed from: b */
        final /* synthetic */ View f6158b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f6159c;

        e(RecyclerView.AbstractC1370b0 abstractC1370b0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6157a = abstractC1370b0;
            this.f6158b = view;
            this.f6159c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6158b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6159c.setListener(null);
            C1403c.this.m8082r(this.f6157a);
            C1403c.this.f6143o.remove(this.f6157a);
            C1403c.this.m8019M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1403c.this.m8083s(this.f6157a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.AbstractC1370b0 f6161a;

        /* renamed from: b */
        final /* synthetic */ int f6162b;

        /* renamed from: c */
        final /* synthetic */ View f6163c;

        /* renamed from: d */
        final /* synthetic */ int f6164d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f6165e;

        f(RecyclerView.AbstractC1370b0 abstractC1370b0, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f6161a = abstractC1370b0;
            this.f6162b = i10;
            this.f6163c = view;
            this.f6164d = i11;
            this.f6165e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f6162b != 0) {
                this.f6163c.setTranslationX(0.0f);
            }
            if (this.f6164d != 0) {
                this.f6163c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6165e.setListener(null);
            C1403c.this.m8086v(this.f6161a);
            C1403c.this.f6144p.remove(this.f6161a);
            C1403c.this.m8019M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1403c.this.m8087w(this.f6161a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f6167a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f6168b;

        /* renamed from: c */
        final /* synthetic */ View f6169c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6167a = iVar;
            this.f6168b = viewPropertyAnimator;
            this.f6169c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6168b.setListener(null);
            this.f6169c.setAlpha(1.0f);
            this.f6169c.setTranslationX(0.0f);
            this.f6169c.setTranslationY(0.0f);
            C1403c.this.m8084t(this.f6167a.f6175a, true);
            C1403c.this.f6146r.remove(this.f6167a.f6175a);
            C1403c.this.m8019M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1403c.this.m8085u(this.f6167a.f6175a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ i f6171a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f6172b;

        /* renamed from: c */
        final /* synthetic */ View f6173c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f6171a = iVar;
            this.f6172b = viewPropertyAnimator;
            this.f6173c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6172b.setListener(null);
            this.f6173c.setAlpha(1.0f);
            this.f6173c.setTranslationX(0.0f);
            this.f6173c.setTranslationY(0.0f);
            C1403c.this.m8084t(this.f6171a.f6176b, false);
            C1403c.this.f6146r.remove(this.f6171a.f6176b);
            C1403c.this.m8019M();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1403c.this.m8085u(this.f6171a.f6176b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$i */
    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        public RecyclerView.AbstractC1370b0 f6175a;

        /* renamed from: b */
        public RecyclerView.AbstractC1370b0 f6176b;

        /* renamed from: c */
        public int f6177c;

        /* renamed from: d */
        public int f6178d;

        /* renamed from: e */
        public int f6179e;

        /* renamed from: f */
        public int f6180f;

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f6175a + ", newHolder=" + this.f6176b + ", fromX=" + this.f6177c + ", fromY=" + this.f6178d + ", toX=" + this.f6179e + ", toY=" + this.f6180f + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$j */
    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a */
        public RecyclerView.AbstractC1370b0 f6181a;

        /* renamed from: b */
        public int f6182b;

        /* renamed from: c */
        public int f6183c;

        /* renamed from: d */
        public int f6184d;

        /* renamed from: e */
        public int f6185e;
    }

    /* renamed from: K */
    private void m8011K(RecyclerView.AbstractC1370b0 abstractC1370b0) {
        View view = abstractC1370b0.f5980a;
        ViewPropertyAnimator animate = view.animate();
        this.f6145q.add(abstractC1370b0);
        animate.setDuration(m7793k()).alpha(0.0f).setListener(new d(abstractC1370b0, animate, view)).start();
    }

    /* renamed from: N */
    private void m8012N(List<i> list, RecyclerView.AbstractC1370b0 abstractC1370b0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (m8014P(iVar, abstractC1370b0) && iVar.f6175a == null && iVar.f6176b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: O */
    private void m8013O(i iVar) {
        RecyclerView.AbstractC1370b0 abstractC1370b0 = iVar.f6175a;
        if (abstractC1370b0 != null) {
            m8014P(iVar, abstractC1370b0);
        }
        RecyclerView.AbstractC1370b0 abstractC1370b02 = iVar.f6176b;
        if (abstractC1370b02 != null) {
            m8014P(iVar, abstractC1370b02);
        }
    }

    /* renamed from: P */
    private boolean m8014P(i iVar, RecyclerView.AbstractC1370b0 abstractC1370b0) {
        boolean z10 = false;
        if (iVar.f6176b == abstractC1370b0) {
            iVar.f6176b = null;
        } else {
            if (iVar.f6175a != abstractC1370b0) {
                return false;
            }
            iVar.f6175a = null;
            z10 = true;
        }
        abstractC1370b0.f5980a.setAlpha(1.0f);
        abstractC1370b0.f5980a.setTranslationX(0.0f);
        abstractC1370b0.f5980a.setTranslationY(0.0f);
        m8084t(abstractC1370b0, z10);
        return true;
    }

    /* renamed from: H */
    void m8015H(RecyclerView.AbstractC1370b0 abstractC1370b0) {
        View view = abstractC1370b0.f5980a;
        ViewPropertyAnimator animate = view.animate();
        this.f6143o.add(abstractC1370b0);
        animate.alpha(1.0f).setDuration(m7790h()).setListener(new e(abstractC1370b0, view, animate)).start();
    }

    /* renamed from: I */
    void m8016I(i iVar) {
        RecyclerView.AbstractC1370b0 abstractC1370b0 = iVar.f6175a;
        View view = abstractC1370b0 == null ? null : abstractC1370b0.f5980a;
        RecyclerView.AbstractC1370b0 abstractC1370b02 = iVar.f6176b;
        View view2 = abstractC1370b02 != null ? abstractC1370b02.f5980a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m7791i());
            this.f6146r.add(iVar.f6175a);
            duration.translationX(iVar.f6179e - iVar.f6177c);
            duration.translationY(iVar.f6180f - iVar.f6178d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f6146r.add(iVar.f6176b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m7791i()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    /* renamed from: J */
    void m8017J(RecyclerView.AbstractC1370b0 abstractC1370b0, int i10, int i11, int i12, int i13) {
        View view = abstractC1370b0.f5980a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f6144p.add(abstractC1370b0);
        animate.setDuration(m7792j()).setListener(new f(abstractC1370b0, i14, view, i15, animate)).start();
    }

    /* renamed from: L */
    void m8018L(List<RecyclerView.AbstractC1370b0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f5980a.animate().cancel();
        }
    }

    /* renamed from: M */
    void m8019M() {
        if (mo7794l()) {
            return;
        }
        m7787e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1379k
    /* renamed from: c */
    public boolean mo7785c(RecyclerView.AbstractC1370b0 abstractC1370b0, List<Object> list) {
        return !list.isEmpty() || super.mo7785c(abstractC1370b0, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1379k
    /* renamed from: f */
    public void mo7788f(RecyclerView.AbstractC1370b0 abstractC1370b0) {
        View view = abstractC1370b0.f5980a;
        view.animate().cancel();
        int size = this.f6138j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f6138j.get(size).f6181a == abstractC1370b0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m8086v(abstractC1370b0);
                this.f6138j.remove(size);
            }
        }
        m8012N(this.f6139k, abstractC1370b0);
        if (this.f6136h.remove(abstractC1370b0)) {
            view.setAlpha(1.0f);
            m8088x(abstractC1370b0);
        }
        if (this.f6137i.remove(abstractC1370b0)) {
            view.setAlpha(1.0f);
            m8082r(abstractC1370b0);
        }
        for (int size2 = this.f6142n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f6142n.get(size2);
            m8012N(arrayList, abstractC1370b0);
            if (arrayList.isEmpty()) {
                this.f6142n.remove(size2);
            }
        }
        for (int size3 = this.f6141m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f6141m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f6181a == abstractC1370b0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m8086v(abstractC1370b0);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f6141m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f6140l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC1370b0> arrayList3 = this.f6140l.get(size5);
            if (arrayList3.remove(abstractC1370b0)) {
                view.setAlpha(1.0f);
                m8082r(abstractC1370b0);
                if (arrayList3.isEmpty()) {
                    this.f6140l.remove(size5);
                }
            }
        }
        this.f6145q.remove(abstractC1370b0);
        this.f6143o.remove(abstractC1370b0);
        this.f6146r.remove(abstractC1370b0);
        this.f6144p.remove(abstractC1370b0);
        m8019M();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1379k
    /* renamed from: g */
    public void mo7789g() {
        int size = this.f6138j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f6138j.get(size);
            View view = jVar.f6181a.f5980a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m8086v(jVar.f6181a);
            this.f6138j.remove(size);
        }
        for (int size2 = this.f6136h.size() - 1; size2 >= 0; size2--) {
            m8088x(this.f6136h.get(size2));
            this.f6136h.remove(size2);
        }
        int size3 = this.f6137i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC1370b0 abstractC1370b0 = this.f6137i.get(size3);
            abstractC1370b0.f5980a.setAlpha(1.0f);
            m8082r(abstractC1370b0);
            this.f6137i.remove(size3);
        }
        for (int size4 = this.f6139k.size() - 1; size4 >= 0; size4--) {
            m8013O(this.f6139k.get(size4));
        }
        this.f6139k.clear();
        if (mo7794l()) {
            for (int size5 = this.f6141m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f6141m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f6181a.f5980a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m8086v(jVar2.f6181a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f6141m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f6140l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC1370b0> arrayList2 = this.f6140l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC1370b0 abstractC1370b02 = arrayList2.get(size8);
                    abstractC1370b02.f5980a.setAlpha(1.0f);
                    m8082r(abstractC1370b02);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f6140l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f6142n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f6142n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m8013O(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f6142n.remove(arrayList3);
                    }
                }
            }
            m8018L(this.f6145q);
            m8018L(this.f6144p);
            m8018L(this.f6143o);
            m8018L(this.f6146r);
            m7787e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1379k
    /* renamed from: l */
    public boolean mo7794l() {
        return (this.f6137i.isEmpty() && this.f6139k.isEmpty() && this.f6138j.isEmpty() && this.f6136h.isEmpty() && this.f6144p.isEmpty() && this.f6145q.isEmpty() && this.f6143o.isEmpty() && this.f6146r.isEmpty() && this.f6141m.isEmpty() && this.f6140l.isEmpty() && this.f6142n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1379k
    /* renamed from: p */
    public void mo7798p() {
        boolean z10 = !this.f6136h.isEmpty();
        boolean z11 = !this.f6138j.isEmpty();
        boolean z12 = !this.f6139k.isEmpty();
        boolean z13 = !this.f6137i.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.AbstractC1370b0> it = this.f6136h.iterator();
            while (it.hasNext()) {
                m8011K(it.next());
            }
            this.f6136h.clear();
            if (z11) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f6138j);
                this.f6141m.add(arrayList);
                this.f6138j.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    C1116x0.m5254S(arrayList.get(0).f6181a.f5980a, aVar, m7793k());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f6139k);
                this.f6142n.add(arrayList2);
                this.f6139k.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    C1116x0.m5254S(arrayList2.get(0).f6175a.f5980a, bVar, m7793k());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList<RecyclerView.AbstractC1370b0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f6137i);
                this.f6140l.add(arrayList3);
                this.f6137i.clear();
                c cVar = new c(arrayList3);
                if (z10 || z11 || z12) {
                    C1116x0.m5254S(arrayList3.get(0).f5980a, cVar, (z10 ? m7793k() : 0L) + Math.max(z11 ? m7792j() : 0L, z12 ? m7791i() : 0L));
                } else {
                    cVar.run();
                }
            }
        }
    }
}
