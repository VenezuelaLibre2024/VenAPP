package p022b4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p129h3.InterfaceC7622f;

/* renamed from: b4.b */
/* loaded from: classes.dex */
public final class C1654b {

    /* renamed from: a */
    private static final ConcurrentMap<String, InterfaceC7622f> f7038a = new ConcurrentHashMap();

    /* renamed from: a */
    private static PackageInfo m9111a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    /* renamed from: b */
    private static String m9112b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public static InterfaceC7622f m9113c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, InterfaceC7622f> concurrentMap = f7038a;
        InterfaceC7622f interfaceC7622f = concurrentMap.get(packageName);
        if (interfaceC7622f != null) {
            return interfaceC7622f;
        }
        InterfaceC7622f m9114d = m9114d(context);
        InterfaceC7622f putIfAbsent = concurrentMap.putIfAbsent(packageName, m9114d);
        return putIfAbsent == null ? m9114d : putIfAbsent;
    }

    /* renamed from: d */
    private static InterfaceC7622f m9114d(Context context) {
        return new C1656d(m9112b(m9111a(context)));
    }
}
