.class public Lx8/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx8/h$a;
    }
.end annotation


# instance fields
.field protected final a:Lcom/google/android/gms/ads/internal/client/z2;


# direct methods
.method protected constructor <init>(Lx8/a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/z2;

    iget-object p1, p1, Lx8/a;->a:Lcom/google/android/gms/ads/internal/client/y2;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/ads/internal/client/z2;-><init>(Lcom/google/android/gms/ads/internal/client/y2;Lp9/a;)V

    iput-object v0, p0, Lx8/h;->a:Lcom/google/android/gms/ads/internal/client/z2;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/ads/internal/client/z2;
    .locals 1

    iget-object v0, p0, Lx8/h;->a:Lcom/google/android/gms/ads/internal/client/z2;

    return-object v0
.end method
