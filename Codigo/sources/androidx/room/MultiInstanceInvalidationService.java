package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import ck.v;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import r1.j;
import r1.k;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private int f5441a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, String> f5442b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final RemoteCallbackList<j> f5443c = new b();

    /* renamed from: d, reason: collision with root package name */
    private final k.a f5444d = new a();

    /* loaded from: classes.dex */
    public static final class a extends k.a {
        a() {
        }

        @Override // r1.k
        public int M0(j callback, String str) {
            n.e(callback, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<j> a10 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a10) {
                multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                int c10 = multiInstanceInvalidationService.c();
                if (multiInstanceInvalidationService.a().register(callback, Integer.valueOf(c10))) {
                    multiInstanceInvalidationService.b().put(Integer.valueOf(c10), str);
                    i10 = c10;
                } else {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                    multiInstanceInvalidationService.c();
                }
            }
            return i10;
        }

        @Override // r1.k
        public void g0(j callback, int i10) {
            n.e(callback, "callback");
            RemoteCallbackList<j> a10 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a10) {
                multiInstanceInvalidationService.a().unregister(callback);
                multiInstanceInvalidationService.b().remove(Integer.valueOf(i10));
            }
        }

        @Override // r1.k
        public void o0(int i10, String[] tables) {
            n.e(tables, "tables");
            RemoteCallbackList<j> a10 = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (a10) {
                String str = multiInstanceInvalidationService.b().get(Integer.valueOf(i10));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                for (int i11 = 0; i11 < beginBroadcast; i11++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i11);
                        n.c(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = ((Integer) broadcastCookie).intValue();
                        String str2 = multiInstanceInvalidationService.b().get(Integer.valueOf(intValue));
                        if (i10 != intValue && n.a(str, str2)) {
                            try {
                                multiInstanceInvalidationService.a().getBroadcastItem(i11).q(tables);
                            } catch (RemoteException e10) {
                                Log.w("ROOM", "Error invoking a remote callback", e10);
                            }
                        }
                    } catch (Throwable th2) {
                        multiInstanceInvalidationService.a().finishBroadcast();
                        throw th2;
                    }
                }
                multiInstanceInvalidationService.a().finishBroadcast();
                v vVar = v.f7137a;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends RemoteCallbackList<j> {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(j callback, Object cookie) {
            n.e(callback, "callback");
            n.e(cookie, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) cookie);
        }
    }

    public final RemoteCallbackList<j> a() {
        return this.f5443c;
    }

    public final Map<Integer, String> b() {
        return this.f5442b;
    }

    public final int c() {
        return this.f5441a;
    }

    public final void d(int i10) {
        this.f5441a = i10;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        n.e(intent, "intent");
        return this.f5444d;
    }
}
