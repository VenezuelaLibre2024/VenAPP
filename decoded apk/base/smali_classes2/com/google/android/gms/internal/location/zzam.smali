.class final Lcom/google/android/gms/internal/location/zzam;
.super Lcom/google/android/gms/internal/location/zzat;
.source "SourceFile"


# instance fields
.field final synthetic zza:Landroid/app/PendingIntent;

.field final synthetic zzb:Lcom/google/android/gms/location/LocationRequest;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/location/zzau;Lcom/google/android/gms/common/api/f;Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationRequest;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/location/zzam;->zza:Landroid/app/PendingIntent;

    iput-object p4, p0, Lcom/google/android/gms/internal/location/zzam;->zzb:Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/location/zzat;-><init>(Lcom/google/android/gms/common/api/f;)V

    return-void
.end method


# virtual methods
.method protected final bridge synthetic doExecute(Lcom/google/android/gms/common/api/a$b;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzam;->zza:Landroid/app/PendingIntent;

    iget-object v1, p0, Lcom/google/android/gms/internal/location/zzam;->zzb:Lcom/google/android/gms/location/LocationRequest;

    invoke-static {p0}, Lcom/google/android/gms/internal/location/zzau;->zza(Lcom/google/android/gms/common/api/internal/e;)Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/internal/location/zzda;->zzw(Landroid/app/PendingIntent;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
