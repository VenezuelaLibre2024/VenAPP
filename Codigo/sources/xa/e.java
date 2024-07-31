package xa;

/* loaded from: classes2.dex */
public interface e {

    /* loaded from: classes2.dex */
    public static class a extends com.google.android.gms.common.api.m<b> {
        public String c() {
            return a().getJwsResult();
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface b extends com.google.android.gms.common.api.n {
        String getJwsResult();
    }

    /* loaded from: classes2.dex */
    public static class c extends com.google.android.gms.common.api.m<d> {
        public boolean c() {
            return a().isVerifyAppsEnabled();
        }
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface d extends com.google.android.gms.common.api.n {
        boolean isVerifyAppsEnabled();
    }
}
