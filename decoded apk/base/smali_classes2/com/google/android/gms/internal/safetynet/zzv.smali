.class abstract Lcom/google/android/gms/internal/safetynet/zzv;
.super Lcom/google/android/gms/internal/safetynet/zze;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/safetynet/zze<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field protected final zza:Lcom/google/android/gms/internal/safetynet/zzg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/safetynet/zze;-><init>(Lcom/google/android/gms/common/api/f;)V

    new-instance p1, Lcom/google/android/gms/internal/safetynet/zzu;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/safetynet/zzu;-><init>(Lcom/google/android/gms/internal/safetynet/zzv;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/safetynet/zzv;->zza:Lcom/google/android/gms/internal/safetynet/zzg;

    return-void
.end method


# virtual methods
.method protected final bridge synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/n;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/safetynet/zzaa;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/safetynet/zzaa;-><init>(Lcom/google/android/gms/common/api/Status;Lxa/j;)V

    return-object v0
.end method
