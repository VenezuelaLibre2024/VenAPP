package ca;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f6937a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f6938b = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    public IBinder a() {
        com.google.android.gms.common.internal.s.i("BlockingServiceConnection.getService() called on main thread");
        if (this.f6937a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f6937a = true;
        return (IBinder) this.f6938b.take();
    }

    @ResultIgnorabilityUnspecified
    public IBinder b(long j10, TimeUnit timeUnit) {
        com.google.android.gms.common.internal.s.i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f6937a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f6937a = true;
        IBinder iBinder = (IBinder) this.f6938b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6938b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
