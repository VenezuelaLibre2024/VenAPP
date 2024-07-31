package io.flutter.plugins.camera.features.resolution;

import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.util.Size;
import io.flutter.plugins.camera.CameraProperties;
import io.flutter.plugins.camera.SdkCapabilityChecker;
import io.flutter.plugins.camera.features.CameraFeature;
import java.util.List;

/* loaded from: classes3.dex */
public class ResolutionFeature extends CameraFeature<ResolutionPreset> {
    private int cameraId;
    private Size captureSize;
    private ResolutionPreset currentSetting;
    private Size previewSize;
    private EncoderProfiles recordingProfile;
    private CamcorderProfile recordingProfileLegacy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugins.camera.features.resolution.ResolutionFeature$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset;

        static {
            int[] iArr = new int[ResolutionPreset.values().length];
            $SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset = iArr;
            try {
                iArr[ResolutionPreset.max.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset[ResolutionPreset.ultraHigh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset[ResolutionPreset.veryHigh.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset[ResolutionPreset.high.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset[ResolutionPreset.medium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset[ResolutionPreset.low.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ResolutionFeature(CameraProperties cameraProperties, ResolutionPreset resolutionPreset, String str) {
        super(cameraProperties);
        this.currentSetting = resolutionPreset;
        try {
            int parseInt = Integer.parseInt(str, 10);
            this.cameraId = parseInt;
            configureResolution(resolutionPreset, parseInt);
        } catch (NumberFormatException unused) {
            this.cameraId = -1;
        }
    }

    static Size computeBestPreviewSize(int i10, ResolutionPreset resolutionPreset) {
        List videoProfiles;
        int width;
        int height;
        int ordinal = resolutionPreset.ordinal();
        ResolutionPreset resolutionPreset2 = ResolutionPreset.high;
        if (ordinal > resolutionPreset2.ordinal()) {
            resolutionPreset = resolutionPreset2;
        }
        if (SdkCapabilityChecker.supportsEncoderProfiles()) {
            videoProfiles = getBestAvailableCamcorderProfileForResolutionPreset(i10, resolutionPreset).getVideoProfiles();
            EncoderProfiles.VideoProfile videoProfile = (EncoderProfiles.VideoProfile) videoProfiles.get(0);
            if (videoProfile != null) {
                width = videoProfile.getWidth();
                height = videoProfile.getHeight();
                return new Size(width, height);
            }
        }
        CamcorderProfile bestAvailableCamcorderProfileForResolutionPresetLegacy = getBestAvailableCamcorderProfileForResolutionPresetLegacy(i10, resolutionPreset);
        return new Size(bestAvailableCamcorderProfileForResolutionPresetLegacy.videoFrameWidth, bestAvailableCamcorderProfileForResolutionPresetLegacy.videoFrameHeight);
    }

    private void configureResolution(ResolutionPreset resolutionPreset, int i10) {
        List videoProfiles;
        int width;
        int height;
        if (checkIsSupported()) {
            boolean z10 = false;
            if (SdkCapabilityChecker.supportsEncoderProfiles()) {
                this.recordingProfileLegacy = null;
                EncoderProfiles bestAvailableCamcorderProfileForResolutionPreset = getBestAvailableCamcorderProfileForResolutionPreset(i10, resolutionPreset);
                this.recordingProfile = bestAvailableCamcorderProfileForResolutionPreset;
                videoProfiles = bestAvailableCamcorderProfileForResolutionPreset.getVideoProfiles();
                EncoderProfiles.VideoProfile videoProfile = (EncoderProfiles.VideoProfile) videoProfiles.get(0);
                if (videoProfile != null) {
                    width = videoProfile.getWidth();
                    height = videoProfile.getHeight();
                    this.captureSize = new Size(width, height);
                    z10 = true;
                }
            }
            if (!z10) {
                this.recordingProfile = null;
                this.recordingProfileLegacy = getBestAvailableCamcorderProfileForResolutionPresetLegacy(i10, resolutionPreset);
                CamcorderProfile camcorderProfile = this.recordingProfileLegacy;
                this.captureSize = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            this.previewSize = computeBestPreviewSize(i10, resolutionPreset);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000e. Please report as an issue. */
    public static EncoderProfiles getBestAvailableCamcorderProfileForResolutionPreset(int i10, ResolutionPreset resolutionPreset) {
        EncoderProfiles all;
        EncoderProfiles all2;
        EncoderProfiles all3;
        EncoderProfiles all4;
        EncoderProfiles all5;
        EncoderProfiles all6;
        EncoderProfiles all7;
        if (i10 < 0) {
            throw new AssertionError("getBestAvailableCamcorderProfileForResolutionPreset can only be used with valid (>=0) camera identifiers.");
        }
        String num = Integer.toString(i10);
        switch (AnonymousClass1.$SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset[resolutionPreset.ordinal()]) {
            case 1:
                if (CamcorderProfile.hasProfile(i10, 1)) {
                    all7 = CamcorderProfile.getAll(num, 1);
                    return all7;
                }
            case 2:
                if (CamcorderProfile.hasProfile(i10, 8)) {
                    all6 = CamcorderProfile.getAll(num, 8);
                    return all6;
                }
            case 3:
                if (CamcorderProfile.hasProfile(i10, 6)) {
                    all5 = CamcorderProfile.getAll(num, 6);
                    return all5;
                }
            case 4:
                if (CamcorderProfile.hasProfile(i10, 5)) {
                    all4 = CamcorderProfile.getAll(num, 5);
                    return all4;
                }
            case 5:
                if (CamcorderProfile.hasProfile(i10, 4)) {
                    all3 = CamcorderProfile.getAll(num, 4);
                    return all3;
                }
            case 6:
                if (CamcorderProfile.hasProfile(i10, 7)) {
                    all2 = CamcorderProfile.getAll(num, 7);
                    return all2;
                }
            default:
                if (!CamcorderProfile.hasProfile(i10, 0)) {
                    throw new IllegalArgumentException("No capture session available for current capture session.");
                }
                all = CamcorderProfile.getAll(num, 0);
                return all;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    public static CamcorderProfile getBestAvailableCamcorderProfileForResolutionPresetLegacy(int i10, ResolutionPreset resolutionPreset) {
        if (i10 < 0) {
            throw new AssertionError("getBestAvailableCamcorderProfileForResolutionPreset can only be used with valid (>=0) camera identifiers.");
        }
        switch (AnonymousClass1.$SwitchMap$io$flutter$plugins$camera$features$resolution$ResolutionPreset[resolutionPreset.ordinal()]) {
            case 1:
                if (CamcorderProfile.hasProfile(i10, 1)) {
                    return CamcorderProfile.get(i10, 1);
                }
            case 2:
                if (CamcorderProfile.hasProfile(i10, 8)) {
                    return CamcorderProfile.get(i10, 8);
                }
            case 3:
                if (CamcorderProfile.hasProfile(i10, 6)) {
                    return CamcorderProfile.get(i10, 6);
                }
            case 4:
                if (CamcorderProfile.hasProfile(i10, 5)) {
                    return CamcorderProfile.get(i10, 5);
                }
            case 5:
                if (CamcorderProfile.hasProfile(i10, 4)) {
                    return CamcorderProfile.get(i10, 4);
                }
            case 6:
                if (CamcorderProfile.hasProfile(i10, 7)) {
                    return CamcorderProfile.get(i10, 7);
                }
            default:
                if (CamcorderProfile.hasProfile(i10, 0)) {
                    return CamcorderProfile.get(i10, 0);
                }
                throw new IllegalArgumentException("No capture session available for current capture session.");
        }
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public boolean checkIsSupported() {
        return this.cameraId >= 0;
    }

    public Size getCaptureSize() {
        return this.captureSize;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public String getDebugName() {
        return "ResolutionFeature";
    }

    public Size getPreviewSize() {
        return this.previewSize;
    }

    public EncoderProfiles getRecordingProfile() {
        return this.recordingProfile;
    }

    public CamcorderProfile getRecordingProfileLegacy() {
        return this.recordingProfileLegacy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.flutter.plugins.camera.features.CameraFeature
    public ResolutionPreset getValue() {
        return this.currentSetting;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public void setValue(ResolutionPreset resolutionPreset) {
        this.currentSetting = resolutionPreset;
        configureResolution(resolutionPreset, this.cameraId);
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public void updateBuilder(CaptureRequest.Builder builder) {
    }
}
