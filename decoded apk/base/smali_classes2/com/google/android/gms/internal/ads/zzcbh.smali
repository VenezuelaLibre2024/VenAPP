.class public final Lcom/google/android/gms/internal/ads/zzcbh;
.super Lo9/a;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzcan;

.field private final zzc:Landroid/content/Context;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzcbf;

.field private zze:Lx8/n;

.field private zzf:Ln9/a;

.field private zzg:Lx8/t;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lo9/a;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zza:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzc:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->a()Lcom/google/android/gms/ads/internal/client/v;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbsr;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzbsr;-><init>()V

    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/gms/ads/internal/client/v;->o(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsv;)Lcom/google/android/gms/internal/ads/zzcan;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzcbf;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzcbf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzd:Lcom/google/android/gms/internal/ads/zzcbf;

    return-void
.end method


# virtual methods
.method public final getAdMetadata()Landroid/os/Bundle;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcan;->zzb()Landroid/os/Bundle;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public final getFullScreenContentCallback()Lx8/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zze:Lx8/n;

    return-object v0
.end method

.method public final getOnAdMetadataChangedListener()Ln9/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzf:Ln9/a;

    return-object v0
.end method

.method public final getOnPaidEventListener()Lx8/t;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzg:Lx8/t;

    return-object v0
.end method

.method public final getResponseInfo()Lx8/z;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzcan;->zzc()Lcom/google/android/gms/ads/internal/client/p2;

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

.method public final getRewardItem()Ln9/b;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcan;->zzd()Lcom/google/android/gms/internal/ads/zzcak;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcax;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzcax;-><init>(Lcom/google/android/gms/internal/ads/zzcak;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    sget-object v0, Ln9/b;->a:Ln9/b;

    return-object v0
.end method

.method public final setFullScreenContentCallback(Lx8/n;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zze:Lx8/n;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzd:Lcom/google/android/gms/internal/ads/zzcbf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzcbf;->zzb(Lx8/n;)V

    return-void
.end method

.method public final setImmersiveMode(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzcan;->zzh(Z)V
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

.method public final setOnAdMetadataChangedListener(Ln9/a;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzf:Ln9/a;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/g4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/g4;-><init>(Ln9/a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzcan;->zzi(Lcom/google/android/gms/ads/internal/client/f2;)V
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzg:Lx8/t;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/ads/internal/client/h4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/h4;-><init>(Lx8/t;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzcan;->zzj(Lcom/google/android/gms/ads/internal/client/i2;)V
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

.method public final setServerSideVerificationOptions(Ln9/e;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcbb;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzcbb;-><init>(Ln9/e;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzcan;->zzl(Lcom/google/android/gms/internal/ads/zzcbb;)V
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

.method public final show(Landroid/app/Activity;Lx8/u;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzd:Lcom/google/android/gms/internal/ads/zzcbf;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzcbf;->zzc(Lx8/u;)V

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzd:Lcom/google/android/gms/internal/ads/zzcbf;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/zzcan;->zzk(Lcom/google/android/gms/internal/ads/zzcaq;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/zzcan;->zzm(Lcom/google/android/gms/dynamic/b;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/ads/internal/client/z2;Lo9/b;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzb:Lcom/google/android/gms/internal/ads/zzcan;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/google/android/gms/ads/internal/client/y4;->a:Lcom/google/android/gms/ads/internal/client/y4;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcbh;->zzc:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Lcom/google/android/gms/ads/internal/client/y4;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z2;)Lcom/google/android/gms/ads/internal/client/u4;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcbg;

    invoke-direct {v1, p2, p0}, Lcom/google/android/gms/internal/ads/zzcbg;-><init>(Lo9/b;Lcom/google/android/gms/internal/ads/zzcbh;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzcan;->zzg(Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/internal/ads/zzcau;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
