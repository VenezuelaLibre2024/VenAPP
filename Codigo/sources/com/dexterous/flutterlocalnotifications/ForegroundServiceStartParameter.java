package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ForegroundServiceStartParameter implements Serializable {
    public static final String EXTRA = "com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter";
    public final ArrayList<Integer> foregroundServiceTypes;
    public final NotificationDetails notificationData;
    public final int startMode;

    public ForegroundServiceStartParameter(NotificationDetails notificationDetails, int i10, ArrayList<Integer> arrayList) {
        this.notificationData = notificationDetails;
        this.startMode = i10;
        this.foregroundServiceTypes = arrayList;
    }

    public String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.notificationData + ", startMode=" + this.startMode + ", foregroundServiceTypes=" + this.foregroundServiceTypes + '}';
    }
}
