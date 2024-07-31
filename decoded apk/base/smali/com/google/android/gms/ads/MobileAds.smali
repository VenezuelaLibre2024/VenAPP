.class public Lcom/google/android/gms/ads/MobileAds;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/internal/client/m3;->m(Landroid/content/Context;)V

    return-void
.end method

.method public static b()Lx8/y;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/client/m3;->e()Lx8/y;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lx8/a0;
    .locals 6

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    const-string v0, "23.0.0"

    const-string v1, "\\."

    invoke-static {v0, v1}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    new-instance v0, Lx8/a0;

    invoke-direct {v0, v3, v3, v3}, Lx8/a0;-><init>(III)V

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v1, Lx8/a0;

    aget-object v2, v0, v3

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    const/4 v4, 0x1

    aget-object v4, v0, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/4 v5, 0x2

    aget-object v0, v0, v5

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-direct {v1, v2, v4, v0}, Lx8/a0;-><init>(III)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    new-instance v0, Lx8/a0;

    invoke-direct {v0, v3, v3, v3}, Lx8/a0;-><init>(III)V

    :goto_0
    return-object v0
.end method

.method public static d(Landroid/content/Context;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, v1}, Lcom/google/android/gms/ads/internal/client/m3;->n(Landroid/content/Context;Ljava/lang/String;Le9/c;)V

    return-void
.end method

.method public static e(Landroid/content/Context;Le9/c;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Lcom/google/android/gms/ads/internal/client/m3;->n(Landroid/content/Context;Ljava/lang/String;Le9/c;)V

    return-void
.end method

.method public static f(Landroid/content/Context;Lx8/s;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/ads/internal/client/m3;->q(Landroid/content/Context;Lx8/s;)V

    return-void
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/google/android/gms/ads/internal/client/m3;->r(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static h(Landroid/webkit/WebView;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    const-string v0, "#008 Must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/s;->e(Ljava/lang/String;)V

    if-nez p0, :cond_0

    const-string p0, "The webview to be registered cannot be null."

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzcec;->zzg(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbxk;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzcct;

    move-result-object v0

    if-nez v0, :cond_1

    const-string p0, "Internal error, query info generator is null."

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzcec;->zzg(Ljava/lang/String;)V

    return-void

    :cond_1
    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/zzcct;->zzj(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string v0, ""

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static i(Z)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/internal/client/m3;->s(Z)V

    return-void
.end method

.method public static j(F)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/internal/client/m3;->t(F)V

    return-void
.end method

.method public static k(Lx8/y;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/internal/client/m3;->v(Lx8/y;)V

    return-void
.end method

.method private static setPlugin(Ljava/lang/String;)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/m3;->h()Lcom/google/android/gms/ads/internal/client/m3;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/ads/internal/client/m3;->u(Ljava/lang/String;)V

    return-void
.end method
