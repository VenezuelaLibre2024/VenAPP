.class public final Lcom/google/android/gms/ads/internal/client/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/r;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/google/android/gms/ads/internal/client/x1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/x1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/y1;->b:Lcom/google/android/gms/ads/internal/client/x1;

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/ads/internal/client/x1;->zze()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/y1;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/ads/internal/client/x1;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/y1;->b:Lcom/google/android/gms/ads/internal/client/x1;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/y1;->a:Ljava/lang/String;

    return-object v0
.end method
