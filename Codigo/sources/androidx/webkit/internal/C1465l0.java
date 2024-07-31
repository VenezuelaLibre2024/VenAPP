package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* renamed from: androidx.webkit.internal.l0 */
/* loaded from: classes.dex */
public class C1465l0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static ServiceInfo m8381a(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static PackageManager.ComponentInfoFlags m8382b(long j10) {
        return PackageManager.ComponentInfoFlags.of(j10);
    }
}
