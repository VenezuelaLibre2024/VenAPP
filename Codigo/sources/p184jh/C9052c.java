package p184jh;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p184jh.C9058i;

/* renamed from: jh.c */
/* loaded from: classes3.dex */
public final class C9052c {

    /* renamed from: a */
    private static final Pattern f21683a = Pattern.compile(";");

    /* renamed from: a */
    private static List<Camera.Area> m26574a(int i10) {
        int i11 = -i10;
        return Collections.singletonList(new Camera.Area(new Rect(i11, i11, i10, i10), 1));
    }

    /* renamed from: b */
    private static String m26575b(String str, Collection<String> collection, String... strArr) {
        Log.i("CameraConfiguration", "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i("CameraConfiguration", "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    /* renamed from: c */
    public static void m26576c(Camera.Parameters parameters) {
        if ("barcode".equals(parameters.getSceneMode())) {
            Log.i("CameraConfiguration", "Barcode scene mode already set");
            return;
        }
        String m26575b = m26575b("scene mode", parameters.getSupportedSceneModes(), "barcode");
        if (m26575b != null) {
            parameters.setSceneMode(m26575b);
        }
    }

    /* renamed from: d */
    public static void m26577d(Camera.Parameters parameters, boolean z10) {
        String str;
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            if (exposureCompensationStep > 0.0f) {
                int round = Math.round((z10 ? 0.0f : 1.5f) / exposureCompensationStep);
                float f10 = exposureCompensationStep * round;
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    str = "Exposure compensation already set to " + max + " / " + f10;
                    Log.i("CameraConfiguration", str);
                }
                Log.i("CameraConfiguration", "Setting exposure compensation to " + max + " / " + f10);
                parameters.setExposureCompensation(max);
                return;
            }
        }
        str = "Camera does not support exposure compensation";
        Log.i("CameraConfiguration", str);
    }

    /* renamed from: e */
    public static void m26578e(Camera.Parameters parameters) {
        m26579f(parameters, 10, 20);
    }

    /* renamed from: f */
    public static void m26579f(Camera.Parameters parameters, int i10, int i11) {
        int[] iArr;
        String str;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i("CameraConfiguration", "Supported FPS ranges: " + m26587n(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                iArr = null;
                break;
            }
            iArr = it.next();
            int i12 = iArr[0];
            int i13 = iArr[1];
            if (i12 >= i10 * AdError.NETWORK_ERROR_CODE && i13 <= i11 * AdError.NETWORK_ERROR_CODE) {
                break;
            }
        }
        if (iArr == null) {
            str = "No suitable FPS range?";
        } else {
            int[] iArr2 = new int[2];
            parameters.getPreviewFpsRange(iArr2);
            if (!Arrays.equals(iArr2, iArr)) {
                Log.i("CameraConfiguration", "Setting FPS range to " + Arrays.toString(iArr));
                parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                return;
            }
            str = "FPS range already set to " + Arrays.toString(iArr);
        }
        Log.i("CameraConfiguration", str);
    }

    /* renamed from: g */
    public static void m26580g(Camera.Parameters parameters, C9058i.a aVar, boolean z10) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String m26575b = (z10 || aVar == C9058i.a.AUTO) ? m26575b("focus mode", supportedFocusModes, "auto") : aVar == C9058i.a.CONTINUOUS ? m26575b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : aVar == C9058i.a.INFINITY ? m26575b("focus mode", supportedFocusModes, "infinity") : aVar == C9058i.a.MACRO ? m26575b("focus mode", supportedFocusModes, "macro") : null;
        if (!z10 && m26575b == null) {
            m26575b = m26575b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (m26575b != null) {
            if (!m26575b.equals(parameters.getFocusMode())) {
                parameters.setFocusMode(m26575b);
                return;
            }
            Log.i("CameraConfiguration", "Focus mode already set to " + m26575b);
        }
    }

    /* renamed from: h */
    public static void m26581h(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() <= 0) {
            Log.i("CameraConfiguration", "Device does not support focus areas");
            return;
        }
        Log.i("CameraConfiguration", "Old focus areas: " + m26586m(parameters.getFocusAreas()));
        List<Camera.Area> m26574a = m26574a(400);
        Log.i("CameraConfiguration", "Setting focus area to : " + m26586m(m26574a));
        parameters.setFocusAreas(m26574a);
    }

    /* renamed from: i */
    public static void m26582i(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i("CameraConfiguration", "Negative effect already set");
            return;
        }
        String m26575b = m26575b("color effect", parameters.getSupportedColorEffects(), "negative");
        if (m26575b != null) {
            parameters.setColorEffect(m26575b);
        }
    }

    /* renamed from: j */
    public static void m26583j(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() <= 0) {
            Log.i("CameraConfiguration", "Device does not support metering areas");
            return;
        }
        Log.i("CameraConfiguration", "Old metering areas: " + parameters.getMeteringAreas());
        List<Camera.Area> m26574a = m26574a(400);
        Log.i("CameraConfiguration", "Setting metering area to : " + m26586m(m26574a));
        parameters.setMeteringAreas(m26574a);
    }

    /* renamed from: k */
    public static void m26584k(Camera.Parameters parameters, boolean z10) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String m26575b = z10 ? m26575b("flash mode", supportedFlashModes, "torch", "on") : m26575b("flash mode", supportedFlashModes, "off");
        if (m26575b != null) {
            if (m26575b.equals(parameters.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to " + m26575b);
                return;
            }
            Log.i("CameraConfiguration", "Setting flash mode to " + m26575b);
            parameters.setFlashMode(m26575b);
        }
    }

    /* renamed from: l */
    public static void m26585l(Camera.Parameters parameters) {
        String str;
        if (!parameters.isVideoStabilizationSupported()) {
            str = "This device does not support video stabilization";
        } else {
            if (!parameters.getVideoStabilization()) {
                Log.i("CameraConfiguration", "Enabling video stabilization...");
                parameters.setVideoStabilization(true);
                return;
            }
            str = "Video stabilization already enabled";
        }
        Log.i("CameraConfiguration", str);
    }

    /* renamed from: m */
    private static String m26586m(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb2.append(area.rect);
            sb2.append(':');
            sb2.append(area.weight);
            sb2.append(' ');
        }
        return sb2.toString();
    }

    /* renamed from: n */
    private static String m26587n(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb2.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
