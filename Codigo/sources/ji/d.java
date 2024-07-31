package ji;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;

/* loaded from: classes3.dex */
public class d extends BroadcastReceiver implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    private final Context f19975a;

    /* renamed from: b, reason: collision with root package name */
    private final ji.a f19976b;

    /* renamed from: c, reason: collision with root package name */
    private EventChannel.EventSink f19977c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f19978d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f19979e;

    /* loaded from: classes3.dex */
    class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            d.this.g();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            d.this.h("none");
        }
    }

    public d(Context context, ji.a aVar) {
        this.f19975a = context;
        this.f19976b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f19977c.success(this.f19976b.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str) {
        this.f19977c.success(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f19978d.post(new Runnable() { // from class: ji.b
            @Override // java.lang.Runnable
            public final void run() {
                d.this.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(final String str) {
        this.f19978d.post(new Runnable() { // from class: ji.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.f(str);
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        if (this.f19979e != null) {
            this.f19976b.a().unregisterNetworkCallback(this.f19979e);
            this.f19979e = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f19977c = eventSink;
        this.f19979e = new a();
        this.f19976b.a().registerDefaultNetworkCallback(this.f19979e);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink = this.f19977c;
        if (eventSink != null) {
            eventSink.success(this.f19976b.b());
        }
    }
}
