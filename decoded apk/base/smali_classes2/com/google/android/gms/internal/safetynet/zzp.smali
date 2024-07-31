.class final Lcom/google/android/gms/internal/safetynet/zzp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxa/e$b;


# instance fields
.field private final zza:Lcom/google/android/gms/common/api/Status;

.field private final zzb:Lxa/g;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lxa/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/safetynet/zzp;->zza:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/safetynet/zzp;->zzb:Lxa/g;

    return-void
.end method


# virtual methods
.method public final getJwsResult()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzp;->zzb:Lxa/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lxa/g;->zza()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzp;->zza:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
