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
import androidx.fragment.app.Fragment;
import com.bumptech.glide.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class q implements Handler.Callback {

    /* renamed from: v, reason: collision with root package name */
    private static final b f7495v = new a();

    /* renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.k f7496a;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f7499d;

    /* renamed from: e, reason: collision with root package name */
    private final b f7500e;

    /* renamed from: t, reason: collision with root package name */
    private final k f7504t;

    /* renamed from: u, reason: collision with root package name */
    private final n f7505u;

    /* renamed from: b, reason: collision with root package name */
    final Map<FragmentManager, p> f7497b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map<androidx.fragment.app.n, u> f7498c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final androidx.collection.a<View, Fragment> f7501f = new androidx.collection.a<>();

    /* renamed from: r, reason: collision with root package name */
    private final androidx.collection.a<View, android.app.Fragment> f7502r = new androidx.collection.a<>();

    /* renamed from: s, reason: collision with root package name */
    private final Bundle f7503s = new Bundle();

    /* loaded from: classes.dex */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.q.b
        public com.bumptech.glide.k a(com.bumptech.glide.b bVar, l lVar, r rVar, Context context) {
            return new com.bumptech.glide.k(bVar, lVar, rVar, context);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.b bVar, l lVar, r rVar, Context context);
    }

    public q(b bVar, com.bumptech.glide.e eVar) {
        bVar = bVar == null ? f7495v : bVar;
        this.f7500e = bVar;
        this.f7499d = new Handler(Looper.getMainLooper(), this);
        this.f7505u = new n(bVar);
        this.f7504t = b(eVar);
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static k b(com.bumptech.glide.e eVar) {
        return (q3.u.f23473h && q3.u.f23472g) ? eVar.a(c.d.class) ? new i() : new j() : new g();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    private com.bumptech.glide.k d(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        p j10 = j(fragmentManager, fragment);
        com.bumptech.glide.k e10 = j10.e();
        if (e10 == null) {
            e10 = this.f7500e.a(com.bumptech.glide.b.d(context), j10.c(), j10.f(), context);
            if (z10) {
                e10.onStart();
            }
            j10.k(e10);
        }
        return e10;
    }

    private com.bumptech.glide.k h(Context context) {
        if (this.f7496a == null) {
            synchronized (this) {
                if (this.f7496a == null) {
                    this.f7496a = this.f7500e.a(com.bumptech.glide.b.d(context.getApplicationContext()), new com.bumptech.glide.manager.b(), new h(), context.getApplicationContext());
                }
            }
        }
        return this.f7496a;
    }

    private p j(FragmentManager fragmentManager, android.app.Fragment fragment) {
        p pVar = this.f7497b.get(fragmentManager);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = (p) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (pVar2 == null) {
            pVar2 = new p();
            pVar2.j(fragment);
            this.f7497b.put(fragmentManager, pVar2);
            fragmentManager.beginTransaction().add(pVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f7499d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return pVar2;
    }

    private u l(androidx.fragment.app.n nVar, Fragment fragment) {
        u uVar = this.f7498c.get(nVar);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = (u) nVar.h0("com.bumptech.glide.manager");
        if (uVar2 == null) {
            uVar2 = new u();
            uVar2.m(fragment);
            this.f7498c.put(nVar, uVar2);
            nVar.m().d(uVar2, "com.bumptech.glide.manager").g();
            this.f7499d.obtainMessage(2, nVar).sendToTarget();
        }
        return uVar2;
    }

    private static boolean m(Context context) {
        Activity c10 = c(context);
        return c10 == null || !c10.isFinishing();
    }

    private boolean n(FragmentManager fragmentManager, boolean z10) {
        p pVar = this.f7497b.get(fragmentManager);
        p pVar2 = (p) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (pVar2 == pVar) {
            return true;
        }
        if (pVar2 != null && pVar2.e() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + pVar2 + " New: " + pVar);
        }
        if (z10 || fragmentManager.isDestroyed()) {
            if (Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", fragmentManager.isDestroyed() ? "Parent was destroyed before our Fragment could be added" : "Tried adding Fragment twice and failed twice, giving up!");
            }
            pVar.c().c();
            return true;
        }
        FragmentTransaction add = fragmentManager.beginTransaction().add(pVar, "com.bumptech.glide.manager");
        if (pVar2 != null) {
            add.remove(pVar2);
        }
        add.commitAllowingStateLoss();
        this.f7499d.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
        if (Log.isLoggable("RMRetriever", 3)) {
            Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
        }
        return false;
    }

    private boolean o(androidx.fragment.app.n nVar, boolean z10) {
        u uVar = this.f7498c.get(nVar);
        u uVar2 = (u) nVar.h0("com.bumptech.glide.manager");
        if (uVar2 == uVar) {
            return true;
        }
        if (uVar2 != null && uVar2.h() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + uVar2 + " New: " + uVar);
        }
        if (z10 || nVar.D0()) {
            if (nVar.D0()) {
                if (Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                }
            } else if (Log.isLoggable("RMRetriever", 6)) {
                Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            uVar.f().c();
            return true;
        }
        androidx.fragment.app.v d10 = nVar.m().d(uVar, "com.bumptech.glide.manager");
        if (uVar2 != null) {
            d10.k(uVar2);
        }
        d10.h();
        this.f7499d.obtainMessage(2, 1, 0, nVar).sendToTarget();
        if (Log.isLoggable("RMRetriever", 3)) {
            Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
        }
        return false;
    }

    @Deprecated
    public com.bumptech.glide.k e(Activity activity) {
        if (c4.l.q()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof androidx.fragment.app.e) {
            return g((androidx.fragment.app.e) activity);
        }
        a(activity);
        this.f7504t.a(activity);
        return d(activity, activity.getFragmentManager(), null, m(activity));
    }

    public com.bumptech.glide.k f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (c4.l.r() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.e) {
                return g((androidx.fragment.app.e) context);
            }
            if (context instanceof Activity) {
                return e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return f(contextWrapper.getBaseContext());
                }
            }
        }
        return h(context);
    }

    public com.bumptech.glide.k g(androidx.fragment.app.e eVar) {
        if (c4.l.q()) {
            return f(eVar.getApplicationContext());
        }
        a(eVar);
        this.f7504t.a(eVar);
        boolean m10 = m(eVar);
        return this.f7505u.b(eVar, com.bumptech.glide.b.d(eVar.getApplicationContext()), eVar.getLifecycle(), eVar.getSupportFragmentManager(), m10);
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
            if (n(fragmentManager, z12)) {
                map = this.f7497b;
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
            androidx.fragment.app.n nVar = (androidx.fragment.app.n) message.obj;
            if (o(nVar, z12)) {
                map = this.f7498c;
                obj2 = nVar;
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
    public p i(Activity activity) {
        return j(activity.getFragmentManager(), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u k(androidx.fragment.app.n nVar) {
        return l(nVar, null);
    }
}
