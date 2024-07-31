package ca;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import io.flutter.plugins.firebase.crashlytics.Constants;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ca.b */
/* loaded from: classes.dex */
public final class C1894b extends AbstractC7138a {

    /* renamed from: a */
    final int f7891a;

    /* renamed from: b */
    private final int f7892b;

    /* renamed from: c */
    private final PendingIntent f7893c;

    /* renamed from: d */
    private final String f7894d;

    /* renamed from: e */
    public static final C1894b f7890e = new C1894b(0);
    public static final Parcelable.Creator<C1894b> CREATOR = new C1922q();

    public C1894b(int i10) {
        this(i10, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1894b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f7891a = i10;
        this.f7892b = i11;
        this.f7893c = pendingIntent;
        this.f7894d = str;
    }

    public C1894b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public C1894b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z1 */
    public static String m10049z1(int i10) {
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
        if (!(obj instanceof C1894b)) {
            return false;
        }
        C1894b c1894b = (C1894b) obj;
        return this.f7892b == c1894b.f7892b && C5270q.m13304b(this.f7893c, c1894b.f7893c) && C5270q.m13304b(this.f7894d, c1894b.f7894d);
    }

    public int hashCode() {
        return C5270q.m13305c(Integer.valueOf(this.f7892b), this.f7893c, this.f7894d);
    }

    public String toString() {
        C5270q.a m13306d = C5270q.m13306d(this);
        m13306d.m13307a("statusCode", m10049z1(this.f7892b));
        m13306d.m13307a("resolution", this.f7893c);
        m13306d.m13307a(Constants.MESSAGE, this.f7894d);
        return m13306d.toString();
    }

    /* renamed from: u1 */
    public int m10050u1() {
        return this.f7892b;
    }

    /* renamed from: v1 */
    public String m10051v1() {
        return this.f7894d;
    }

    /* renamed from: w1 */
    public PendingIntent m10052w1() {
        return this.f7893c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21229u(parcel, 1, this.f7891a);
        C7140c.m21229u(parcel, 2, m10050u1());
        C7140c.m21198E(parcel, 3, m10052w1(), i10, false);
        C7140c.m21200G(parcel, 4, m10051v1(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public boolean m10053x1() {
        return (this.f7892b == 0 || this.f7893c == null) ? false : true;
    }

    /* renamed from: y1 */
    public boolean m10054y1() {
        return this.f7892b == 0;
    }
}
