package p116g4;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import androidx.core.os.C0949h;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: g4.a */
/* loaded from: classes.dex */
public class C7447a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: a */
    private MethodChannel f17348a;

    /* renamed from: b */
    private Context f17349b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g4.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f17350a;

        a(String str) {
            this.f17350a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((LocaleManager) C7447a.this.f17349b.getSystemService(LocaleManager.class)).setApplicationLocales(LocaleList.forLanguageTags(this.f17350a));
        }
    }

    /* renamed from: b */
    private String m22493b() {
        return m22494c(Locale.getDefault());
    }

    /* renamed from: c */
    private String m22494c(Locale locale) {
        return locale.toLanguageTag();
    }

    /* renamed from: d */
    private List<String> m22495d() {
        ArrayList arrayList = new ArrayList();
        C0949h m4718d = C0949h.m4718d();
        for (int i10 = 0; i10 < m4718d.m4723g(); i10++) {
            arrayList.add(m22494c(m4718d.m4721c(i10)));
        }
        return arrayList;
    }

    /* renamed from: e */
    private boolean m22496e() {
        return Build.VERSION.SDK_INT >= 33;
    }

    /* renamed from: f */
    private boolean m22497f(MethodCall methodCall) {
        new Handler(this.f17349b.getMainLooper()).post(new a((String) methodCall.argument("locale")));
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f17349b = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "uk.spiralarm.flutter/devicelocale");
        this.f17348a = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f17348a.setMethodCallHandler(null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0039. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object obj;
        boolean m22497f;
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
                    m22497f = m22497f(methodCall);
                    obj = Boolean.valueOf(m22497f);
                    result.success(obj);
                    return;
                }
            case 1:
                m22497f = m22496e();
                obj = Boolean.valueOf(m22497f);
                result.success(obj);
                return;
            case 2:
                obj = m22495d();
                result.success(obj);
                return;
            case 3:
                obj = m22493b();
                result.success(obj);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
