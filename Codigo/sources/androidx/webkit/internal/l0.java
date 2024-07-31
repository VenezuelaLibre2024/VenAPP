package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* loaded from: classes.dex */
public class l0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ServiceInfo a(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PackageManager.ComponentInfoFlags b(long j10) {
        return PackageManager.ComponentInfoFlags.of(j10);
    }
}
