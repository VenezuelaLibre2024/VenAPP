package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import od.f;
import pc.c;
import ye.e;
import ye.h;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ye.c.c());
        arrayList.add(f.g());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "20.4.2"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", new h.a() { // from class: zb.i
            @Override // ye.h.a
            public final String a(Object obj) {
                String e10;
                e10 = FirebaseCommonRegistrar.e((Context) obj);
                return e10;
            }
        }));
        arrayList.add(h.c("android-min-sdk", new h.a() { // from class: zb.j
            @Override // ye.h.a
            public final String a(Object obj) {
                String f10;
                f10 = FirebaseCommonRegistrar.f((Context) obj);
                return f10;
            }
        }));
        arrayList.add(h.c("android-platform", new h.a() { // from class: zb.k
            @Override // ye.h.a
            public final String a(Object obj) {
                String g10;
                g10 = FirebaseCommonRegistrar.g((Context) obj);
                return g10;
            }
        }));
        arrayList.add(h.c("android-installer", new h.a() { // from class: zb.l
            @Override // ye.h.a
            public final String a(Object obj) {
                String h10;
                h10 = FirebaseCommonRegistrar.h((Context) obj);
                return h10;
            }
        }));
        String a10 = e.a();
        if (a10 != null) {
            arrayList.add(h.b("kotlin", a10));
        }
        return arrayList;
    }
}
