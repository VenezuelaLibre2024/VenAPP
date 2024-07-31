package com.facebook.ads.redexgen.uinode;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.ads.redexgen.X.7o */
/* loaded from: assets/audience_network.dex */
public final class C27027o {
    public static byte[] A04;
    public static String[] A05 = {"qJOvsPrm5BQkhL6wLJahauzjA45r7dQz", "hfx8x2hkXgxq19RSFkkqiaOe1zMy03Qo", "bV5o7GaQth4ZZOPd4LFtWwXjKNVB8lua", "1EyYFmGpmEhL9EWyl0I1ptwRPtnJxpez", "F", "i", "plO80lk7YnGQvaXazMopbLIwOg8MB0TR", "EzLFA06L6a2SQhX4934tm7serJXXg4XA"};
    public static final String A06;
    public static final Lock A07;
    public static final Lock A08;
    public static final ReentrantReadWriteLock A09;
    public SQLiteOpenHelper A00;
    public final C4336Ym A01;
    public final C4334Yk A03 = new C4334Yk(this);
    public final C4335Yl A02 = new C4335Yl(this);

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[3].charAt(0) != '1') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[0] = "6YOEgEHO6bjbd5au9bSAefu6W5tI3Dak";
            strArr[6] = "kgOgsYcmlOEy6T8oxoaixHiO6WRSp1D2";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 115);
            i13++;
        }
    }

    public static void A07() {
        A04 = new byte[]{-31, -2, -31, -81, -51, -81, -50, -11, 22, 40, 24, -67, -29, -17, -20, -22, -67, -44, -2, 3, -3, 2, -44, -108, -64, -67, -63, -67, -56, -108, -106, -59, -60, -106, -35, 12, 15, 1, 2, 15, -35, -1, 22, -35, -42, 9, -5, 10, -42, -98, -43, -58, -61, -48, -61, -98, -49, -43, -46, -58, 11, 3, -54, -52, 22, 52, 65, 65, 66, 71, -13, 54, 52, 63, 63, -13, 58, 56, 71, 23, 52, 71, 52, 53, 52, 70, 56, -13, 57, 69, 66, 64, -13, 71, 59, 56, -13, 40, 28, -13, 71, 59, 69, 56, 52, 55, -12, 33, 19, 26, 19, 17, 34, -18, 66, 61, 57, 51, 60, 65, -4, 39, 34, 22, 19, 38, 23, -14, 43, 40, 59, 40, 41, 40, 58, 44, 71, 88, 71, 80, 86, 85, -9, -14, -18, -24, -15, -10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0J() {
        for (int i10 = 0; i10 < A0M().length; i10++) {
        }
        SQLiteOpenHelper sQLiteOpenHelper = this.A00;
        if (sQLiteOpenHelper != null) {
            sQLiteOpenHelper.close();
            this.A00 = null;
        }
    }

    static {
        A07();
        StringBuilder append = new StringBuilder().append(A05(107, 14, 91)).append(C4334Yk.A02.A01);
        String A052 = A05(58, 2, 51);
        StringBuilder append2 = append.append(A052);
        String A053 = A05(142, 6, 16);
        StringBuilder append3 = append2.append(A053);
        String A054 = A05(60, 1, 106);
        StringBuilder append4 = append3.append(A054).append(C4334Yk.A01.A01).append(A052);
        String A055 = A05(136, 6, 111);
        A06 = append4.append(A055).append(A054).append(C4335Yl.A04.A01).append(A052).append(A055).append(A054).append(C4335Yl.A05.A01).append(A052).append(A055).append(A054).append(C4335Yl.A0A.A01).append(A052).append(A055).append(A054).append(C4335Yl.A08.A01).append(A052).append(A055).append(A054).append(C4335Yl.A07.A01).append(A052).append(A055).append(A054).append(C4335Yl.A06.A01).append(A052).append(A055).append(A054).append(C4335Yl.A03.A01).append(A052).append(A055).append(A054).append(C4335Yl.A02.A01).append(A05(11, 6, 42)).append(A055).append(A05(17, 6, 65)).append(A053).append(A05(30, 4, 3)).append(A055).append(A054).append(C4335Yl.A09.A01).append(A05(0, 3, 78)).append(A053).append(A054).append(C4334Yk.A02.A01).append(A05(34, 10, 74)).append(A055).append(A054).append(C4335Yl.A08.A01).append(A05(7, 4, 98)).toString();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        A09 = reentrantReadWriteLock;
        A07 = reentrantReadWriteLock.readLock();
        A08 = reentrantReadWriteLock.writeLock();
    }

    public C27027o(C4336Ym c4336Ym) {
        this.A01 = c4336Ym;
    }

    private synchronized SQLiteDatabase A00() {
        if (this.A00 == null) {
            final C4336Ym c4336Ym = this.A01;
            this.A00 = new SQLiteOpenHelper(c4336Ym, this) { // from class: com.facebook.ads.redexgen.X.7p
                public static byte[] A01;
                public static String[] A02 = {"JShIJu3JRfHt43ypO9GqFaXtQU", "Uet3LTw8rLJmru1DFWkYPrIPq9yjzQ4", "LBYTyoU1fD8w8O4ue", "ZxNu1nQjo2XkCjw5ERk40jWGoeLjYM9V", "VhJY3C97J7J84q76u4hEYHgB0g", "Ro8Wdk2EPx5GRn22XYsr1QjtSyjSX", "SdOPztDY16h0BPmxgfN82QFEWJhjV", "9YM807W9r6X84VXv6l9L7RtBJQk8UQ"};
                public static final String A03;
                public final C27027o A00;

                public static String A00(int i10, int i11, int i12) {
                    byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                    for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                        copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 76);
                    }
                    return new String(copyOfRange);
                }

                public static void A02() {
                    A01 = new byte[]{17, 1, 101, 100, 103, 96, 116, 109, 117, 1, 17, 48, 61, 37, 52, 35, 81, 37, 48, 51, 61, 52, 81, 20, 7, 20, 31, 5, 2, 81, 48, 53, 53, 81, 50, 62, 61, 36, 60, 63, 81, 90, Byte.MAX_VALUE, 95, 122, 111, 122, 121, 122, 104, 126, 83, 126, 119, 107, 126, 105, 59, 120, 122, 117, 59, 117, 116, 111, 59, 121, 126, 59, 117, 110, 119, 119, 33, 55, 42, 53, 69, 49, 36, 39, 41, 32, 69, 44, 35, 69, 32, 61, 44, 54, 49, 54, 69, 6, 23, 4, 22, 13, 0, 22, 88, 90, 73, 79, 69, 73, 40, 110, 103, 122, 109, 97, 111, 102, 87, 99, 109, 113, 123, 40, 53, 40, 71, 70, 51, 124, 121, 110, 56, 110, 51, 121, Byte.MAX_VALUE};
                }

                static {
                    A02();
                    A03 = C27037p.class.getSimpleName();
                }

                {
                    super(c4336Ym, A01(c4336Ym), (SQLiteDatabase.CursorFactory) null, 4);
                    if (this != null) {
                        this.A00 = this;
                        return;
                    }
                    throw new IllegalArgumentException(A00(41, 32, 87));
                }

                public static String A01(C4336Ym c4336Ym2) {
                    Locale locale = Locale.US;
                    Object[] objArr = {A00(0, 0, 95)};
                    String processName = A00(126, 8, 81);
                    String format = String.format(locale, processName, objArr);
                    if (!C3348Ih.A2C(c4336Ym2)) {
                        return format;
                    }
                    String defaultDbName = c4336Ym2.getPackageName();
                    String processName2 = ProcessUtils.getProcessName(c4336Ym2);
                    if (!defaultDbName.equals(processName2) && !TextUtils.isEmpty(processName2)) {
                        String defaultDbName2 = '_' + processName2;
                        return String.format(Locale.US, processName, defaultDbName2);
                    }
                    return format;
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                    for (AbstractC27067s abstractC27067s : this.A00.A0M()) {
                        abstractC27067s.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                    for (AbstractC27067s abstractC27067s : this.A00.A0M()) {
                        abstractC27067s.A08(sQLiteDatabase);
                        abstractC27067s.A07(sQLiteDatabase);
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onOpen(SQLiteDatabase sQLiteDatabase) {
                    super.onOpen(sQLiteDatabase);
                    if (!sQLiteDatabase.isReadOnly()) {
                        sQLiteDatabase.execSQL(A00(101, 25, 68));
                    }
                }

                @Override // android.database.sqlite.SQLiteOpenHelper
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
                    if (i10 == 2 && i11 >= 3) {
                        String A00 = A00(73, 28, 41);
                        if (A02[7].length() != 30) {
                            throw new RuntimeException();
                        }
                        A02[3] = "Uy0CZyDaBZXeJSQ63Y80hAJR5wsAelR7";
                        sQLiteDatabase.execSQL(A00);
                    }
                    if (i10 <= 3 && i11 >= 4) {
                        C27007m c27007m = C4335Yl.A02;
                        sQLiteDatabase.execSQL(A00(11, 30, 61) + c27007m.A01 + A00(0, 1, 125) + c27007m.A02 + A00(1, 10, 109));
                    }
                }
            };
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized SQLiteDatabase A01() {
        SQLiteException e10 = null;
        for (int i10 = 0; i10 < 10; i10++) {
            try {
            } catch (SQLiteException e11) {
                e10 = e11;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
        this.A01.A07().A9a(A05(RecognitionOptions.ITF, 8, 84), AbstractC27248A.A0v, new C27258B(e10));
        throw e10;
        return A00();
    }

    public final int A08(int i10) {
        Lock lock = A08;
        lock.lock();
        try {
            int delete = A0E().delete(A05(136, 6, 111), C4335Yl.A02.A01 + A05(3, 4, 28), new String[]{String.valueOf(i10 - 1)});
            lock.unlock();
            return delete;
        } catch (Throwable th2) {
            A08.unlock();
            throw th2;
        }
    }

    public final Cursor A09() {
        Lock lock = A07;
        lock.lock();
        try {
            Cursor A0B = this.A02.A0B();
            lock.unlock();
            return A0B;
        } catch (Throwable th2) {
            A07.unlock();
            throw th2;
        }
    }

    public final Cursor A0A() {
        Lock lock = A07;
        lock.lock();
        try {
            Cursor A0C = this.A02.A0C();
            lock.unlock();
            return A0C;
        } catch (Throwable th2) {
            A07.unlock();
            throw th2;
        }
    }

    public final Cursor A0B() {
        Lock lock = A07;
        lock.lock();
        try {
            Cursor A0B = this.A03.A0B();
            lock.unlock();
            return A0B;
        } catch (Throwable th2) {
            A07.unlock();
            throw th2;
        }
    }

    public final Cursor A0C(int i10) {
        Lock lock = A07;
        lock.lock();
        try {
            Cursor rawQuery = A0E().rawQuery(A06 + A05(23, 7, 1) + String.valueOf(i10), null);
            lock.unlock();
            return rawQuery;
        } catch (Throwable th2) {
            A07.unlock();
            throw th2;
        }
    }

    public final Cursor A0D(String str) {
        Lock lock = A07;
        lock.lock();
        try {
            Cursor A0D = this.A02.A0D(str);
            lock.unlock();
            return A0D;
        } catch (Throwable th2) {
            A07.unlock();
            throw th2;
        }
    }

    public final SQLiteDatabase A0E() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return A01();
        }
        throw new IllegalStateException(A05(64, 43, 96));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8t != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> AsyncTask A0F(final AbstractC27057r<T> abstractC27057r, final AbstractC27688t<T> abstractC27688t) {
        Executor executor = ExecutorC3541Lt.A07;
        final C4336Ym c4336Ym = this.A01;
        return AbstractC3538Lq.A00(executor, new AsyncTask<Void, Void, T>(c4336Ym, abstractC27057r, abstractC27688t) { // from class: com.facebook.ads.redexgen.X.7n
            public static byte[] A04;
            public static String[] A05 = {"65r9CRdv0GoLRVNVjbjXzJK5P2ycj7FG", "0CWnyuhck9HOQgwCfxzQ09GVkx", "IEC2mc7xTTQi8lqWDODmms9jEFByhoZx", "6exEWFSZK9oTcnxcvUurXohDGqhdlb0H", "22QzghXqrFZ4DBGtDF", "dbvBYMdgslkBJuEWD9uCPJqFmtTt8cU5", "jZC4Ivj", "4jv2LQemXeCXPfpssPDUuPD2TleIiZzb"};
            public EnumC27047q A00;
            public final C4336Ym A01;
            public final AbstractC27057r<T> A02;
            public final AbstractC27688t<T> A03;

            public static String A01(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                for (int i13 = 0; i13 < copyOfRange.length; i13++) {
                    int i14 = (copyOfRange[i13] - i12) - 116;
                    if (A05[7].charAt(12) != 'P') {
                        throw new RuntimeException();
                    }
                    A05[6] = "VTML";
                    copyOfRange[i13] = (byte) i14;
                }
                return new String(copyOfRange);
            }

            public static void A02() {
                A04 = new byte[]{31, 28, 47, 28, 29, 28, 46, 32};
            }

            static {
                A02();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7n != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7r != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8t != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
            {
                this.A02 = abstractC27057r;
                this.A03 = abstractC27688t;
                this.A01 = c4336Ym;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7n != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            private final T A00(Void... voidArr) {
                if (AbstractC3447KL.A02(this)) {
                    return null;
                }
                if (A05[6].length() == 11) {
                    throw new RuntimeException();
                }
                A05[2] = "4eGiZ19xQ4OxGjIavdFldPBRBlbWR0DL";
                T t10 = null;
                try {
                    try {
                        t10 = this.A02.A03();
                        this.A00 = this.A02.A00();
                        return t10;
                    } catch (Exception e10) {
                        this.A01.A07().A9a(A01(0, 8, 71), AbstractC27248A.A0w, new C27258B(e10));
                        this.A00 = EnumC27047q.A09;
                        return t10;
                    }
                } catch (Throwable th2) {
                    AbstractC3447KL.A00(th2, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7n != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) {
                if (AbstractC3447KL.A02(this)) {
                    return null;
                }
                try {
                    return A00(voidArr);
                } catch (Throwable th2) {
                    AbstractC3447KL.A00(th2, this);
                    return null;
                }
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.7n != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
            @Override // android.os.AsyncTask
            public final void onPostExecute(T result) {
                if (AbstractC3447KL.A02(this)) {
                    return;
                }
                try {
                    EnumC27047q enumC27047q = this.A00;
                    if (enumC27047q == null) {
                        this.A03.A02(result);
                    } else {
                        this.A03.A01(enumC27047q.A02(), this.A00.A03());
                    }
                } catch (Throwable th2) {
                    AbstractC3447KL.A00(th2, this);
                }
            }
        }, new Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8t != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final AsyncTask A0G(String str, int i10, String str2, double d10, double d11, String str3, Map<String, String> data, AbstractC27688t<String> abstractC27688t) {
        return A0F(new C3088EP(this, str2, str, i10, d10, d11, str3, data), abstractC27688t);
    }

    public final void A0H() {
        Lock lock = A08;
        lock.lock();
        try {
            this.A02.A09();
            this.A03.A09();
            lock.unlock();
        } catch (Throwable th2) {
            A08.unlock();
            throw th2;
        }
    }

    public final void A0I() {
        Lock lock = A08;
        lock.lock();
        try {
            this.A03.A0D(this.A01);
            lock.unlock();
        } catch (Throwable th2) {
            A08.unlock();
            throw th2;
        }
    }

    public final boolean A0K(String str) {
        Lock lock = A08;
        lock.lock();
        try {
            boolean A0F = this.A02.A0F(str);
            lock.unlock();
            String[] strArr = A05;
            if (strArr[7].charAt(23) != strArr[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "8";
            strArr2[5] = "N";
            return A0F;
        } catch (Throwable th2) {
            A08.unlock();
            throw th2;
        }
    }

    public final boolean A0L(String str) {
        boolean z10;
        A08.lock();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A05(121, 7, 95)).append(A05(136, 6, 111)).append(A05(44, 5, 67)).append(C4335Yl.A02.A01).append(A05(61, 1, 83)).append(C4335Yl.A02.A01).append(A05(56, 2, 49)).append(A05(49, 7, 11)).append(C4335Yl.A04.A01).append(A05(62, 2, 26));
            A0E().execSQL(sb2.toString(), new String[]{str});
            z10 = true;
        } catch (SQLiteException unused) {
            z10 = false;
        }
        A08.unlock();
        String[] strArr = A05;
        if (strArr[0].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A05[2] = "LEhHmvsdsEQXOsQ0B1AVwqczGhJrofDk";
        return z10;
    }

    public final AbstractC27067s[] A0M() {
        return new AbstractC27067s[]{this.A03, this.A02};
    }
}
