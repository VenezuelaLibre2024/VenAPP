package p213l4;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import com.facebook.internal.C4652z;
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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;
import p152i4.C7799e0;
import p152i4.C7824r;
import p213l4.C9386b;
import p213l4.C9392h;
import p232m4.C9540a;
import p232m4.C9541b;
import p232m4.C9542c;
import p232m4.C9545f;
import p303q4.C10267g;
import p450xk.C12524p;

/* renamed from: l4.g */
/* loaded from: classes.dex */
public final class C9391g {

    /* renamed from: f */
    public static final a f22764f = new a(null);

    /* renamed from: g */
    private static final String f22765g = C9391g.class.getCanonicalName();

    /* renamed from: h */
    private static C9391g f22766h;

    /* renamed from: a */
    private final Handler f22767a;

    /* renamed from: b */
    private final Set<Activity> f22768b;

    /* renamed from: c */
    private final Set<c> f22769c;

    /* renamed from: d */
    private HashSet<String> f22770d;

    /* renamed from: e */
    private final HashMap<Integer, HashSet<String>> f22771e;

    /* renamed from: l4.g$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final synchronized C9391g m27954a() {
            C9391g m27945b;
            if (C9391g.m27945b() == null) {
                C9391g.m27947d(new C9391g(null));
            }
            m27945b = C9391g.m27945b();
            if (m27945b == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            }
            return m27945b;
        }

        /* renamed from: b */
        public final Bundle m27955b(C9540a c9540a, View rootView, View hostView) {
            List<C9541b> m28383c;
            c.a aVar;
            List<C9542c> m28390b;
            int i10;
            int i11;
            String simpleName;
            C9540a c9540a2;
            View view;
            String m28424k;
            String m28389a;
            C9322n.m27781e(rootView, "rootView");
            C9322n.m27781e(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (c9540a != null && (m28383c = c9540a.m28383c()) != null) {
                for (C9541b c9541b : m28383c) {
                    if (c9541b.m28392d() != null) {
                        if (c9541b.m28392d().length() > 0) {
                            m28389a = c9541b.m28389a();
                            m28424k = c9541b.m28392d();
                            bundle.putString(m28389a, m28424k);
                            break;
                        }
                    }
                    if (c9541b.m28390b().size() > 0) {
                        if (C9322n.m27777a(c9541b.m28391c(), "relative")) {
                            aVar = c.f22774f;
                            m28390b = c9541b.m28390b();
                            i10 = 0;
                            i11 = -1;
                            simpleName = hostView.getClass().getSimpleName();
                            C9322n.m27780d(simpleName, "hostView.javaClass.simpleName");
                            c9540a2 = c9540a;
                            view = hostView;
                        } else {
                            aVar = c.f22774f;
                            m28390b = c9541b.m28390b();
                            i10 = 0;
                            i11 = -1;
                            simpleName = rootView.getClass().getSimpleName();
                            C9322n.m27780d(simpleName, "rootView.javaClass.simpleName");
                            c9540a2 = c9540a;
                            view = rootView;
                        }
                        for (b bVar : aVar.m27966a(c9540a2, view, m28390b, i10, i11, simpleName)) {
                            if (bVar.m27956a() != null) {
                                C9545f c9545f = C9545f.f23243a;
                                m28424k = C9545f.m28424k(bVar.m27956a());
                                if (m28424k.length() > 0) {
                                    m28389a = c9541b.m28389a();
                                    bundle.putString(m28389a, m28424k);
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

    /* renamed from: l4.g$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final WeakReference<View> f22772a;

        /* renamed from: b */
        private final String f22773b;

        public b(View view, String viewMapKey) {
            C9322n.m27781e(view, "view");
            C9322n.m27781e(viewMapKey, "viewMapKey");
            this.f22772a = new WeakReference<>(view);
            this.f22773b = viewMapKey;
        }

        /* renamed from: a */
        public final View m27956a() {
            WeakReference<View> weakReference = this.f22772a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        /* renamed from: b */
        public final String m27957b() {
            return this.f22773b;
        }
    }

    /* renamed from: l4.g$c */
    /* loaded from: classes.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: f */
        public static final a f22774f = new a(null);

        /* renamed from: a */
        private final WeakReference<View> f22775a;

        /* renamed from: b */
        private List<C9540a> f22776b;

        /* renamed from: c */
        private final Handler f22777c;

        /* renamed from: d */
        private final HashSet<String> f22778d;

        /* renamed from: e */
        private final String f22779e;

        /* renamed from: l4.g$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }

            /* renamed from: b */
            private final List<View> m27964b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        View child = viewGroup.getChildAt(i10);
                        if (child.getVisibility() == 0) {
                            C9322n.m27780d(child, "child");
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
            
                if (kotlin.jvm.internal.C9322n.m27777a(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /* renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private final boolean m27965c(android.view.View r10, p232m4.C9542c r11, int r12) {
                /*
                    Method dump skipped, instructions count: 324
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p213l4.C9391g.c.a.m27965c(android.view.View, m4.c, int):boolean");
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x00d2 A[LOOP:0: B:14:0x00b7->B:16:0x00d2, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00d4 A[EDGE_INSN: B:17:0x00d4->B:18:0x00d4 BREAK  A[LOOP:0: B:14:0x00b7->B:16:0x00d2], SYNTHETIC] */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List<p213l4.C9391g.b> m27966a(p232m4.C9540a r10, android.view.View r11, java.util.List<p232m4.C9542c> r12, int r13, int r14, java.lang.String r15) {
                /*
                    r9 = this;
                    java.lang.String r0 = "path"
                    kotlin.jvm.internal.C9322n.m27781e(r12, r0)
                    java.lang.String r0 = "mapKey"
                    kotlin.jvm.internal.C9322n.m27781e(r15, r0)
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
                    m4.c r1 = (p232m4.C9542c) r1
                    java.lang.String r3 = r1.m28393a()
                    java.lang.String r4 = ".."
                    boolean r3 = kotlin.jvm.internal.C9322n.m27777a(r3, r4)
                    if (r3 == 0) goto L7c
                    android.view.ViewParent r11 = r11.getParent()
                    boolean r14 = r11 instanceof android.view.ViewGroup
                    if (r14 == 0) goto L7b
                    android.view.ViewGroup r11 = (android.view.ViewGroup) r11
                    java.util.List r11 = r9.m27964b(r11)
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
                    java.util.List r1 = r1.m27966a(r2, r3, r4, r5, r6, r7)
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
                    java.lang.String r3 = r1.m28393a()
                    java.lang.String r4 = "."
                    boolean r3 = kotlin.jvm.internal.C9322n.m27777a(r3, r4)
                    if (r3 == 0) goto L91
                    l4.g$b r10 = new l4.g$b
                    r10.<init>(r11, r15)
                    r0.add(r10)
                    return r0
                L91:
                    boolean r14 = r9.m27965c(r11, r1, r14)
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
                    java.util.List r11 = r9.m27964b(r11)
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
                    java.util.List r1 = r1.m27966a(r2, r3, r4, r5, r6, r7)
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
                throw new UnsupportedOperationException("Method not decompiled: p213l4.C9391g.c.a.m27966a(m4.a, android.view.View, java.util.List, int, int, java.lang.String):java.util.List");
            }
        }

        public c(View view, Handler handler, HashSet<String> listenerSet, String activityName) {
            C9322n.m27781e(handler, "handler");
            C9322n.m27781e(listenerSet, "listenerSet");
            C9322n.m27781e(activityName, "activityName");
            this.f22775a = new WeakReference<>(view);
            this.f22777c = handler;
            this.f22778d = listenerSet;
            this.f22779e = activityName;
            handler.postDelayed(this, 200L);
        }

        /* renamed from: a */
        private final void m27958a(b bVar, View view, C9540a c9540a) {
            boolean m41031E;
            if (c9540a == null) {
                return;
            }
            try {
                View m27956a = bVar.m27956a();
                if (m27956a == null) {
                    return;
                }
                View m28414a = C9545f.m28414a(m27956a);
                if (m28414a != null && C9545f.f23243a.m28432p(m27956a, m28414a)) {
                    m27961d(bVar, view, c9540a);
                    return;
                }
                String name = m27956a.getClass().getName();
                C9322n.m27780d(name, "view.javaClass.name");
                m41031E = C12524p.m41031E(name, "com.facebook.react", false, 2, null);
                if (m41031E) {
                    return;
                }
                if (!(m27956a instanceof AdapterView)) {
                    m27959b(bVar, view, c9540a);
                } else if (m27956a instanceof ListView) {
                    m27960c(bVar, view, c9540a);
                }
            } catch (Exception e10) {
                C4634n0 c4634n0 = C4634n0.f8760a;
                C4634n0.m11312j0(C9391g.m27946c(), e10);
            }
        }

        /* renamed from: b */
        private final void m27959b(b bVar, View view, C9540a c9540a) {
            boolean z10;
            View m27956a = bVar.m27956a();
            if (m27956a == null) {
                return;
            }
            String m27957b = bVar.m27957b();
            View.OnClickListener m28420g = C9545f.m28420g(m27956a);
            if (m28420g instanceof C9386b.a) {
                if (m28420g == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                }
                if (((C9386b.a) m28420g).m27927a()) {
                    z10 = true;
                    if (!this.f22778d.contains(m27957b) || z10) {
                    }
                    m27956a.setOnClickListener(C9386b.m27922b(c9540a, view, m27956a));
                    this.f22778d.add(m27957b);
                    return;
                }
            }
            z10 = false;
            if (this.f22778d.contains(m27957b)) {
            }
        }

        /* renamed from: c */
        private final void m27960c(b bVar, View view, C9540a c9540a) {
            boolean z10;
            AdapterView adapterView = (AdapterView) bVar.m27956a();
            if (adapterView == null) {
                return;
            }
            String m27957b = bVar.m27957b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            if (onItemClickListener instanceof C9386b.b) {
                if (onItemClickListener == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                }
                if (((C9386b.b) onItemClickListener).m27928a()) {
                    z10 = true;
                    if (!this.f22778d.contains(m27957b) || z10) {
                    }
                    adapterView.setOnItemClickListener(C9386b.m27923c(c9540a, view, adapterView));
                    this.f22778d.add(m27957b);
                    return;
                }
            }
            z10 = false;
            if (this.f22778d.contains(m27957b)) {
            }
        }

        /* renamed from: d */
        private final void m27961d(b bVar, View view, C9540a c9540a) {
            boolean z10;
            View m27956a = bVar.m27956a();
            if (m27956a == null) {
                return;
            }
            String m27957b = bVar.m27957b();
            View.OnTouchListener m28421h = C9545f.m28421h(m27956a);
            if (m28421h instanceof C9392h.a) {
                if (m28421h == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                }
                if (((C9392h.a) m28421h).m27968a()) {
                    z10 = true;
                    if (!this.f22778d.contains(m27957b) || z10) {
                    }
                    m27956a.setOnTouchListener(C9392h.m27967a(c9540a, view, m27956a));
                    this.f22778d.add(m27957b);
                    return;
                }
            }
            z10 = false;
            if (this.f22778d.contains(m27957b)) {
            }
        }

        /* renamed from: e */
        private final void m27962e(C9540a c9540a, View view) {
            if (c9540a == null || view == null) {
                return;
            }
            String m28381a = c9540a.m28381a();
            if ((m28381a == null || m28381a.length() == 0) || C9322n.m27777a(c9540a.m28381a(), this.f22779e)) {
                List<C9542c> m28384d = c9540a.m28384d();
                if (m28384d.size() > 25) {
                    return;
                }
                Iterator<b> it = f22774f.m27966a(c9540a, view, m28384d, 0, -1, this.f22779e).iterator();
                while (it.hasNext()) {
                    m27958a(it.next(), view, c9540a);
                }
            }
        }

        /* renamed from: f */
        private final void m27963f() {
            int size;
            List<C9540a> list = this.f22776b;
            if (list == null || this.f22775a.get() == null || list.size() - 1 < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                m27962e(list.get(i10), this.f22775a.get());
                if (i11 > size) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m27963f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            m27963f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (C0033a.m107d(this)) {
                    return;
                }
                try {
                    C4641r m11447f = C4648v.m11447f(C7799e0.m23861m());
                    if (m11447f != null && m11447f.m11377c()) {
                        List<C9540a> m28387b = C9540a.f23214j.m28387b(m11447f.m11379e());
                        this.f22776b = m28387b;
                        if (m28387b == null || (view = this.f22775a.get()) == null) {
                            return;
                        }
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        m27963f();
                    }
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
            }
        }
    }

    private C9391g() {
        this.f22767a = new Handler(Looper.getMainLooper());
        Set<Activity> newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        C9322n.m27780d(newSetFromMap, "newSetFromMap(WeakHashMap())");
        this.f22768b = newSetFromMap;
        this.f22769c = new LinkedHashSet();
        this.f22770d = new HashSet<>();
        this.f22771e = new HashMap<>();
    }

    public /* synthetic */ C9391g(C9315g c9315g) {
        this();
    }

    /* renamed from: b */
    public static final /* synthetic */ C9391g m27945b() {
        if (C0033a.m107d(C9391g.class)) {
            return null;
        }
        try {
            return f22766h;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9391g.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ String m27946c() {
        if (C0033a.m107d(C9391g.class)) {
            return null;
        }
        try {
            return f22765g;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9391g.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m27947d(C9391g c9391g) {
        if (C0033a.m107d(C9391g.class)) {
            return;
        }
        try {
            f22766h = c9391g;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9391g.class);
        }
    }

    /* renamed from: g */
    private final void m27948g() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            for (Activity activity : this.f22768b) {
                if (activity != null) {
                    View m30748e = C10267g.m30748e(activity);
                    String activityName = activity.getClass().getSimpleName();
                    Handler handler = this.f22767a;
                    HashSet<String> hashSet = this.f22770d;
                    C9322n.m27780d(activityName, "activityName");
                    this.f22769c.add(new c(m30748e, handler, hashSet, activityName));
                }
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: i */
    private final void m27949i() {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                m27948g();
            } else {
                this.f22767a.post(new Runnable() { // from class: l4.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9391g.m27950j(C9391g.this);
                    }
                });
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m27950j(C9391g this$0) {
        if (C0033a.m107d(C9391g.class)) {
            return;
        }
        try {
            C9322n.m27781e(this$0, "this$0");
            this$0.m27948g();
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9391g.class);
        }
    }

    /* renamed from: e */
    public final void m27951e(Activity activity) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(activity, "activity");
            if (C4652z.m11469b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new C7824r("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f22768b.add(activity);
            this.f22770d.clear();
            HashSet<String> hashSet = this.f22771e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f22770d = hashSet;
            }
            m27949i();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: f */
    public final void m27952f(Activity activity) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(activity, "activity");
            this.f22771e.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }

    /* renamed from: h */
    public final void m27953h(Activity activity) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            C9322n.m27781e(activity, "activity");
            if (C4652z.m11469b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new C7824r("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f22768b.remove(activity);
            this.f22769c.clear();
            this.f22771e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f22770d.clone());
            this.f22770d.clear();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
        }
    }
}
