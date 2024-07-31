package ll;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class g implements kl.a {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f21280a = Uri.parse("content://com.android.badge/badge");

    @Override // kl.a
    public List<String> a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // kl.a
    public void b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(this.f21280a, "setAppBadgeCount", (String) null, bundle);
    }
}
