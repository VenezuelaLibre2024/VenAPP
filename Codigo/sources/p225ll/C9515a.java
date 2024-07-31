package p225ll;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import ml.C9614a;
import p207kl.InterfaceC9289a;

/* renamed from: ll.a */
/* loaded from: classes3.dex */
public class C9515a implements InterfaceC9289a {
    @Override // p207kl.InterfaceC9289a
    /* renamed from: a */
    public List<String> mo27711a() {
        return Arrays.asList("com.asus.launcher");
    }

    @Override // p207kl.InterfaceC9289a
    /* renamed from: b */
    public void mo27712b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        C9614a.m28611b(context, intent);
    }
}
