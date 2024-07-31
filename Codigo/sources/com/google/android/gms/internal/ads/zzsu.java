package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.List;

/* loaded from: classes2.dex */
final class zzsu {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, String str, int i10, int i11, double d10) {
        List supportedPerformancePoints;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int zzb = zzb(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i10, i11, (int) d10));
        if (zzb == 1 && str.equals("video/avc") && zzb(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(PlatformPlugin.DEFAULT_SYSTEM_UI, 720, 60)) != 2) {
            return 0;
        }
        return zzb;
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i10 = 0; i10 < list.size(); i10++) {
            covers = ((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i10)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
