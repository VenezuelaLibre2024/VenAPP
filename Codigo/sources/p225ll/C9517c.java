package p225ll;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.List;
import p207kl.InterfaceC9289a;

/* renamed from: ll.c */
/* loaded from: classes3.dex */
public class C9517c implements InterfaceC9289a {
    @Override // p207kl.InterfaceC9289a
    /* renamed from: a */
    public List<String> mo27711a() {
        return Arrays.asList("com.huawei.android.launcher");
    }

    @Override // p207kl.InterfaceC9289a
    /* renamed from: b */
    public void mo27712b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString(Constants.CLASS, componentName.getClassName());
        bundle.putInt("badgenumber", i10);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}
