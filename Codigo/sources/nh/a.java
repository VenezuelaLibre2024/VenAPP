package nh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.maru.twitter_login.chrome_custom_tabs.ChromeCustomTabsActivity;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mh.b;

/* loaded from: classes3.dex */
public class a implements MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public static final Map<String, a> f21973d = new HashMap();

    /* renamed from: a */
    public MethodChannel f21974a;

    /* renamed from: b */
    public b f21975b;

    /* renamed from: c */
    public String f21976c = UUID.randomUUID().toString();

    public a(b bVar) {
        this.f21975b = bVar;
        MethodChannel methodChannel = new MethodChannel(bVar.b(), "twitter_login/auth_browser");
        this.f21974a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        f21973d.put(this.f21976c, this);
    }

    public void a() {
        this.f21974a.setMethodCallHandler(null);
        f21973d.remove(this.f21976c);
        this.f21975b = null;
    }

    public void b(Activity activity, String str, String str2, MethodChannel.Result result) {
        Boolean bool;
        if (com.maru.twitter_login.chrome_custom_tabs.a.c(activity)) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str2);
            bundle.putString(FacebookMediationAdapter.KEY_ID, str);
            bundle.putString("managerId", this.f21976c);
            Intent intent = new Intent(activity, (Class<?>) ChromeCustomTabsActivity.class);
            intent.putExtras(bundle);
            activity.startActivity(intent);
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        result.success(bool);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if ("open".equals(methodCall.method)) {
            b(this.f21975b.c(), (String) methodCall.argument(FacebookMediationAdapter.KEY_ID), (String) methodCall.argument("url"), result);
        } else if ("isAvailable".equals(methodCall.method)) {
            result.success(Boolean.valueOf(com.maru.twitter_login.chrome_custom_tabs.a.c(this.f21975b.c())));
        } else {
            result.notImplemented();
        }
    }
}
