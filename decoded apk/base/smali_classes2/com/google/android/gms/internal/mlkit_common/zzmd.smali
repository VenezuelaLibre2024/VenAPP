.class public final Lcom/google/android/gms/internal/mlkit_common/zzmd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_common/zzlz;

.field private final zzb:Lcom/google/android/gms/internal/mlkit_common/zzmb;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_common/zzmb;

.field private final zzd:Ljava/lang/Boolean;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_common/zzma;Lcom/google/android/gms/internal/mlkit_common/zzmc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_common/zzma;->zza(Lcom/google/android/gms/internal/mlkit_common/zzma;)Lcom/google/android/gms/internal/mlkit_common/zzlz;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzmd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlz;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzmd;->zzb:Lcom/google/android/gms/internal/mlkit_common/zzmb;

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzmd;->zzc:Lcom/google/android/gms/internal/mlkit_common/zzmb;

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzmd;->zzd:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/gms/internal/mlkit_common/zzmd;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/mlkit_common/zzmd;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzmd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlz;

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_common/zzmd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlz;

    invoke-static {v1, p1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    invoke-static {p1, p1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1, p1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1, p1}, Lcom/google/android/gms/common/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzmd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlz;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final zza()Lcom/google/android/gms/internal/mlkit_common/zzlz;
    .locals 1
    .annotation build Lcom/google/android/gms/internal/mlkit_common/zzbo;
        zza = 0x1
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzmd;->zza:Lcom/google/android/gms/internal/mlkit_common/zzlz;

    return-object v0
.end method
