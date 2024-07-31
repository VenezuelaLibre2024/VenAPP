package p143hh;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p143hh.C7740e;

/* renamed from: hh.e */
/* loaded from: classes.dex */
public class C7740e implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: a */
    private MethodChannel f18451a;

    /* renamed from: b */
    private C7736a f18452b;

    /* renamed from: c */
    private HandlerThread f18453c;

    /* renamed from: d */
    private Handler f18454d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hh.e$a */
    /* loaded from: classes.dex */
    public static class a implements MethodChannel.Result {

        /* renamed from: a */
        private final MethodChannel.Result f18455a;

        /* renamed from: b */
        private final Handler f18456b = new Handler(Looper.getMainLooper());

        a(MethodChannel.Result result) {
            this.f18455a = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m23633c(String str, String str2, Object obj) {
            this.f18455a.error(str, str2, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m23634d(Object obj) {
            this.f18455a.success(obj);
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void error(final String str, final String str2, final Object obj) {
            this.f18456b.post(new Runnable() { // from class: hh.c
                @Override // java.lang.Runnable
                public final void run() {
                    C7740e.a.this.m23633c(str, str2, obj);
                }
            });
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void notImplemented() {
            Handler handler = this.f18456b;
            final MethodChannel.Result result = this.f18455a;
            Objects.requireNonNull(result);
            handler.post(new Runnable() { // from class: hh.b
                @Override // java.lang.Runnable
                public final void run() {
                    MethodChannel.Result.this.notImplemented();
                }
            });
        }

        @Override // io.flutter.plugin.common.MethodChannel.Result
        public void success(final Object obj) {
            this.f18456b.post(new Runnable() { // from class: hh.d
                @Override // java.lang.Runnable
                public final void run() {
                    C7740e.a.this.m23634d(obj);
                }
            });
        }
    }

    /* renamed from: hh.e$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        private final MethodCall f18457a;

        /* renamed from: b */
        private final MethodChannel.Result f18458b;

        b(MethodCall methodCall, MethodChannel.Result result) {
            this.f18457a = methodCall;
            this.f18458b = result;
        }

        /* renamed from: a */
        private void m23635a(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            this.f18458b.error("Exception encountered", this.f18457a.method, stringWriter.toString());
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Exception e10;
            MethodChannel.Result result;
            Object m23622n;
            MethodChannel.Result result2;
            char c10 = 0;
            try {
                try {
                    C7740e.this.f18452b.f18438e = (Map) ((Map) this.f18457a.arguments).get("options");
                    C7740e.this.f18452b.m23620h();
                    z10 = C7740e.this.f18452b.m23621i();
                    try {
                        String str = this.f18457a.method;
                        switch (str.hashCode()) {
                            case -1335458389:
                                if (str.equals("delete")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -358737930:
                                if (str.equals("deleteAll")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3496342:
                                if (str.equals("read")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 113399775:
                                if (str.equals("write")) {
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 208013248:
                                if (str.equals("containsKey")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1080375339:
                                if (str.equals("readAll")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        Map<String, String> map = null;
                        if (c10 == 0) {
                            String m23628d = C7740e.this.m23628d(this.f18457a);
                            String m23629e = C7740e.this.m23629e(this.f18457a);
                            if (m23629e == null) {
                                this.f18458b.error("null", null, null);
                                return;
                            } else {
                                C7740e.this.f18452b.m23624p(m23628d, m23629e);
                                result = this.f18458b;
                            }
                        } else if (c10 == 1) {
                            String m23628d2 = C7740e.this.m23628d(this.f18457a);
                            if (C7740e.this.f18452b.m23617c(m23628d2)) {
                                m23622n = C7740e.this.f18452b.m23622n(m23628d2);
                                result2 = this.f18458b;
                                result2.success(m23622n);
                                return;
                            }
                            result = this.f18458b;
                        } else if (c10 == 2) {
                            result = this.f18458b;
                            map = C7740e.this.f18452b.m23623o();
                        } else {
                            if (c10 == 3) {
                                boolean m23617c = C7740e.this.f18452b.m23617c(C7740e.this.m23628d(this.f18457a));
                                result2 = this.f18458b;
                                m23622n = Boolean.valueOf(m23617c);
                                result2.success(m23622n);
                                return;
                            }
                            if (c10 == 4) {
                                C7740e.this.f18452b.m23618e(C7740e.this.m23628d(this.f18457a));
                                result = this.f18458b;
                            } else if (c10 != 5) {
                                this.f18458b.notImplemented();
                                return;
                            } else {
                                C7740e.this.f18452b.m23619f();
                                result = this.f18458b;
                            }
                        }
                        result.success(map);
                    } catch (Exception e11) {
                        e10 = e11;
                        if (z10) {
                            try {
                                C7740e.this.f18452b.m23619f();
                                this.f18458b.success("Data has been reset");
                                return;
                            } catch (Exception e12) {
                                e10 = e12;
                                m23635a(e10);
                            }
                        }
                        m23635a(e10);
                    }
                } catch (Exception e13) {
                    z10 = false;
                    e10 = e13;
                }
            } catch (FileNotFoundException e14) {
                Log.i("Creating sharedPrefs", e14.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public String m23628d(MethodCall methodCall) {
        return this.f18452b.m23616a((String) ((Map) methodCall.arguments).get(Constants.KEY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public String m23629e(MethodCall methodCall) {
        return (String) ((Map) methodCall.arguments).get("value");
    }

    /* renamed from: f */
    public void m23630f(BinaryMessenger binaryMessenger, Context context) {
        try {
            this.f18452b = new C7736a(context, new HashMap());
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f18453c = handlerThread;
            handlerThread.start();
            this.f18454d = new Handler(this.f18453c.getLooper());
            MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.it_nomads.com/flutter_secure_storage");
            this.f18451a = methodChannel;
            methodChannel.setMethodCallHandler(this);
        } catch (Exception e10) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e10);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        m23630f(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.f18451a != null) {
            this.f18453c.quitSafely();
            this.f18453c = null;
            this.f18451a.setMethodCallHandler(null);
            this.f18451a = null;
        }
        this.f18452b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        this.f18454d.post(new b(methodCall, new a(result)));
    }
}
