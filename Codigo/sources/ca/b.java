package ca;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* loaded from: classes.dex */
public final class b extends ea.a {

    /* renamed from: a, reason: collision with root package name */
    final int f6942a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6943b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f6944c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6945d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f6941e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new q();

    public b(int i10) {
        this(i10, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f6942a = i10;
        this.f6943b = i11;
        this.f6944c = pendingIntent;
        this.f6945d = str;
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String z1(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6943b == bVar.f6943b && com.google.android.gms.common.internal.q.b(this.f6944c, bVar.f6944c) && com.google.android.gms.common.internal.q.b(this.f6945d, bVar.f6945d);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f6943b), this.f6944c, this.f6945d);
    }

    public String toString() {
        q.a d10 = com.google.android.gms.common.internal.q.d(this);
        d10.a("statusCode", z1(this.f6943b));
        d10.a("resolution", this.f6944c);
        d10.a(Constants.MESSAGE, this.f6945d);
        return d10.toString();
    }

    public int u1() {
        return this.f6943b;
    }

    public String v1() {
        return this.f6945d;
    }

    public PendingIntent w1() {
        return this.f6944c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f6942a);
        ea.c.u(parcel, 2, u1());
        ea.c.E(parcel, 3, w1(), i10, false);
        ea.c.G(parcel, 4, v1(), false);
        ea.c.b(parcel, a10);
    }

    public boolean x1() {
        return (this.f6943b == 0 || this.f6944c == null) ? false : true;
    }

    public boolean y1() {
        return this.f6943b == 0;
    }
}
