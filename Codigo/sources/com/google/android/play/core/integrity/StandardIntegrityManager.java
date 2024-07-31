package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public interface StandardIntegrityManager {

    /* loaded from: classes2.dex */
    public static abstract class PrepareIntegrityTokenRequest {

        /* loaded from: classes2.dex */
        public static abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j10);
        }

        public static Builder builder() {
            return new f();
        }

        public abstract long a();
    }

    /* loaded from: classes2.dex */
    public static abstract class StandardIntegrityToken {
        public abstract String token();
    }

    /* loaded from: classes2.dex */
    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    /* loaded from: classes2.dex */
    public static abstract class StandardIntegrityTokenRequest {

        /* loaded from: classes2.dex */
        public static abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);
        }

        public static Builder builder() {
            return new i();
        }

        public abstract String a();
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
