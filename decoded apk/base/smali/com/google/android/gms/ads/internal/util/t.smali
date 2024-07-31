.class public final synthetic Lcom/google/android/gms/ads/internal/util/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/ads/internal/util/v;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/ads/internal/util/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/util/t;->a:Lcom/google/android/gms/ads/internal/util/v;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/util/t;->a:Lcom/google/android/gms/ads/internal/util/v;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/util/v;->r()V

    return-void
.end method
