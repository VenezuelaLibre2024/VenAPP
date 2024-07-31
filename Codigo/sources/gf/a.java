package gf;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final a f16226c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Object, C0264a> f16227a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Object f16228b = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gf.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0264a {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f16229a;

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f16230b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f16231c;

        public C0264a(Activity activity, Runnable runnable, Object obj) {
            this.f16229a = activity;
            this.f16230b = runnable;
            this.f16231c = obj;
        }

        public Activity a() {
            return this.f16229a;
        }

        public Object b() {
            return this.f16231c;
        }

        public Runnable c() {
            return this.f16230b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0264a)) {
                return false;
            }
            C0264a c0264a = (C0264a) obj;
            return c0264a.f16231c.equals(this.f16231c) && c0264a.f16230b == this.f16230b && c0264a.f16229a == this.f16229a;
        }

        public int hashCode() {
            return this.f16231c.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b extends LifecycleCallback {

        /* renamed from: a, reason: collision with root package name */
        private final List<C0264a> f16232a;

        private b(j jVar) {
            super(jVar);
            this.f16232a = new ArrayList();
            this.mLifecycleFragment.a("StorageOnStopCallback", this);
        }

        public static b b(Activity activity) {
            j fragment = LifecycleCallback.getFragment(new com.google.android.gms.common.api.internal.i(activity));
            b bVar = (b) fragment.b("StorageOnStopCallback", b.class);
            return bVar == null ? new b(fragment) : bVar;
        }

        public void a(C0264a c0264a) {
            synchronized (this.f16232a) {
                this.f16232a.add(c0264a);
            }
        }

        public void c(C0264a c0264a) {
            synchronized (this.f16232a) {
                this.f16232a.remove(c0264a);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            ArrayList arrayList;
            synchronized (this.f16232a) {
                arrayList = new ArrayList(this.f16232a);
                this.f16232a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0264a c0264a = (C0264a) it.next();
                if (c0264a != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    c0264a.c().run();
                    a.a().b(c0264a.b());
                }
            }
        }
    }

    private a() {
    }

    public static a a() {
        return f16226c;
    }

    public void b(Object obj) {
        synchronized (this.f16228b) {
            C0264a c0264a = this.f16227a.get(obj);
            if (c0264a != null) {
                b.b(c0264a.a()).c(c0264a);
            }
        }
    }

    public void c(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.f16228b) {
            C0264a c0264a = new C0264a(activity, runnable, obj);
            b.b(activity).a(c0264a);
            this.f16227a.put(obj, c0264a);
        }
    }
}
