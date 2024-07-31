package l4;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.internal.n0;
import com.facebook.internal.r;
import com.facebook.internal.v;
import com.facebook.internal.z;
import i4.e0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.n;
import l4.b;
import l4.h;
import xk.p;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: f */
    public static final a f20942f = new a(null);

    /* renamed from: g */
    private static final String f20943g = g.class.getCanonicalName();

    /* renamed from: h */
    private static g f20944h;

    /* renamed from: a */
    private final Handler f20945a;

    /* renamed from: b */
    private final Set<Activity> f20946b;

    /* renamed from: c */
    private final Set<c> f20947c;

    /* renamed from: d */
    private HashSet<String> f20948d;

    /* renamed from: e */
    private final HashMap<Integer, HashSet<String>> f20949e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final synchronized g a() {
            g b10;
            if (g.b() == null) {
                g.d(new g(null));
            }
            b10 = g.b();
            if (b10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return b10;
        }

        public final Bundle b(m4.a aVar, View rootView, View hostView) {
            List<m4.b> c10;
            c.a aVar2;
            List<m4.c> b10;
            int i10;
            int i11;
            String simpleName;
            m4.a aVar3;
            View view;
            String k10;
            String a10;
            n.e(rootView, "rootView");
            n.e(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (aVar != null && (c10 = aVar.c()) != null) {
                for (m4.b bVar : c10) {
                    if (bVar.d() != null) {
                        if (bVar.d().length() > 0) {
                            a10 = bVar.a();
                            k10 = bVar.d();
                            bundle.putString(a10, k10);
                            break;
                        }
                    }
                    if (bVar.b().size() > 0) {
                        if (n.a(bVar.c(), "relative")) {
                            aVar2 = c.f20952f;
                            b10 = bVar.b();
                            i10 = 0;
                            i11 = -1;
                            simpleName = hostView.getClass().getSimpleName();
                            n.d(simpleName, "hostView.javaClass.simpleName");
                            aVar3 = aVar;
                            view = hostView;
                        } else {
                            aVar2 = c.f20952f;
                            b10 = bVar.b();
                            i10 = 0;
                            i11 = -1;
                            simpleName = rootView.getClass().getSimpleName();
                            n.d(simpleName, "rootView.javaClass.simpleName");
                            aVar3 = aVar;
                            view = rootView;
                        }
                        for (b bVar2 : aVar2.a(aVar3, view, b10, i10, i11, simpleName)) {
                            if (bVar2.a() != null) {
                                m4.f fVar = m4.f.f21389a;
                                k10 = m4.f.k(bVar2.a());
                                if (k10.length() > 0) {
                                    a10 = bVar.a();
                                    bundle.putString(a10, k10);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final WeakReference<View> f20950a;

        /* renamed from: b */
        private final String f20951b;

        public b(View view, String viewMapKey) {
            n.e(view, "view");
            n.e(viewMapKey, "viewMapKey");
            this.f20950a = new WeakReference<>(view);
            this.f20951b = viewMapKey;
        }

        public final View a() {
            WeakReference<View> weakReference = this.f20950a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public final String b() {
            return this.f20951b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: f */
        public static final a f20952f = new a(null);

        /* renamed from: a */
        private final WeakReference<View> f20953a;

        /* renamed from: b */
        private List<m4.a> f20954b;

        /* renamed from: c */
        private final Handler f20955c;

        /* renamed from: d */
        private final HashSet<String> f20956d;

        /* renamed from: e */
        private final String f20957e;

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            private final List<View> b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View child = viewGroup.getChildAt(i10);
                        if (child.getVisibility() == 0) {
                            n.d(child, "child");
                            arrayList.add(child);
                        }
                        if (i11 >= childCount) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
            
                if (kotlin.jvm.internal.n.a(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L73;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private final boolean c(android.view.View r10, m4.c r11, int r12) {
                /*
                    Method dump skipped, instructions count: 324
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: l4.g.c.a.c(android.view.View, m4.c, int):boolean");
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x00d2 A[LOOP:0: B:14:0x00b7->B:16:0x00d2, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00d4 A[EDGE_INSN: B:17:0x00d4->B:18:0x00d4 BREAK  A[LOOP:0: B:14:0x00b7->B:16:0x00d2], SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List<l4.g.b> a(m4.a r10, android.view.View r11, java.util.List<m4.c> r12, int r13, int r14, java.lang.String r15) {
                /*
                    r9 = this;
                    java.lang.String r0 = "path"
                    kotlin.jvm.internal.n.e(r12, r0)
                    java.lang.String r0 = "mapKey"
                    kotlin.jvm.internal.n.e(r15, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r0.append(r15)
                    r15 = 46
                    r0.append(r15)
                    r0.append(r14)
                    java.lang.String r15 = r0.toString()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    if (r11 != 0) goto L26
                    return r0
                L26:
                    int r1 = r12.size()
                    r2 = 0
                    if (r13 < r1) goto L37
                    l4.g$b r14 = new l4.g$b
                    r14.<init>(r11, r15)
                L32:
                    r0.add(r14)
                    goto La6
                L37:
                    java.lang.Object r1 = r12.get(r13)
                    m4.c r1 = (m4.c) r1
                    java.lang.String r3 = r1.a()
                    java.lang.String r4 = ".."
                    boolean r3 = kotlin.jvm.internal.n.a(r3, r4)
                    if (r3 == 0) goto L7c
                    android.view.ViewParent r11 = r11.getParent()
                    boolean r14 = r11 instanceof android.view.ViewGroup
                    if (r14 == 0) goto L7b
                    android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                    java.util.List r11 = r9.b(r11)
                    int r14 = r11.size()
                    if (r14 <= 0) goto L7b
                    r6 = r2
                L5e:
                    int r8 = r6 + 1
                    java.lang.Object r1 = r11.get(r6)
                    r3 = r1
                    android.view.View r3 = (android.view.View) r3
                    int r5 = r13 + 1
                    r1 = r9
                    r2 = r10
                    r4 = r12
                    r7 = r15
                    java.util.List r1 = r1.a(r2, r3, r4, r5, r6, r7)
                    java.util.Collection r1 = (java.util.Collection) r1
                    r0.addAll(r1)
                    if (r8 < r14) goto L79
                    goto L7b
                L79:
                    r6 = r8
                    goto L5e
                L7b:
                    return r0
                L7c:
                    java.lang.String r3 = r1.a()
                    java.lang.String r4 = "."
                    boolean r3 = kotlin.jvm.internal.n.a(r3, r4)
                    if (r3 == 0) goto L91
                    l4.g$b r10 = new l4.g$b
                    r10.<init>(r11, r15)
                    r0.add(r10)
                    return r0
                L91:
                    boolean r14 = r9.c(r11, r1, r14)
                    if (r14 != 0) goto L98
                    return r0
                L98:
                    int r14 = r12.size()
                    int r14 = r14 + (-1)
                    if (r13 != r14) goto La6
                    l4.g$b r14 = new l4.g$b
                    r14.<init>(r11, r15)
                    goto L32
                La6:
                    boolean r14 = r11 instanceof android.view.ViewGroup
                    if (r14 == 0) goto Ld4
                    android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                    java.util.List r11 = r9.b(r11)
                    int r14 = r11.size()
                    if (r14 <= 0) goto Ld4
                    r6 = r2
                Lb7:
                    int r8 = r6 + 1
                    java.lang.Object r1 = r11.get(r6)
                    r3 = r1
                    android.view.View r3 = (android.view.View) r3
                    int r5 = r13 + 1
                    r1 = r9
                    r2 = r10
                    r4 = r12
                    r7 = r15
                    java.util.List r1 = r1.a(r2, r3, r4, r5, r6, r7)
                    java.util.Collection r1 = (java.util.Collection) r1
                    r0.addAll(r1)
                    if (r8 < r14) goto Ld2
                    goto Ld4
                Ld2:
                    r6 = r8
                    goto Lb7
                Ld4:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: l4.g.c.a.a(m4.a, android.view.View, java.util.List, int, int, java.lang.String):java.util.List");
            }
        }

        public c(View view, Handler handler, HashSet<String> listenerSet, String activityName) {
            n.e(handler, "handler");
            n.e(listenerSet, "listenerSet");
            n.e(activityName, "activityName");
            this.f20953a = new WeakReference<>(view);
            this.f20955c = handler;
            this.f20956d = listenerSet;
            this.f20957e = activityName;
            handler.postDelayed(this, 200L);
        }

        private final void a(b bVar, View view, m4.a aVar) {
            boolean E;
            if (aVar == null) {
                return;
            }
            try {
                View a10 = bVar.a();
                if (a10 == null) {
                    return;
                }
                View a11 = m4.f.a(a10);
                if (a11 != null && m4.f.f21389a.p(a10, a11)) {
                    d(bVar, view, aVar);
                    return;
                }
                String name = a10.getClass().getName();
                n.d(name, "view.javaClass.name");
                E = p.E(name, "com.facebook.react", false, 2, null);
                if (E) {
                    return;
                }
                if (!(a10 instanceof AdapterView)) {
                    b(bVar, view, aVar);
                } else if (a10 instanceof ListView) {
                    c(bVar, view, aVar);
                }
            } catch (Exception e10) {
                n0 n0Var = n0.f7780a;
                n0.j0(g.c(), e10);
            }
        }

        private final void b(b bVar, View view, m4.a aVar) {
            boolean z10;
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            String b10 = bVar.b();
            View.OnClickListener g10 = m4.f.g(a10);
            if (g10 instanceof b.a) {
                if (g10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((b.a) g10).a()) {
                    z10 = true;
                    if (!this.f20956d.contains(b10) || z10) {
                    }
                    a10.setOnClickListener(l4.b.b(aVar, view, a10));
                    this.f20956d.add(b10);
                    return;
                }
            }
            z10 = false;
            if (this.f20956d.contains(b10)) {
            }
        }

        private final void c(b bVar, View view, m4.a aVar) {
            boolean z10;
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            String b10 = bVar.b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof b.C0328b) {
                if (onItemClickListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                if (((b.C0328b) onItemClickListener).a()) {
                    z10 = true;
                    if (!this.f20956d.contains(b10) || z10) {
                    }
                    adapterView.setOnItemClickListener(l4.b.c(aVar, view, adapterView));
                    this.f20956d.add(b10);
                    return;
                }
            }
            z10 = false;
            if (this.f20956d.contains(b10)) {
            }
        }

        private final void d(b bVar, View view, m4.a aVar) {
            boolean z10;
            View a10 = bVar.a();
            if (a10 == null) {
                return;
            }
            String b10 = bVar.b();
            View.OnTouchListener h10 = m4.f.h(a10);
            if (h10 instanceof h.a) {
                if (h10 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((h.a) h10).a()) {
                    z10 = true;
                    if (!this.f20956d.contains(b10) || z10) {
                    }
                    a10.setOnTouchListener(h.a(aVar, view, a10));
                    this.f20956d.add(b10);
                    return;
                }
            }
            z10 = false;
            if (this.f20956d.contains(b10)) {
            }
        }

        private final void e(m4.a aVar, View view) {
            if (aVar == null || view == null) {
                return;
            }
            String a10 = aVar.a();
            if ((a10 == null || a10.length() == 0) || n.a(aVar.a(), this.f20957e)) {
                List<m4.c> d10 = aVar.d();
                if (d10.size() > 25) {
                    return;
                }
                Iterator<b> it = f20952f.a(aVar, view, d10, 0, -1, this.f20957e).iterator();
                while (it.hasNext()) {
                    a(it.next(), view, aVar);
                }
            }
        }

        private final void f() {
            int size;
            List<m4.a> list = this.f20954b;
            if (list == null || this.f20953a.get() == null || list.size() - 1 < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                e(list.get(i10), this.f20953a.get());
                if (i11 > size) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (a5.a.d(this)) {
                return;
            }
            try {
                if (a5.a.d(this)) {
                    return;
                }
                try {
                    r f10 = v.f(e0.m());
                    if (f10 != null && f10.c()) {
                        List<m4.a> b10 = m4.a.f21361j.b(f10.e());
                        this.f20954b = b10;
                        if (b10 == null || (view = this.f20953a.get()) == null) {
                            return;
                        }
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        f();
                    }
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
            }
        }
    }

    private g() {
        this.f20945a = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        n.d(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f20946b = newSetFromMap;
        this.f20947c = new LinkedHashSet();
        this.f20948d = new HashSet<>();
        this.f20949e = new HashMap<>();
    }

    public /* synthetic */ g(kotlin.jvm.internal.g gVar) {
        this();
    }

    public static final /* synthetic */ g b() {
        if (a5.a.d(g.class)) {
            return null;
        }
        try {
            return f20944h;
        } catch (Throwable th2) {
            a5.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (a5.a.d(g.class)) {
            return null;
        }
        try {
            return f20943g;
        } catch (Throwable th2) {
            a5.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (a5.a.d(g.class)) {
            return;
        }
        try {
            f20944h = gVar;
        } catch (Throwable th2) {
            a5.a.b(th2, g.class);
        }
    }

    private final void g() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            for (Activity activity : this.f20946b) {
                if (activity != null) {
                    View e10 = q4.g.e(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.f20945a;
                    HashSet<String> hashSet = this.f20948d;
                    n.d(activityName, "activityName");
                    this.f20947c.add(new c(e10, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    private final void i() {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                g();
            } else {
                this.f20945a.post(new Runnable() { // from class: l4.f
                    public /* synthetic */ f() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        g.j(g.this);
                    }
                });
            }
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public static final void j(g this$0) {
        if (a5.a.d(g.class)) {
            return;
        }
        try {
            n.e(this$0, "this$0");
            this$0.g();
        } catch (Throwable th2) {
            a5.a.b(th2, g.class);
        }
    }

    public final void e(Activity activity) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            n.e(activity, "activity");
            if (z.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new i4.r("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f20946b.add(activity);
            this.f20948d.clear();
            HashSet<String> hashSet = this.f20949e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f20948d = hashSet;
            }
            i();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void f(Activity activity) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            n.e(activity, "activity");
            this.f20949e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }

    public final void h(Activity activity) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            n.e(activity, "activity");
            if (z.b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new i4.r("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f20946b.remove(activity);
            this.f20947c.clear();
            this.f20949e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f20948d.clone());
            this.f20948d.clear();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
        }
    }
}
