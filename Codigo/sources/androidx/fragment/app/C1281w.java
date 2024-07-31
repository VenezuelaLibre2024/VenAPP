package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0731a;
import androidx.core.os.C0944c;
import androidx.core.view.C1116x0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1108v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p020b2.C1618e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
public class C1281w {

    /* renamed from: a */
    private static final int[] f5552a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final AbstractC1283y f5553b = new C1282x();

    /* renamed from: c */
    static final AbstractC1283y f5554c = m7234w();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.w$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g f5555a;

        /* renamed from: b */
        final /* synthetic */ Fragment f5556b;

        /* renamed from: c */
        final /* synthetic */ C0944c f5557c;

        a(g gVar, Fragment fragment, C0944c c0944c) {
            this.f5555a = gVar;
            this.f5556b = fragment;
            this.f5557c = c0944c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5555a.mo7115a(this.f5556b, this.f5557c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.w$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f5558a;

        b(ArrayList arrayList) {
            this.f5558a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1281w.m7210A(this.f5558a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.w$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g f5559a;

        /* renamed from: b */
        final /* synthetic */ Fragment f5560b;

        /* renamed from: c */
        final /* synthetic */ C0944c f5561c;

        c(g gVar, Fragment fragment, C0944c c0944c) {
            this.f5559a = gVar;
            this.f5560b = fragment;
            this.f5561c = c0944c;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5559a.mo7115a(this.f5560b, this.f5561c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.w$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f5562a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1283y f5563b;

        /* renamed from: c */
        final /* synthetic */ View f5564c;

        /* renamed from: d */
        final /* synthetic */ Fragment f5565d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f5566e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f5567f;

        /* renamed from: r */
        final /* synthetic */ ArrayList f5568r;

        /* renamed from: s */
        final /* synthetic */ Object f5569s;

        d(Object obj, AbstractC1283y abstractC1283y, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f5562a = obj;
            this.f5563b = abstractC1283y;
            this.f5564c = view;
            this.f5565d = fragment;
            this.f5566e = arrayList;
            this.f5567f = arrayList2;
            this.f5568r = arrayList3;
            this.f5569s = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f5562a;
            if (obj != null) {
                this.f5563b.mo7248p(obj, this.f5564c);
                this.f5567f.addAll(C1281w.m7222k(this.f5563b, this.f5562a, this.f5565d, this.f5566e, this.f5564c));
            }
            if (this.f5568r != null) {
                if (this.f5569s != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f5564c);
                    this.f5563b.mo7249q(this.f5569s, this.f5568r, arrayList);
                }
                this.f5568r.clear();
                this.f5568r.add(this.f5564c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.w$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Fragment f5570a;

        /* renamed from: b */
        final /* synthetic */ Fragment f5571b;

        /* renamed from: c */
        final /* synthetic */ boolean f5572c;

        /* renamed from: d */
        final /* synthetic */ C0731a f5573d;

        /* renamed from: e */
        final /* synthetic */ View f5574e;

        /* renamed from: f */
        final /* synthetic */ AbstractC1283y f5575f;

        /* renamed from: r */
        final /* synthetic */ Rect f5576r;

        e(Fragment fragment, Fragment fragment2, boolean z10, C0731a c0731a, View view, AbstractC1283y abstractC1283y, Rect rect) {
            this.f5570a = fragment;
            this.f5571b = fragment2;
            this.f5572c = z10;
            this.f5573d = c0731a;
            this.f5574e = view;
            this.f5575f = abstractC1283y;
            this.f5576r = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1281w.m7217f(this.f5570a, this.f5571b, this.f5572c, this.f5573d, false);
            View view = this.f5574e;
            if (view != null) {
                this.f5575f.m7262k(view, this.f5576r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.w$f */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC1283y f5577a;

        /* renamed from: b */
        final /* synthetic */ C0731a f5578b;

        /* renamed from: c */
        final /* synthetic */ Object f5579c;

        /* renamed from: d */
        final /* synthetic */ h f5580d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f5581e;

        /* renamed from: f */
        final /* synthetic */ View f5582f;

        /* renamed from: r */
        final /* synthetic */ Fragment f5583r;

        /* renamed from: s */
        final /* synthetic */ Fragment f5584s;

        /* renamed from: t */
        final /* synthetic */ boolean f5585t;

        /* renamed from: u */
        final /* synthetic */ ArrayList f5586u;

        /* renamed from: v */
        final /* synthetic */ Object f5587v;

        /* renamed from: w */
        final /* synthetic */ Rect f5588w;

        f(AbstractC1283y abstractC1283y, C0731a c0731a, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f5577a = abstractC1283y;
            this.f5578b = c0731a;
            this.f5579c = obj;
            this.f5580d = hVar;
            this.f5581e = arrayList;
            this.f5582f = view;
            this.f5583r = fragment;
            this.f5584s = fragment2;
            this.f5585t = z10;
            this.f5586u = arrayList2;
            this.f5587v = obj2;
            this.f5588w = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0731a<String, View> m7219h = C1281w.m7219h(this.f5577a, this.f5578b, this.f5579c, this.f5580d);
            if (m7219h != null) {
                this.f5581e.addAll(m7219h.values());
                this.f5581e.add(this.f5582f);
            }
            C1281w.m7217f(this.f5583r, this.f5584s, this.f5585t, m7219h, false);
            Object obj = this.f5579c;
            if (obj != null) {
                this.f5577a.mo7239A(obj, this.f5586u, this.f5581e);
                View m7230s = C1281w.m7230s(m7219h, this.f5580d, this.f5587v, this.f5585t);
                if (m7230s != null) {
                    this.f5577a.m7262k(m7230s, this.f5588w);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.w$g */
    /* loaded from: classes.dex */
    public interface g {
        /* renamed from: a */
        void mo7115a(Fragment fragment, C0944c c0944c);

        /* renamed from: b */
        void mo7116b(Fragment fragment, C0944c c0944c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.w$h */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a */
        public Fragment f5589a;

        /* renamed from: b */
        public boolean f5590b;

        /* renamed from: c */
        public C1255a f5591c;

        /* renamed from: d */
        public Fragment f5592d;

        /* renamed from: e */
        public boolean f5593e;

        /* renamed from: f */
        public C1255a f5594f;

        h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public static void m7210A(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static void m7211B(Context context, AbstractC1265g abstractC1265g, ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            C1255a c1255a = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                m7216e(c1255a, sparseArray, z10);
            } else {
                m7214c(c1255a, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                C0731a<String, String> m7215d = m7215d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (abstractC1265g.mo6829d() && (viewGroup = (ViewGroup) abstractC1265g.mo6828c(keyAt)) != null) {
                    if (z10) {
                        m7226o(viewGroup, hVar, view, m7215d, gVar);
                    } else {
                        m7225n(viewGroup, hVar, view, m7215d, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m7212a(ArrayList<View> arrayList, C0731a<String, View> c0731a, Collection<String> collection) {
        for (int size = c0731a.size() - 1; size >= 0; size--) {
            View m3715n = c0731a.m3715n(size);
            if (collection.contains(C1116x0.m5236A(m3715n))) {
                arrayList.add(m3715n);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0039, code lost:
    
        if (r0.mAdded != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008a, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x006e, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0088, code lost:
    
        if (r0.mHidden == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m7213b(androidx.fragment.app.C1255a r8, androidx.fragment.app.AbstractC1280v.a r9, android.util.SparseArray<androidx.fragment.app.C1281w.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1281w.m7213b(androidx.fragment.app.a, androidx.fragment.app.v$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m7214c(C1255a c1255a, SparseArray<h> sparseArray, boolean z10) {
        int size = c1255a.f5527c.size();
        for (int i10 = 0; i10 < size; i10++) {
            m7213b(c1255a, c1255a.f5527c.get(i10), sparseArray, false, z10);
        }
    }

    /* renamed from: d */
    private static C0731a<String, String> m7215d(int i10, ArrayList<C1255a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0731a<String, String> c0731a = new C0731a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            C1255a c1255a = arrayList.get(i13);
            if (c1255a.m6854u(i10)) {
                boolean booleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = c1255a.f5540p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c1255a.f5540p;
                        arrayList4 = c1255a.f5541q;
                    } else {
                        ArrayList<String> arrayList6 = c1255a.f5540p;
                        arrayList3 = c1255a.f5541q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String remove = c0731a.remove(str2);
                        if (remove != null) {
                            c0731a.put(str, remove);
                        } else {
                            c0731a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0731a;
    }

    /* renamed from: e */
    public static void m7216e(C1255a c1255a, SparseArray<h> sparseArray, boolean z10) {
        if (c1255a.f5278t.m7094n0().mo6829d()) {
            for (int size = c1255a.f5527c.size() - 1; size >= 0; size--) {
                m7213b(c1255a, c1255a.f5527c.get(size), sparseArray, true, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m7217f(Fragment fragment, Fragment fragment2, boolean z10, C0731a<String, View> c0731a, boolean z11) {
        if (z10) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    /* renamed from: g */
    private static boolean m7218g(AbstractC1283y abstractC1283y, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!abstractC1283y.mo7244e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C0731a<String, View> m7219h(AbstractC1283y abstractC1283y, C0731a<String, String> c0731a, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f5589a;
        View view = fragment.getView();
        if (c0731a.isEmpty() || obj == null || view == null) {
            c0731a.clear();
            return null;
        }
        C0731a<String, View> c0731a2 = new C0731a<>();
        abstractC1283y.m7261j(c0731a2, view);
        C1255a c1255a = hVar.f5591c;
        if (hVar.f5590b) {
            fragment.getExitTransitionCallback();
            arrayList = c1255a.f5540p;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = c1255a.f5541q;
        }
        if (arrayList != null) {
            c0731a2.m3651p(arrayList);
            c0731a2.m3651p(c0731a.values());
        }
        m7235x(c0731a, c0731a2);
        return c0731a2;
    }

    /* renamed from: i */
    private static C0731a<String, View> m7220i(AbstractC1283y abstractC1283y, C0731a<String, String> c0731a, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (c0731a.isEmpty() || obj == null) {
            c0731a.clear();
            return null;
        }
        Fragment fragment = hVar.f5592d;
        C0731a<String, View> c0731a2 = new C0731a<>();
        abstractC1283y.m7261j(c0731a2, fragment.requireView());
        C1255a c1255a = hVar.f5594f;
        if (hVar.f5593e) {
            fragment.getEnterTransitionCallback();
            arrayList = c1255a.f5541q;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = c1255a.f5540p;
        }
        if (arrayList != null) {
            c0731a2.m3651p(arrayList);
        }
        c0731a.m3651p(c0731a2.keySet());
        return c0731a2;
    }

    /* renamed from: j */
    private static AbstractC1283y m7221j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC1283y abstractC1283y = f5553b;
        if (abstractC1283y != null && m7218g(abstractC1283y, arrayList)) {
            return abstractC1283y;
        }
        AbstractC1283y abstractC1283y2 = f5554c;
        if (abstractC1283y2 != null && m7218g(abstractC1283y2, arrayList)) {
            return abstractC1283y2;
        }
        if (abstractC1283y == null && abstractC1283y2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m7222k(AbstractC1283y abstractC1283y, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            abstractC1283y.m7260f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC1283y.mo7242b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: l */
    private static Object m7223l(AbstractC1283y abstractC1283y, ViewGroup viewGroup, View view, C0731a<String, String> c0731a, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m7231t;
        C0731a<String, String> c0731a2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f5589a;
        Fragment fragment2 = hVar.f5592d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f5590b;
        if (c0731a.isEmpty()) {
            c0731a2 = c0731a;
            m7231t = null;
        } else {
            m7231t = m7231t(abstractC1283y, fragment, fragment2, z10);
            c0731a2 = c0731a;
        }
        C0731a<String, View> m7220i = m7220i(abstractC1283y, c0731a2, m7231t, hVar);
        if (c0731a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m7220i.values());
            obj3 = m7231t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m7217f(fragment, fragment2, z10, m7220i, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC1283y.mo7255z(obj3, view, arrayList);
            m7237z(abstractC1283y, obj3, obj2, m7220i, hVar.f5593e, hVar.f5594f);
            if (obj != null) {
                abstractC1283y.mo7252u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(viewGroup, new f(abstractC1283y, c0731a, obj3, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: m */
    private static Object m7224m(AbstractC1283y abstractC1283y, ViewGroup viewGroup, View view, C0731a<String, String> c0731a, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f5589a;
        Fragment fragment2 = hVar.f5592d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f5590b;
        Object m7231t = c0731a.isEmpty() ? null : m7231t(abstractC1283y, fragment, fragment2, z10);
        C0731a<String, View> m7220i = m7220i(abstractC1283y, c0731a, m7231t, hVar);
        C0731a<String, View> m7219h = m7219h(abstractC1283y, c0731a, m7231t, hVar);
        if (c0731a.isEmpty()) {
            if (m7220i != null) {
                m7220i.clear();
            }
            if (m7219h != null) {
                m7219h.clear();
            }
            obj3 = null;
        } else {
            m7212a(arrayList, m7220i, c0731a.keySet());
            m7212a(arrayList2, m7219h, c0731a.values());
            obj3 = m7231t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m7217f(fragment, fragment2, z10, m7220i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC1283y.mo7255z(obj3, view, arrayList);
            m7237z(abstractC1283y, obj3, obj2, m7220i, hVar.f5593e, hVar.f5594f);
            Rect rect2 = new Rect();
            View m7230s = m7230s(m7219h, hVar, obj, z10);
            if (m7230s != null) {
                abstractC1283y.mo7252u(obj, rect2);
            }
            rect = rect2;
            view2 = m7230s;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(viewGroup, new e(fragment, fragment2, z10, m7219h, view2, abstractC1283y, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m7225n(ViewGroup viewGroup, h hVar, View view, C0731a<String, String> c0731a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f5589a;
        Fragment fragment2 = hVar.f5592d;
        AbstractC1283y m7221j = m7221j(fragment2, fragment);
        if (m7221j == null) {
            return;
        }
        boolean z10 = hVar.f5590b;
        boolean z11 = hVar.f5593e;
        Object m7228q = m7228q(m7221j, fragment, z10);
        Object m7229r = m7229r(m7221j, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m7223l = m7223l(m7221j, viewGroup, view, c0731a, hVar, arrayList, arrayList2, m7228q, m7229r);
        if (m7228q == null && m7223l == null) {
            obj = m7229r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m7229r;
        }
        ArrayList<View> m7222k = m7222k(m7221j, obj, fragment2, arrayList, view);
        if (m7222k == null || m7222k.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        m7221j.mo7241a(m7228q, view);
        Object m7232u = m7232u(m7221j, m7228q, obj2, m7223l, fragment, hVar.f5590b);
        if (fragment2 != null && m7222k != null && (m7222k.size() > 0 || arrayList.size() > 0)) {
            C0944c c0944c = new C0944c();
            gVar.mo7116b(fragment2, c0944c);
            m7221j.mo7254w(fragment2, m7232u, c0944c, new c(gVar, fragment2, c0944c));
        }
        if (m7232u != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m7221j.mo7251t(m7232u, m7228q, arrayList3, obj2, m7222k, m7223l, arrayList2);
            m7236y(m7221j, viewGroup, fragment, view, arrayList2, m7228q, arrayList3, obj2, m7222k);
            m7221j.m7265x(viewGroup, arrayList2, c0731a);
            m7221j.mo7243c(viewGroup, m7232u);
            m7221j.m7264s(viewGroup, arrayList2, c0731a);
        }
    }

    /* renamed from: o */
    private static void m7226o(ViewGroup viewGroup, h hVar, View view, C0731a<String, String> c0731a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f5589a;
        Fragment fragment2 = hVar.f5592d;
        AbstractC1283y m7221j = m7221j(fragment2, fragment);
        if (m7221j == null) {
            return;
        }
        boolean z10 = hVar.f5590b;
        boolean z11 = hVar.f5593e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m7228q = m7228q(m7221j, fragment, z10);
        Object m7229r = m7229r(m7221j, fragment2, z11);
        Object m7224m = m7224m(m7221j, viewGroup, view, c0731a, hVar, arrayList2, arrayList, m7228q, m7229r);
        if (m7228q == null && m7224m == null) {
            obj = m7229r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m7229r;
        }
        ArrayList<View> m7222k = m7222k(m7221j, obj, fragment2, arrayList2, view);
        ArrayList<View> m7222k2 = m7222k(m7221j, m7228q, fragment, arrayList, view);
        m7210A(m7222k2, 4);
        Object m7232u = m7232u(m7221j, m7228q, obj, m7224m, fragment, z10);
        if (fragment2 != null && m7222k != null && (m7222k.size() > 0 || arrayList2.size() > 0)) {
            C0944c c0944c = new C0944c();
            gVar.mo7116b(fragment2, c0944c);
            m7221j.mo7254w(fragment2, m7232u, c0944c, new a(gVar, fragment2, c0944c));
        }
        if (m7232u != null) {
            m7233v(m7221j, obj, fragment2, m7222k);
            ArrayList<String> m7263o = m7221j.m7263o(arrayList);
            m7221j.mo7251t(m7232u, m7228q, m7222k2, obj, m7222k, m7224m, arrayList);
            m7221j.mo7243c(viewGroup, m7232u);
            m7221j.m7266y(viewGroup, arrayList2, arrayList, m7263o, c0731a);
            m7210A(m7222k2, 0);
            m7221j.mo7239A(m7224m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    private static h m7227p(h hVar, SparseArray<h> sparseArray, int i10) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i10, hVar2);
        return hVar2;
    }

    /* renamed from: q */
    private static Object m7228q(AbstractC1283y abstractC1283y, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return abstractC1283y.mo7245g(z10 ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    /* renamed from: r */
    private static Object m7229r(AbstractC1283y abstractC1283y, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return abstractC1283y.mo7245g(z10 ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    /* renamed from: s */
    static View m7230s(C0731a<String, View> c0731a, h hVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        C1255a c1255a = hVar.f5591c;
        if (obj == null || c0731a == null || (arrayList = c1255a.f5540p) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0731a.get((z10 ? c1255a.f5540p : c1255a.f5541q).get(0));
    }

    /* renamed from: t */
    private static Object m7231t(AbstractC1283y abstractC1283y, Fragment fragment, Fragment fragment2, boolean z10) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return abstractC1283y.mo7240B(abstractC1283y.mo7245g(z10 ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    /* renamed from: u */
    private static Object m7232u(AbstractC1283y abstractC1283y, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        return (obj == null || obj2 == null || fragment == null) ? true : z10 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? abstractC1283y.mo7247n(obj2, obj, obj3) : abstractC1283y.mo7246m(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m7233v(AbstractC1283y abstractC1283y, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            abstractC1283y.mo7250r(obj, fragment.getView(), arrayList);
            ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(fragment.mContainer, new b(arrayList));
        }
    }

    /* renamed from: w */
    private static AbstractC1283y m7234w() {
        try {
            return (AbstractC1283y) C1618e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m7235x(C0731a<String, String> c0731a, C0731a<String, View> c0731a2) {
        for (int size = c0731a.size() - 1; size >= 0; size--) {
            if (!c0731a2.containsKey(c0731a.m3715n(size))) {
                c0731a.mo3713l(size);
            }
        }
    }

    /* renamed from: y */
    private static void m7236y(AbstractC1283y abstractC1283y, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(viewGroup, new d(obj, abstractC1283y, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m7237z(AbstractC1283y abstractC1283y, Object obj, Object obj2, C0731a<String, View> c0731a, boolean z10, C1255a c1255a) {
        ArrayList<String> arrayList = c1255a.f5540p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0731a.get((z10 ? c1255a.f5541q : c1255a.f5540p).get(0));
        abstractC1283y.mo7253v(obj, view);
        if (obj2 != null) {
            abstractC1283y.mo7253v(obj2, view);
        }
    }
}
