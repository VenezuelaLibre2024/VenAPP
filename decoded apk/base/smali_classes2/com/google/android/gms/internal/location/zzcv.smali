.class final Lcom/google/android/gms/internal/location/zzcv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/k$b;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/location/zzcw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/location/zzcw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/location/zzcv;->zza:Lcom/google/android/gms/internal/location/zzcw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic notifyListener(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/m;

    iget-object p1, p0, Lcom/google/android/gms/internal/location/zzcv;->zza:Lcom/google/android/gms/internal/location/zzcw;

    invoke-static {p1}, Lcom/google/android/gms/internal/location/zzcw;->zzc(Lcom/google/android/gms/internal/location/zzcw;)Lcom/google/android/gms/internal/location/zzcs;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/location/zzcs;->zzb()V

    return-void
.end method

.method public final onNotifyListenerFailed()V
    .locals 0

    return-void
.end method
