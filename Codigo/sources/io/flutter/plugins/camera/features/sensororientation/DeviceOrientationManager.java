package io.flutter.plugins.camera.features.sensororientation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.view.Display;
import android.view.WindowManager;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugins.camera.DartMessenger;

/* loaded from: classes3.dex */
public class DeviceOrientationManager {
    private static final IntentFilter orientationIntentFilter = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");
    private final Activity activity;
    private BroadcastReceiver broadcastReceiver;
    private final boolean isFrontFacing;
    private PlatformChannel.DeviceOrientation lastOrientation;
    private final DartMessenger messenger;
    private final int sensorOrientation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugins.camera.features.sensororientation.DeviceOrientationManager$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation;

        static {
            int[] iArr = new int[PlatformChannel.DeviceOrientation.values().length];
            $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation = iArr;
            try {
                iArr[PlatformChannel.DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[PlatformChannel.DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private DeviceOrientationManager(Activity activity, DartMessenger dartMessenger, boolean z10, int i10) {
        this.activity = activity;
        this.messenger = dartMessenger;
        this.isFrontFacing = z10;
        this.sensorOrientation = i10;
    }

    public static DeviceOrientationManager create(Activity activity, DartMessenger dartMessenger, boolean z10, int i10) {
        return new DeviceOrientationManager(activity, dartMessenger, z10, i10);
    }

    static void handleOrientationChange(PlatformChannel.DeviceOrientation deviceOrientation, PlatformChannel.DeviceOrientation deviceOrientation2, DartMessenger dartMessenger) {
        if (deviceOrientation.equals(deviceOrientation2)) {
            return;
        }
        dartMessenger.sendDeviceOrientationChangeEvent(deviceOrientation);
    }

    PlatformChannel.DeviceOrientation calculateSensorOrientation(int i10) {
        int i11 = i10 + 45;
        if (getDeviceDefaultOrientation() == 2) {
            i11 += 90;
        }
        return new PlatformChannel.DeviceOrientation[]{PlatformChannel.DeviceOrientation.PORTRAIT_UP, PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT, PlatformChannel.DeviceOrientation.PORTRAIT_DOWN, PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT}[(i11 % 360) / 90];
    }

    int getDeviceDefaultOrientation() {
        Configuration configuration = this.activity.getResources().getConfiguration();
        int rotation = getDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    Display getDisplay() {
        return ((WindowManager) this.activity.getSystemService("window")).getDefaultDisplay();
    }

    public PlatformChannel.DeviceOrientation getLastUIOrientation() {
        return this.lastOrientation;
    }

    public int getPhotoOrientation() {
        return getPhotoOrientation(this.lastOrientation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        if (r4.isFrontFacing != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0027, code lost:
    
        if (r4.isFrontFacing != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getPhotoOrientation(io.flutter.embedding.engine.systemchannels.PlatformChannel.DeviceOrientation r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation r5 = r4.getUIOrientation()
        L6:
            int[] r0 = io.flutter.plugins.camera.features.sensororientation.DeviceOrientationManager.AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            r1 = 270(0x10e, float:3.78E-43)
            if (r5 == r0) goto L2f
            r0 = 2
            if (r5 == r0) goto L2d
            r0 = 3
            r2 = 180(0xb4, float:2.52E-43)
            r3 = 0
            if (r5 == r0) goto L25
            r0 = 4
            if (r5 == r0) goto L20
            goto L31
        L20:
            boolean r5 = r4.isFrontFacing
            if (r5 == 0) goto L2b
            goto L2a
        L25:
            boolean r5 = r4.isFrontFacing
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            r2 = r3
        L2b:
            r3 = r2
            goto L31
        L2d:
            r3 = r1
            goto L31
        L2f:
            r3 = 90
        L31:
            int r5 = r4.sensorOrientation
            int r3 = r3 + r5
            int r3 = r3 + r1
            int r3 = r3 % 360
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.camera.features.sensororientation.DeviceOrientationManager.getPhotoOrientation(io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation):int");
    }

    PlatformChannel.DeviceOrientation getUIOrientation() {
        int rotation = getDisplay().getRotation();
        int i10 = this.activity.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? PlatformChannel.DeviceOrientation.PORTRAIT_UP : (rotation == 0 || rotation == 1) ? PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT : PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT : (rotation == 0 || rotation == 1) ? PlatformChannel.DeviceOrientation.PORTRAIT_UP : PlatformChannel.DeviceOrientation.PORTRAIT_DOWN;
    }

    public int getVideoOrientation() {
        return getVideoOrientation(this.lastOrientation);
    }

    public int getVideoOrientation(PlatformChannel.DeviceOrientation deviceOrientation) {
        if (deviceOrientation == null) {
            deviceOrientation = getUIOrientation();
        }
        int i10 = AnonymousClass2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[deviceOrientation.ordinal()];
        int i11 = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                i11 = 180;
            } else if (i10 == 3) {
                i11 = 270;
            } else if (i10 == 4) {
                i11 = 90;
            }
        }
        if (this.isFrontFacing) {
            i11 *= -1;
        }
        return ((i11 + this.sensorOrientation) + 360) % 360;
    }

    void handleUIOrientationChange() {
        PlatformChannel.DeviceOrientation uIOrientation = getUIOrientation();
        handleOrientationChange(uIOrientation, this.lastOrientation, this.messenger);
        this.lastOrientation = uIOrientation;
    }

    public void start() {
        if (this.broadcastReceiver != null) {
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: io.flutter.plugins.camera.features.sensororientation.DeviceOrientationManager.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                DeviceOrientationManager.this.handleUIOrientationChange();
            }
        };
        this.broadcastReceiver = broadcastReceiver;
        this.activity.registerReceiver(broadcastReceiver, orientationIntentFilter);
        this.broadcastReceiver.onReceive(this.activity, null);
    }

    public void stop() {
        BroadcastReceiver broadcastReceiver = this.broadcastReceiver;
        if (broadcastReceiver == null) {
            return;
        }
        this.activity.unregisterReceiver(broadcastReceiver);
        this.broadcastReceiver = null;
    }
}
