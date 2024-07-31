package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import c4.f;
import com.bumptech.glide.manager.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class t {

    /* renamed from: d, reason: collision with root package name */
    private static volatile t f7509d;

    /* renamed from: a, reason: collision with root package name */
    private final c f7510a;

    /* renamed from: b, reason: collision with root package name */
    final Set<c.a> f7511b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f7512c;

    /* loaded from: classes.dex */
    class a implements f.b<ConnectivityManager> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f7513a;

        a(Context context) {
            this.f7513a = context;
        }

        @Override // c4.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f7513a.getSystemService("connectivity");
        }
    }

    /* loaded from: classes.dex */
    class b implements c.a {
        b() {
        }

        @Override // com.bumptech.glide.manager.c.a
        public void a(boolean z10) {
            ArrayList arrayList;
            c4.l.b();
            synchronized (t.this) {
                arrayList = new ArrayList(t.this.f7511b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c.a) it.next()).a(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        void a();

        boolean b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        boolean f7516a;

        /* renamed from: b, reason: collision with root package name */
        final c.a f7517b;

        /* renamed from: c, reason: collision with root package name */
        private final f.b<ConnectivityManager> f7518c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f7519d = new a();

        /* loaded from: classes.dex */
        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.bumptech.glide.manager.t$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0130a implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f7521a;

                RunnableC0130a(boolean z10) {
                    this.f7521a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f7521a);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                c4.l.u(new RunnableC0130a(z10));
            }

            void a(boolean z10) {
                c4.l.b();
                d dVar = d.this;
                boolean z11 = dVar.f7516a;
                dVar.f7516a = z10;
                if (z11 != z10) {
                    dVar.f7517b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b<ConnectivityManager> bVar, c.a aVar) {
            this.f7518c = bVar;
            this.f7517b = aVar;
        }

        @Override // com.bumptech.glide.manager.t.c
        public void a() {
            this.f7518c.get().unregisterNetworkCallback(this.f7519d);
        }

        @Override // com.bumptech.glide.manager.t.c
        public boolean b() {
            this.f7516a = this.f7518c.get().getActiveNetwork() != null;
            try {
                this.f7518c.get().registerDefaultNetworkCallback(this.f7519d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    private t(Context context) {
        this.f7510a = new d(c4.f.a(new a(context)), new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t a(Context context) {
        if (f7509d == null) {
            synchronized (t.class) {
                if (f7509d == null) {
                    f7509d = new t(context.getApplicationContext());
                }
            }
        }
        return f7509d;
    }

    private void b() {
        if (this.f7512c || this.f7511b.isEmpty()) {
            return;
        }
        this.f7512c = this.f7510a.b();
    }

    private void c() {
        if (this.f7512c && this.f7511b.isEmpty()) {
            this.f7510a.a();
            this.f7512c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(c.a aVar) {
        this.f7511b.add(aVar);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void e(c.a aVar) {
        this.f7511b.remove(aVar);
        c();
    }
}
