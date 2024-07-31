package p440xa;

import com.google.android.gms.common.api.C5203m;
import com.google.android.gms.common.api.InterfaceC5204n;

/* renamed from: xa.e */
/* loaded from: classes2.dex */
public interface InterfaceC12398e {

    /* renamed from: xa.e$a */
    /* loaded from: classes2.dex */
    public static class a extends C5203m<b> {
        /* renamed from: c */
        public String m40062c() {
            return m13213a().getJwsResult();
        }
    }

    @Deprecated
    /* renamed from: xa.e$b */
    /* loaded from: classes2.dex */
    public interface b extends InterfaceC5204n {
        String getJwsResult();
    }

    /* renamed from: xa.e$c */
    /* loaded from: classes2.dex */
    public static class c extends C5203m<d> {
        /* renamed from: c */
        public boolean m40063c() {
            return m13213a().isVerifyAppsEnabled();
        }
    }

    @Deprecated
    /* renamed from: xa.e$d */
    /* loaded from: classes2.dex */
    public interface d extends InterfaceC5204n {
        boolean isVerifyAppsEnabled();
    }
}
