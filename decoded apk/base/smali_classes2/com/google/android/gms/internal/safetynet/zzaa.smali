.class final Lcom/google/android/gms/internal/safetynet/zzaa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/n;


# instance fields
.field private final zza:Lcom/google/android/gms/common/api/Status;

.field private final zzb:Lxa/j;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lxa/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zza:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zzb:Lxa/j;

    return-void
.end method


# virtual methods
.method public final getHarmfulAppsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxa/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zzb:Lxa/j;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lxa/j;->b:[Lxa/a;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final getHoursSinceLastScanWithHarmfulApp()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zzb:Lxa/j;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget v0, v0, Lxa/j;->c:I

    return v0
.end method

.method public final getLastScanTimeMs()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zzb:Lxa/j;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-wide v0, v0, Lxa/j;->a:J

    return-wide v0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzaa;->zza:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
