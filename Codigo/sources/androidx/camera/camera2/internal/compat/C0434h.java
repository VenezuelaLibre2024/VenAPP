package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.compat.h */
/* loaded from: classes.dex */
public class C0434h extends Exception {

    /* renamed from: c */
    static final Set<Integer> f2163c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: d */
    static final Set<Integer> f2164d = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* renamed from: a */
    private final int f2165a;

    /* renamed from: b */
    private final CameraAccessException f2166b;

    public C0434h(int i10, String str, Throwable th2) {
        super(m2232a(i10, str), th2);
        this.f2165a = i10;
        this.f2166b = f2163c.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, str, th2) : null;
    }

    public C0434h(int i10, Throwable th2) {
        super(m2233b(i10), th2);
        this.f2165a = i10;
        this.f2166b = f2163c.contains(Integer.valueOf(i10)) ? new CameraAccessException(i10, null, th2) : null;
    }

    private C0434h(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f2165a = cameraAccessException.getReason();
        this.f2166b = cameraAccessException;
    }

    /* renamed from: a */
    private static String m2232a(int i10, String str) {
        return String.format("%s (%d): %s", m2234c(i10), Integer.valueOf(i10), str);
    }

    /* renamed from: b */
    private static String m2233b(int i10) {
        if (i10 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i10 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i10 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i10 == 4) {
            return "The camera device is in use already";
        }
        if (i10 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i10 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i10 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    /* renamed from: c */
    private static String m2234c(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 1000 ? i10 != 10001 ? i10 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    /* renamed from: e */
    public static C0434h m2235e(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new C0434h(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    /* renamed from: d */
    public final int m2236d() {
        return this.f2165a;
    }
}
