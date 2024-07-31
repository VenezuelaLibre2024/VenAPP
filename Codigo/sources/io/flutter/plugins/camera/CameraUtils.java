package io.flutter.plugins.camera;

import android.app.Activity;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class CameraUtils {

    /* renamed from: io.flutter.plugins.camera.CameraUtils$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
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

    private CameraUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlatformChannel.DeviceOrientation deserializeDeviceOrientation(String str) {
        if (str == null) {
            throw new UnsupportedOperationException("Could not deserialize null device orientation.");
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2022952606:
                if (str.equals("landscapeLeft")) {
                    c10 = 0;
                    break;
                }
                break;
            case -339013923:
                if (str.equals("portraitDown")) {
                    c10 = 1;
                    break;
                }
                break;
            case 746015638:
                if (str.equals("portraitUp")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1718639649:
                if (str.equals("landscapeRight")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return PlatformChannel.DeviceOrientation.LANDSCAPE_LEFT;
            case 1:
                return PlatformChannel.DeviceOrientation.PORTRAIT_DOWN;
            case 2:
                return PlatformChannel.DeviceOrientation.PORTRAIT_UP;
            case 3:
                return PlatformChannel.DeviceOrientation.LANDSCAPE_RIGHT;
            default:
                throw new UnsupportedOperationException("Could not deserialize device orientation: " + str);
        }
    }

    public static List<Map<String, Object>> getAvailableCameras(Activity activity) {
        int i10;
        String str;
        CameraManager cameraManager = (CameraManager) activity.getSystemService("camera");
        String[] cameraIdList = cameraManager.getCameraIdList();
        ArrayList arrayList = new ArrayList();
        for (String str2 : cameraIdList) {
            try {
                i10 = Integer.parseInt(str2, 10);
            } catch (NumberFormatException unused) {
                i10 = -1;
            }
            if (i10 >= 0) {
                HashMap hashMap = new HashMap();
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                hashMap.put("name", str2);
                hashMap.put("sensorOrientation", Integer.valueOf(((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue()));
                int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
                if (intValue == 0) {
                    str = "front";
                } else if (intValue != 1) {
                    if (intValue == 2) {
                        str = "external";
                    }
                    arrayList.add(hashMap);
                } else {
                    str = "back";
                }
                hashMap.put("lensFacing", str);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CameraManager getCameraManager(Context context) {
        return (CameraManager) context.getSystemService("camera");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String serializeDeviceOrientation(PlatformChannel.DeviceOrientation deviceOrientation) {
        if (deviceOrientation == null) {
            throw new UnsupportedOperationException("Could not serialize null device orientation.");
        }
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[deviceOrientation.ordinal()];
        if (i10 == 1) {
            return "portraitUp";
        }
        if (i10 == 2) {
            return "portraitDown";
        }
        if (i10 == 3) {
            return "landscapeLeft";
        }
        if (i10 == 4) {
            return "landscapeRight";
        }
        throw new UnsupportedOperationException("Could not serialize device orientation: " + deviceOrientation.toString());
    }
}
