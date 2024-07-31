package j2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import l2.p;

/* loaded from: classes.dex */
public final class j extends h<h2.b> {

    /* renamed from: f, reason: collision with root package name */
    private final ConnectivityManager f19536f;

    /* renamed from: g, reason: collision with root package name */
    private final a f19537g;

    /* loaded from: classes.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            String str;
            kotlin.jvm.internal.n.e(network, "network");
            kotlin.jvm.internal.n.e(capabilities, "capabilities");
            f2.j e10 = f2.j.e();
            str = k.f19539a;
            e10.a(str, "Network capabilities changed: " + capabilities);
            j jVar = j.this;
            jVar.g(k.c(jVar.f19536f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            kotlin.jvm.internal.n.e(network, "network");
            f2.j e10 = f2.j.e();
            str = k.f19539a;
            e10.a(str, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f19536f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, m2.b taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(taskExecutor, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        kotlin.jvm.internal.n.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f19536f = (ConnectivityManager) systemService;
        this.f19537g = new a();
    }

    @Override // j2.h
    public void h() {
        String str;
        String str2;
        try {
            f2.j e10 = f2.j.e();
            str2 = k.f19539a;
            e10.a(str2, "Registering network callback");
            p.a(this.f19536f, this.f19537g);
        } catch (IllegalArgumentException | SecurityException e11) {
            f2.j e12 = f2.j.e();
            str = k.f19539a;
            e12.d(str, "Received exception while registering network callback", e11);
        }
    }

    @Override // j2.h
    public void i() {
        String str;
        String str2;
        try {
            f2.j e10 = f2.j.e();
            str2 = k.f19539a;
            e10.a(str2, "Unregistering network callback");
            l2.n.c(this.f19536f, this.f19537g);
        } catch (IllegalArgumentException | SecurityException e11) {
            f2.j e12 = f2.j.e();
            str = k.f19539a;
            e12.d(str, "Received exception while unregistering network callback", e11);
        }
    }

    @Override // j2.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public h2.b e() {
        return k.c(this.f19536f);
    }
}
