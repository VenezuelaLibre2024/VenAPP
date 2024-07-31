package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.ads.AdError;
import com.google.android.gms.common.annotation.KeepName;
import ea.c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends ea.a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new b();

    /* renamed from: v, reason: collision with root package name */
    private static final a f9515v = new com.google.android.gms.common.data.a(new String[0], null);

    /* renamed from: a, reason: collision with root package name */
    final int f9516a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f9517b;

    /* renamed from: c, reason: collision with root package name */
    Bundle f9518c;

    /* renamed from: d, reason: collision with root package name */
    private final CursorWindow[] f9519d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9520e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f9521f;

    /* renamed from: r, reason: collision with root package name */
    int[] f9522r;

    /* renamed from: s, reason: collision with root package name */
    int f9523s;

    /* renamed from: t, reason: collision with root package name */
    boolean f9524t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f9525u = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String[] f9526a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f9527b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f9528c = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f9516a = i10;
        this.f9517b = strArr;
        this.f9519d = cursorWindowArr;
        this.f9520e = i11;
        this.f9521f = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.f9524t) {
                this.f9524t = true;
                int i10 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f9519d;
                    if (i10 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i10].close();
                    i10++;
                }
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.f9525u && this.f9519d.length > 0 && !isClosed()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.f9524t;
        }
        return z10;
    }

    public Bundle u1() {
        return this.f9521f;
    }

    public int v1() {
        return this.f9520e;
    }

    public final void w1() {
        this.f9518c = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.f9517b;
            if (i11 >= strArr.length) {
                break;
            }
            this.f9518c.putInt(strArr[i11], i11);
            i11++;
        }
        this.f9522r = new int[this.f9519d.length];
        int i12 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f9519d;
            if (i10 >= cursorWindowArr.length) {
                this.f9523s = i12;
                return;
            }
            this.f9522r[i10] = i12;
            i12 += this.f9519d[i10].getNumRows() - (i12 - cursorWindowArr[i10].getStartPosition());
            i10++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, this.f9517b, false);
        c.J(parcel, 2, this.f9519d, i10, false);
        c.u(parcel, 3, v1());
        c.j(parcel, 4, u1(), false);
        c.u(parcel, AdError.NETWORK_ERROR_CODE, this.f9516a);
        c.b(parcel, a10);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
