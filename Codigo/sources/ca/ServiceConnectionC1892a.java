package ca;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C5276s;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ca.a */
/* loaded from: classes.dex */
public class ServiceConnectionC1892a implements ServiceConnection {

    /* renamed from: a */
    boolean f7886a = false;

    /* renamed from: b */
    private final BlockingQueue f7887b = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    /* renamed from: a */
    public IBinder m10045a() {
        C5276s.m13323i("BlockingServiceConnection.getService() called on main thread");
        if (this.f7886a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f7886a = true;
        return (IBinder) this.f7887b.take();
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: b */
    public IBinder m10046b(long j10, TimeUnit timeUnit) {
        C5276s.m13323i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f7886a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f7886a = true;
        IBinder iBinder = (IBinder) this.f7887b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7887b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
