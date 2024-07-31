.class public final synthetic Lcom/google/android/gms/ads/internal/util/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/ads/internal/util/v;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/ads/internal/util/v;IIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/util/p;->a:Lcom/google/android/gms/ads/internal/util/v;

    iput p2, p0, Lcom/google/android/gms/ads/internal/util/p;->b:I

    iput p3, p0, Lcom/google/android/gms/ads/internal/util/p;->c:I

    iput p4, p0, Lcom/google/android/gms/ads/internal/util/p;->d:I

    iput p5, p0, Lcom/google/android/gms/ads/internal/util/p;->e:I

    iput p6, p0, Lcom/google/android/gms/ads/internal/util/p;->f:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/util/p;->a:Lcom/google/android/gms/ads/internal/util/v;

    iget v1, p0, Lcom/google/android/gms/ads/internal/util/p;->b:I

    iget v2, p0, Lcom/google/android/gms/ads/internal/util/p;->c:I

    iget v3, p0, Lcom/google/android/gms/ads/internal/util/p;->d:I

    iget v4, p0, Lcom/google/android/gms/ads/internal/util/p;->e:I

    iget v5, p0, Lcom/google/android/gms/ads/internal/util/p;->f:I

    move-object v6, p1

    move v7, p2

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/ads/internal/util/v;->j(IIIIILandroid/content/DialogInterface;I)V

    return-void
.end method
