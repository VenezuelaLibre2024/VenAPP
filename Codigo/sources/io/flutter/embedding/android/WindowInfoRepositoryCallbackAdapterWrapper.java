package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class WindowInfoRepositoryCallbackAdapterWrapper {
    final WindowInfoTrackerCallbackAdapter adapter;

    public WindowInfoRepositoryCallbackAdapterWrapper(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.adapter = windowInfoTrackerCallbackAdapter;
    }

    public void addWindowLayoutInfoListener(Activity activity, Executor executor, androidx.core.util.a<WindowLayoutInfo> aVar) {
        this.adapter.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void removeWindowLayoutInfoListener(androidx.core.util.a<WindowLayoutInfo> aVar) {
        this.adapter.removeWindowLayoutInfoListener(aVar);
    }
}
