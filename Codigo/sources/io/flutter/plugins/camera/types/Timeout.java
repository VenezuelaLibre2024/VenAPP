package io.flutter.plugins.camera.types;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class Timeout {
    private final long timeStarted = SystemClock.elapsedRealtime();
    private final long timeoutMs;

    private Timeout(long j10) {
        this.timeoutMs = j10;
    }

    public static Timeout create(long j10) {
        return new Timeout(j10);
    }

    public boolean getIsExpired() {
        return SystemClock.elapsedRealtime() - this.timeStarted > this.timeoutMs;
    }
}
