package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.firebase.auth.AbstractC6084j0;
import com.google.firebase.auth.AbstractC6092l0;
import com.google.firebase.auth.C6124t0;
import com.google.firebase.auth.C6143y0;
import java.util.ArrayList;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: oc.o */
/* loaded from: classes.dex */
public final class C9875o extends AbstractC6092l0 {
    public static final Parcelable.Creator<C9875o> CREATOR = new C9872n();

    /* renamed from: a */
    private String f24354a;

    /* renamed from: b */
    private String f24355b;

    /* renamed from: c */
    private List<C6124t0> f24356c;

    /* renamed from: d */
    private List<C6143y0> f24357d;

    /* renamed from: e */
    private C9842d f24358e;

    private C9875o() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9875o(String str, String str2, List<C6124t0> list, List<C6143y0> list2, C9842d c9842d) {
        this.f24354a = str;
        this.f24355b = str2;
        this.f24356c = list;
        this.f24357d = list2;
        this.f24358e = c9842d;
    }

    /* renamed from: v1 */
    public static C9875o m29565v1(String str, C9842d c9842d) {
        C5276s.m13320f(str);
        C9875o c9875o = new C9875o();
        c9875o.f24354a = str;
        c9875o.f24358e = c9842d;
        return c9875o;
    }

    /* renamed from: w1 */
    public static C9875o m29566w1(List<AbstractC6084j0> list, String str) {
        List list2;
        AbstractC7138a abstractC7138a;
        C5276s.m13324j(list);
        C5276s.m13320f(str);
        C9875o c9875o = new C9875o();
        c9875o.f24356c = new ArrayList();
        c9875o.f24357d = new ArrayList();
        for (AbstractC6084j0 abstractC6084j0 : list) {
            if (abstractC6084j0 instanceof C6124t0) {
                list2 = c9875o.f24356c;
                abstractC7138a = (C6124t0) abstractC6084j0;
            } else {
                if (!(abstractC6084j0 instanceof C6143y0)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + abstractC6084j0.mo16555v1());
                }
                list2 = c9875o.f24357d;
                abstractC7138a = (C6143y0) abstractC6084j0;
            }
            list2.add(abstractC7138a);
        }
        c9875o.f24355b = str;
        return c9875o;
    }

    /* renamed from: u1 */
    public final C9842d m29567u1() {
        return this.f24358e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21200G(parcel, 1, this.f24354a, false);
        C7140c.m21200G(parcel, 2, this.f24355b, false);
        C7140c.m21204K(parcel, 3, this.f24356c, false);
        C7140c.m21204K(parcel, 4, this.f24357d, false);
        C7140c.m21198E(parcel, 5, this.f24358e, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }

    public final String zzb() {
        return this.f24354a;
    }

    public final String zzc() {
        return this.f24355b;
    }

    public final boolean zzd() {
        return this.f24354a != null;
    }
}
