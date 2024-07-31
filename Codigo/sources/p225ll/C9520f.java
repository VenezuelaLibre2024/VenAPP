package p225ll;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p207kl.InterfaceC9289a;

/* renamed from: ll.f */
/* loaded from: classes3.dex */
public class C9520f implements InterfaceC9289a {
    @Override // p207kl.InterfaceC9289a
    /* renamed from: a */
    public List<String> mo27711a() {
        return new ArrayList(0);
    }

    @Override // p207kl.InterfaceC9289a
    /* renamed from: b */
    public void mo27712b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", (String) null, bundle);
    }
}
