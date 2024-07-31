package gd;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p081ea.AbstractC7138a;
import p105fd.InterfaceC7331d;

/* renamed from: gd.j */
/* loaded from: classes.dex */
public final class C7554j extends AbstractC7138a implements InterfaceC7331d {
    public static final Parcelable.Creator<C7554j> CREATOR = new C7555k();

    /* renamed from: a */
    private final Uri f17859a;

    /* renamed from: b */
    private final Uri f17860b;

    /* renamed from: c */
    private final List<a> f17861c;

    /* renamed from: gd.j$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC7138a implements InterfaceC7331d.a {
        public static final Parcelable.Creator<a> CREATOR = new C7556l();

        /* renamed from: a */
        private final String f17862a;

        public a(String str) {
            this.f17862a = str;
        }

        @Override // p105fd.InterfaceC7331d.a
        public String getMessage() {
            return this.f17862a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            C7556l.m22936c(this, parcel, i10);
        }
    }

    public C7554j(Uri uri, Uri uri2, List<a> list) {
        this.f17859a = uri;
        this.f17860b = uri2;
        this.f17861c = list == null ? new ArrayList<>() : list;
    }

    @Override // p105fd.InterfaceC7331d
    /* renamed from: U */
    public Uri mo22030U() {
        return this.f17860b;
    }

    @Override // p105fd.InterfaceC7331d
    /* renamed from: h0 */
    public List<a> mo22031h0() {
        return this.f17861c;
    }

    @Override // p105fd.InterfaceC7331d
    /* renamed from: i0 */
    public Uri mo22032i0() {
        return this.f17859a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C7555k.m22933c(this, parcel, i10);
    }
}
