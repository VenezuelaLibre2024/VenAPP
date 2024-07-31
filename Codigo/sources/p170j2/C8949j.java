package p170j2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p128h2.C7612b;
import p211l2.C9362n;
import p211l2.C9364p;
import p230m2.InterfaceC9536b;

/* renamed from: j2.j */
/* loaded from: classes.dex */
public final class C8949j extends AbstractC8947h<C7612b> {

    /* renamed from: f */
    private final ConnectivityManager f21287f;

    /* renamed from: g */
    private final a f21288g;

    /* renamed from: j2.j$a */
    /* loaded from: classes.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            String str;
            C9322n.m27781e(network, "network");
            C9322n.m27781e(capabilities, "capabilities");
            AbstractC7277j m21767e = AbstractC7277j.m21767e();
            str = C8950k.f21290a;
            m21767e.mo21770a(str, "Network capabilities changed: " + capabilities);
            C8949j c8949j = C8949j.this;
            c8949j.m26166g(C8950k.m26172c(c8949j.f21287f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            C9322n.m27781e(network, "network");
            AbstractC7277j m21767e = AbstractC7277j.m21767e();
            str = C8950k.f21290a;
            m21767e.mo21770a(str, "Network connection lost");
            C8949j c8949j = C8949j.this;
            c8949j.m26166g(C8950k.m26172c(c8949j.f21287f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8949j(Context context, InterfaceC9536b taskExecutor) {
        super(context, taskExecutor);
        C9322n.m27781e(context, "context");
        C9322n.m27781e(taskExecutor, "taskExecutor");
        Object systemService = m26164d().getSystemService("connectivity");
        C9322n.m27779c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f21287f = (ConnectivityManager) systemService;
        this.f21288g = new a();
    }

    @Override // p170j2.AbstractC8947h
    /* renamed from: h */
    public void mo26158h() {
        String str;
        String str2;
        try {
            AbstractC7277j m21767e = AbstractC7277j.m21767e();
            str2 = C8950k.f21290a;
            m21767e.mo21770a(str2, "Registering network callback");
            C9364p.m27877a(this.f21287f, this.f21288g);
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC7277j m21767e2 = AbstractC7277j.m21767e();
            str = C8950k.f21290a;
            m21767e2.mo21773d(str, "Received exception while registering network callback", e10);
        }
    }

    @Override // p170j2.AbstractC8947h
    /* renamed from: i */
    public void mo26159i() {
        String str;
        String str2;
        try {
            AbstractC7277j m21767e = AbstractC7277j.m21767e();
            str2 = C8950k.f21290a;
            m21767e.mo21770a(str2, "Unregistering network callback");
            C9362n.m27875c(this.f21287f, this.f21288g);
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC7277j m21767e2 = AbstractC7277j.m21767e();
            str = C8950k.f21290a;
            m21767e2.mo21773d(str, "Received exception while unregistering network callback", e10);
        }
    }

    @Override // p170j2.AbstractC8947h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C7612b mo26151e() {
        return C8950k.m26172c(this.f21287f);
    }
}
