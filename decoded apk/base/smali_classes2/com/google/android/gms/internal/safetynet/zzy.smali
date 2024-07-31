.class final Lcom/google/android/gms/internal/safetynet/zzy;
.super Lcom/google/android/gms/internal/safetynet/zzd;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/safetynet/zzz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/safetynet/zzz;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/safetynet/zzy;->zza:Lcom/google/android/gms/internal/safetynet/zzz;

    invoke-direct {p0}, Lcom/google/android/gms/internal/safetynet/zzd;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzj(Lcom/google/android/gms/common/api/Status;Lxa/b;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzy;->zza:Lcom/google/android/gms/internal/safetynet/zzz;

    new-instance v1, Lcom/google/android/gms/internal/safetynet/zzac;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzac;-><init>(Lcom/google/android/gms/common/api/Status;Lxa/b;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method
