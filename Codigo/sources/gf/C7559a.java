package gf;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.internal.C5143i;
import com.google.android.gms.common.api.internal.InterfaceC5147j;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gf.a */
/* loaded from: classes2.dex */
public class C7559a {

    /* renamed from: c */
    private static final C7559a f17863c = new C7559a();

    /* renamed from: a */
    private final Map<Object, a> f17864a = new HashMap();

    /* renamed from: b */
    private final Object f17865b = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gf.a$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final Activity f17866a;

        /* renamed from: b */
        private final Runnable f17867b;

        /* renamed from: c */
        private final Object f17868c;

        public a(Activity activity, Runnable runnable, Object obj) {
            this.f17866a = activity;
            this.f17867b = runnable;
            this.f17868c = obj;
        }

        /* renamed from: a */
        public Activity m22943a() {
            return this.f17866a;
        }

        /* renamed from: b */
        public Object m22944b() {
            return this.f17868c;
        }

        /* renamed from: c */
        public Runnable m22945c() {
            return this.f17867b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.f17868c.equals(this.f17868c) && aVar.f17867b == this.f17867b && aVar.f17866a == this.f17866a;
        }

        public int hashCode() {
            return this.f17868c.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gf.a$b */
    /* loaded from: classes2.dex */
    public static class b extends LifecycleCallback {

        /* renamed from: a */
        private final List<a> f17869a;

        private b(InterfaceC5147j interfaceC5147j) {
            super(interfaceC5147j);
            this.f17869a = new ArrayList();
            this.mLifecycleFragment.mo13078a("StorageOnStopCallback", this);
        }

        /* renamed from: b */
        public static b m22946b(Activity activity) {
            InterfaceC5147j fragment = LifecycleCallback.getFragment(new C5143i(activity));
            b bVar = (b) fragment.mo13079b("StorageOnStopCallback", b.class);
            return bVar == null ? new b(fragment) : bVar;
        }

        /* renamed from: a */
        public void m22947a(a aVar) {
            synchronized (this.f17869a) {
                this.f17869a.add(aVar);
            }
        }

        /* renamed from: c */
        public void m22948c(a aVar) {
            synchronized (this.f17869a) {
                this.f17869a.remove(aVar);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            ArrayList arrayList;
            synchronized (this.f17869a) {
                arrayList = new ArrayList(this.f17869a);
                this.f17869a.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar != null) {
                    Log.d("StorageOnStopCallback", "removing subscription from activity.");
                    aVar.m22945c().run();
                    C7559a.m22940a().m22941b(aVar.m22944b());
                }
            }
        }
    }

    private C7559a() {
    }

    /* renamed from: a */
    public static C7559a m22940a() {
        return f17863c;
    }

    /* renamed from: b */
    public void m22941b(Object obj) {
        synchronized (this.f17865b) {
            a aVar = this.f17864a.get(obj);
            if (aVar != null) {
                b.m22946b(aVar.m22943a()).m22948c(aVar);
            }
        }
    }

    /* renamed from: c */
    public void m22942c(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.f17865b) {
            a aVar = new a(activity, runnable, obj);
            b.m22946b(activity).m22947a(aVar);
            this.f17864a.put(obj, aVar);
        }
    }
}
