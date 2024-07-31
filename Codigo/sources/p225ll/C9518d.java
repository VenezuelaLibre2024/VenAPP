package p225ll;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p207kl.InterfaceC9289a;

/* renamed from: ll.d */
/* loaded from: classes3.dex */
public class C9518d implements InterfaceC9289a {

    /* renamed from: a */
    private int f23132a = -1;

    /* renamed from: c */
    private void m28327c(Context context, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
    }

    @Override // p207kl.InterfaceC9289a
    /* renamed from: a */
    public List<String> mo27711a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // p207kl.InterfaceC9289a
    /* renamed from: b */
    public void mo27712b(Context context, ComponentName componentName, int i10) {
        if (this.f23132a == i10) {
            return;
        }
        this.f23132a = i10;
        m28327c(context, i10);
    }
}
