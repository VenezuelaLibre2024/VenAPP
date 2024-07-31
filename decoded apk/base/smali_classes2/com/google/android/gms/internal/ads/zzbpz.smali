.class public final Lcom/google/android/gms/internal/ads/zzbpz;
.super Ly8/c;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/ads/internal/client/y4;

.field private final zzc:Lcom/google/android/gms/ads/internal/client/u0;

.field private final zzd:Ljava/lang/String;

.field private final zze:Lcom/google/android/gms/internal/ads/zzbsr;

.field private zzf:Ly8/e;

.field private zzg:Lx8/n;

.field private zzh:Lx8/t;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ly8/c;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbsr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbsr;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zze:Lcom/google/android/gms/internal/ads/zzbsr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzd:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/ads/internal/client/y4;->a:Lcom/google/android/gms/ads/internal/client/y4;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzb:Lcom/google/android/gms/ads/internal/client/y4;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->a()Lcom/google/android/gms/ads/internal/client/v;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/ads/internal/client/z4;

    invoke-direct {v2}, Lcom/google/android/gms/ads/internal/client/z4;-><init>()V

    invoke-virtual {v1, p1, v2, p2, v0}, Lcom/google/android/gms/ads/internal/client/v;->e(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsv;)Lcom/google/android/gms/ads/internal/client/u0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzc:Lcom/google/android/gms/ads/internal/client/u0;

    return-void
.end method


# virtual methods
.method public final getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final getAppEventListener()Ly8/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzf:Ly8/e;

    return-object v0
.end method

.method public final getFullScreenContentCallback()Lx8/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzg:Lx8/n;

    return-object v0
.end method

.method public final getOnPaidEventListener()Lx8/t;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzh:Lx8/t;

    return-object v0
.end method

.method public final getResponseInfo()Lx8/z;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzc:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzk()Lcom/google/android/gms/ads/internal/client/p2;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    invoke-static {v0}, Lx8/z;->g(Lcom/google/android/gms/ads/internal/client/p2;)Lx8/z;

    move-result-object v0

    return-object v0
.end method

.method public final setAppEventListener(Ly8/e;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzf:Ly8/e;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzc:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzaze;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzaze;-><init>(Ly8/e;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzG(Lcom/google/android/gms/ads/internal/client/c1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setFullScreenContentCallback(Lx8/n;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzg:Lx8/n;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzc:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/b0;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/b0;-><init>(Lx8/n;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzJ(Lcom/google/android/gms/ads/internal/client/j1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setImmersiveMode(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzc:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzL(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setOnPaidEventListener(Lx8/t;)V
    .locals 2

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzh:Lx8/t;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzc:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/h4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/h4;-><init>(Lx8/t;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzP(Lcom/google/android/gms/ads/internal/client/i2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final show(Landroid/app/Activity;)V
    .locals 1

    if-nez p1, :cond_0

    const-string v0, "The activity for show is null, will proceed with show using the context provided when loading the ad."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzj(Ljava/lang/String;)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzc:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/ads/internal/client/u0;->zzW(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/ads/internal/client/z2;Lx8/f;)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzc:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zzb:Lcom/google/android/gms/ads/internal/client/y4;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbpz;->zza:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/ads/internal/client/y4;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z2;)Lcom/google/android/gms/ads/internal/client/u4;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/ads/internal/client/q4;

    invoke-direct {v1, p2, p0}, Lcom/google/android/gms/ads/internal/client/q4;-><init>(Lx8/f;Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzy(Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/ads/internal/client/k0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v3, "Internal Error."

    const-string v4, "com.google.android.gms.ads"

    new-instance p1, Lx8/o;

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lx8/o;-><init>(ILjava/lang/String;Ljava/lang/String;Lx8/b;Lx8/z;)V

    invoke-virtual {p2, p1}, Lx8/f;->onAdFailedToLoad(Lx8/o;)V

    return-void
.end method
