package p185ji;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;

/* renamed from: ji.d */
/* loaded from: classes3.dex */
public class C9070d extends BroadcastReceiver implements EventChannel.StreamHandler {

    /* renamed from: a */
    private final Context f21754a;

    /* renamed from: b */
    private final C9067a f21755b;

    /* renamed from: c */
    private EventChannel.EventSink f21756c;

    /* renamed from: d */
    private final Handler f21757d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private ConnectivityManager.NetworkCallback f21758e;

    /* renamed from: ji.d$a */
    /* loaded from: classes3.dex */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            C9070d.this.m26679g();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            C9070d.this.m26680h("none");
        }
    }

    public C9070d(Context context, C9067a c9067a) {
        this.f21754a = context;
        this.f21755b = c9067a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m26677e() {
        this.f21756c.success(this.f21755b.m26672b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m26678f(String str) {
        this.f21756c.success(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m26679g() {
        this.f21757d.post(new Runnable() { // from class: ji.b
            @Override // java.lang.Runnable
            public final void run() {
                C9070d.this.m26677e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m26680h(final String str) {
        this.f21757d.post(new Runnable() { // from class: ji.c
            @Override // java.lang.Runnable
            public final void run() {
                C9070d.this.m26678f(str);
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        if (this.f21758e != null) {
            this.f21755b.m26671a().unregisterNetworkCallback(this.f21758e);
            this.f21758e = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f21756c = eventSink;
        this.f21758e = new a();
        this.f21755b.m26671a().registerDefaultNetworkCallback(this.f21758e);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink = this.f21756c;
        if (eventSink != null) {
            eventSink.success(this.f21755b.m26672b());
        }
    }
}
