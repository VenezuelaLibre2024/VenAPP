package ll;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class a implements kl.a {
    @Override // kl.a
    public List<String> a() {
        return Arrays.asList("com.asus.launcher");
    }

    @Override // kl.a
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i10);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        intent.putExtra("badge_vip_count", 0);
        ml.a.b(context, intent);
    }
}
