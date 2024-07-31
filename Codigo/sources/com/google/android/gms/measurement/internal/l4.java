package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class l4 extends y2 {

    /* renamed from: c */
    private final k4 f10347c;

    /* renamed from: d */
    private boolean f10348d;

    public l4(w5 w5Var) {
        super(w5Var);
        this.f10347c = new k4(this, zza(), "google_app_measurement_local.db");
    }

    private final SQLiteDatabase F() {
        if (this.f10348d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f10347c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f10348d = true;
        return null;
    }

    private final boolean G() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    private static long w(SQLiteDatabase sQLiteDatabase) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean y(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l4.y(int, byte[]):boolean");
    }

    public final boolean A(d0 d0Var) {
        Parcel obtain = Parcel.obtain();
        d0Var.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return y(0, marshall);
        }
        zzj().D().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean B(hb hbVar) {
        Parcel obtain = Parcel.obtain();
        hbVar.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return y(1, marshall);
        }
        zzj().D().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final void C() {
        int delete;
        i();
        try {
            SQLiteDatabase F = F();
            if (F == null || (delete = F.delete("messages", null, null) + 0) <= 0) {
                return;
            }
            zzj().F().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e10) {
            zzj().B().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean D() {
        return y(3, new byte[0]);
    }

    public final boolean E() {
        int i10;
        i();
        if (this.f10348d || !G()) {
            return false;
        }
        int i11 = 5;
        for (0; i10 < 5; i10 + 1) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase F = F();
                    if (F == null) {
                        this.f10348d = true;
                        if (F != null) {
                            F.close();
                        }
                        return false;
                    }
                    F.beginTransaction();
                    F.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    F.setTransactionSuccessful();
                    F.endTransaction();
                    F.close();
                    return true;
                } catch (SQLiteFullException e10) {
                    zzj().B().b("Error deleting app launch break from local database", e10);
                    this.f10348d = true;
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
                    zzj().B().b("Error deleting app launch break from local database", e11);
                    this.f10348d = true;
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
        zzj().G().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.z3, com.google.android.gms.measurement.internal.v6
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ x j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ i4 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ l4 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ b7 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ o8 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ v8 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.z3
    public final /* bridge */ /* synthetic */ da p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.y2
    protected final boolean v() {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<ea.a> x(int r22) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l4.x(int):java.util.List");
    }

    public final boolean z(d dVar) {
        f();
        byte[] k02 = ib.k0(dVar);
        if (k02.length <= 131072) {
            return y(2, k02);
        }
        zzj().D().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ la.f zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.w6
    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
