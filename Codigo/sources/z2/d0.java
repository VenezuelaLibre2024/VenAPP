package z2;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.os.Handler;
import java.util.Calendar;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32267a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f32268b;

    /* renamed from: c, reason: collision with root package name */
    private final z f32269c;

    /* renamed from: e, reason: collision with root package name */
    private String f32271e;

    /* renamed from: f, reason: collision with root package name */
    private Calendar f32272f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f32273g = false;

    /* renamed from: d, reason: collision with root package name */
    private OnNmeaMessageListener f32270d = new OnNmeaMessageListener() { // from class: z2.c0
        @Override // android.location.OnNmeaMessageListener
        public final void onNmeaMessage(String str, long j10) {
            d0.this.c(str, j10);
        }
    };

    public d0(Context context, z zVar) {
        this.f32267a = context;
        this.f32269c = zVar;
        this.f32268b = (LocationManager) context.getSystemService("location");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str, long j10) {
        if (str.startsWith("$GPGGA")) {
            this.f32271e = str;
            this.f32272f = Calendar.getInstance();
        }
    }

    public void b(Location location) {
        if (location == null || this.f32271e == null || this.f32269c == null || !this.f32273g) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, -5);
        Calendar calendar2 = this.f32272f;
        if ((calendar2 == null || !calendar2.before(calendar)) && this.f32269c.d()) {
            String[] split = this.f32271e.split(",");
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

    public void d() {
        z zVar;
        LocationManager locationManager;
        if (this.f32273g || (zVar = this.f32269c) == null || !zVar.d() || (locationManager = this.f32268b) == null) {
            return;
        }
        locationManager.addNmeaListener(this.f32270d, (Handler) null);
        this.f32273g = true;
    }

    public void e() {
        LocationManager locationManager;
        z zVar = this.f32269c;
        if (zVar == null || !zVar.d() || (locationManager = this.f32268b) == null) {
            return;
        }
        locationManager.removeNmeaListener(this.f32270d);
        this.f32273g = false;
    }
}
