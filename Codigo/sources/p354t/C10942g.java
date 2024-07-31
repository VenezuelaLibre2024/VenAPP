package p354t;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.nio.BufferUnderflowException;
import p342s.C10750l;
import p342s.C10756r;
import p407w.C12029o0;

/* renamed from: t.g */
/* loaded from: classes.dex */
public final class C10942g {
    /* renamed from: a */
    public static boolean m33414a(InterfaceC10938c interfaceC10938c) {
        return m33415b(false, interfaceC10938c);
    }

    /* renamed from: b */
    public static boolean m33415b(boolean z10, InterfaceC10938c interfaceC10938c) {
        Boolean bool;
        try {
            bool = (Boolean) interfaceC10938c.mo2545a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e10) {
            if (C10750l.m32699a(C10756r.class) != null) {
                C12029o0.m38638a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                C12029o0.m38641d("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e10);
            }
            if (z10) {
                throw e10;
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            C12029o0.m38648k("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
