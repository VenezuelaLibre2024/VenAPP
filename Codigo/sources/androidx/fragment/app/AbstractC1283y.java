package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C0944c;
import androidx.core.view.C1059k2;
import androidx.core.view.C1116x0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1108v0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
public abstract class AbstractC1283y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f5611a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5612b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f5613c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f5614d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f5615e;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f5611a = i10;
            this.f5612b = arrayList;
            this.f5613c = arrayList2;
            this.f5614d = arrayList3;
            this.f5615e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f5611a; i10++) {
                C1116x0.m5283k0((View) this.f5612b.get(i10), (String) this.f5613c.get(i10));
                C1116x0.m5283k0((View) this.f5614d.get(i10), (String) this.f5615e.get(i10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f5617a;

        /* renamed from: b */
        final /* synthetic */ Map f5618b;

        b(ArrayList arrayList, Map map) {
            this.f5617a = arrayList;
            this.f5618b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f5617a.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f5617a.get(i10);
                String m5236A = C1116x0.m5236A(view);
                if (m5236A != null) {
                    C1116x0.m5283k0(view, AbstractC1283y.m7258i(this.f5618b, m5236A));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.y$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ArrayList f5620a;

        /* renamed from: b */
        final /* synthetic */ Map f5621b;

        c(ArrayList arrayList, Map map) {
            this.f5620a = arrayList;
            this.f5621b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f5620a.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) this.f5620a.get(i10);
                C1116x0.m5283k0(view, (String) this.f5621b.get(C1116x0.m5236A(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m7256d(List<View> list, View view) {
        int size = list.size();
        if (m7257h(list, view, size)) {
            return;
        }
        if (C1116x0.m5236A(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!m7257h(list, childAt, size) && C1116x0.m5236A(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m7257h(List<View> list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m7258i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static boolean m7259l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo7239A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo7240B(Object obj);

    /* renamed from: a */
    public abstract void mo7241a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo7242b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo7243c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo7244e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m7260f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z10 = view instanceof ViewGroup;
            View view2 = view;
            if (z10) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean m5013a = C1059k2.m5013a(viewGroup);
                view2 = viewGroup;
                if (!m5013a) {
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        m7260f(arrayList, viewGroup.getChildAt(i10));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    /* renamed from: g */
    public abstract Object mo7245g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m7261j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m5236A = C1116x0.m5236A(view);
            if (m5236A != null) {
                map.put(m5236A, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    m7261j(map, viewGroup.getChildAt(i10));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m7262k(View view, Rect rect) {
        if (C1116x0.m5242G(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: m */
    public abstract Object mo7246m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo7247n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> m7263o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = arrayList.get(i10);
            arrayList2.add(C1116x0.m5236A(view));
            C1116x0.m5283k0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo7248p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo7249q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo7250r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m7264s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(viewGroup, new c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo7251t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo7252u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo7253v(Object obj, View view);

    /* renamed from: w */
    public void mo7254w(Fragment fragment, Object obj, C0944c c0944c, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m7265x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(view, new b(arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m7266y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            String m5236A = C1116x0.m5236A(view2);
            arrayList4.add(m5236A);
            if (m5236A != null) {
                C1116x0.m5283k0(view2, null);
                String str = map.get(m5236A);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i11))) {
                        C1116x0.m5283k0(arrayList2.get(i11), m5236A);
                        break;
                    }
                    i11++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC1108v0.m5218a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo7255z(Object obj, View view, ArrayList<View> arrayList);
}
