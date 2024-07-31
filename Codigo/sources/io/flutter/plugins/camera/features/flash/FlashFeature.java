package io.flutter.plugins.camera.features.flash;

import android.hardware.camera2.CaptureRequest;
import io.flutter.plugins.camera.CameraProperties;
import io.flutter.plugins.camera.features.CameraFeature;

/* loaded from: classes3.dex */
public class FlashFeature extends CameraFeature<FlashMode> {
    private FlashMode currentSetting;

    /* renamed from: io.flutter.plugins.camera.features.flash.FlashFeature$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$camera$features$flash$FlashMode;

        static {
            int[] iArr = new int[FlashMode.values().length];
            $SwitchMap$io$flutter$plugins$camera$features$flash$FlashMode = iArr;
            try {
                iArr[FlashMode.off.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$camera$features$flash$FlashMode[FlashMode.always.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$camera$features$flash$FlashMode[FlashMode.torch.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$camera$features$flash$FlashMode[FlashMode.auto.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FlashFeature(CameraProperties cameraProperties) {
        super(cameraProperties);
        this.currentSetting = FlashMode.auto;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public boolean checkIsSupported() {
        Boolean flashInfoAvailable = this.cameraProperties.getFlashInfoAvailable();
        return flashInfoAvailable != null && flashInfoAvailable.booleanValue();
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public String getDebugName() {
        return "FlashFeature";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.flutter.plugins.camera.features.CameraFeature
    public FlashMode getValue() {
        return this.currentSetting;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public void setValue(FlashMode flashMode) {
        this.currentSetting = flashMode;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public void updateBuilder(CaptureRequest.Builder builder) {
        CaptureRequest.Key key;
        int i10;
        int i11;
        CaptureRequest.Key key2;
        if (checkIsSupported()) {
            int i12 = AnonymousClass1.$SwitchMap$io$flutter$plugins$camera$features$flash$FlashMode[this.currentSetting.ordinal()];
            if (i12 == 1) {
                key = CaptureRequest.CONTROL_AE_MODE;
                i10 = 1;
            } else if (i12 == 2) {
                key = CaptureRequest.CONTROL_AE_MODE;
                i10 = 3;
            } else {
                if (i12 == 3) {
                    builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    key2 = CaptureRequest.FLASH_MODE;
                    i11 = 2;
                    builder.set(key2, i11);
                }
                if (i12 != 4) {
                    return;
                }
                key = CaptureRequest.CONTROL_AE_MODE;
                i10 = 2;
            }
            builder.set(key, i10);
            key2 = CaptureRequest.FLASH_MODE;
            i11 = 0;
            builder.set(key2, i11);
        }
    }
}
