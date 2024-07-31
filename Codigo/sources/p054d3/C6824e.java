package p054d3;

import android.content.Context;
import androidx.lifecycle.LiveData;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p074e3.C7119a;
import p074e3.C7121c;
import p074e3.InterfaceC7120b;
import p094f2.AbstractC7287t;
import p094f2.C7286s;

/* renamed from: d3.e */
/* loaded from: classes.dex */
public class C6824e implements FlutterPlugin, InterfaceC7120b {

    /* renamed from: a */
    private MethodChannel f15069a;

    /* renamed from: b */
    private C6835p f15070b;

    /* renamed from: c */
    private C7121c f15071c;

    /* renamed from: d */
    private EventChannel f15072d;

    /* renamed from: f */
    private EventChannel f15074f;

    /* renamed from: s */
    private LiveData<List<C7286s>> f15076s;

    /* renamed from: e */
    private final C7119a<Map<String, Object>> f15073e = new C7119a<>();

    /* renamed from: r */
    private final C7119a<Map<String, Object>> f15075r = new C7119a<>();

    /* renamed from: f */
    private void m19716f(Context context, BinaryMessenger binaryMessenger) {
        int m19714a = C6823d.m19714a(context);
        this.f15069a = new MethodChannel(binaryMessenger, "flutter_uploader");
        this.f15070b = new C6835p(context, m19714a, this);
        this.f15071c = new C7121c(this);
        LiveData<List<C7286s>> mo8683f = AbstractC7287t.m21795e(context).mo8683f("flutter_upload_task");
        this.f15076s = mo8683f;
        mo8683f.observeForever(this.f15071c);
        this.f15069a.setMethodCallHandler(this.f15070b);
        EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter_uploader/events/progress");
        this.f15072d = eventChannel;
        eventChannel.setStreamHandler(this.f15073e);
        EventChannel eventChannel2 = new EventChannel(binaryMessenger, "flutter_uploader/events/result");
        this.f15074f = eventChannel2;
        eventChannel2.setStreamHandler(this.f15075r);
    }

    /* renamed from: g */
    private void m19717g() {
        this.f15069a.setMethodCallHandler(null);
        this.f15069a = null;
        C7121c c7121c = this.f15071c;
        if (c7121c != null) {
            this.f15076s.removeObserver(c7121c);
            this.f15076s = null;
            this.f15071c = null;
        }
        this.f15070b = null;
        this.f15072d.setStreamHandler(null);
        this.f15072d = null;
        this.f15074f.setStreamHandler(null);
        this.f15074f = null;
        this.f15073e.m21009b();
        this.f15075r.m21009b();
    }

    @Override // p074e3.InterfaceC7120b
    /* renamed from: a */
    public void mo19718a() {
        this.f15073e.m21009b();
        this.f15075r.m21009b();
    }

    @Override // p074e3.InterfaceC7120b
    /* renamed from: b */
    public void mo19719b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("taskId", str);
        hashMap.put("status", Integer.valueOf(C6838s.f15105a));
        this.f15075r.m21008a(str, hashMap);
    }

    @Override // p074e3.InterfaceC7120b
    /* renamed from: c */
    public void mo19720c(String str, int i10, int i11, String str2, String str3, String[] strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("taskId", str);
        hashMap.put("status", Integer.valueOf(i10));
        hashMap.put("statusCode", Integer.valueOf(i11));
        hashMap.put("code", str2);
        hashMap.put(Constants.MESSAGE, str3);
        hashMap.put("details", strArr != null ? new ArrayList(Arrays.asList(strArr)) : Collections.emptyList());
        this.f15075r.m21008a(str, hashMap);
    }

    @Override // p074e3.InterfaceC7120b
    /* renamed from: d */
    public void mo19721d(String str, int i10, int i11, String str2, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("taskId", str);
        hashMap.put("status", Integer.valueOf(i10));
        hashMap.put("statusCode", Integer.valueOf(i11));
        hashMap.put(Constants.MESSAGE, str2);
        if (map == null) {
            map = Collections.emptyMap();
        }
        hashMap.put("headers", map);
        this.f15075r.m21008a(str, hashMap);
    }

    @Override // p074e3.InterfaceC7120b
    /* renamed from: e */
    public void mo19722e(String str, int i10, int i11) {
        HashMap hashMap = new HashMap();
        hashMap.put("taskId", str);
        hashMap.put("status", Integer.valueOf(i10));
        hashMap.put("progress", Integer.valueOf(i11));
        this.f15073e.m21008a(str, hashMap);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m19716f(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m19717g();
    }
}
