package com.google.android.gms.location;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface g {
    Task<Location> getLastLocation();

    Task<Void> removeLocationUpdates(m mVar);

    Task<Void> requestLocationUpdates(LocationRequest locationRequest, m mVar, Looper looper);
}
