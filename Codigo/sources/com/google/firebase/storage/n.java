package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public class n extends zb.m {

    /* renamed from: a */
    private final int f12675a;

    /* renamed from: b */
    private final int f12676b;

    /* renamed from: c */
    private Throwable f12677c;

    n(int i10, Throwable th2, int i11) {
        super(g(i10));
        this.f12677c = th2;
        this.f12675a = i10;
        this.f12676b = i11;
        Log.e("StorageException", "StorageException has occurred.\n" + g(i10) + "\n Code: " + i10 + " HttpResult: " + i11);
        Throwable th3 = this.f12677c;
        if (th3 != null) {
            Log.e("StorageException", th3.getMessage(), this.f12677c);
        }
    }

    private static int a(Status status) {
        if (status.R0()) {
            return -13040;
        }
        return status.equals(Status.f9295u) ? -13030 : -13000;
    }

    private static int b(Throwable th2, int i10) {
        if (th2 instanceof a) {
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

    public static n c(Status status) {
        com.google.android.gms.common.internal.s.j(status);
        com.google.android.gms.common.internal.s.a(!status.y1());
        return new n(a(status), null, 0);
    }

    public static n d(Throwable th2) {
        return e(th2, 0);
    }

    public static n e(Throwable th2, int i10) {
        if (th2 instanceof n) {
            return (n) th2;
        }
        if (h(i10) && th2 == null) {
            return null;
        }
        return new n(b(th2, i10), th2, i10);
    }

    static String g(int i10) {
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

    private static boolean h(int i10) {
        return i10 == 0 || (i10 >= 200 && i10 < 300);
    }

    public int f() {
        return this.f12675a;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        Throwable th2;
        th2 = this.f12677c;
        if (th2 == this) {
            return null;
        }
        return th2;
    }
}
