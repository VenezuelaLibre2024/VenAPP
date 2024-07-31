package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.v0;
import androidx.core.view.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f4798a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    static final y f4799b = new x();

    /* renamed from: c, reason: collision with root package name */
    static final y f4800c = w();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f4801a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f4802b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f4803c;

        a(g gVar, Fragment fragment, androidx.core.os.c cVar) {
            this.f4801a = gVar;
            this.f4802b = fragment;
            this.f4803c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4801a.a(this.f4802b, this.f4803c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f4804a;

        b(ArrayList arrayList) {
            this.f4804a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.A(this.f4804a, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f4805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f4806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f4807c;

        c(g gVar, Fragment fragment, androidx.core.os.c cVar) {
            this.f4805a = gVar;
            this.f4806b = fragment;
            this.f4807c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4805a.a(this.f4806b, this.f4807c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f4808a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f4809b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f4810c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Fragment f4811d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f4812e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f4813f;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ArrayList f4814r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f4815s;

        d(Object obj, y yVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f4808a = obj;
            this.f4809b = yVar;
            this.f4810c = view;
            this.f4811d = fragment;
            this.f4812e = arrayList;
            this.f4813f = arrayList2;
            this.f4814r = arrayList3;
            this.f4815s = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f4808a;
            if (obj != null) {
                this.f4809b.p(obj, this.f4810c);
                this.f4813f.addAll(w.k(this.f4809b, this.f4808a, this.f4811d, this.f4812e, this.f4810c));
            }
            if (this.f4814r != null) {
                if (this.f4815s != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f4810c);
                    this.f4809b.q(this.f4815s, this.f4814r, arrayList);
                }
                this.f4814r.clear();
                this.f4814r.add(this.f4810c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f4816a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f4817b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f4818c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f4819d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ View f4820e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ y f4821f;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Rect f4822r;

        e(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a aVar, View view, y yVar, Rect rect) {
            this.f4816a = fragment;
            this.f4817b = fragment2;
            this.f4818c = z10;
            this.f4819d = aVar;
            this.f4820e = view;
            this.f4821f = yVar;
            this.f4822r = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f4816a, this.f4817b, this.f4818c, this.f4819d, false);
            View view = this.f4820e;
            if (view != null) {
                this.f4821f.k(view, this.f4822r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ y f4823a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.collection.a f4824b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f4825c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ h f4826d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f4827e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f4828f;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Fragment f4829r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Fragment f4830s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f4831t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ArrayList f4832u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ Object f4833v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Rect f4834w;

        f(y yVar, androidx.collection.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f4823a = yVar;
            this.f4824b = aVar;
            this.f4825c = obj;
            this.f4826d = hVar;
            this.f4827e = arrayList;
            this.f4828f = view;
            this.f4829r = fragment;
            this.f4830s = fragment2;
            this.f4831t = z10;
            this.f4832u = arrayList2;
            this.f4833v = obj2;
            this.f4834w = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.collection.a<String, View> h10 = w.h(this.f4823a, this.f4824b, this.f4825c, this.f4826d);
            if (h10 != null) {
                this.f4827e.addAll(h10.values());
                this.f4827e.add(this.f4828f);
            }
            w.f(this.f4829r, this.f4830s, this.f4831t, h10, false);
            Object obj = this.f4825c;
            if (obj != null) {
                this.f4823a.A(obj, this.f4832u, this.f4827e);
                View s10 = w.s(h10, this.f4826d, this.f4833v, this.f4831t);
                if (s10 != null) {
                    this.f4823a.k(s10, this.f4834w);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        void a(Fragment fragment, androidx.core.os.c cVar);

        void b(Fragment fragment, androidx.core.os.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f4835a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4836b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f4837c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f4838d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4839e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f4840f;

        h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void A(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B(Context context, androidx.fragment.app.g gVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z10, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                e(aVar, sparseArray, z10);
            } else {
                c(aVar, sparseArray, z10);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                androidx.collection.a<String, String> d10 = d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (gVar.d() && (viewGroup = (ViewGroup) gVar.c(keyAt)) != null) {
                    if (z10) {
                        o(viewGroup, hVar, view, d10, gVar2);
                    } else {
                        n(viewGroup, hVar, view, d10, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, androidx.collection.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View n10 = aVar.n(size);
            if (collection.contains(x0.A(n10))) {
                arrayList.add(n10);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.v.a r9, android.util.SparseArray<androidx.fragment.app.w.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.b(androidx.fragment.app.a, androidx.fragment.app.v$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z10) {
        int size = aVar.f4773c.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(aVar, aVar.f4773c.get(i10), sparseArray, false, z10);
        }
    }

    private static androidx.collection.a<String, String> d(int i10, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        androidx.collection.a<String, String> aVar = new androidx.collection.a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i13);
            if (aVar2.u(i10)) {
                boolean booleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f4786p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f4786p;
                        arrayList4 = aVar2.f4787q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f4786p;
                        arrayList3 = aVar2.f4787q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z10) {
        if (aVar.f4541t.n0().d()) {
            for (int size = aVar.f4773c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f4773c.get(size), sparseArray, true, z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Fragment fragment, Fragment fragment2, boolean z10, androidx.collection.a<String, View> aVar, boolean z11) {
        if (z10) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    private static boolean g(y yVar, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!yVar.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static androidx.collection.a<String, View> h(y yVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f4835a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        yVar.j(aVar2, view);
        androidx.fragment.app.a aVar3 = hVar.f4837c;
        if (hVar.f4836b) {
            fragment.getExitTransitionCallback();
            arrayList = aVar3.f4786p;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = aVar3.f4787q;
        }
        if (arrayList != null) {
            aVar2.p(arrayList);
            aVar2.p(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static androidx.collection.a<String, View> i(y yVar, androidx.collection.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f4838d;
        androidx.collection.a<String, View> aVar2 = new androidx.collection.a<>();
        yVar.j(aVar2, fragment.requireView());
        androidx.fragment.app.a aVar3 = hVar.f4840f;
        if (hVar.f4839e) {
            fragment.getEnterTransitionCallback();
            arrayList = aVar3.f4787q;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = aVar3.f4786p;
        }
        if (arrayList != null) {
            aVar2.p(arrayList);
        }
        aVar.p(aVar2.keySet());
        return aVar2;
    }

    private static y j(Fragment fragment, Fragment fragment2) {
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
        y yVar = f4799b;
        if (yVar != null && g(yVar, arrayList)) {
            return yVar;
        }
        y yVar2 = f4800c;
        if (yVar2 != null && g(yVar2, arrayList)) {
            return yVar2;
        }
        if (yVar == null && yVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(y yVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            yVar.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        yVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(y yVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object t10;
        androidx.collection.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f4835a;
        Fragment fragment2 = hVar.f4838d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f4836b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            t10 = null;
        } else {
            t10 = t(yVar, fragment, fragment2, z10);
            aVar2 = aVar;
        }
        androidx.collection.a<String, View> i10 = i(yVar, aVar2, t10, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(i10.values());
            obj3 = t10;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            rect = new Rect();
            yVar.z(obj3, view, arrayList);
            z(yVar, obj3, obj2, i10, hVar.f4839e, hVar.f4840f);
            if (obj != null) {
                yVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        v0.a(viewGroup, new f(yVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z10, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(y yVar, ViewGroup viewGroup, View view, androidx.collection.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f4835a;
        Fragment fragment2 = hVar.f4838d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z10 = hVar.f4836b;
        Object t10 = aVar.isEmpty() ? null : t(yVar, fragment, fragment2, z10);
        androidx.collection.a<String, View> i10 = i(yVar, aVar, t10, hVar);
        androidx.collection.a<String, View> h10 = h(yVar, aVar, t10, hVar);
        if (aVar.isEmpty()) {
            if (i10 != null) {
                i10.clear();
            }
            if (h10 != null) {
                h10.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, i10, aVar.keySet());
            a(arrayList2, h10, aVar.values());
            obj3 = t10;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z10, i10, true);
        if (obj3 != null) {
            arrayList2.add(view);
            yVar.z(obj3, view, arrayList);
            z(yVar, obj3, obj2, i10, hVar.f4839e, hVar.f4840f);
            Rect rect2 = new Rect();
            View s10 = s(h10, hVar, obj, z10);
            if (s10 != null) {
                yVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s10;
        } else {
            view2 = null;
            rect = null;
        }
        v0.a(viewGroup, new e(fragment, fragment2, z10, h10, view2, yVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f4835a;
        Fragment fragment2 = hVar.f4838d;
        y j10 = j(fragment2, fragment);
        if (j10 == null) {
            return;
        }
        boolean z10 = hVar.f4836b;
        boolean z11 = hVar.f4839e;
        Object q10 = q(j10, fragment, z10);
        Object r10 = r(j10, fragment2, z11);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object l10 = l(j10, viewGroup, view, aVar, hVar, arrayList, arrayList2, q10, r10);
        if (q10 == null && l10 == null) {
            obj = r10;
            if (obj == null) {
                return;
            }
        } else {
            obj = r10;
        }
        ArrayList<View> k10 = k(j10, obj, fragment2, arrayList, view);
        if (k10 == null || k10.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        j10.a(q10, view);
        Object u10 = u(j10, q10, obj2, l10, fragment, hVar.f4836b);
        if (fragment2 != null && k10 != null && (k10.size() > 0 || arrayList.size() > 0)) {
            androidx.core.os.c cVar = new androidx.core.os.c();
            gVar.b(fragment2, cVar);
            j10.w(fragment2, u10, cVar, new c(gVar, fragment2, cVar));
        }
        if (u10 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            j10.t(u10, q10, arrayList3, obj2, k10, l10, arrayList2);
            y(j10, viewGroup, fragment, view, arrayList2, q10, arrayList3, obj2, k10);
            j10.x(viewGroup, arrayList2, aVar);
            j10.c(viewGroup, u10);
            j10.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, androidx.collection.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f4835a;
        Fragment fragment2 = hVar.f4838d;
        y j10 = j(fragment2, fragment);
        if (j10 == null) {
            return;
        }
        boolean z10 = hVar.f4836b;
        boolean z11 = hVar.f4839e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object q10 = q(j10, fragment, z10);
        Object r10 = r(j10, fragment2, z11);
        Object m10 = m(j10, viewGroup, view, aVar, hVar, arrayList2, arrayList, q10, r10);
        if (q10 == null && m10 == null) {
            obj = r10;
            if (obj == null) {
                return;
            }
        } else {
            obj = r10;
        }
        ArrayList<View> k10 = k(j10, obj, fragment2, arrayList2, view);
        ArrayList<View> k11 = k(j10, q10, fragment, arrayList, view);
        A(k11, 4);
        Object u10 = u(j10, q10, obj, m10, fragment, z10);
        if (fragment2 != null && k10 != null && (k10.size() > 0 || arrayList2.size() > 0)) {
            androidx.core.os.c cVar = new androidx.core.os.c();
            gVar.b(fragment2, cVar);
            j10.w(fragment2, u10, cVar, new a(gVar, fragment2, cVar));
        }
        if (u10 != null) {
            v(j10, obj, fragment2, k10);
            ArrayList<String> o10 = j10.o(arrayList);
            j10.t(u10, q10, k11, obj, k10, m10, arrayList);
            j10.c(viewGroup, u10);
            j10.y(viewGroup, arrayList2, arrayList, o10, aVar);
            A(k11, 0);
            j10.A(m10, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i10) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i10, hVar2);
        return hVar2;
    }

    private static Object q(y yVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z10 ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    private static Object r(y yVar, Fragment fragment, boolean z10) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z10 ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    static View s(androidx.collection.a<String, View> aVar, h hVar, Object obj, boolean z10) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.f4837c;
        if (obj == null || aVar == null || (arrayList = aVar2.f4786p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z10 ? aVar2.f4786p : aVar2.f4787q).get(0));
    }

    private static Object t(y yVar, Fragment fragment, Fragment fragment2, boolean z10) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return yVar.B(yVar.g(z10 ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    private static Object u(y yVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z10) {
        return (obj == null || obj2 == null || fragment == null) ? true : z10 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? yVar.n(obj2, obj, obj3) : yVar.m(obj2, obj, obj3);
    }

    private static void v(y yVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            yVar.r(obj, fragment.getView(), arrayList);
            v0.a(fragment.mContainer, new b(arrayList));
        }
    }

    private static y w() {
        try {
            return (y) b2.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void x(androidx.collection.a<String, String> aVar, androidx.collection.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.n(size))) {
                aVar.l(size);
            }
        }
    }

    private static void y(y yVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        v0.a(viewGroup, new d(obj, yVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(y yVar, Object obj, Object obj2, androidx.collection.a<String, View> aVar, boolean z10, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f4786p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z10 ? aVar2.f4787q : aVar2.f4786p).get(0));
        yVar.v(obj, view);
        if (obj2 != null) {
            yVar.v(obj2, view);
        }
    }
}
