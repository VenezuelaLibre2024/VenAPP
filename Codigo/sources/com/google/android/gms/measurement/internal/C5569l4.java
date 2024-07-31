package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import la.InterfaceC9461f;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
/* loaded from: classes2.dex */
public final class C5569l4 extends AbstractC5733y2 {

    /* renamed from: c */
    private final C5556k4 f11519c;

    /* renamed from: d */
    private boolean f11520d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5569l4(C5712w5 c5712w5) {
        super(c5712w5);
        this.f11519c = new C5556k4(this, zza(), "google_app_measurement_local.db");
    }

    /* renamed from: F */
    private final SQLiteDatabase m14071F() {
        if (this.f11520d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f11519c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f11520d = true;
        return null;
    }

    /* renamed from: G */
    private final boolean m14072G() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: w */
    private static long m14073w(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursor.moveToFirst()) {
                cursor.close();
                return -1L;
            }
            long j10 = cursor.getLong(0);
            cursor.close();
            return j10;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: all -> 0x004b, SQLiteException -> 0x004e, SQLiteFullException -> 0x0050, SQLiteDatabaseLockedException -> 0x00b0, TRY_ENTER, TryCatch #7 {SQLiteDatabaseLockedException -> 0x00b0, SQLiteFullException -> 0x0050, SQLiteException -> 0x004e, all -> 0x004b, blocks: (B:72:0x0040, B:74:0x0046, B:17:0x005f, B:19:0x0083, B:20:0x009d), top: B:71:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a8  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m14074y(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5569l4.m14074y(int, byte[]):boolean");
    }

    /* renamed from: A */
    public final boolean m14075A(C5461d0 c5461d0) {
        Parcel obtain = Parcel.obtain();
        c5461d0.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m14074y(0, marshall);
        }
        zzj().m14184D().m14218a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    /* renamed from: B */
    public final boolean m14076B(C5524hb c5524hb) {
        Parcel obtain = Parcel.obtain();
        c5524hb.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return m14074y(1, marshall);
        }
        zzj().m14184D().m14218a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* renamed from: C */
    public final void m14077C() {
        int delete;
        mo13687i();
        try {
            SQLiteDatabase m14071F = m14071F();
            if (m14071F == null || (delete = m14071F.delete("messages", null, null) + 0) <= 0) {
                return;
            }
            zzj().m14186F().m14219b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            zzj().m14182B().m14219b("Error resetting local analytics data. error", e10);
        }
    }

    /* renamed from: D */
    public final boolean m14078D() {
        return m14074y(3, new byte[0]);
    }

    /* renamed from: E */
    public final boolean m14079E() {
        int i10;
        mo13687i();
        if (this.f11520d || !m14072G()) {
            return false;
        }
        int i11 = 5;
        for (0; i10 < 5; i10 + 1) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase m14071F = m14071F();
                    if (m14071F == null) {
                        this.f11520d = true;
                        if (m14071F != null) {
                            m14071F.close();
                        }
                        return false;
                    }
                    m14071F.beginTransaction();
                    m14071F.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m14071F.setTransactionSuccessful();
                    m14071F.endTransaction();
                    m14071F.close();
                    return true;
                } catch (SQLiteFullException e10) {
                    zzj().m14182B().m14219b("Error deleting app launch break from local database", e10);
                    this.f11520d = true;
                    i10 = 0 == 0 ? i10 + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    zzj().m14182B().m14219b("Error deleting app launch break from local database", e11);
                    this.f11520d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i11);
                i11 += 20;
                if (0 == 0) {
                }
                sQLiteDatabase.close();
            }
        }
        zzj().m14187G().m14218a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C5486f mo13672a() {
        return super.mo13672a();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5730y mo13675c() {
        return super.mo13675c();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5582m4 mo13677d() {
        return super.mo13677d();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5735y4 mo13679e() {
        return super.mo13679e();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5537ib mo13681f() {
        return super.mo13681f();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo13683g() {
        super.mo13683g();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo13685h() {
        super.mo13685h();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3, com.google.android.gms.measurement.internal.C5701v6
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo13687i() {
        super.mo13687i();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5718x mo13689j() {
        return super.mo13689j();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5530i4 mo13691k() {
        return super.mo13691k();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5569l4 mo13693l() {
        return super.mo13693l();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5442b7 mo13695m() {
        return super.mo13695m();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5612o8 mo13697n() {
        return super.mo13697n();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5703v8 mo13698o() {
        return super.mo13698o();
    }

    @Override // com.google.android.gms.measurement.internal.C5746z3
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C5471da mo13699p() {
        return super.mo13699p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5733y2
    /* renamed from: v */
    protected final boolean mo13704v() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01eb  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<p081ea.AbstractC7138a> m14080x(int r22) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5569l4.m14080x(int):java.util.List");
    }

    /* renamed from: z */
    public final boolean m14081z(C5460d c5460d) {
        mo13681f();
        byte[] m13994k0 = C5537ib.m13994k0(c5460d);
        if (m13994k0.length <= 131072) {
            return m14074y(2, m13994k0);
        }
        zzj().m14184D().m14218a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ InterfaceC9461f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5473e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5595n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.C5701v6, com.google.android.gms.measurement.internal.InterfaceC5713w6
    public final /* bridge */ /* synthetic */ C5635q5 zzl() {
        return super.zzl();
    }
}
