.class final Lcom/google/android/gms/ads/internal/util/i2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/util/j2;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/ads/internal/util/j2;Lcom/google/android/gms/ads/internal/util/h2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/util/i2;->a:Lcom/google/android/gms/ads/internal/util/j2;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/util/i2;->a:Lcom/google/android/gms/ads/internal/util/j2;

    const/4 p2, 0x1

    :goto_0
    invoke-static {p1, p2}, Lcom/google/android/gms/ads/internal/util/j2;->G(Lcom/google/android/gms/ads/internal/util/j2;Z)V

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/util/i2;->a:Lcom/google/android/gms/ads/internal/util/j2;

    const/4 p2, 0x0

    goto :goto_0

    :cond_1
    return-void
.end method
