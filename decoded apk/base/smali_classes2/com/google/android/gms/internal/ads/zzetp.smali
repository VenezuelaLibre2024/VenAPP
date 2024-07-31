.class final Lcom/google/android/gms/internal/ads/zzetp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final zza:Lcom/google/common/util/concurrent/f;

.field private final zzb:J

.field private final zzc:Lla/f;


# direct methods
.method public constructor <init>(Lcom/google/common/util/concurrent/f;JLla/f;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzetp;->zza:Lcom/google/common/util/concurrent/f;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzetp;->zzc:Lla/f;

    invoke-interface {p4}, Lla/f;->b()J

    move-result-wide v0

    add-long/2addr v0, p2

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzetp;->zzb:J

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzetp;->zzc:Lla/f;

    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzetp;->zzb:J

    invoke-interface {v0}, Lla/f;->b()J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
