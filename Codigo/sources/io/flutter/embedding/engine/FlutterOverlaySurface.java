package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public class FlutterOverlaySurface {

    /* renamed from: id, reason: collision with root package name */
    private final int f17858id;
    private final Surface surface;

    public FlutterOverlaySurface(int i10, Surface surface) {
        this.f17858id = i10;
        this.surface = surface;
    }

    public int getId() {
        return this.f17858id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
