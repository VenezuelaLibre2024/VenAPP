.class final Lcom/google/android/gms/internal/location/zzt;
.super Lcom/google/android/gms/internal/location/zzv;
.source "SourceFile"


# instance fields
.field final synthetic zza:J

.field final synthetic zzb:Landroid/app/PendingIntent;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/location/zzw;Lcom/google/android/gms/common/api/f;JLandroid/app/PendingIntent;)V
    .locals 0

    iput-wide p3, p0, Lcom/google/android/gms/internal/location/zzt;->zza:J

    iput-object p5, p0, Lcom/google/android/gms/internal/location/zzt;->zzb:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/location/zzv;-><init>(Lcom/google/android/gms/common/api/f;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic doExecute(Lcom/google/android/gms/common/api/a$b;)V
    .locals 6

    check-cast p1, Lcom/google/android/gms/internal/location/zzf;

    iget-wide v0, p0, Lcom/google/android/gms/internal/location/zzt;->zza:J

    iget-object v2, p0, Lcom/google/android/gms/internal/location/zzt;->zzb:Landroid/app/PendingIntent;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    const/4 v4, 0x1

    if-ltz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const-string v5, "detectionIntervalMillis must be >= 0"

    invoke-static {v3, v5}, Lcom/google/android/gms/common/internal/s;->b(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/location/zzo;

    invoke-interface {p1, v0, v1, v4, v2}, Lcom/google/android/gms/internal/location/zzo;->zzr(JZLandroid/app/PendingIntent;)V

    sget-object p1, Lcom/google/android/gms/common/api/Status;->r:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method
