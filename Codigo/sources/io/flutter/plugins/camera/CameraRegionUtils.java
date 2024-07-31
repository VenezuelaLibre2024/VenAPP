package io.flutter.plugins.camera;

import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import java.util.Arrays;
import java.util.function.IntPredicate;

/* loaded from: classes3.dex */
public final class CameraRegionUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: io.flutter.plugins.camera.CameraRegionUtils$1, reason: invalid class name */
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

    /* loaded from: classes3.dex */
    static class MeteringRectangleFactory {
        MeteringRectangleFactory() {
        }

        public static MeteringRectangle create(int i10, int i11, int i12, int i13, int i14) {
            return new MeteringRectangle(i10, i11, i12, i13, i14);
        }
    }

    /* loaded from: classes3.dex */
    static class SizeFactory {
        SizeFactory() {
        }

        public static Size create(int i10, int i11) {
            return new Size(i10, i11);
        }
    }

    public static MeteringRectangle convertPointToMeteringRectangle(Size size, double d10, double d11, PlatformChannel.DeviceOrientation deviceOrientation) {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[deviceOrientation.ordinal()];
        if (i10 == 1) {
            double d12 = 1.0d - d10;
            d10 = d11;
            d11 = d12;
        } else if (i10 == 2) {
            double d13 = 1.0d - d11;
            d11 = d10;
            d10 = d13;
        } else if (i10 == 4) {
            d10 = 1.0d - d10;
            d11 = 1.0d - d11;
        }
        int round = (int) Math.round(d10 * (size.getWidth() - 1));
        int round2 = (int) Math.round(d11 * (size.getHeight() - 1));
        int round3 = (int) Math.round(size.getWidth() / 10.0d);
        int round4 = (int) Math.round(size.getHeight() / 10.0d);
        int i11 = round - (round3 / 2);
        int i12 = round2 - (round4 / 2);
        if (i11 < 0) {
            i11 = 0;
        }
        if (i12 < 0) {
            i12 = 0;
        }
        int width = (size.getWidth() - 1) - round3;
        int height = (size.getHeight() - 1) - round4;
        if (i11 > width) {
            i11 = width;
        }
        if (i12 > height) {
            i12 = height;
        }
        return MeteringRectangleFactory.create(i11, i12, round3, round4, 1);
    }

    public static Size getCameraBoundaries(CameraProperties cameraProperties, CaptureRequest.Builder builder) {
        CaptureRequest.Key key;
        if (!SdkCapabilityChecker.supportsDistortionCorrection() || !supportsDistortionCorrection(cameraProperties)) {
            return cameraProperties.getSensorInfoPixelArraySize();
        }
        key = CaptureRequest.DISTORTION_CORRECTION_MODE;
        Integer num = (Integer) builder.get(key);
        Rect sensorInfoPreCorrectionActiveArraySize = (num == null || num.intValue() == 0) ? cameraProperties.getSensorInfoPreCorrectionActiveArraySize() : cameraProperties.getSensorInfoActiveArraySize();
        return SizeFactory.create(sensorInfoPreCorrectionActiveArraySize.width(), sensorInfoPreCorrectionActiveArraySize.height());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$supportsDistortionCorrection$0(int i10) {
        return i10 != 0;
    }

    private static boolean supportsDistortionCorrection(CameraProperties cameraProperties) {
        int[] distortionCorrectionAvailableModes = cameraProperties.getDistortionCorrectionAvailableModes();
        if (distortionCorrectionAvailableModes == null) {
            distortionCorrectionAvailableModes = new int[0];
        }
        return Arrays.stream(distortionCorrectionAvailableModes).filter(new IntPredicate() { // from class: io.flutter.plugins.camera.x
            @Override // java.util.function.IntPredicate
            public final boolean test(int i10) {
                boolean lambda$supportsDistortionCorrection$0;
                lambda$supportsDistortionCorrection$0 = CameraRegionUtils.lambda$supportsDistortionCorrection$0(i10);
                return lambda$supportsDistortionCorrection$0;
            }
        }).count() > 0;
    }
}
