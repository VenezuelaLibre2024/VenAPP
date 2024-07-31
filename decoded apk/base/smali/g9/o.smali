.class final Lg9/o;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field final a:Lcom/google/android/gms/ads/internal/util/v;

.field b:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/util/v;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/ads/internal/util/v;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lg9/o;->a:Lcom/google/android/gms/ads/internal/util/v;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/ads/internal/util/v;->o(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Lcom/google/android/gms/ads/internal/util/v;->n(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lg9/o;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lg9/o;->a:Lcom/google/android/gms/ads/internal/util/v;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/util/v;->m(Landroid/view/MotionEvent;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
