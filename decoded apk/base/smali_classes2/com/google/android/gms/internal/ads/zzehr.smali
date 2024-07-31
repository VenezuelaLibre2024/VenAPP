.class final Lcom/google/android/gms/internal/ads/zzehr;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic zza:Landroid/app/AlertDialog;

.field final synthetic zzb:Ljava/util/Timer;

.field final synthetic zzc:Lg9/u;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzehs;Landroid/app/AlertDialog;Ljava/util/Timer;Lg9/u;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzehr;->zza:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzehr;->zzb:Ljava/util/Timer;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzehr;->zzc:Lg9/u;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehr;->zza:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehr;->zzb:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzehr;->zzc:Lg9/u;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg9/u;->zzb()V

    :cond_0
    return-void
.end method
