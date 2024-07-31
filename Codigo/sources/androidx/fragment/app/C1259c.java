package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.C0731a;
import androidx.core.os.C0944c;
import androidx.core.util.C0984h;
import androidx.core.view.C1059k2;
import androidx.core.view.C1116x0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1108v0;
import androidx.fragment.app.AbstractC1258b0;
import androidx.fragment.app.C1264f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
class C1259c extends AbstractC1258b0 {

    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5317a;

        static {
            int[] iArr = new int[AbstractC1258b0.e.c.values().length];
            f5317a = iArr;
            try {
                iArr[AbstractC1258b0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5317a[AbstractC1258b0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5317a[AbstractC1258b0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5317a[AbstractC1258b0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f5318a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1258b0.e f5319b;

        b(List list, AbstractC1258b0.e eVar) {
            this.f5318a = list;
            this.f5319b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5318a.contains(this.f5319b)) {
                this.f5318a.remove(this.f5319b);
                C1259c.this.m6898s(this.f5319b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$c */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5321a;

        /* renamed from: b */
        final /* synthetic */ View f5322b;

        /* renamed from: c */
        final /* synthetic */ boolean f5323c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1258b0.e f5324d;

        /* renamed from: e */
        final /* synthetic */ k f5325e;

        c(ViewGroup viewGroup, View view, boolean z10, AbstractC1258b0.e eVar, k kVar) {
            this.f5321a = viewGroup;
            this.f5322b = view;
            this.f5323c = z10;
            this.f5324d = eVar;
            this.f5325e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5321a.endViewTransition(this.f5322b);
            if (this.f5323c) {
                this.f5324d.m6886e().m6895b(this.f5322b);
            }
            this.f5325e.m6903a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$d */
    /* loaded from: classes.dex */
    public class d implements C0944c.b {

        /* renamed from: a */
        final /* synthetic */ Animator f5327a;

        d(Animator animator) {
            this.f5327a = animator;
        }

        @Override // androidx.core.os.C0944c.b
        public void onCancel() {
            this.f5327a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$e */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5329a;

        /* renamed from: b */
        final /* synthetic */ View f5330b;

        /* renamed from: c */
        final /* synthetic */ k f5331c;

        /* renamed from: androidx.fragment.app.c$e$a */
        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f5329a.endViewTransition(eVar.f5330b);
                e.this.f5331c.m6903a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f5329a = viewGroup;
            this.f5330b = view;
            this.f5331c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f5329a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$f */
    /* loaded from: classes.dex */
    public class f implements C0944c.b {

        /* renamed from: a */
        final /* synthetic */ View f5334a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f5335b;

        /* renamed from: c */
        final /* synthetic */ k f5336c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f5334a = view;
            this.f5335b = viewGroup;
            this.f5336c = kVar;
        }

        @Override // androidx.core.os.C0944c.b
        public void onCancel() {
            this.f5334a.clearAnimation();
            this.f5335b.endViewTransition(this.f5334a);
            this.f5336c.m6903a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$g */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC1258b0.e f5338a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1258b0.e f5339b;

        /* renamed from: c */
        final /* synthetic */ boolean f5340c;

        /* renamed from: d */
        final /* synthetic */ C0731a f5341d;

        g(AbstractC1258b0.e eVar, AbstractC1258b0.e eVar2, boolean z10, C0731a c0731a) {
            this.f5338a = eVar;
            this.f5339b = eVar2;
            this.f5340c = z10;
            this.f5341d = c0731a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1281w.m7217f(this.f5338a.m6887f(), this.f5339b.m6887f(), this.f5340c, this.f5341d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$h */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC1283y f5343a;

        /* renamed from: b */
        final /* synthetic */ View f5344b;

        /* renamed from: c */
        final /* synthetic */ Rect f5345c;

        h(AbstractC1283y abstractC1283y, View view, Rect rect) {
            this.f5343a = abstractC1283y;
            this.f5344b = view;
            this.f5345c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5343a.m7262k(this.f5344b, this.f5345c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$i */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f5347a;

        i(ArrayList arrayList) {
            this.f5347a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1281w.m7210A(this.f5347a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$j */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ m f5349a;

        j(m mVar) {
            this.f5349a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5349a.m6903a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$k */
    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c */
        private boolean f5351c;

        /* renamed from: d */
        private boolean f5352d;

        /* renamed from: e */
        private C1264f.d f5353e;

        k(AbstractC1258b0.e eVar, C0944c c0944c, boolean z10) {
            super(eVar, c0944c);
            this.f5352d = false;
            this.f5351c = z10;
        }

        /* renamed from: e */
        C1264f.d m6902e(Context context) {
            if (this.f5352d) {
                return this.f5353e;
            }
            C1264f.d m6937c = C1264f.m6937c(context, m6904b().m6887f(), m6904b().m6886e() == AbstractC1258b0.e.c.VISIBLE, this.f5351c);
            this.f5353e = m6937c;
            this.f5352d = true;
            return m6937c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a */
        private final AbstractC1258b0.e f5354a;

        /* renamed from: b */
        private final C0944c f5355b;

        l(AbstractC1258b0.e eVar, C0944c c0944c) {
            this.f5354a = eVar;
            this.f5355b = c0944c;
        }

        /* renamed from: a */
        void m6903a() {
            this.f5354a.m6885d(this.f5355b);
        }

        /* renamed from: b */
        AbstractC1258b0.e m6904b() {
            return this.f5354a;
        }

        /* renamed from: c */
        C0944c m6905c() {
            return this.f5355b;
        }

        /* renamed from: d */
        boolean m6906d() {
            AbstractC1258b0.e.c cVar;
            AbstractC1258b0.e.c m6894i = AbstractC1258b0.e.c.m6894i(this.f5354a.m6887f().mView);
            AbstractC1258b0.e.c m6886e = this.f5354a.m6886e();
            return m6894i == m6886e || !(m6894i == (cVar = AbstractC1258b0.e.c.VISIBLE) || m6886e == cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$m */
    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c */
        private final Object f5356c;

        /* renamed from: d */
        private final boolean f5357d;

        /* renamed from: e */
        private final Object f5358e;

        m(AbstractC1258b0.e eVar, C0944c c0944c, boolean z10, boolean z11) {
            super(eVar, c0944c);
            boolean z12;
            Object obj;
            if (eVar.m6886e() == AbstractC1258b0.e.c.VISIBLE) {
                Fragment m6887f = eVar.m6887f();
                this.f5356c = z10 ? m6887f.getReenterTransition() : m6887f.getEnterTransition();
                Fragment m6887f2 = eVar.m6887f();
                z12 = z10 ? m6887f2.getAllowReturnTransitionOverlap() : m6887f2.getAllowEnterTransitionOverlap();
            } else {
                Fragment m6887f3 = eVar.m6887f();
                this.f5356c = z10 ? m6887f3.getReturnTransition() : m6887f3.getExitTransition();
                z12 = true;
            }
            this.f5357d = z12;
            if (z11) {
                Fragment m6887f4 = eVar.m6887f();
                obj = z10 ? m6887f4.getSharedElementReturnTransition() : m6887f4.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.f5358e = obj;
        }

        /* renamed from: f */
        private AbstractC1283y m6907f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC1283y abstractC1283y = C1281w.f5553b;
            if (abstractC1283y != null && abstractC1283y.mo7244e(obj)) {
                return abstractC1283y;
            }
            AbstractC1283y abstractC1283y2 = C1281w.f5554c;
            if (abstractC1283y2 != null && abstractC1283y2.mo7244e(obj)) {
                return abstractC1283y2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m6904b().m6887f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: e */
        AbstractC1283y m6908e() {
            AbstractC1283y m6907f = m6907f(this.f5356c);
            AbstractC1283y m6907f2 = m6907f(this.f5358e);
            if (m6907f == null || m6907f2 == null || m6907f == m6907f2) {
                return m6907f != null ? m6907f : m6907f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m6904b().m6887f() + " returned Transition " + this.f5356c + " which uses a different Transition  type than its shared element transition " + this.f5358e);
        }

        /* renamed from: g */
        public Object m6909g() {
            return this.f5358e;
        }

        /* renamed from: h */
        Object m6910h() {
            return this.f5356c;
        }

        /* renamed from: i */
        public boolean m6911i() {
            return this.f5358e != null;
        }

        /* renamed from: j */
        boolean m6912j() {
            return this.f5357d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1259c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m6896w(List<k> list, List<AbstractC1258b0.e> list2, boolean z10, Map<AbstractC1258b0.e, Boolean> map) {
        StringBuilder sb2;
        String str;
        C1264f.d m6902e;
        ViewGroup m6878m = m6878m();
        Context context = m6878m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k kVar : list) {
            if (kVar.m6906d() || (m6902e = kVar.m6902e(context)) == null) {
                kVar.m6903a();
            } else {
                Animator animator = m6902e.f5396b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    AbstractC1258b0.e m6904b = kVar.m6904b();
                    Fragment m6887f = m6904b.m6887f();
                    if (Boolean.TRUE.equals(map.get(m6904b))) {
                        if (AbstractC1272n.m6991E0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + m6887f + " as this Fragment was involved in a Transition.");
                        }
                        kVar.m6903a();
                    } else {
                        boolean z12 = m6904b.m6886e() == AbstractC1258b0.e.c.GONE;
                        if (z12) {
                            list2.remove(m6904b);
                        }
                        View view = m6887f.mView;
                        m6878m.startViewTransition(view);
                        animator.addListener(new c(m6878m, view, z12, m6904b, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.m6905c().m4705c(new d(animator));
                        z11 = true;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            AbstractC1258b0.e m6904b2 = kVar2.m6904b();
            Fragment m6887f2 = m6904b2.m6887f();
            if (z10) {
                if (AbstractC1272n.m6991E0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(m6887f2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar2.m6903a();
            } else if (z11) {
                if (AbstractC1272n.m6991E0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(m6887f2);
                    str = " as Animations cannot run alongside Animators.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar2.m6903a();
            } else {
                View view2 = m6887f2.mView;
                Animation animation = (Animation) C0984h.m4833k(((C1264f.d) C0984h.m4833k(kVar2.m6902e(context))).f5395a);
                if (m6904b2.m6886e() != AbstractC1258b0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.m6903a();
                } else {
                    m6878m.startViewTransition(view2);
                    C1264f.e eVar = new C1264f.e(animation, m6878m, view2);
                    eVar.setAnimationListener(new e(m6878m, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.m6905c().m4705c(new f(view2, m6878m, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    private Map<AbstractC1258b0.e, Boolean> m6897x(List<m> list, List<AbstractC1258b0.e> list2, boolean z10, AbstractC1258b0.e eVar, AbstractC1258b0.e eVar2) {
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        AbstractC1258b0.e eVar3;
        AbstractC1258b0.e eVar4;
        View view2;
        Object mo7247n;
        C0731a c0731a;
        ArrayList<View> arrayList3;
        AbstractC1258b0.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        AbstractC1283y abstractC1283y;
        AbstractC1258b0.e eVar6;
        View view4;
        boolean z11 = z10;
        AbstractC1258b0.e eVar7 = eVar;
        AbstractC1258b0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        AbstractC1283y abstractC1283y2 = null;
        for (m mVar : list) {
            if (!mVar.m6906d()) {
                AbstractC1283y m6908e = mVar.m6908e();
                if (abstractC1283y2 == null) {
                    abstractC1283y2 = m6908e;
                } else if (m6908e != null && abstractC1283y2 != m6908e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.m6904b().m6887f() + " returned Transition " + mVar.m6910h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC1283y2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.m6904b(), Boolean.FALSE);
                mVar2.m6903a();
            }
            return hashMap;
        }
        View view5 = new View(m6878m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        C0731a c0731a2 = new C0731a();
        Object obj3 = null;
        View view6 = null;
        boolean z12 = false;
        for (m mVar3 : list) {
            if (!mVar3.m6911i() || eVar7 == null || eVar8 == null) {
                c0731a = c0731a2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                abstractC1283y = abstractC1283y2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object mo7240B = abstractC1283y2.mo7240B(abstractC1283y2.mo7245g(mVar3.m6909g()));
                ArrayList<String> sharedElementSourceNames = eVar2.m6887f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.m6887f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.m6887f().getSharedElementTargetNames();
                View view7 = view6;
                int i10 = 0;
                while (i10 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i10));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i10));
                    }
                    i10++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.m6887f().getSharedElementTargetNames();
                Fragment m6887f = eVar.m6887f();
                if (z11) {
                    m6887f.getEnterTransitionCallback();
                    eVar2.m6887f().getExitTransitionCallback();
                } else {
                    m6887f.getExitTransitionCallback();
                    eVar2.m6887f().getEnterTransitionCallback();
                }
                int i11 = 0;
                for (int size = sharedElementSourceNames.size(); i11 < size; size = size) {
                    c0731a2.put(sharedElementSourceNames.get(i11), sharedElementTargetNames2.get(i11));
                    i11++;
                }
                C0731a<String, View> c0731a3 = new C0731a<>();
                m6900u(c0731a3, eVar.m6887f().mView);
                c0731a3.m3651p(sharedElementSourceNames);
                c0731a2.m3651p(c0731a3.keySet());
                C0731a<String, View> c0731a4 = new C0731a<>();
                m6900u(c0731a4, eVar2.m6887f().mView);
                c0731a4.m3651p(sharedElementTargetNames2);
                c0731a4.m3651p(c0731a2.values());
                C1281w.m7235x(c0731a2, c0731a4);
                m6901v(c0731a3, c0731a2.keySet());
                m6901v(c0731a4, c0731a2.values());
                if (c0731a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c0731a = c0731a2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    abstractC1283y = abstractC1283y2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    C1281w.m7217f(eVar2.m6887f(), eVar.m6887f(), z11, c0731a3, true);
                    c0731a = c0731a2;
                    ArrayList<View> arrayList8 = arrayList6;
                    ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(m6878m(), new g(eVar2, eVar, z10, c0731a4));
                    arrayList5.addAll(c0731a3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = (View) c0731a3.get(sharedElementSourceNames.get(0));
                        abstractC1283y2.mo7253v(mo7240B, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c0731a4.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view4 = (View) c0731a4.get(sharedElementTargetNames2.get(0))) != null) {
                        ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(m6878m(), new h(abstractC1283y2, view4, rect2));
                        z12 = true;
                    }
                    abstractC1283y2.mo7255z(mo7240B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    abstractC1283y = abstractC1283y2;
                    abstractC1283y2.mo7251t(mo7240B, null, null, null, null, mo7240B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = mo7240B;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            c0731a2 = c0731a;
            z11 = z10;
            arrayList6 = arrayList3;
            abstractC1283y2 = abstractC1283y;
        }
        View view9 = view6;
        C0731a c0731a5 = c0731a2;
        ArrayList<View> arrayList9 = arrayList6;
        AbstractC1258b0.e eVar9 = eVar7;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        AbstractC1283y abstractC1283y3 = abstractC1283y2;
        boolean z13 = false;
        AbstractC1258b0.e eVar10 = eVar8;
        ArrayList arrayList11 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar4 : list) {
            if (mVar4.m6906d()) {
                hashMap.put(mVar4.m6904b(), Boolean.FALSE);
                mVar4.m6903a();
            } else {
                Object mo7245g = abstractC1283y3.mo7245g(mVar4.m6910h());
                AbstractC1258b0.e m6904b = mVar4.m6904b();
                boolean z14 = (obj3 == null || !(m6904b == eVar9 || m6904b == eVar10)) ? z13 : true;
                if (mo7245g == null) {
                    if (!z14) {
                        hashMap.put(m6904b, Boolean.FALSE);
                        mVar4.m6903a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    view = view10;
                    mo7247n = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj6 = obj4;
                    m6899t(arrayList12, m6904b.m6887f().mView);
                    if (z14) {
                        if (m6904b == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        abstractC1283y3.mo7241a(mo7245g, view10);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view10;
                        eVar4 = m6904b;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        abstractC1283y3.mo7242b(mo7245g, arrayList12);
                        view = view10;
                        obj = obj6;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        eVar3 = eVar10;
                        abstractC1283y3.mo7251t(mo7245g, mo7245g, arrayList12, null, null, null, null);
                        if (m6904b.m6886e() == AbstractC1258b0.e.c.GONE) {
                            eVar4 = m6904b;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(eVar4.m6887f().mView);
                            abstractC1283y3.mo7250r(mo7245g, eVar4.m6887f().mView, arrayList13);
                            ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(m6878m(), new i(arrayList12));
                        } else {
                            eVar4 = m6904b;
                        }
                    }
                    if (eVar4.m6886e() == AbstractC1258b0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z12) {
                            abstractC1283y3.mo7252u(mo7245g, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        abstractC1283y3.mo7253v(mo7245g, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (mVar4.m6912j()) {
                        obj5 = abstractC1283y3.mo7247n(obj2, mo7245g, null);
                        mo7247n = obj;
                    } else {
                        mo7247n = abstractC1283y3.mo7247n(obj, mo7245g, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = mo7247n;
                view9 = view2;
                view10 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
                z13 = false;
            }
        }
        ArrayList<View> arrayList14 = arrayList9;
        ArrayList<View> arrayList15 = arrayList10;
        AbstractC1258b0.e eVar11 = eVar10;
        Object mo7246m = abstractC1283y3.mo7246m(obj5, obj4, obj3);
        for (m mVar5 : list) {
            if (!mVar5.m6906d()) {
                Object m6910h = mVar5.m6910h();
                AbstractC1258b0.e m6904b2 = mVar5.m6904b();
                boolean z15 = obj3 != null && (m6904b2 == eVar9 || m6904b2 == eVar11);
                if (m6910h != null || z15) {
                    if (C1116x0.m5243H(m6878m())) {
                        abstractC1283y3.mo7254w(mVar5.m6904b().m6887f(), mo7246m, mVar5.m6905c(), new j(mVar5));
                    } else {
                        if (AbstractC1272n.m6991E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m6878m() + " has not been laid out. Completing operation " + m6904b2);
                        }
                        mVar5.m6903a();
                    }
                }
            }
        }
        if (!C1116x0.m5243H(m6878m())) {
            return hashMap;
        }
        C1281w.m7210A(arrayList11, 4);
        ArrayList<String> m7263o = abstractC1283y3.m7263o(arrayList14);
        abstractC1283y3.mo7243c(m6878m(), mo7246m);
        abstractC1283y3.m7266y(m6878m(), arrayList15, arrayList14, m7263o, c0731a5);
        C1281w.m7210A(arrayList11, 0);
        abstractC1283y3.mo7239A(obj3, arrayList15, arrayList14);
        return hashMap;
    }

    @Override // androidx.fragment.app.AbstractC1258b0
    /* renamed from: f */
    void mo6873f(List<AbstractC1258b0.e> list, boolean z10) {
        AbstractC1258b0.e eVar = null;
        AbstractC1258b0.e eVar2 = null;
        for (AbstractC1258b0.e eVar3 : list) {
            AbstractC1258b0.e.c m6894i = AbstractC1258b0.e.c.m6894i(eVar3.m6887f().mView);
            int i10 = a.f5317a[eVar3.m6886e().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (m6894i == AbstractC1258b0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i10 == 4 && m6894i != AbstractC1258b0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        for (AbstractC1258b0.e eVar4 : list) {
            C0944c c0944c = new C0944c();
            eVar4.m6891j(c0944c);
            arrayList.add(new k(eVar4, c0944c, z10));
            C0944c c0944c2 = new C0944c();
            eVar4.m6891j(c0944c2);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, c0944c2, z10, z11));
                    eVar4.m6883a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, c0944c2, z10, z11));
                eVar4.m6883a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, c0944c2, z10, z11));
                    eVar4.m6883a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, c0944c2, z10, z11));
                eVar4.m6883a(new b(arrayList3, eVar4));
            }
        }
        Map<AbstractC1258b0.e, Boolean> m6897x = m6897x(arrayList2, arrayList3, z10, eVar, eVar2);
        m6896w(arrayList, arrayList3, m6897x.containsValue(Boolean.TRUE), m6897x);
        Iterator<AbstractC1258b0.e> it = arrayList3.iterator();
        while (it.hasNext()) {
            m6898s(it.next());
        }
        arrayList3.clear();
    }

    /* renamed from: s */
    void m6898s(AbstractC1258b0.e eVar) {
        eVar.m6886e().m6895b(eVar.m6887f().mView);
    }

    /* renamed from: t */
    void m6899t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (C1059k2.m5013a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                m6899t(arrayList, childAt);
            }
        }
    }

    /* renamed from: u */
    void m6900u(Map<String, View> map, View view) {
        String m5236A = C1116x0.m5236A(view);
        if (m5236A != null) {
            map.put(m5236A, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    m6900u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    void m6901v(C0731a<String, View> c0731a, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c0731a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C1116x0.m5236A(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
