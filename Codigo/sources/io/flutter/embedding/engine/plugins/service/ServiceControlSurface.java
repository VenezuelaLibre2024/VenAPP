package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import androidx.lifecycle.f;

/* loaded from: classes3.dex */
public interface ServiceControlSurface {
    void attachToService(Service service, f fVar, boolean z10);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
