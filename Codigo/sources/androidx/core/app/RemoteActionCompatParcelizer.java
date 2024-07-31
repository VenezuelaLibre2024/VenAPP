package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3471a = (IconCompat) aVar.v(remoteActionCompat.f3471a, 1);
        remoteActionCompat.f3472b = aVar.l(remoteActionCompat.f3472b, 2);
        remoteActionCompat.f3473c = aVar.l(remoteActionCompat.f3473c, 3);
        remoteActionCompat.f3474d = (PendingIntent) aVar.r(remoteActionCompat.f3474d, 4);
        remoteActionCompat.f3475e = aVar.h(remoteActionCompat.f3475e, 5);
        remoteActionCompat.f3476f = aVar.h(remoteActionCompat.f3476f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f3471a, 1);
        aVar.D(remoteActionCompat.f3472b, 2);
        aVar.D(remoteActionCompat.f3473c, 3);
        aVar.H(remoteActionCompat.f3474d, 4);
        aVar.z(remoteActionCompat.f3475e, 5);
        aVar.z(remoteActionCompat.f3476f, 6);
    }
}
