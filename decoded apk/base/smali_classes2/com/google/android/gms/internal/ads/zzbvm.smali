.class final Lcom/google/android/gms/internal/ads/zzbvm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbvn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbvn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbvm;->zza:Lcom/google/android/gms/internal/ads/zzbvn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbvm;->zza:Lcom/google/android/gms/internal/ads/zzbvn;

    const-string p2, "Operation denied by user."

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzbvw;->zzh(Ljava/lang/String;)V

    return-void
.end method
