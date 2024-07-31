.class public final Lx8/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx8/c0$a;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/n4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/client/n4;->a:Z

    iput-boolean v0, p0, Lx8/c0;->a:Z

    iget-boolean v0, p1, Lcom/google/android/gms/ads/internal/client/n4;->b:Z

    iput-boolean v0, p0, Lx8/c0;->b:Z

    iget-boolean p1, p1, Lcom/google/android/gms/ads/internal/client/n4;->c:Z

    iput-boolean p1, p0, Lx8/c0;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lx8/c0$a;Lx8/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lx8/c0$a;->g(Lx8/c0$a;)Z

    move-result p2

    iput-boolean p2, p0, Lx8/c0;->a:Z

    invoke-static {p1}, Lx8/c0$a;->f(Lx8/c0$a;)Z

    move-result p2

    iput-boolean p2, p0, Lx8/c0;->b:Z

    invoke-static {p1}, Lx8/c0$a;->e(Lx8/c0$a;)Z

    move-result p1

    iput-boolean p1, p0, Lx8/c0;->c:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lx8/c0;->c:Z

    return v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lx8/c0;->b:Z

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lx8/c0;->a:Z

    return v0
.end method
