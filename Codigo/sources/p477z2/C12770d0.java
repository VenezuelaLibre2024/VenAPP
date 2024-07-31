package p477z2;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.os.Handler;
import java.util.Calendar;

/* renamed from: z2.d0 */
/* loaded from: classes.dex */
public class C12770d0 {

    /* renamed from: a */
    private final Context f34818a;

    /* renamed from: b */
    private final LocationManager f34819b;

    /* renamed from: c */
    private final C12794z f34820c;

    /* renamed from: e */
    private String f34822e;

    /* renamed from: f */
    private Calendar f34823f;

    /* renamed from: g */
    private boolean f34824g = false;

    /* renamed from: d */
    private OnNmeaMessageListener f34821d = new OnNmeaMessageListener() { // from class: z2.c0
        @Override // android.location.OnNmeaMessageListener
        public final void onNmeaMessage(String str, long j10) {
            C12770d0.this.m42367c(str, j10);
        }
    };

    public C12770d0(Context context, C12794z c12794z) {
        this.f34818a = context;
        this.f34820c = c12794z;
        this.f34819b = (LocationManager) context.getSystemService("location");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m42367c(String str, long j10) {
        if (str.startsWith("$GPGGA")) {
            this.f34822e = str;
            this.f34823f = Calendar.getInstance();
        }
    }

    /* renamed from: b */
    public void m42368b(Location location) {
        if (location == null || this.f34822e == null || this.f34820c == null || !this.f34824g) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, -5);
        Calendar calendar2 = this.f34823f;
        if ((calendar2 == null || !calendar2.before(calendar)) && this.f34820c.m42430d()) {
            String[] split = this.f34822e.split(",");
            if (!split[0].startsWith("$GPGGA") || split.length <= 9 || split[9].isEmpty()) {
                return;
            }
            double parseDouble = Double.parseDouble(split[9]);
            if (location.getExtras() == null) {
                location.setExtras(Bundle.EMPTY);
            }
            location.getExtras().putDouble("geolocator_mslAltitude", parseDouble);
        }
    }

    /* renamed from: d */
    public void m42369d() {
        C12794z c12794z;
        LocationManager locationManager;
        if (this.f34824g || (c12794z = this.f34820c) == null || !c12794z.m42430d() || (locationManager = this.f34819b) == null) {
            return;
        }
        locationManager.addNmeaListener(this.f34821d, (Handler) null);
        this.f34824g = true;
    }

    /* renamed from: e */
    public void m42370e() {
        LocationManager locationManager;
        C12794z c12794z = this.f34820c;
        if (c12794z == null || !c12794z.m42430d() || (locationManager = this.f34819b) == null) {
            return;
        }
        locationManager.removeNmeaListener(this.f34821d);
        this.f34824g = false;
    }
}
