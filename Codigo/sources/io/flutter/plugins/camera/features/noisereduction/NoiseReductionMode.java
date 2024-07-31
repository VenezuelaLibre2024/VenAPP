package io.flutter.plugins.camera.features.noisereduction;

/* loaded from: classes3.dex */
public enum NoiseReductionMode {
    off("off"),
    fast("fast"),
    highQuality("highQuality"),
    minimal("minimal"),
    zeroShutterLag("zeroShutterLag");

    private final String strValue;

    NoiseReductionMode(String str) {
        this.strValue = str;
    }

    public static NoiseReductionMode getValueForString(String str) {
        for (NoiseReductionMode noiseReductionMode : values()) {
            if (noiseReductionMode.strValue.equals(str)) {
                return noiseReductionMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.strValue;
    }
}
