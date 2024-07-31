package io.flutter.plugins.camera.types;

/* loaded from: classes3.dex */
public enum FlashMode {
    off("off"),
    auto("auto"),
    always("always"),
    torch("torch");

    private final String strValue;

    FlashMode(String str) {
        this.strValue = str;
    }

    public static FlashMode getValueForString(String str) {
        for (FlashMode flashMode : values()) {
            if (flashMode.strValue.equals(str)) {
                return flashMode;
            }
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.strValue;
    }
}
