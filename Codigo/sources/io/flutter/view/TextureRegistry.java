package io.flutter.view;

import android.graphics.SurfaceTexture;

/* loaded from: classes3.dex */
public interface TextureRegistry {

    /* loaded from: classes3.dex */
    public interface OnFrameConsumedListener {
        void onFrameConsumed();
    }

    /* loaded from: classes3.dex */
    public interface OnTrimMemoryListener {
        void onTrimMemory(int i10);
    }

    /* loaded from: classes3.dex */
    public interface SurfaceTextureEntry {
        long id();

        void release();

        default void setOnFrameConsumedListener(OnFrameConsumedListener onFrameConsumedListener) {
        }

        default void setOnTrimMemoryListener(OnTrimMemoryListener onTrimMemoryListener) {
        }

        SurfaceTexture surfaceTexture();
    }

    SurfaceTextureEntry createSurfaceTexture();

    default void onTrimMemory(int i10) {
    }

    SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture surfaceTexture);
}
