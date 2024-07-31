package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class ApexHomeBadger implements kl.a {
    @Override // kl.a
    public List<String> a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // kl.a
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra(Constants.CLASS, componentName.getClassName());
        ml.a.c(context, intent);
    }
}
