.class public final synthetic Lx8/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx8/g;

.field public final synthetic b:Lcom/google/android/gms/ads/internal/client/z2;


# direct methods
.method public synthetic constructor <init>(Lx8/g;Lcom/google/android/gms/ads/internal/client/z2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx8/d0;->a:Lx8/g;

    iput-object p2, p0, Lx8/d0;->b:Lcom/google/android/gms/ads/internal/client/z2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx8/d0;->a:Lx8/g;

    iget-object v1, p0, Lx8/d0;->b:Lcom/google/android/gms/ads/internal/client/z2;

    invoke-virtual {v0, v1}, Lx8/g;->c(Lcom/google/android/gms/ads/internal/client/z2;)V

    return-void
.end method
