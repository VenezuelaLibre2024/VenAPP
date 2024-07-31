package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import p485zb.C12873m;

/* renamed from: com.google.firebase.storage.n */
/* loaded from: classes2.dex */
public class C6398n extends C12873m {

    /* renamed from: a */
    private final int f13907a;

    /* renamed from: b */
    private final int f13908b;

    /* renamed from: c */
    private Throwable f13909c;

    C6398n(int i10, Throwable th2, int i11) {
        super(m17921g(i10));
        this.f13909c = th2;
        this.f13907a = i10;
        this.f13908b = i11;
        Log.e("StorageException", "StorageException has occurred.\n" + m17921g(i10) + "\n Code: " + i10 + " HttpResult: " + i11);
        Throwable th3 = this.f13909c;
        if (th3 != null) {
            Log.e("StorageException", th3.getMessage(), this.f13909c);
        }
    }

    /* renamed from: a */
    private static int m17916a(Status status) {
        if (status.m12967R0()) {
            return -13040;
        }
        return status.equals(Status.f10403u) ? -13030 : -13000;
    }

    /* renamed from: b */
    private static int m17917b(Throwable th2, int i10) {
        if (th2 instanceof C6372a) {
            return -13040;
        }
        if (i10 == -2) {
            return -13030;
        }
        if (i10 == 401) {
            return -13020;
        }
        if (i10 == 409) {
            return -13031;
        }
        if (i10 != 403) {
            return i10 != 404 ? -13000 : -13010;
        }
        return -13021;
    }

    /* renamed from: c */
    public static C6398n m17918c(Status status) {
        C5276s.m13324j(status);
        C5276s.m13315a(!status.m12972y1());
        return new C6398n(m17916a(status), null, 0);
    }

    /* renamed from: d */
    public static C6398n m17919d(Throwable th2) {
        return m17920e(th2, 0);
    }

    /* renamed from: e */
    public static C6398n m17920e(Throwable th2, int i10) {
        if (th2 instanceof C6398n) {
            return (C6398n) th2;
        }
        if (m17922h(i10) && th2 == null) {
            return null;
        }
        return new C6398n(m17917b(th2, i10), th2, i10);
    }

    /* renamed from: g */
    static String m17921g(int i10) {
        if (i10 == -13040) {
            return "The operation was cancelled.";
        }
        if (i10 == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i10 == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i10 == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i10 == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i10) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    /* renamed from: h */
    private static boolean m17922h(int i10) {
        return i10 == 0 || (i10 >= 200 && i10 < 300);
    }

    /* renamed from: f */
    public int m17923f() {
        return this.f13907a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        Throwable th2;
        th2 = this.f13909c;
        if (th2 == this) {
            return null;
        }
        return th2;
    }
}
