.class final Lcom/google/android/gms/internal/safetynet/zzs;
.super Lcom/google/android/gms/internal/safetynet/zzd;
.source "SourceFile"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/safetynet/zzt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/safetynet/zzt;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/safetynet/zzs;->zza:Lcom/google/android/gms/internal/safetynet/zzt;

    invoke-direct {p0}, Lcom/google/android/gms/internal/safetynet/zzd;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lcom/google/android/gms/common/api/Status;Z)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/safetynet/zzs;->zza:Lcom/google/android/gms/internal/safetynet/zzt;

    new-instance v1, Lcom/google/android/gms/internal/safetynet/zzad;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/safetynet/zzad;-><init>(Lcom/google/android/gms/common/api/Status;Z)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/n;)V

    return-void
.end method
