.class final Lcom/google/android/gms/internal/location/zzcu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/k$b;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/location/LocationAvailability;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/location/zzcw;Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/location/zzcu;->zza:Lcom/google/android/gms/location/LocationAvailability;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic notifyListener(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/location/m;

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzcu;->zza:Lcom/google/android/gms/location/LocationAvailability;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/m;->onLocationAvailability(Lcom/google/android/gms/location/LocationAvailability;)V

    return-void
.end method

.method public final onNotifyListenerFailed()V
    .locals 0

    return-void
.end method
