package ll;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class d implements kl.a {

    /* renamed from: a, reason: collision with root package name */
    private int f21279a = -1;

    private void c(Context context, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }

    @Override // kl.a
    public List<String> a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // kl.a
    public void b(Context context, ComponentName componentName, int i10) {
        if (this.f21279a == i10) {
            return;
        }
        this.f21279a = i10;
        c(context, i10);
    }
}
