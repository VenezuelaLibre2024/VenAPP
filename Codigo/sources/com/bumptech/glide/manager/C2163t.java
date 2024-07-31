package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import com.bumptech.glide.manager.InterfaceC2146c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p036c4.C1865f;
import p036c4.C1871l;

/* renamed from: com.bumptech.glide.manager.t */
/* loaded from: classes.dex */
final class C2163t {

    /* renamed from: d */
    private static volatile C2163t f8476d;

    /* renamed from: a */
    private final c f8477a;

    /* renamed from: b */
    final Set<InterfaceC2146c.a> f8478b = new HashSet();

    /* renamed from: c */
    private boolean f8479c;

    /* renamed from: com.bumptech.glide.manager.t$a */
    /* loaded from: classes.dex */
    class a implements C1865f.b<ConnectivityManager> {

        /* renamed from: a */
        final /* synthetic */ Context f8480a;

        a(Context context) {
            this.f8480a = context;
        }

        @Override // p036c4.C1865f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f8480a.getSystemService("connectivity");
        }
    }

    /* renamed from: com.bumptech.glide.manager.t$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC2146c.a {
        b() {
        }

        @Override // com.bumptech.glide.manager.InterfaceC2146c.a
        /* renamed from: a */
        public void mo10736a(boolean z10) {
            ArrayList arrayList;
            C1871l.m9953b();
            synchronized (C2163t.this) {
                arrayList = new ArrayList(C2163t.this.f8478b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC2146c.a) it.next()).mo10736a(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.manager.t$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo10851a();

        /* renamed from: b */
        boolean mo10852b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.manager.t$d */
    /* loaded from: classes.dex */
    public static final class d implements c {

        /* renamed from: a */
        boolean f8483a;

        /* renamed from: b */
        final InterfaceC2146c.a f8484b;

        /* renamed from: c */
        private final C1865f.b<ConnectivityManager> f8485c;

        /* renamed from: d */
        private final ConnectivityManager.NetworkCallback f8486d = new a();

        /* renamed from: com.bumptech.glide.manager.t$d$a */
        /* loaded from: classes.dex */
        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.bumptech.glide.manager.t$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC13178a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ boolean f8488a;

                RunnableC13178a(boolean z10) {
                    this.f8488a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m10854a(this.f8488a);
                }
            }

            a() {
            }

            /* renamed from: b */
            private void m10853b(boolean z10) {
                C1871l.m9972u(new RunnableC13178a(z10));
            }

            /* renamed from: a */
            void m10854a(boolean z10) {
                C1871l.m9953b();
                d dVar = d.this;
                boolean z11 = dVar.f8483a;
                dVar.f8483a = z10;
                if (z11 != z10) {
                    dVar.f8484b.mo10736a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m10853b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m10853b(false);
            }
        }

        d(C1865f.b<ConnectivityManager> bVar, InterfaceC2146c.a aVar) {
            this.f8485c = bVar;
            this.f8484b = aVar;
        }

        @Override // com.bumptech.glide.manager.C2163t.c
        /* renamed from: a */
        public void mo10851a() {
            this.f8485c.get().unregisterNetworkCallback(this.f8486d);
        }

        @Override // com.bumptech.glide.manager.C2163t.c
        /* renamed from: b */
        public boolean mo10852b() {
            this.f8483a = this.f8485c.get().getActiveNetwork() != null;
            try {
                this.f8485c.get().registerDefaultNetworkCallback(this.f8486d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    private C2163t(Context context) {
        this.f8477a = new d(C1865f.m9932a(new a(context)), new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2163t m10845a(Context context) {
        if (f8476d == null) {
            synchronized (C2163t.class) {
                if (f8476d == null) {
                    f8476d = new C2163t(context.getApplicationContext());
                }
            }
        }
        return f8476d;
    }

    /* renamed from: b */
    private void m10846b() {
        if (this.f8479c || this.f8478b.isEmpty()) {
            return;
        }
        this.f8479c = this.f8477a.mo10852b();
    }

    /* renamed from: c */
    private void m10847c() {
        if (this.f8479c && this.f8478b.isEmpty()) {
            this.f8477a.mo10851a();
            this.f8479c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void m10848d(InterfaceC2146c.a aVar) {
        this.f8478b.add(aVar);
        m10846b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void m10849e(InterfaceC2146c.a aVar) {
        this.f8478b.remove(aVar);
        m10847c();
    }
}
