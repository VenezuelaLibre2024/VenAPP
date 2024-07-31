package com.google.android.gms.location;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.location.g */
/* loaded from: classes2.dex */
public interface InterfaceC5373g {
    Task<Location> getLastLocation();

    Task<Void> removeLocationUpdates(AbstractC5385m abstractC5385m);

    Task<Void> requestLocationUpdates(LocationRequest locationRequest, AbstractC5385m abstractC5385m, Looper looper);
}
