package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.collection.C0731a;
import androidx.fragment.app.AbstractC1272n;
import androidx.fragment.app.AbstractC1280v;
import androidx.fragment.app.ActivityC1263e;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C2117c;
import com.bumptech.glide.C2119e;
import com.bumptech.glide.ComponentCallbacks2C2116b;
import com.bumptech.glide.ComponentCallbacks2C2125k;
import java.util.HashMap;
import java.util.Map;
import p036c4.C1871l;
import p302q3.C10255u;

/* renamed from: com.bumptech.glide.manager.q */
/* loaded from: classes.dex */
public class C2160q implements Handler.Callback {

    /* renamed from: v */
    private static final b f8462v = new a();

    /* renamed from: a */
    private volatile ComponentCallbacks2C2125k f8463a;

    /* renamed from: d */
    private final Handler f8466d;

    /* renamed from: e */
    private final b f8467e;

    /* renamed from: t */
    private final InterfaceC2154k f8471t;

    /* renamed from: u */
    private final C2157n f8472u;

    /* renamed from: b */
    final Map<FragmentManager, FragmentC2159p> f8464b = new HashMap();

    /* renamed from: c */
    final Map<AbstractC1272n, C2164u> f8465c = new HashMap();

    /* renamed from: f */
    private final C0731a<View, Fragment> f8468f = new C0731a<>();

    /* renamed from: r */
    private final C0731a<View, android.app.Fragment> f8469r = new C0731a<>();

    /* renamed from: s */
    private final Bundle f8470s = new Bundle();

