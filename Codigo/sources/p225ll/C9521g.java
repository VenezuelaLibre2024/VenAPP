package p225ll;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p207kl.InterfaceC9289a;

/* renamed from: ll.g */
/* loaded from: classes3.dex */
public class C9521g implements InterfaceC9289a {

    /* renamed from: a */
    private final Uri f23133a = Uri.parse("content://com.android.badge/badge");

    @Override // p207kl.InterfaceC9289a
    /* renamed from: a */
    public List<String> mo27711a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // p207kl.InterfaceC9289a
    /* renamed from: b */
    public void mo27712b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(this.f23133a, "setAppBadgeCount", (String) null, bundle);
    }
}
