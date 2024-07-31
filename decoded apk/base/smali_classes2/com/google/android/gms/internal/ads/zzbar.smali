.class public final Lcom/google/android/gms/internal/ads/zzbar;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zza:Lcom/google/android/gms/ads/internal/client/u0;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Lcom/google/android/gms/ads/internal/client/z2;

.field private final zze:I

.field private final zzf:Lz8/a$a;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzbsr;

.field private final zzh:Lcom/google/android/gms/ads/internal/client/y4;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/internal/client/z2;ILz8/a$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbsr;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbsr;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzg:Lcom/google/android/gms/internal/ads/zzbsr;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzb:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzc:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzd:Lcom/google/android/gms/ads/internal/client/z2;

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzbar;->zze:I

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzf:Lz8/a$a;

    sget-object p1, Lcom/google/android/gms/ads/internal/client/y4;->a:Lcom/google/android/gms/ads/internal/client/y4;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzh:Lcom/google/android/gms/ads/internal/client/y4;

    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 5

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/z4;->v1()Lcom/google/android/gms/ads/internal/client/z4;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->a()Lcom/google/android/gms/ads/internal/client/v;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzb:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzc:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzg:Lcom/google/android/gms/internal/ads/zzbsr;

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/google/android/gms/ads/internal/client/v;->d(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z4;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbsv;)Lcom/google/android/gms/ads/internal/client/u0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbar;->zza:Lcom/google/android/gms/ads/internal/client/u0;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbar;->zze:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/ads/internal/client/f5;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbar;->zze:I

    invoke-direct {v0, v1}, Lcom/google/android/gms/ads/internal/client/f5;-><init>(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbar;->zza:Lcom/google/android/gms/ads/internal/client/u0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/ads/internal/client/u0;->zzI(Lcom/google/android/gms/ads/internal/client/f5;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbar;->zza:Lcom/google/android/gms/ads/internal/client/u0;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzbae;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzf:Lz8/a$a;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzc:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzbae;-><init>(Lz8/a$a;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzH(Lcom/google/android/gms/internal/ads/zzbam;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbar;->zza:Lcom/google/android/gms/ads/internal/client/u0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzh:Lcom/google/android/gms/ads/internal/client/y4;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzb:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzbar;->zzd:Lcom/google/android/gms/ads/internal/client/z2;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/ads/internal/client/y4;->a(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/z2;)Lcom/google/android/gms/ads/internal/client/u4;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/internal/client/u0;->zzaa(Lcom/google/android/gms/ads/internal/client/u4;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
