package g4;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import androidx.core.os.h;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    private MethodChannel f15766a;

    /* renamed from: b, reason: collision with root package name */
    private Context f15767b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g4.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0257a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15768a;

        RunnableC0257a(String str) {
            this.f15768a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((LocaleManager) a.this.f15767b.getSystemService(LocaleManager.class)).setApplicationLocales(LocaleList.forLanguageTags(this.f15768a));
        }
    }

    private String b() {
        return c(Locale.getDefault());
    }

    private String c(Locale locale) {
        return locale.toLanguageTag();
    }

    private List<String> d() {
        ArrayList arrayList = new ArrayList();
        h d10 = h.d();
        for (int i10 = 0; i10 < d10.g(); i10++) {
            arrayList.add(c(d10.c(i10)));
        }
        return arrayList;
    }

    private boolean e() {
        return Build.VERSION.SDK_INT >= 33;
    }

    private boolean f(MethodCall methodCall) {
        new Handler(this.f15767b.getMainLooper()).post(new RunnableC0257a((String) methodCall.argument("locale")));
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f15767b = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "uk.spiralarm.flutter/devicelocale");
        this.f15766a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f15766a.setMethodCallHandler(null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0039. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object obj;
        boolean f10;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1571638722:
                if (str.equals("setLanguagePerApp")) {
                    c10 = 0;
                    break;
                }
                break;
            case -882016924:
                if (str.equals("isLanguagePerAppSettingSupported")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1950510234:
                if (str.equals("preferredLanguages")) {
                    c10 = 2;
                    break;
                }
                break;
            case 2037840179:
                if (str.equals("currentLocale")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (Build.VERSION.SDK_INT < 33) {
                    obj = Boolean.FALSE;
                    result.success(obj);
                    return;
                } else {
                    f10 = f(methodCall);
                    obj = Boolean.valueOf(f10);
                    result.success(obj);
                    return;
                }
            case 1:
                f10 = e();
                obj = Boolean.valueOf(f10);
                result.success(obj);
                return;
            case 2:
                obj = d();
                result.success(obj);
                return;
            case 3:
                obj = b();
                result.success(obj);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
