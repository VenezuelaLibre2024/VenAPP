package gd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import fd.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends ea.a implements fd.d {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a */
    private final Uri f16222a;

    /* renamed from: b */
    private final Uri f16223b;

    /* renamed from: c */
    private final List<a> f16224c;

    /* loaded from: classes.dex */
    public static class a extends ea.a implements d.a {
        public static final Parcelable.Creator<a> CREATOR = new l();

        /* renamed from: a */
        private final String f16225a;

        public a(String str) {
            this.f16225a = str;
        }

        @Override // fd.d.a
        public String getMessage() {
            return this.f16225a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            l.c(this, parcel, i10);
        }
    }

    public j(Uri uri, Uri uri2, List<a> list) {
        this.f16222a = uri;
        this.f16223b = uri2;
        this.f16224c = list == null ? new ArrayList<>() : list;
    }

    @Override // fd.d
    public Uri U() {
        return this.f16223b;
    }

    @Override // fd.d
    public List<a> h0() {
        return this.f16224c;
    }

    @Override // fd.d
    public Uri i0() {
        return this.f16222a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        k.c(this, parcel, i10);
    }
}