    /* renamed from: com.bumptech.glide.manager.q$a */
    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.C2160q.b
        /* renamed from: a */
        public ComponentCallbacks2C2125k mo10837a(ComponentCallbacks2C2116b componentCallbacks2C2116b, InterfaceC2155l interfaceC2155l, InterfaceC2161r interfaceC2161r, Context context) {
            return new ComponentCallbacks2C2125k(componentCallbacks2C2116b, interfaceC2155l, interfaceC2161r, context);
        }
    }

    /* renamed from: com.bumptech.glide.manager.q$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        ComponentCallbacks2C2125k mo10837a(ComponentCallbacks2C2116b componentCallbacks2C2116b, InterfaceC2155l interfaceC2155l, InterfaceC2161r interfaceC2161r, Context context);
    }

    public C2160q(b bVar, C2119e c2119e) {
        bVar = bVar == null ? f8462v : bVar;
        this.f8467e = bVar;
        this.f8466d = new Handler(Looper.getMainLooper(), this);
        this.f8472u = new C2157n(bVar);
        this.f8471t = m10823b(c2119e);
    }

    /* renamed from: a */
    private static void m10822a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    private static InterfaceC2154k m10823b(C2119e c2119e) {
        return (C10255u.f25441h && C10255u.f25440g) ? c2119e.m10671a(C2117c.d.class) ? new ComponentCallbacks2C2152i() : new C2153j() : new C2150g();
    }

    /* renamed from: c */
    private static Activity m10824c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m10824c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    /* renamed from: d */
    private ComponentCallbacks2C2125k m10825d(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        FragmentC2159p m10827j = m10827j(fragmentManager, fragment);
        ComponentCallbacks2C2125k m10818e = m10827j.m10818e();
        if (m10818e == null) {
            m10818e = this.f8467e.mo10837a(ComponentCallbacks2C2116b.m10641d(context), m10827j.m10817c(), m10827j.m10819f(), context);
            if (z10) {
                m10818e.onStart();
            }
            m10827j.m10821k(m10818e);
        }
        return m10818e;
    }

    /* renamed from: h */
    private ComponentCallbacks2C2125k m10826h(Context context) {
        if (this.f8463a == null) {
            synchronized (this) {
                if (this.f8463a == null) {
                    this.f8463a = this.f8467e.mo10837a(ComponentCallbacks2C2116b.m10641d(context.getApplicationContext()), new C2145b(), new C2151h(), context.getApplicationContext());
                }
            }
        }
        return this.f8463a;
    }

    /* renamed from: j */
    private FragmentC2159p m10827j(FragmentManager fragmentManager, android.app.Fragment fragment) {
        FragmentC2159p fragmentC2159p = this.f8464b.get(fragmentManager);
        if (fragmentC2159p != null) {
            return fragmentC2159p;
        }
        FragmentC2159p fragmentC2159p2 = (FragmentC2159p) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC2159p2 == null) {
            fragmentC2159p2 = new FragmentC2159p();
            fragmentC2159p2.m10820j(fragment);
            this.f8464b.put(fragmentManager, fragmentC2159p2);
            fragmentManager.beginTransaction().add(fragmentC2159p2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f8466d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC2159p2;
    }

    /* renamed from: l */
    private C2164u m10828l(AbstractC1272n abstractC1272n, Fragment fragment) {
        C2164u c2164u = this.f8465c.get(abstractC1272n);
        if (c2164u != null) {
            return c2164u;
        }
        C2164u c2164u2 = (C2164u) abstractC1272n.m7081h0("com.bumptech.glide.manager");
        if (c2164u2 == null) {
            c2164u2 = new C2164u();
            c2164u2.m10865m(fragment);
            this.f8465c.put(abstractC1272n, c2164u2);
            abstractC1272n.m7092m().m7206d(c2164u2, "com.bumptech.glide.manager").mo6842g();
            this.f8466d.obtainMessage(2, abstractC1272n).sendToTarget();
        }
        return c2164u2;
    }

    /* renamed from: m */
    private static boolean m10829m(Context context) {
        Activity m10824c = m10824c(context);
        return m10824c == null || !m10824c.isFinishing();
    }

    /* renamed from: n */
    private boolean m10830n(FragmentManager fragmentManager, boolean z10) {
        FragmentC2159p fragmentC2159p = this.f8464b.get(fragmentManager);
        FragmentC2159p fragmentC2159p2 = (FragmentC2159p) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC2159p2 == fragmentC2159p) {
            return true;
        }
        if (fragmentC2159p2 != null && fragmentC2159p2.m10818e() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + fragmentC2159p2 + " New: " + fragmentC2159p);
        }
        if (z10 || fragmentManager.isDestroyed()) {
            if (Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", fragmentManager.isDestroyed() ? "Parent was destroyed before our Fragment could be added" : "Tried adding Fragment twice and failed twice, giving up!");
            }
            fragmentC2159p.m10817c().m10799c();
            return true;
        }
        FragmentTransaction add = fragmentManager.beginTransaction().add(fragmentC2159p, "com.bumptech.glide.manager");
        if (fragmentC2159p2 != null) {
            add.remove(fragmentC2159p2);
        }
        add.commitAllowingStateLoss();
        this.f8466d.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
        if (Log.isLoggable("RMRetriever", 3)) {
            Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
        }
        return false;
    }

    /* renamed from: o */
    private boolean m10831o(AbstractC1272n abstractC1272n, boolean z10) {
        C2164u c2164u = this.f8465c.get(abstractC1272n);
        C2164u c2164u2 = (C2164u) abstractC1272n.m7081h0("com.bumptech.glide.manager");
        if (c2164u2 == c2164u) {
            return true;
        }
        if (c2164u2 != null && c2164u2.m10864h() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + c2164u2 + " New: " + c2164u);
        }
        if (z10 || abstractC1272n.m7033D0()) {
            if (abstractC1272n.m7033D0()) {
                if (Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                }
            } else if (Log.isLoggable("RMRetriever", 6)) {
                Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            c2164u.m10863f().m10799c();
            return true;
        }
        AbstractC1280v m7206d = abstractC1272n.m7092m().m7206d(c2164u, "com.bumptech.glide.manager");
        if (c2164u2 != null) {
            m7206d.mo6845k(c2164u2);
        }
        m7206d.mo6843h();
        this.f8466d.obtainMessage(2, 1, 0, abstractC1272n).sendToTarget();
        if (Log.isLoggable("RMRetriever", 3)) {
            Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
        }
        return false;
    }

    @Deprecated
    /* renamed from: e */
    public ComponentCallbacks2C2125k m10832e(Activity activity) {
        if (C1871l.m9968q()) {
            return m10833f(activity.getApplicationContext());
        }
        if (activity instanceof ActivityC1263e) {
            return m10834g((ActivityC1263e) activity);
        }
        m10822a(activity);
        this.f8471t.mo10805a(activity);
        return m10825d(activity, activity.getFragmentManager(), null, m10829m(activity));
    }

    /* renamed from: f */
    public ComponentCallbacks2C2125k m10833f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (C1871l.m9969r() && !(context instanceof Application)) {
            if (context instanceof ActivityC1263e) {
                return m10834g((ActivityC1263e) context);
            }
            if (context instanceof Activity) {
                return m10832e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m10833f(contextWrapper.getBaseContext());
                }
            }
        }
        return m10826h(context);
    }

    /* renamed from: g */
    public ComponentCallbacks2C2125k m10834g(ActivityC1263e activityC1263e) {
        if (C1871l.m9968q()) {
            return m10833f(activityC1263e.getApplicationContext());
        }
        m10822a(activityC1263e);
        this.f8471t.mo10805a(activityC1263e);
        boolean m10829m = m10829m(activityC1263e);
        return this.f8472u.m10808b(activityC1263e, ComponentCallbacks2C2116b.m10641d(activityC1263e.getApplicationContext()), activityC1263e.getLifecycle(), activityC1263e.getSupportFragmentManager(), m10829m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Map map;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = message.arg1 == 1;
        int i10 = message.what;
        Object obj3 = null;
        if (i10 == 1) {
            FragmentManager fragmentManager = (FragmentManager) message.obj;
            if (m10830n(fragmentManager, z12)) {
                map = this.f8464b;
                obj2 = fragmentManager;
                obj3 = map.remove(obj2);
                z11 = true;
                obj = obj2;
            }
            obj = null;
            z11 = true;
            z10 = false;
        } else if (i10 != 2) {
            z10 = false;
            obj = null;
        } else {
            AbstractC1272n abstractC1272n = (AbstractC1272n) message.obj;
            if (m10831o(abstractC1272n, z12)) {
                map = this.f8465c;
                obj2 = abstractC1272n;
                obj3 = map.remove(obj2);
                z11 = true;
                obj = obj2;
            }
            obj = null;
            z11 = true;
            z10 = false;
        }
        if (Log.isLoggable("RMRetriever", 5) && z10 && obj3 == null) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: i */
    public FragmentC2159p m10835i(Activity activity) {
        return m10827j(activity.getFragmentManager(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C2164u m10836k(AbstractC1272n abstractC1272n) {
        return m10828l(abstractC1272n, null);
    }
}
