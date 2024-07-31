package d3;

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

/* loaded from: classes.dex */
public class e implements FlutterPlugin, e3.b {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f13715a;

    /* renamed from: b, reason: collision with root package name */
    private p f13716b;

    /* renamed from: c, reason: collision with root package name */
    private e3.c f13717c;

    /* renamed from: d, reason: collision with root package name */
    private EventChannel f13718d;

    /* renamed from: f, reason: collision with root package name */
    private EventChannel f13720f;

    /* renamed from: s, reason: collision with root package name */
    private LiveData<List<f2.s>> f13722s;

    /* renamed from: e, reason: collision with root package name */
    private final e3.a<Map<String, Object>> f13719e = new e3.a<>();

    /* renamed from: r, reason: collision with root package name */
    private final e3.a<Map<String, Object>> f13721r = new e3.a<>();

    private void f(Context context, BinaryMessenger binaryMessenger) {
        int a10 = d.a(context);
        this.f13715a = new MethodChannel(binaryMessenger, "flutter_uploader");
        this.f13716b = new p(context, a10, this);
        this.f13717c = new e3.c(this);
        LiveData<List<f2.s>> f10 = f2.t.e(context).f("flutter_upload_task");
        this.f13722s = f10;
        f10.observeForever(this.f13717c);
        this.f13715a.setMethodCallHandler(this.f13716b);
        EventChannel eventChannel = new EventChannel(binaryMessenger, "flutter_uploader/events/progress");
        this.f13718d = eventChannel;
        eventChannel.setStreamHandler(this.f13719e);
        EventChannel eventChannel2 = new EventChannel(binaryMessenger, "flutter_uploader/events/result");
        this.f13720f = eventChannel2;
        eventChannel2.setStreamHandler(this.f13721r);
    }

    private void g() {
        this.f13715a.setMethodCallHandler(null);
        this.f13715a = null;
        e3.c cVar = this.f13717c;
        if (cVar != null) {
            this.f13722s.removeObserver(cVar);
            this.f13722s = null;
            this.f13717c = null;
        }
        this.f13716b = null;
        this.f13718d.setStreamHandler(null);
        this.f13718d = null;
        this.f13720f.setStreamHandler(null);
        this.f13720f = null;
        this.f13719e.b();
        this.f13721r.b();
    }

    @Override // e3.b
    public void a() {
        this.f13719e.b();
        this.f13721r.b();
    }

    @Override // e3.b
    public void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("taskId", str);
        hashMap.put("status", Integer.valueOf(s.f13751a));
        this.f13721r.a(str, hashMap);
    }

    @Override // e3.b
    public void c(String str, int i10, int i11, String str2, String str3, String[] strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("taskId", str);
        hashMap.put("status", Integer.valueOf(i10));
        hashMap.put("statusCode", Integer.valueOf(i11));
        hashMap.put("code", str2);
        hashMap.put(Constants.MESSAGE, str3);
        hashMap.put("details", strArr != null ? new ArrayList(Arrays.asList(strArr)) : Collections.emptyList());
        this.f13721r.a(str, hashMap);
    }

    @Override // e3.b
    public void d(String str, int i10, int i11, String str2, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("taskId", str);
        hashMap.put("status", Integer.valueOf(i10));
        hashMap.put("statusCode", Integer.valueOf(i11));
        hashMap.put(Constants.MESSAGE, str2);
        if (map == null) {
            map = Collections.emptyMap();
        }
        hashMap.put("headers", map);
        this.f13721r.a(str, hashMap);
    }

    @Override // e3.b
    public void e(String str, int i10, int i11) {
        HashMap hashMap = new HashMap();
        hashMap.put("taskId", str);
        hashMap.put("status", Integer.valueOf(i10));
        hashMap.put("progress", Integer.valueOf(i11));
        this.f13719e.a(str, hashMap);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        f(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        g();
    }
}
