package p255nh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.maru.twitter_login.chrome_custom_tabs.C6661a;
import com.maru.twitter_login.chrome_custom_tabs.ChromeCustomTabsActivity;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import mh.C9586b;

/* renamed from: nh.a */
/* loaded from: classes3.dex */
public class C9718a implements MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public static final Map<String, C9718a> f23906d = new HashMap();

    /* renamed from: a */
    public MethodChannel f23907a;

    /* renamed from: b */
    public C9586b f23908b;

    /* renamed from: c */
    public String f23909c = UUID.randomUUID().toString();

    public C9718a(C9586b c9586b) {
        this.f23908b = c9586b;
        MethodChannel methodChannel = new MethodChannel(c9586b.m28559b(), "twitter_login/auth_browser");
        this.f23907a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        f23906d.put(this.f23909c, this);
    }

    /* renamed from: a */
    public void m29147a() {
        this.f23907a.setMethodCallHandler(null);
        f23906d.remove(this.f23909c);
        this.f23908b = null;
    }

    /* renamed from: b */
    public void m29148b(Activity activity, String str, String str2, MethodChannel.Result result) {
        Boolean bool;
        if (C6661a.m19487c(activity)) {
            Bundle bundle = new Bundle();
            bundle.putString("url", str2);
            bundle.putString(FacebookMediationAdapter.KEY_ID, str);
            bundle.putString("managerId", this.f23909c);
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
            m29148b(this.f23908b.m28560c(), (String) methodCall.argument(FacebookMediationAdapter.KEY_ID), (String) methodCall.argument("url"), result);
        } else if ("isAvailable".equals(methodCall.method)) {
            result.success(Boolean.valueOf(C6661a.m19487c(this.f23908b.m28560c())));
        } else {
            result.notImplemented();
        }
    }
}
