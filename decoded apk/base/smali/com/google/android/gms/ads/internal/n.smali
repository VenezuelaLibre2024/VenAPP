.class final Lcom/google/android/gms/ads/internal/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/s;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/n;->a:Lcom/google/android/gms/ads/internal/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/n;->a:Lcom/google/android/gms/ads/internal/s;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/s;->i2(Lcom/google/android/gms/ads/internal/s;)Lcom/google/android/gms/internal/ads/zzavi;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/s;->i2(Lcom/google/android/gms/ads/internal/s;)Lcom/google/android/gms/internal/ads/zzavi;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzavi;->zzd(Landroid/view/MotionEvent;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
