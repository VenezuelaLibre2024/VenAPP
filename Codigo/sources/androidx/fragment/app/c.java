package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.c;
import androidx.core.view.k2;
import androidx.core.view.v0;
import androidx.core.view.x0;
import androidx.fragment.app.b0;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class c extends b0 {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4580a;

        static {
            int[] iArr = new int[b0.e.c.values().length];
            f4580a = iArr;
            try {
                iArr[b0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4580a[b0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4580a[b0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4580a[b0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f4581a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0.e f4582b;

        b(List list, b0.e eVar) {
            this.f4581a = list;
            this.f4582b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4581a.contains(this.f4582b)) {
                this.f4581a.remove(this.f4582b);
                c.this.s(this.f4582b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0065c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f4584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4585b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4586c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0.e f4587d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f4588e;

        C0065c(ViewGroup viewGroup, View view, boolean z10, b0.e eVar, k kVar) {
            this.f4584a = viewGroup;
            this.f4585b = view;
            this.f4586c = z10;
            this.f4587d = eVar;
            this.f4588e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4584a.endViewTransition(this.f4585b);
            if (this.f4586c) {
                this.f4587d.e().b(this.f4585b);
            }
            this.f4588e.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f4590a;

        d(Animator animator) {
            this.f4590a = animator;
        }

        @Override // androidx.core.os.c.b
        public void onCancel() {
            this.f4590a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f4592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4593b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f4594c;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f4592a.endViewTransition(eVar.f4593b);
                e.this.f4594c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f4592a = viewGroup;
            this.f4593b = view;
            this.f4594c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4592a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f4597a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f4598b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f4599c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f4597a = view;
            this.f4598b = viewGroup;
            this.f4599c = kVar;
        }

        @Override // androidx.core.os.c.b
        public void onCancel() {
            this.f4597a.clearAnimation();
            this.f4598b.endViewTransition(this.f4597a);
            this.f4599c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0.e f4601a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0.e f4602b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4603c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f4604d;

        g(b0.e eVar, b0.e eVar2, boolean z10, androidx.collection.a aVar) {
            this.f4601a = eVar;
            this.f4602b = eVar2;
            this.f4603c = z10;
            this.f4604d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f4601a.f(), this.f4602b.f(), this.f4603c, this.f4604d, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f4606a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4607b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f4608c;

        h(y yVar, View view, Rect rect) {
            this.f4606a = yVar;
            this.f4607b = view;
            this.f4608c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4606a.k(this.f4607b, this.f4608c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f4610a;

        i(ArrayList arrayList) {
            this.f4610a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.A(this.f4610a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f4612a;

        j(m mVar) {
            this.f4612a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4612a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f4614c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f4615d;

        /* renamed from: e, reason: collision with root package name */
        private f.d f4616e;

        k(b0.e eVar, androidx.core.os.c cVar, boolean z10) {
            super(eVar, cVar);
            this.f4615d = false;
            this.f4614c = z10;
        }

        f.d e(Context context) {
            if (this.f4615d) {
                return this.f4616e;
            }
            f.d c10 = androidx.fragment.app.f.c(context, b().f(), b().e() == b0.e.c.VISIBLE, this.f4614c);
            this.f4616e = c10;
            this.f4615d = true;
            return c10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        private final b0.e f4617a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.os.c f4618b;

        l(b0.e eVar, androidx.core.os.c cVar) {
            this.f4617a = eVar;
            this.f4618b = cVar;
        }

        void a() {
            this.f4617a.d(this.f4618b);
        }

        b0.e b() {
            return this.f4617a;
        }

        androidx.core.os.c c() {
            return this.f4618b;
        }

        boolean d() {
            b0.e.c cVar;
            b0.e.c i10 = b0.e.c.i(this.f4617a.f().mView);
            b0.e.c e10 = this.f4617a.e();
            return i10 == e10 || !(i10 == (cVar = b0.e.c.VISIBLE) || e10 == cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        private final Object f4619c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f4620d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f4621e;

        m(b0.e eVar, androidx.core.os.c cVar, boolean z10, boolean z11) {
            super(eVar, cVar);
            boolean z12;
            Object obj;
            if (eVar.e() == b0.e.c.VISIBLE) {
                Fragment f10 = eVar.f();
                this.f4619c = z10 ? f10.getReenterTransition() : f10.getEnterTransition();
                Fragment f11 = eVar.f();
                z12 = z10 ? f11.getAllowReturnTransitionOverlap() : f11.getAllowEnterTransitionOverlap();
            } else {
                Fragment f12 = eVar.f();
                this.f4619c = z10 ? f12.getReturnTransition() : f12.getExitTransition();
                z12 = true;
            }
            this.f4620d = z12;
            if (z11) {
                Fragment f13 = eVar.f();
                obj = z10 ? f13.getSharedElementReturnTransition() : f13.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.f4621e = obj;
        }

        private y f(Object obj) {
            if (obj == null) {
                return null;
            }
            y yVar = w.f4799b;
            if (yVar != null && yVar.e(obj)) {
                return yVar;
            }
            y yVar2 = w.f4800c;
            if (yVar2 != null && yVar2.e(obj)) {
                return yVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        y e() {
            y f10 = f(this.f4619c);
            y f11 = f(this.f4621e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 != null ? f10 : f11;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f4619c + " which uses a different Transition  type than its shared element transition " + this.f4621e);
        }

        public Object g() {
            return this.f4621e;
        }

        Object h() {
            return this.f4619c;
        }

        public boolean i() {
            return this.f4621e != null;
        }

        boolean j() {
            return this.f4620d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<b0.e> list2, boolean z10, Map<b0.e, Boolean> map) {
        StringBuilder sb2;
        String str;
        f.d e10;
        ViewGroup m10 = m();
        Context context = m10.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (k kVar : list) {
            if (kVar.d() || (e10 = kVar.e(context)) == null) {
                kVar.a();
            } else {
                Animator animator = e10.f4658b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    b0.e b10 = kVar.b();
                    Fragment f10 = b10.f();
                    if (Boolean.TRUE.equals(map.get(b10))) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f10 + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z12 = b10.e() == b0.e.c.GONE;
                        if (z12) {
                            list2.remove(b10);
                        }
                        View view = f10.mView;
                        m10.startViewTransition(view);
                        animator.addListener(new C0065c(m10, view, z12, b10, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().c(new d(animator));
                        z11 = true;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            b0.e b11 = kVar2.b();
            Fragment f11 = b11.f();
            if (z10) {
                if (n.E0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f11);
                    str = " as Animations cannot run alongside Transitions.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar2.a();
            } else if (z11) {
                if (n.E0(2)) {
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f11);
                    str = " as Animations cannot run alongside Animators.";
                    sb2.append(str);
                    Log.v("FragmentManager", sb2.toString());
                }
                kVar2.a();
            } else {
                View view2 = f11.mView;
                Animation animation = (Animation) androidx.core.util.h.k(((f.d) androidx.core.util.h.k(kVar2.e(context))).f4657a);
                if (b11.e() != b0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    m10.startViewTransition(view2);
                    f.e eVar = new f.e(animation, m10, view2);
                    eVar.setAnimationListener(new e(m10, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(view2, m10, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Map<b0.e, Boolean> x(List<m> list, List<b0.e> list2, boolean z10, b0.e eVar, b0.e eVar2) {
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        b0.e eVar3;
        b0.e eVar4;
        View view2;
        Object n10;
        androidx.collection.a aVar;
        ArrayList<View> arrayList3;
        b0.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        y yVar;
        b0.e eVar6;
        View view4;
        boolean z11 = z10;
        b0.e eVar7 = eVar;
        b0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        y yVar2 = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                y e10 = mVar.e();
                if (yVar2 == null) {
                    yVar2 = e10;
                } else if (e10 != null && yVar2 != e10) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (yVar2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return hashMap;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        androidx.collection.a aVar2 = new androidx.collection.a();
        Object obj3 = null;
        View view6 = null;
        boolean z12 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                yVar = yVar2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object B = yVar2.B(yVar2.g(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
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
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                Fragment f10 = eVar.f();
                if (z11) {
                    f10.getEnterTransitionCallback();
                    eVar2.f().getExitTransitionCallback();
                } else {
                    f10.getExitTransitionCallback();
                    eVar2.f().getEnterTransitionCallback();
                }
                int i11 = 0;
                for (int size = sharedElementSourceNames.size(); i11 < size; size = size) {
                    aVar2.put(sharedElementSourceNames.get(i11), sharedElementTargetNames2.get(i11));
                    i11++;
                }
                androidx.collection.a<String, View> aVar3 = new androidx.collection.a<>();
                u(aVar3, eVar.f().mView);
                aVar3.p(sharedElementSourceNames);
                aVar2.p(aVar3.keySet());
                androidx.collection.a<String, View> aVar4 = new androidx.collection.a<>();
                u(aVar4, eVar2.f().mView);
                aVar4.p(sharedElementTargetNames2);
                aVar4.p(aVar2.values());
                w.x(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    yVar = yVar2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    w.f(eVar2.f(), eVar.f(), z11, aVar3, true);
                    aVar = aVar2;
                    ArrayList<View> arrayList8 = arrayList6;
                    v0.a(m(), new g(eVar2, eVar, z10, aVar4));
                    arrayList5.addAll(aVar3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = (View) aVar3.get(sharedElementSourceNames.get(0));
                        yVar2.v(B, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(aVar4.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view4 = (View) aVar4.get(sharedElementTargetNames2.get(0))) != null) {
                        v0.a(m(), new h(yVar2, view4, rect2));
                        z12 = true;
                    }
                    yVar2.z(B, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    yVar = yVar2;
                    yVar2.t(B, null, null, null, null, B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = B;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            aVar2 = aVar;
            z11 = z10;
            arrayList6 = arrayList3;
            yVar2 = yVar;
        }
        View view9 = view6;
        androidx.collection.a aVar5 = aVar2;
        ArrayList<View> arrayList9 = arrayList6;
        b0.e eVar9 = eVar7;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        y yVar3 = yVar2;
        boolean z13 = false;
        b0.e eVar10 = eVar8;
        ArrayList arrayList11 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar4 : list) {
            if (mVar4.d()) {
                hashMap.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object g10 = yVar3.g(mVar4.h());
                b0.e b10 = mVar4.b();
                boolean z14 = (obj3 == null || !(b10 == eVar9 || b10 == eVar10)) ? z13 : true;
                if (g10 == null) {
                    if (!z14) {
                        hashMap.put(b10, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    view = view10;
                    n10 = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj6 = obj4;
                    t(arrayList12, b10.f().mView);
                    if (z14) {
                        if (b10 == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        yVar3.a(g10, view10);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view10;
                        eVar4 = b10;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        yVar3.b(g10, arrayList12);
                        view = view10;
                        obj = obj6;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        eVar3 = eVar10;
                        yVar3.t(g10, g10, arrayList12, null, null, null, null);
                        if (b10.e() == b0.e.c.GONE) {
                            eVar4 = b10;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(eVar4.f().mView);
                            yVar3.r(g10, eVar4.f().mView, arrayList13);
                            v0.a(m(), new i(arrayList12));
                        } else {
                            eVar4 = b10;
                        }
                    }
                    if (eVar4.e() == b0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z12) {
                            yVar3.u(g10, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        yVar3.v(g10, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (mVar4.j()) {
                        obj5 = yVar3.n(obj2, g10, null);
                        n10 = obj;
                    } else {
                        n10 = yVar3.n(obj, g10, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = n10;
                view9 = view2;
                view10 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
                z13 = false;
            }
        }
        ArrayList<View> arrayList14 = arrayList9;
        ArrayList<View> arrayList15 = arrayList10;
        b0.e eVar11 = eVar10;
        Object m10 = yVar3.m(obj5, obj4, obj3);
        for (m mVar5 : list) {
            if (!mVar5.d()) {
                Object h10 = mVar5.h();
                b0.e b11 = mVar5.b();
                boolean z15 = obj3 != null && (b11 == eVar9 || b11 == eVar11);
                if (h10 != null || z15) {
                    if (x0.H(m())) {
                        yVar3.w(mVar5.b().f(), m10, mVar5.c(), new j(mVar5));
                    } else {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b11);
                        }
                        mVar5.a();
                    }
                }
            }
        }
        if (!x0.H(m())) {
            return hashMap;
        }
        w.A(arrayList11, 4);
        ArrayList<String> o10 = yVar3.o(arrayList14);
        yVar3.c(m(), m10);
        yVar3.y(m(), arrayList15, arrayList14, o10, aVar5);
        w.A(arrayList11, 0);
        yVar3.A(obj3, arrayList15, arrayList14);
        return hashMap;
    }

    @Override // androidx.fragment.app.b0
    void f(List<b0.e> list, boolean z10) {
        b0.e eVar = null;
        b0.e eVar2 = null;
        for (b0.e eVar3 : list) {
            b0.e.c i10 = b0.e.c.i(eVar3.f().mView);
            int i11 = a.f4580a[eVar3.e().ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                if (i10 == b0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i11 == 4 && i10 != b0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        for (b0.e eVar4 : list) {
            androidx.core.os.c cVar = new androidx.core.os.c();
            eVar4.j(cVar);
            arrayList.add(new k(eVar4, cVar, z10));
            androidx.core.os.c cVar2 = new androidx.core.os.c();
            eVar4.j(cVar2);
            boolean z11 = false;
            if (z10) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, cVar2, z10, z11));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, cVar2, z10, z11));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, cVar2, z10, z11));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z11 = true;
                arrayList2.add(new m(eVar4, cVar2, z10, z11));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map<b0.e, Boolean> x10 = x(arrayList2, arrayList3, z10, eVar, eVar2);
        w(arrayList, arrayList3, x10.containsValue(Boolean.TRUE), x10);
        Iterator<b0.e> it = arrayList3.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        arrayList3.clear();
    }

    void s(b0.e eVar) {
        eVar.e().b(eVar.f().mView);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (k2.a(viewGroup)) {
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
                t(arrayList, childAt);
            }
        }
    }

    void u(Map<String, View> map, View view) {
        String A = x0.A(view);
        if (A != null) {
            map.put(A, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(androidx.collection.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(x0.A(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
