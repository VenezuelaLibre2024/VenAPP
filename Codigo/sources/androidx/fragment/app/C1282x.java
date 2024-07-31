package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0944c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.x */
/* loaded from: classes.dex */
class C1282x extends AbstractC1283y {

    /* renamed from: androidx.fragment.app.x$a */
    /* loaded from: classes.dex */
    class a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f5595a;

        a(Rect rect) {
            this.f5595a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f5595a;
        }
    }

    /* renamed from: androidx.fragment.app.x$b */
    /* loaded from: classes.dex */
    class b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f5597a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5598b;

        b(View view, ArrayList arrayList) {
            this.f5597a = view;
            this.f5598b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f5597a.setVisibility(8);
            int size = this.f5598b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f5598b.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.x$c */
    /* loaded from: classes.dex */
    class c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f5600a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5601b;

        /* renamed from: c */
        final /* synthetic */ Object f5602c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f5603d;

        /* renamed from: e */
        final /* synthetic */ Object f5604e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f5605f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f5600a = obj;
            this.f5601b = arrayList;
            this.f5602c = obj2;
            this.f5603d = arrayList2;
            this.f5604e = obj3;
            this.f5605f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f5600a;
            if (obj != null) {
                C1282x.this.mo7249q(obj, this.f5601b, null);
            }
            Object obj2 = this.f5602c;
            if (obj2 != null) {
                C1282x.this.mo7249q(obj2, this.f5603d, null);
            }
            Object obj3 = this.f5604e;
            if (obj3 != null) {
                C1282x.this.mo7249q(obj3, this.f5605f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.x$d */
    /* loaded from: classes.dex */
    class d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f5607a;

        d(Runnable runnable) {
            this.f5607a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f5607a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.x$e */
    /* loaded from: classes.dex */
    class e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f5609a;

        e(Rect rect) {
            this.f5609a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f5609a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f5609a;
        }
    }

    /* renamed from: C */
    private static boolean m7238C(Transition transition) {
        return (AbstractC1283y.m7259l(transition.getTargetIds()) && AbstractC1283y.m7259l(transition.getTargetNames()) && AbstractC1283y.m7259l(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: A */
    public void mo7239A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo7249q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: B */
    public Object mo7240B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: a */
    public void mo7241a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: b */
    public void mo7242b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                mo7242b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (m7238C(transition) || !AbstractC1283y.m7259l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: c */
    public void mo7243c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: e */
    public boolean mo7244e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: g */
    public Object mo7245g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: m */
    public Object mo7246m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: n */
    public Object mo7247n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: p */
    public void mo7248p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: q */
    public void mo7249q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                mo7249q(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (m7238C(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i10 < size) {
            transition.addTarget(arrayList2.get(i10));
            i10++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: r */
    public void mo7250r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: t */
    public void mo7251t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: u */
    public void mo7252u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: v */
    public void mo7253v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m7262k(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: w */
    public void mo7254w(Fragment fragment, Object obj, C0944c c0944c, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.AbstractC1283y
    /* renamed from: z */
    public void mo7255z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1283y.m7256d(targets, arrayList.get(i10));
        }
        targets.add(view);
        arrayList.add(view);
        mo7242b(transitionSet, arrayList);
    }
}
